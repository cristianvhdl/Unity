package dk.sdu.mmmi.embedix.generator;

import com.google.common.base.Objects;
import dk.sdu.mmmi.embedix.generator.TopicHolder;
import dk.sdu.mmmi.embedix.generator.Utilities;
import dk.sdu.mmmi.embedix.ulswig.AddressSpec;
import dk.sdu.mmmi.embedix.ulswig.Constructor;
import dk.sdu.mmmi.embedix.ulswig.Expansion;
import dk.sdu.mmmi.embedix.ulswig.GroupElement;
import dk.sdu.mmmi.embedix.ulswig.Grouping;
import dk.sdu.mmmi.embedix.ulswig.Instantiation;
import dk.sdu.mmmi.embedix.ulswig.InstantiationProperty;
import dk.sdu.mmmi.embedix.ulswig.LinkSpec;
import dk.sdu.mmmi.embedix.ulswig.Member;
import dk.sdu.mmmi.embedix.ulswig.PublishProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class ROSmsgCompiler {
  private LinkSpec spec;
  
  private final Map<TopicHolder,List<String>> writeTopics = new Function0<Map<TopicHolder,List<String>>>() {
    public Map<TopicHolder,List<String>> apply() {
      HashMap<TopicHolder,List<String>> _hashMap = new HashMap<TopicHolder,List<String>>();
      return _hashMap;
    }
  }.apply();
  
  private final Map<TopicHolder,List<String>> readTopics = new Function0<Map<TopicHolder,List<String>>>() {
    public Map<TopicHolder,List<String>> apply() {
      HashMap<TopicHolder,List<String>> _hashMap = new HashMap<TopicHolder,List<String>>();
      return _hashMap;
    }
  }.apply();
  
  public ROSmsgCompiler(final LinkSpec spec) {
    this.spec = spec;
    EList<Constructor> _constructors = spec.getConstructors();
    for (final Constructor c : _constructors) {
      boolean _isIsPublic = c.isIsPublic();
      if (_isIsPublic) {
        EList<Member> _members = c.getMembers();
        for (final Member m : _members) {
          String _name = spec.getName();
          String _name_1 = c.getName();
          TopicHolder _join = this.join(_name, _name_1);
          this.expandTopicPath(_join, m, c);
        }
      }
    }
  }
  
  public void generate(final String basedirectory, final IFileSystemAccess access) {
    String _plus = (basedirectory + "/");
    String _name = this.spec.getName();
    final String directory = (_plus + _name);
    this.generateMSG(this.writeTopics, "W", directory, access);
    this.generateMSG(this.readTopics, "R", directory, access);
    this.generateBridgeFile(directory, access);
  }
  
  public void generateMSG(final Map<TopicHolder,List<String>> map, final String prefix, final String directory, final IFileSystemAccess access) {
    Set<Entry<TopicHolder,List<String>>> _entrySet = map.entrySet();
    for (final Entry<TopicHolder,List<String>> e : _entrySet) {
      String _plus = (directory + "/msg/");
      String _plus_1 = (_plus + prefix);
      TopicHolder _key = e.getKey();
      String _rosName = _key.getRosName();
      String _plus_2 = (_plus_1 + _rosName);
      String _plus_3 = (_plus_2 + ".msg");
      List<String> _value = e.getValue();
      CharSequence _generateMSGelements = this.generateMSGelements(_value);
      access.generateFile(_plus_3, _generateMSGelements);
    }
  }
  
  public CharSequence generateMSGelements(final List<String> names) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String n : names) {
        _builder.append("int32 ");
        _builder.append(n, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public void generateBridgeFile(final String directory, final IFileSystemAccess access) {
    String _plus = (directory + "/ros-");
    String _name = this.spec.getName();
    String _plus_1 = (_plus + _name);
    String _plus_2 = (_plus_1 + ".py");
    CharSequence _generateBridge = this.generateBridge();
    access.generateFile(_plus_2, _generateBridge);
  }
  
  public CharSequence generateBridge() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import roslib");
    _builder.newLine();
    _builder.append("import rospy");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ul_instance_");
    String _name = this.spec.getName();
    _builder.append(_name, "");
    _builder.append(" = None");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("# Helper functions for stand-alone ROS");
    _builder.newLine();
    _builder.append("def ros_standalone_init():");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rospy.init_node(\'unity listener\', anonymous=True)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def ros_standalone_serve():");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rospy.spin()");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Subscriptions");
    _builder.newLine();
    {
      Set<Entry<TopicHolder,List<String>>> _entrySet = this.writeTopics.entrySet();
      for(final Entry<TopicHolder,List<String>> e : _entrySet) {
        _builder.append("def ros_callback_");
        TopicHolder _key = e.getKey();
        String _rosName = _key.getRosName();
        _builder.append(_rosName, "");
        _builder.append("(data):");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("ul_instance_");
        TopicHolder _key_1 = e.getKey();
        String _pythonName = _key_1.getPythonName();
        _builder.append(_pythonName, "	");
        _builder.append(".write(");
        {
          List<String> _value = e.getValue();
          boolean _hasElements = false;
          for(final String n : _value) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "	");
            }
            _builder.append("data.");
            _builder.append(n, "	");
          }
        }
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("def init_subscriptions():");
    _builder.newLine();
    {
      Set<Entry<TopicHolder,List<String>>> _entrySet_1 = this.writeTopics.entrySet();
      for(final Entry<TopicHolder,List<String>> e_1 : _entrySet_1) {
        _builder.append("\t");
        _builder.append("rospy.Subscriber(\"");
        TopicHolder _key_2 = e_1.getKey();
        String _rosName_1 = _key_2.getRosName();
        _builder.append(_rosName_1, "	");
        _builder.append("\",\"W");
        TopicHolder _key_3 = e_1.getKey();
        String _rosName_2 = _key_3.getRosName();
        _builder.append(_rosName_2, "	");
        _builder.append("\",ros_callback_");
        TopicHolder _key_4 = e_1.getKey();
        String _rosName_3 = _key_4.getRosName();
        _builder.append(_rosName_3, "	");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("# Publications");
    _builder.newLine();
    return _builder;
  }
  
  protected void _expandTopicPath(final TopicHolder base, final Member member, final Constructor context) {
  }
  
  protected void _expandTopicPath(final TopicHolder base, final Expansion expansion, final Constructor context) {
    Constructor _constructor = expansion.getConstructor();
    EList<Member> _members = _constructor.getMembers();
    for (final Member m : _members) {
      String _name = expansion.getName();
      TopicHolder _join = this.join(base, _name);
      Constructor _constructor_1 = expansion.getConstructor();
      this.expandTopicPath(_join, m, _constructor_1);
    }
  }
  
  protected void _expandTopicPath(final TopicHolder base, final Instantiation instant, final Constructor context) {
    try {
      String _kind = instant.getKind();
      boolean _equals = _kind.equals("READ");
      if (_equals) {
        EList<InstantiationProperty> _properties = instant.getProperties();
        boolean _containsPublish = this.containsPublish(_properties);
        if (_containsPublish) {
          AddressSpec _address = instant.getAddress();
          String _name = _address.getName();
          this.putIntoList(this.readTopics, base, _name);
        }
      } else {
        String _kind_1 = instant.getKind();
        boolean _equals_1 = _kind_1.equals("WRITE");
        if (_equals_1) {
          AddressSpec _address_1 = instant.getAddress();
          String _name_1 = _address_1.getName();
          this.putIntoList(this.writeTopics, base, _name_1);
        } else {
          String _kind_2 = instant.getKind();
          String _plus = ("Illegal kind: " + _kind_2);
          Error _error = new Error(_plus);
          throw _error;
        }
      }
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean containsPublish(final EList<InstantiationProperty> list) {
    for (final InstantiationProperty p : list) {
      if ((p instanceof PublishProperty)) {
        return true;
      }
    }
    return false;
  }
  
  protected void _expandTopicPath(final TopicHolder base, final Grouping group, final Constructor context) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    final List<String> expansion = _arrayList;
    EList<GroupElement> _elements = group.getElements();
    for (final GroupElement e : _elements) {
      List<String> _computeGroupComponents = Utilities.computeGroupComponents(e, context, "", "_");
      expansion.addAll(_computeGroupComponents);
    }
    for (final String e_1 : expansion) {
      String _name = group.getName();
      TopicHolder _join = this.join(base, _name);
      this.putIntoList(this.writeTopics, _join, e_1);
    }
  }
  
  public boolean putIntoList(final Map<TopicHolder,List<String>> map, final TopicHolder base, final String name) {
    boolean _xblockexpression = false;
    {
      List<String> _get = map.get(base);
      boolean _equals = Objects.equal(_get, null);
      if (_equals) {
        ArrayList<String> _arrayList = new ArrayList<String>();
        map.put(base, _arrayList);
      }
      List<String> _get_1 = map.get(base);
      boolean _add = _get_1.add(name);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public TopicHolder join(final String base, final String extend) {
    TopicHolder _topicHolder = new TopicHolder(base, extend, extend);
    return _topicHolder;
  }
  
  public TopicHolder join(final TopicHolder holder, final String extend) {
    String _baseName = holder.getBaseName();
    String _rosName = holder.getRosName();
    String _plus = (_rosName + "_");
    String _plus_1 = (_plus + extend);
    String _pythonName = holder.getPythonName();
    String _plus_2 = (_pythonName + ".");
    String _plus_3 = (_plus_2 + extend);
    TopicHolder _topicHolder = new TopicHolder(_baseName, _plus_1, _plus_3);
    return _topicHolder;
  }
  
  public void expandTopicPath(final TopicHolder base, final Member expansion, final Constructor context) {
    if (expansion instanceof Expansion) {
      _expandTopicPath(base, (Expansion)expansion, context);
      return;
    } else if (expansion instanceof Grouping) {
      _expandTopicPath(base, (Grouping)expansion, context);
      return;
    } else if (expansion instanceof Instantiation) {
      _expandTopicPath(base, (Instantiation)expansion, context);
      return;
    } else if (expansion != null) {
      _expandTopicPath(base, expansion, context);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(base, expansion, context).toString());
    }
  }
}
