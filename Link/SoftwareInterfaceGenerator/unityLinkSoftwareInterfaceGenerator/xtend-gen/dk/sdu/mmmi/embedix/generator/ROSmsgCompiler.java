package dk.sdu.mmmi.embedix.generator;

import com.google.common.base.Objects;
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
  
  private final Map<String,List<String>> writeTopics = new Function0<Map<String,List<String>>>() {
    public Map<String,List<String>> apply() {
      HashMap<String,List<String>> _hashMap = new HashMap<String,List<String>>();
      return _hashMap;
    }
  }.apply();
  
  private final Map<String,List<String>> readTopics = new Function0<Map<String,List<String>>>() {
    public Map<String,List<String>> apply() {
      HashMap<String,List<String>> _hashMap = new HashMap<String,List<String>>();
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
          String _join = this.join(_name, _name_1);
          this.expandTopicPath(_join, m, c);
        }
      }
    }
  }
  
  public void generate(final String directory, final IFileSystemAccess access) {
    this.generateMSG(this.writeTopics, "W", directory, access);
    this.generateMSG(this.readTopics, "R", directory, access);
  }
  
  public void generateMSG(final Map<String,List<String>> map, final String prefix, final String directory, final IFileSystemAccess access) {
    Set<Entry<String,List<String>>> _entrySet = map.entrySet();
    for (final Entry<String,List<String>> e : _entrySet) {
      String _plus = (directory + "/");
      String _plus_1 = (_plus + prefix);
      String _key = e.getKey();
      String _plus_2 = (_plus_1 + _key);
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
  
  protected void _expandTopicPath(final String base, final Member member, final Constructor context) {
  }
  
  protected void _expandTopicPath(final String base, final Expansion expansion, final Constructor context) {
    Constructor _constructor = expansion.getConstructor();
    EList<Member> _members = _constructor.getMembers();
    for (final Member m : _members) {
      String _name = expansion.getName();
      String _join = this.join(base, _name);
      Constructor _constructor_1 = expansion.getConstructor();
      this.expandTopicPath(_join, m, _constructor_1);
    }
  }
  
  protected void _expandTopicPath(final String base, final Instantiation instant, final Constructor context) {
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
  
  protected void _expandTopicPath(final String base, final Grouping group, final Constructor context) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    final List<String> expansion = _arrayList;
    EList<GroupElement> _elements = group.getElements();
    for (final GroupElement e : _elements) {
      List<String> _computeGroupComponents = Utilities.computeGroupComponents(e, context, "", "_");
      expansion.addAll(_computeGroupComponents);
    }
    for (final String e_1 : expansion) {
      String _name = group.getName();
      String _join = this.join(base, _name);
      this.putIntoList(this.writeTopics, _join, e_1);
    }
  }
  
  public boolean putIntoList(final Map<String,List<String>> map, final String base, final String name) {
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
  
  public String join(final String base, final String extend) {
    String _plus = (base + "_");
    String _plus_1 = (_plus + extend);
    return _plus_1;
  }
  
  public void expandTopicPath(final String base, final Member expansion, final Constructor context) {
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
