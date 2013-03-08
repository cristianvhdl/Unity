package dk.sdu.mmmi.embedix.generator;

import com.google.common.base.Objects;
import dk.sdu.mmmi.embedix.generator.Utilities;
import dk.sdu.mmmi.embedix.ulswig.AddressBinding;
import dk.sdu.mmmi.embedix.ulswig.AddressExpansion;
import dk.sdu.mmmi.embedix.ulswig.AddressSpec;
import dk.sdu.mmmi.embedix.ulswig.AddressTuple;
import dk.sdu.mmmi.embedix.ulswig.Argument;
import dk.sdu.mmmi.embedix.ulswig.CRCProperty;
import dk.sdu.mmmi.embedix.ulswig.Constructor;
import dk.sdu.mmmi.embedix.ulswig.ConstructorAddressParameters;
import dk.sdu.mmmi.embedix.ulswig.DirectAddressSpec;
import dk.sdu.mmmi.embedix.ulswig.Expansion;
import dk.sdu.mmmi.embedix.ulswig.GroupElement;
import dk.sdu.mmmi.embedix.ulswig.Grouping;
import dk.sdu.mmmi.embedix.ulswig.IDProperty;
import dk.sdu.mmmi.embedix.ulswig.Instantiation;
import dk.sdu.mmmi.embedix.ulswig.InstantiationProperty;
import dk.sdu.mmmi.embedix.ulswig.LinkBinding;
import dk.sdu.mmmi.embedix.ulswig.LinkProperty;
import dk.sdu.mmmi.embedix.ulswig.LinkSpec;
import dk.sdu.mmmi.embedix.ulswig.Member;
import dk.sdu.mmmi.embedix.ulswig.NamedAddressSpec;
import dk.sdu.mmmi.embedix.ulswig.PublishProperty;
import dk.sdu.mmmi.embedix.ulswig.SimpleExpansion;
import dk.sdu.mmmi.embedix.ulswig.TosNetLinkBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class PythonULSWCompiler {
  private LinkSpec link;
  
  private final HashMap<String,List<String>> groupingMembers = new Function0<HashMap<String,List<String>>>() {
    public HashMap<String,List<String>> apply() {
      HashMap<String,List<String>> _hashMap = new HashMap<String,List<String>>();
      return _hashMap;
    }
  }.apply();
  
  public PythonULSWCompiler(final LinkSpec _link) {
    this.link = _link;
  }
  
  /**
   * Header and overall file structure
   */
  public CharSequence generate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Automatically generated code");
    _builder.newLine();
    _builder.append("from unity_link import * #@UnusedWildImport");
    _builder.newLine();
    _builder.append("from unity_link_hw import * #@UnusedWildImport");
    _builder.newLine();
    _builder.append("from unity_link_data import * #@UnusedWildImport");
    _builder.newLine();
    _builder.append("from unity_link_data import ul_data_proxy");
    _builder.newLine();
    _builder.append("from unity_link_hw import ul_hw_mem");
    _builder.newLine();
    _builder.newLine();
    {
      EList<Constructor> _constructors = this.link.getConstructors();
      for(final Constructor c : _constructors) {
        CharSequence _compile = this.compile(c);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    {
      Set<String> _keySet = this.groupingMembers.keySet();
      for(final String g : _keySet) {
        List<String> _get = this.groupingMembers.get(g);
        final Function1<String,String> _function = new Function1<String,String>() {
            public String apply(final String s) {
              String _replace = s.replace(".", "_");
              return _replace;
            }
          };
        List<String> _map = ListExtensions.<String, String>map(_get, _function);
        CharSequence _generateGroupingClass = this.generateGroupingClass(g, _map);
        _builder.append(_generateGroupingClass, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  /**
   * Constructor
   */
  public CharSequence compile(final Constructor c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    String _name = c.getName();
    String _constructorName = this.constructorName(_name, c);
    _builder.append(_constructorName, "");
    _builder.append(":");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("def __init__(self");
    {
      EList<String> _parameters = c.getParameters();
      for(final String p : _parameters) {
        _builder.append(",");
        _builder.append(p, "	");
      }
    }
    _builder.append(",ul_hwp=None):");
    _builder.newLineIfNotEmpty();
    {
      EList<String> _parameters_1 = c.getParameters();
      for(final String p_1 : _parameters_1) {
        _builder.append("\t\t");
        _builder.append("self.ul_parameter_");
        _builder.append(p_1, "		");
        _builder.append(" = ");
        _builder.append(p_1, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("self.ul_hwp = ul_hwp");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def bind(self,ul_addresses):");
    _builder.newLine();
    {
      ConstructorAddressParameters _addresses = c.getAddresses();
      if ((_addresses instanceof AddressTuple)) {
        _builder.append("\t\t");
        _builder.append("ul_addresses = dict(zip([");
        {
          ConstructorAddressParameters _addresses_1 = c.getAddresses();
          EList<String> _elements = ((AddressTuple) _addresses_1).getElements();
          boolean _hasElements = false;
          for(final String n : _elements) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "		");
            }
            _builder.append("\'");
            _builder.append(n, "		");
            _builder.append("\'");
          }
        }
        _builder.append("],ul_addresses[\"_\"]))");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Member> _members = c.getMembers();
      for(final Member m : _members) {
        _builder.append("\t\t");
        CharSequence _compileMember = this.compileMember(m, c);
        _builder.append(_compileMember, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<Member> _members_1 = c.getMembers();
      List<String> _instantiationNames = this.instantiationNames(_members_1, "WRITE");
      int _size = _instantiationNames.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\t");
        _builder.append("def write(");
        {
          EList<Member> _members_2 = c.getMembers();
          List<String> _instantiationNames_1 = this.instantiationNames(_members_2, "WRITE");
          boolean _hasElements_1 = false;
          for(final String n_1 : _instantiationNames_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "	");
            }
            _builder.append("ul_p_");
            _builder.append(n_1, "	");
          }
        }
        _builder.append("):");
        _builder.newLineIfNotEmpty();
        {
          EList<Member> _members_3 = c.getMembers();
          List<String> _instantiationNames_2 = this.instantiationNames(_members_3, "WRITE");
          for(final String n_2 : _instantiationNames_2) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("self.");
            _builder.append(n_2, "		");
            _builder.append(".write(ul_p_");
            _builder.append(n_2, "		");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public List<String> instantiationNames(final EList<Member> list, final String kind) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    final List<String> names = _arrayList;
    for (final Member n : list) {
      boolean _matched = false;
      if (!_matched) {
        if (n instanceof Instantiation) {
          final Instantiation _instantiation = (Instantiation)n;
          if (Objects.equal(n,_instantiation)) {
            _matched=true;
            String _kind = _instantiation.getKind();
            boolean _equals = _kind.equals(kind);
            if (_equals) {
              AddressSpec _address = _instantiation.getAddress();
              String _name = _address.getName();
              names.add(_name);
            }
          }
        }
      }
    }
    return names;
  }
  
  public String constructorName(final String name, final Constructor constructor) {
    String _xifexpression = null;
    boolean _isIsPublic = constructor.isIsPublic();
    if (_isIsPublic) {
      _xifexpression = name;
    } else {
      String _plus = ("private_" + name);
      _xifexpression = _plus;
    }
    String _plus_1 = ("UL_" + _xifexpression);
    return _plus_1;
  }
  
  /**
   * All member types, utilities
   */
  public String compileArgument(final Argument a) {
    String _xifexpression = null;
    String _simple = a.getSimple();
    boolean _notEquals = (!Objects.equal(_simple, null));
    if (_notEquals) {
      String _simple_1 = a.getSimple();
      String _plus = ("self.ul_parameter_" + _simple_1);
      _xifexpression = _plus;
    } else {
      String _xifexpression_1 = null;
      String _text = a.getText();
      boolean _notEquals_1 = (!Objects.equal(_text, null));
      if (_notEquals_1) {
        String _text_1 = a.getText();
        String _plus_1 = ("\"" + _text_1);
        String _plus_2 = (_plus_1 + "\"");
        _xifexpression_1 = _plus_2;
      } else {
        String _lhs = a.getLhs();
        String _plus_3 = ("self.ul_parameter_" + _lhs);
        String _plus_4 = (_plus_3 + "+");
        Argument _rhs = a.getRhs();
        String _compileArgument = this.compileArgument(_rhs);
        String _plus_5 = (_plus_4 + _compileArgument);
        _xifexpression_1 = _plus_5;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Link bindings
   */
  protected CharSequence _compileMember(final LinkBinding m, final Constructor c) {
    return this.compileBinding(((TosNetLinkBinding) m));
  }
  
  public CharSequence compileBinding(final TosNetLinkBinding t) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# initialization for TOSNET link binding");
    _builder.newLine();
    _builder.append("link_base = 0 # default value");
    _builder.newLine();
    {
      EList<LinkProperty> _properties = t.getProperties();
      for(final LinkProperty p : _properties) {
        CharSequence _compileLinkProperty = this.compileLinkProperty(p);
        _builder.append(_compileLinkProperty, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("self.ul_hwp = ul_hw_mem(link_base, 256, 2, link_ctrl, link_uart.getID())");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileLinkProperty(final LinkProperty property) {
    CharSequence _xifexpression = null;
    String _ctrlName = property.getCtrlName();
    boolean _notEquals = (!Objects.equal(_ctrlName, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("link_ctrl = self.ul_parameter_");
      String _ctrlName_1 = property.getCtrlName();
      _builder.append(_ctrlName_1, "");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      String _uartName = property.getUartName();
      boolean _notEquals_1 = (!Objects.equal(_uartName, null));
      if (_notEquals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("link_uart = self.ul_parameter_");
        String _uartName_1 = property.getUartName();
        _builder_1.append(_uartName_1, "");
        _xifexpression_1 = _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("link_base = ");
        int _baseValue = property.getBaseValue();
        _builder_2.append(_baseValue, "");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  /**
   * Expansion member
   */
  protected CharSequence _compileMember(final Expansion m, final Constructor c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# initialization for expansion ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("self.");
    String _name_1 = m.getName();
    _builder.append(_name_1, "");
    _builder.append(" = ");
    Constructor _constructor = m.getConstructor();
    String _name_2 = _constructor.getName();
    Constructor _constructor_1 = m.getConstructor();
    String _constructorName = this.constructorName(_name_2, _constructor_1);
    _builder.append(_constructorName, "");
    _builder.append("(");
    {
      EList<Argument> _arguments = m.getArguments();
      boolean _hasElements = false;
      for(final Argument a : _arguments) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        String _compileArgument = this.compileArgument(a);
        _builder.append(_compileArgument, "");
      }
    }
    _builder.append(",ul_hwp=self.ul_hwp)");
    _builder.newLineIfNotEmpty();
    CharSequence _compileExpansionAddressBinding = this.compileExpansionAddressBinding(m);
    _builder.append(_compileExpansionAddressBinding, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compileExpansionAddressBinding(final SimpleExpansion m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("self.");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append(".bind({");
    _builder.newLineIfNotEmpty();
    {
      EList<AddressBinding> _bindings = m.getBindings();
      boolean _hasElements = false;
      for(final AddressBinding b : _bindings) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "	");
        }
        _builder.append("\t");
        _builder.append("\'");
        String _name_1 = b.getName();
        String _providedOrDefaultName = this.providedOrDefaultName(_name_1);
        _builder.append(_providedOrDefaultName, "	");
        _builder.append("\': [");
        {
          EList<String> _addresses = b.getAddresses();
          boolean _hasElements_1 = false;
          for(final String x : _addresses) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "	");
            }
            _builder.append(x, "	");
          }
        }
        _builder.append("]");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("})");
    _builder.newLine();
    return _builder;
  }
  
  public String providedOrDefaultName(final String name) {
    String _xifexpression = null;
    boolean _equals = Objects.equal(name, null);
    if (_equals) {
      _xifexpression = "_";
    } else {
      _xifexpression = name;
    }
    return _xifexpression;
  }
  
  protected CharSequence _compileExpansionAddressBinding(final AddressExpansion m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("self.");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.append(".bind({");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\'_\': ul_addresses[\'");
    String _name_1 = m.getName();
    _builder.append(_name_1, "	");
    _builder.append("\']");
    _builder.newLineIfNotEmpty();
    _builder.append("})");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Instantiation member
   */
  protected CharSequence _compileMember(final Instantiation m, final Constructor c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# initialization for instantiation ");
    AddressSpec _address = m.getAddress();
    String _name = _address.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("ul_address = ");
    AddressSpec _address_1 = m.getAddress();
    String _addressFromSpec = this.getAddressFromSpec(_address_1);
    _builder.append(_addressFromSpec, "");
    _builder.newLineIfNotEmpty();
    _builder.append("self.");
    AddressSpec _address_2 = m.getAddress();
    String _name_1 = _address_2.getName();
    _builder.append(_name_1, "");
    _builder.append(" = ul_data_proxy(self.ul_hwp,ul_address, ");
    EList<InstantiationProperty> _properties = m.getProperties();
    String _instantiationID = this.getInstantiationID(_properties);
    _builder.append(_instantiationID, "");
    _builder.append(", ");
    String _kind = m.getKind();
    String _kind_1 = this.getKind(_kind);
    _builder.append(_kind_1, "");
    _builder.append(", 0");
    {
      EList<InstantiationProperty> _properties_1 = m.getProperties();
      for(final InstantiationProperty p : _properties_1) {
        {
          boolean _not = (!(p instanceof IDProperty));
          if (_not) {
            _builder.append(",");
            String _namedProperty = this.getNamedProperty(p);
            _builder.append(_namedProperty, "");
          }
        }
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected String _getNamedProperty(final CRCProperty p) {
    return "crc=True";
  }
  
  protected String _getNamedProperty(final PublishProperty p) {
    int _mode = p.getMode();
    String _plus = ("publish_config=[" + Integer.valueOf(_mode));
    String _plus_1 = (_plus + ",");
    int _rate = p.getRate();
    String _plus_2 = (_plus_1 + Integer.valueOf(_rate));
    String _plus_3 = (_plus_2 + "]");
    return _plus_3;
  }
  
  public String getKind(final String string) {
    String _xifexpression = null;
    boolean _equals = string.equals("READ");
    if (_equals) {
      _xifexpression = "ACCESS_RIGHT.R";
    } else {
      _xifexpression = "ACCESS_RIGHT.W";
    }
    return _xifexpression;
  }
  
  public String getInstantiationID(final EList<InstantiationProperty> list) {
    for (final InstantiationProperty p : list) {
      if ((p instanceof IDProperty)) {
        Argument _id = ((IDProperty) p).getId();
        return this.compileArgument(_id);
      }
    }
    return "(no name)";
  }
  
  protected String _getAddressFromSpec(final DirectAddressSpec spec) {
    String _address = spec.getAddress();
    return _address;
  }
  
  protected String _getAddressFromSpec(final NamedAddressSpec spec) {
    String _name = spec.getName();
    String _plus = ("ul_addresses[\'" + _name);
    String _plus_1 = (_plus + "\']");
    return _plus_1;
  }
  
  /**
   * Grouping member
   */
  protected CharSequence _compileMember(final Grouping m, final Constructor c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# initialization for grouping ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("ul_group_");
    String _name_1 = m.getName();
    _builder.append(_name_1, "");
    _builder.append(" = []");
    _builder.newLineIfNotEmpty();
    {
      EList<GroupElement> _elements = m.getElements();
      for(final GroupElement e : _elements) {
        _builder.append("ul_group_");
        String _name_2 = m.getName();
        _builder.append(_name_2, "");
        _builder.append(".append(");
        String _name_3 = m.getName();
        String _plus = ("UL_private_group_" + _name_3);
        StringBuffer _generateGroupAccess = this.generateGroupAccess(e, _plus, c);
        _builder.append(_generateGroupAccess, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("self.");
    String _name_4 = m.getName();
    _builder.append(_name_4, "");
    _builder.append(" = UL_private_group_");
    String _name_5 = m.getName();
    _builder.append(_name_5, "");
    _builder.append("(self.ul_hwp,ul_group_");
    String _name_6 = m.getName();
    _builder.append(_name_6, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringBuffer generateGroupAccess(final GroupElement element, final String groupingName, final Constructor context) {
    final List<String> expansion = Utilities.computeGroupComponents(element, context, "self.", ".");
    List<String> _get = this.groupingMembers.get(groupingName);
    boolean _equals = Objects.equal(_get, null);
    if (_equals) {
      ArrayList<String> _arrayList = new ArrayList<String>();
      this.groupingMembers.put(groupingName, _arrayList);
    }
    for (final String e : expansion) {
      List<String> _get_1 = this.groupingMembers.get(groupingName);
      _get_1.add(e);
    }
    StringBuffer _stringBuffer = new StringBuffer();
    final StringBuffer result = _stringBuffer;
    for (final String b : expansion) {
      {
        int _length = result.length();
        boolean _greaterThan = (_length > 0);
        if (_greaterThan) {
          result.append(",");
        }
        result.append(b);
      }
    }
    return result;
  }
  
  public CharSequence generateGroupingClass(final String className, final List<String> proxyFlatNames) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class ");
    _builder.append(className, "");
    _builder.append("(ul_data_proxy_group):");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("def __init__(self,ul_hwp,ul_proxies):");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("self.ul_hwp = ul_hwp");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int ul_index = 0");
    _builder.newLine();
    {
      for(final String n : proxyFlatNames) {
        _builder.append("\t\t");
        _builder.append("self.ul_proxy_");
        _builder.append(n, "		");
        _builder.append(" = ul_proxies[ul_index]");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("ul_index += 1");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("ul_data_proxy_group.__init__(self, ul_data_proxy_group, \'Group ");
    _builder.append(className, "		");
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def write(self");
    {
      for(final String n_1 : proxyFlatNames) {
        _builder.append(",ul_val_");
        _builder.append(n_1, "	");
      }
    }
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("self._hwp_data_map[self.ul_hwp.getID()].write(addr=[");
    {
      boolean _hasElements = false;
      for(final String n_2 : proxyFlatNames) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "		");
        }
        _builder.append("self.ul_proxy_");
        _builder.append(n_2, "		");
        _builder.append(".addr");
      }
    }
    _builder.append("], data=[");
    {
      for(final String n_3 : proxyFlatNames) {
        _builder.append(",ul_val_");
        _builder.append(n_3, "		");
      }
    }
    _builder.append("], timestamp=None, quiet=True)");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileMember(final Member m, final Constructor c) {
    if (m instanceof Expansion) {
      return _compileMember((Expansion)m, c);
    } else if (m instanceof Grouping) {
      return _compileMember((Grouping)m, c);
    } else if (m instanceof Instantiation) {
      return _compileMember((Instantiation)m, c);
    } else if (m instanceof LinkBinding) {
      return _compileMember((LinkBinding)m, c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(m, c).toString());
    }
  }
  
  public CharSequence compileExpansionAddressBinding(final Expansion m) {
    if (m instanceof AddressExpansion) {
      return _compileExpansionAddressBinding((AddressExpansion)m);
    } else if (m instanceof SimpleExpansion) {
      return _compileExpansionAddressBinding((SimpleExpansion)m);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(m).toString());
    }
  }
  
  public String getNamedProperty(final InstantiationProperty p) {
    if (p instanceof CRCProperty) {
      return _getNamedProperty((CRCProperty)p);
    } else if (p instanceof PublishProperty) {
      return _getNamedProperty((PublishProperty)p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p).toString());
    }
  }
  
  public String getAddressFromSpec(final AddressSpec spec) {
    if (spec instanceof DirectAddressSpec) {
      return _getAddressFromSpec((DirectAddressSpec)spec);
    } else if (spec instanceof NamedAddressSpec) {
      return _getAddressFromSpec((NamedAddressSpec)spec);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(spec).toString());
    }
  }
}
