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
          TopicHolder _join = this.join(_name, _name_1, false);
          this.expandTopicPath(_join, m, c);
        }
      }
    }
  }
  
  public void generate(final String basedirectory, final IFileSystemAccess access) {
    String _plus = (basedirectory + "/");
    String _xifexpression = null;
    String _packagename = this.spec.getPackagename();
    boolean _equals = Objects.equal(_packagename, null);
    if (_equals) {
      String _name = this.spec.getName();
      _xifexpression = _name;
    } else {
      String _packagename_1 = this.spec.getPackagename();
      _xifexpression = _packagename_1;
    }
    final String directory = (_plus + _xifexpression);
    this.generateMSG(this.writeTopics, "W", directory, access);
    this.generateMSG(this.readTopics, "R", directory, access);
    this.generateBridgeFile(directory, access);
    this.generateMainFile(directory, access);
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
        _builder.append("uint32 ");
        _builder.append(n, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public void generateBridgeFile(final String directory, final IFileSystemAccess access) {
    String _plus = (directory + "/src/ros_");
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
    {
      Set<Entry<TopicHolder,List<String>>> _entrySet = this.writeTopics.entrySet();
      for(final Entry<TopicHolder,List<String>> e : _entrySet) {
        _builder.append("from ");
        String _xifexpression = null;
        String _packagename = this.spec.getPackagename();
        boolean _notEquals = (!Objects.equal(_packagename, null));
        if (_notEquals) {
          String _packagename_1 = this.spec.getPackagename();
          _xifexpression = _packagename_1;
        } else {
          String _name = this.spec.getName();
          _xifexpression = _name;
        }
        _builder.append(_xifexpression, "");
        _builder.append(".msg import W");
        TopicHolder _key = e.getKey();
        String _rosName = _key.getRosName();
        _builder.append(_rosName, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Set<Entry<TopicHolder,List<String>>> _entrySet_1 = this.readTopics.entrySet();
      for(final Entry<TopicHolder,List<String>> e_1 : _entrySet_1) {
        _builder.append("from ");
        String _xifexpression_1 = null;
        String _packagename_2 = this.spec.getPackagename();
        boolean _notEquals_1 = (!Objects.equal(_packagename_2, null));
        if (_notEquals_1) {
          String _packagename_3 = this.spec.getPackagename();
          _xifexpression_1 = _packagename_3;
        } else {
          String _name_1 = this.spec.getName();
          _xifexpression_1 = _name_1;
        }
        _builder.append(_xifexpression_1, "");
        _builder.append(".msg import R");
        TopicHolder _key_1 = e_1.getKey();
        String _rosName_1 = _key_1.getRosName();
        _builder.append(_rosName_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("ul_instance_");
    String _name_2 = this.spec.getName();
    _builder.append(_name_2, "");
    _builder.append(" = None");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("def unity_set_link(link,controller):");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("global ul_instance_mini");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ul_instance_");
    String _name_3 = this.spec.getName();
    _builder.append(_name_3, "	");
    _builder.append(" = link");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ul_attach_callbacks()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("controller.activate_publishing(True)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Helper functions for stand-alone ROS");
    _builder.newLine();
    _builder.append("def ros_standalone_init(is_anonymous=False):");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rospy.init_node(\'");
    String _xifexpression_2 = null;
    String _packagename_4 = this.spec.getPackagename();
    boolean _equals = Objects.equal(_packagename_4, null);
    if (_equals) {
      String _name_4 = this.spec.getName();
      _xifexpression_2 = _name_4;
    } else {
      String _packagename_5 = this.spec.getPackagename();
      _xifexpression_2 = _packagename_5;
    }
    _builder.append(_xifexpression_2, "	");
    _builder.append("\', anonymous=is_anonymous)");
    _builder.newLineIfNotEmpty();
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
      Set<Entry<TopicHolder,List<String>>> _entrySet_2 = this.writeTopics.entrySet();
      for(final Entry<TopicHolder,List<String>> e_2 : _entrySet_2) {
        _builder.append("def ros_callback_");
        TopicHolder _key_2 = e_2.getKey();
        String _rosName_2 = _key_2.getRosName();
        _builder.append(_rosName_2, "");
        _builder.append("(data):");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("ul_instance_");
        TopicHolder _key_3 = e_2.getKey();
        String _pythonName = _key_3.getPythonName();
        _builder.append(_pythonName, "	");
        _builder.append(".write(");
        {
          List<String> _value = e_2.getValue();
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
      Set<Entry<TopicHolder,List<String>>> _entrySet_3 = this.writeTopics.entrySet();
      for(final Entry<TopicHolder,List<String>> e_3 : _entrySet_3) {
        _builder.append("\t");
        _builder.append("rospy.Subscriber(\"");
        TopicHolder _key_4 = e_3.getKey();
        String _rosName_3 = _key_4.getRosName();
        _builder.append(_rosName_3, "	");
        _builder.append("\",W");
        TopicHolder _key_5 = e_3.getKey();
        String _rosName_4 = _key_5.getRosName();
        _builder.append(_rosName_4, "	");
        _builder.append(",ros_callback_");
        TopicHolder _key_6 = e_3.getKey();
        String _rosName_5 = _key_6.getRosName();
        _builder.append(_rosName_5, "	");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("# Publications");
    _builder.newLine();
    {
      Set<Entry<TopicHolder,List<String>>> _entrySet_4 = this.readTopics.entrySet();
      for(final Entry<TopicHolder,List<String>> e_4 : _entrySet_4) {
        _builder.append("ul_publisher_");
        TopicHolder _key_7 = e_4.getKey();
        String _rosName_6 = _key_7.getRosName();
        _builder.append(_rosName_6, "");
        _builder.append(" = rospy.Publisher(\"");
        TopicHolder _key_8 = e_4.getKey();
        String _rosName_7 = _key_8.getRosName();
        _builder.append(_rosName_7, "");
        _builder.append("\",R");
        TopicHolder _key_9 = e_4.getKey();
        String _rosName_8 = _key_9.getRosName();
        _builder.append(_rosName_8, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        {
          TopicHolder _key_10 = e_4.getKey();
          boolean _isGroup = _key_10.isGroup();
          if (_isGroup) {
            _builder.append("def unity_callback_");
            TopicHolder _key_11 = e_4.getKey();
            String _rosName_9 = _key_11.getRosName();
            _builder.append(_rosName_9, "");
            _builder.append("(data):");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("ul_publisher_");
            TopicHolder _key_12 = e_4.getKey();
            String _rosName_10 = _key_12.getRosName();
            _builder.append(_rosName_10, "	");
            _builder.append(".publish(R");
            TopicHolder _key_13 = e_4.getKey();
            String _rosName_11 = _key_13.getRosName();
            _builder.append(_rosName_11, "	");
            _builder.append("(");
            {
              List<String> _value_1 = e_4.getValue();
              ArrayList<Integer> _indices = this.indices(_value_1);
              boolean _hasElements_1 = false;
              for(final Integer i : _indices) {
                if (!_hasElements_1) {
                  _hasElements_1 = true;
                } else {
                  _builder.appendImmediate(",", "	");
                }
                _builder.append("data[1][");
                _builder.append(i, "	");
                _builder.append("]");
              }
            }
            _builder.append("))");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("ul_publisher_cache_");
            TopicHolder _key_14 = e_4.getKey();
            String _rosName_12 = _key_14.getRosName();
            _builder.append(_rosName_12, "");
            _builder.append(" = {}");
            _builder.newLineIfNotEmpty();
            {
              List<String> _value_2 = e_4.getValue();
              for(final String f : _value_2) {
                _builder.append("def unity_callback_");
                TopicHolder _key_15 = e_4.getKey();
                String _rosName_13 = _key_15.getRosName();
                _builder.append(_rosName_13, "");
                _builder.append("_");
                _builder.append(f, "");
                _builder.append("(data,description,address):");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("ul_publisher_cache_");
                TopicHolder _key_16 = e_4.getKey();
                String _rosName_14 = _key_16.getRosName();
                _builder.append(_rosName_14, "	");
                _builder.append("[\"");
                _builder.append(f, "	");
                _builder.append("\"] = data");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("ul_publisher_");
                TopicHolder _key_17 = e_4.getKey();
                String _rosName_15 = _key_17.getRosName();
                _builder.append(_rosName_15, "	");
                _builder.append(".publish(R");
                TopicHolder _key_18 = e_4.getKey();
                String _rosName_16 = _key_18.getRosName();
                _builder.append(_rosName_16, "	");
                _builder.append("(");
                {
                  List<String> _value_3 = e_4.getValue();
                  boolean _hasElements_2 = false;
                  for(final String n_1 : _value_3) {
                    if (!_hasElements_2) {
                      _hasElements_2 = true;
                    } else {
                      _builder.appendImmediate(",", "	");
                    }
                    _builder.append("ul_publisher_cache_");
                    TopicHolder _key_19 = e_4.getKey();
                    String _rosName_17 = _key_19.getRosName();
                    _builder.append(_rosName_17, "	");
                    _builder.append("[\"");
                    _builder.append(n_1, "	");
                    _builder.append("\"]");
                  }
                }
                _builder.append("))");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("def ul_attach_callbacks():");
    _builder.newLine();
    {
      Set<Entry<TopicHolder,List<String>>> _entrySet_5 = this.readTopics.entrySet();
      for(final Entry<TopicHolder,List<String>> e_5 : _entrySet_5) {
        {
          TopicHolder _key_20 = e_5.getKey();
          boolean _isGroup_1 = _key_20.isGroup();
          if (_isGroup_1) {
            _builder.append("\t");
            _builder.append("ul_instance_");
            TopicHolder _key_21 = e_5.getKey();
            String _pythonName_1 = _key_21.getPythonName();
            _builder.append(_pythonName_1, "	");
            _builder.append(".register_callback(unity_callback_");
            TopicHolder _key_22 = e_5.getKey();
            String _rosName_18 = _key_22.getRosName();
            _builder.append(_rosName_18, "	");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          } else {
            {
              List<String> _value_4 = e_5.getValue();
              for(final String f_1 : _value_4) {
                _builder.append("\t");
                _builder.append("ul_instance_");
                TopicHolder _key_23 = e_5.getKey();
                String _pythonName_2 = _key_23.getPythonName();
                _builder.append(_pythonName_2, "	");
                _builder.append(".");
                _builder.append(f_1, "	");
                _builder.append(".register_callback(unity_callback_");
                TopicHolder _key_24 = e_5.getKey();
                String _rosName_19 = _key_24.getRosName();
                _builder.append(_rosName_19, "	");
                _builder.append("_");
                _builder.append(f_1, "	");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public ArrayList<Integer> indices(final List<String> strings) {
    ArrayList<Integer> _arrayList = new ArrayList<Integer>();
    final ArrayList<Integer> result = _arrayList;
    for (final String s : strings) {
      int _size = result.size();
      result.add(Integer.valueOf(_size));
    }
    return result;
  }
  
  public void generateMainFile(final String directory, final IFileSystemAccess access) {
    String _plus = (directory + "/src/ros_");
    String _name = this.spec.getName();
    String _plus_1 = (_plus + _name);
    String _plus_2 = (_plus_1 + "_main.py");
    CharSequence _generateMain = this.generateMain();
    access.generateFile(_plus_2, _generateMain);
  }
  
  public CharSequence generateMain() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Default main file, connects unity link to ROS");
    _builder.newLine();
    _builder.append("# Relies on definitions in config.py (not generated):");
    _builder.newLine();
    _builder.append("#");
    _builder.newLine();
    _builder.append("# # config.connection: the connection, e.g.");
    _builder.newLine();
    _builder.append("# connection = unity_link.ul_rs232(\'/dev/ttyUSB0\', 3000000, serial.PARITY_NONE, serial.STOPBITS_ONE, serial.EIGHTBITS, 0.1)");
    _builder.newLine();
    _builder.append("# # config.controller: the controller, e.g.");
    _builder.newLine();
    _builder.append("# controller = unity_link.ul_link_controller([connection])");
    _builder.newLine();
    _builder.append("#");
    _builder.newLine();
    _builder.append("import config");
    _builder.newLine();
    _builder.append("# Link ROS to Unity-Link");
    _builder.newLine();
    _builder.append("import unity_link");
    _builder.newLine();
    _builder.append("import ");
    String _name = this.spec.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("import ros_");
    String _name_1 = this.spec.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    _builder.append("link_proxy=");
    String _name_2 = this.spec.getName();
    _builder.append(_name_2, "");
    _builder.append(".UL_");
    String _name_3 = this.spec.getName();
    _builder.append(_name_3, "");
    _builder.append("(config.controller,config.connection)");
    _builder.newLineIfNotEmpty();
    _builder.append("link_proxy.bind(None)");
    _builder.newLine();
    _builder.append("ros_");
    String _name_4 = this.spec.getName();
    _builder.append(_name_4, "");
    _builder.append(".ros_standalone_init()");
    _builder.newLineIfNotEmpty();
    _builder.append("ros_");
    String _name_5 = this.spec.getName();
    _builder.append(_name_5, "");
    _builder.append(".unity_set_link(link_proxy,config.controller)");
    _builder.newLineIfNotEmpty();
    _builder.append("ros_");
    String _name_6 = this.spec.getName();
    _builder.append(_name_6, "");
    _builder.append(".init_subscriptions()");
    _builder.newLineIfNotEmpty();
    _builder.append("ros_");
    String _name_7 = this.spec.getName();
    _builder.append(_name_7, "");
    _builder.append(".ros_standalone_serve()");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected void _expandTopicPath(final TopicHolder base, final Member member, final Constructor context) {
  }
  
  protected void _expandTopicPath(final TopicHolder base, final Expansion expansion, final Constructor context) {
    Constructor _constructor = expansion.getConstructor();
    EList<Member> _members = _constructor.getMembers();
    for (final Member m : _members) {
      String _name = expansion.getName();
      TopicHolder _join = this.join(base, _name, false);
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
      TopicHolder _join = this.join(base, _name, true);
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
  
  public TopicHolder join(final String base, final String extend, final boolean group) {
    TopicHolder _topicHolder = new TopicHolder(base, extend, extend, group);
    return _topicHolder;
  }
  
  public TopicHolder join(final TopicHolder holder, final String extend, final boolean group) {
    String _baseName = holder.getBaseName();
    String _rosName = holder.getRosName();
    String _plus = (_rosName + "_");
    String _plus_1 = (_plus + extend);
    String _pythonName = holder.getPythonName();
    String _plus_2 = (_pythonName + ".");
    String _plus_3 = (_plus_2 + extend);
    TopicHolder _topicHolder = new TopicHolder(_baseName, _plus_1, _plus_3, group);
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
