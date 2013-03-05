package dk.sdu.mmmi.embedix.generator;

import com.google.common.base.Objects;
import dk.sdu.mmmi.embedix.ulswig.AddressBinding;
import dk.sdu.mmmi.embedix.ulswig.AddressExpansion;
import dk.sdu.mmmi.embedix.ulswig.AddressSpec;
import dk.sdu.mmmi.embedix.ulswig.Argument;
import dk.sdu.mmmi.embedix.ulswig.Constructor;
import dk.sdu.mmmi.embedix.ulswig.Expansion;
import dk.sdu.mmmi.embedix.ulswig.Grouping;
import dk.sdu.mmmi.embedix.ulswig.Instantiation;
import dk.sdu.mmmi.embedix.ulswig.LinkBinding;
import dk.sdu.mmmi.embedix.ulswig.LinkProperty;
import dk.sdu.mmmi.embedix.ulswig.LinkSpec;
import dk.sdu.mmmi.embedix.ulswig.Member;
import dk.sdu.mmmi.embedix.ulswig.SimpleExpansion;
import dk.sdu.mmmi.embedix.ulswig.TosNetLinkBinding;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class PythonCompiler {
  public CharSequence generate(final LinkSpec link) {
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
      EList<Constructor> _constructors = link.getConstructors();
      for(final Constructor c : _constructors) {
        CharSequence _compile = this.compile(c);
        _builder.append(_compile, "");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder;
  }
  
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
    _builder.append("):");
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
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def bind(self,ul_addresses):");
    _builder.newLine();
    {
      EList<Member> _members = c.getMembers();
      for(final Member m : _members) {
        _builder.append("\t\t");
        CharSequence _compileMember = this.compileMember(m);
        _builder.append(_compileMember, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
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
  
  protected CharSequence _compileMember(final LinkBinding m) {
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
  
  protected CharSequence _compileMember(final Expansion m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# initialization for ");
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
    _builder.append(")");
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
        _builder.append(_name_1, "	");
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
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
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
        String _plus_3 = (_lhs + "+");
        Argument _rhs = a.getRhs();
        String _compileArgument = this.compileArgument(_rhs);
        String _plus_4 = (_plus_3 + _compileArgument);
        _xifexpression_1 = _plus_4;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _compileMember(final Instantiation m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# initialization for ");
    AddressSpec _address = m.getAddress();
    String _name = _address.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _compileMember(final Grouping m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# initialization for ");
    String _name = m.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileMember(final Member m) {
    if (m instanceof Expansion) {
      return _compileMember((Expansion)m);
    } else if (m instanceof Grouping) {
      return _compileMember((Grouping)m);
    } else if (m instanceof Instantiation) {
      return _compileMember((Instantiation)m);
    } else if (m instanceof LinkBinding) {
      return _compileMember((LinkBinding)m);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(m).toString());
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
}
