package dk.sdu.mmmi.embedix.generator;

import com.google.common.base.Objects;
import dk.sdu.mmmi.embedix.ulswig.Constructor;
import dk.sdu.mmmi.embedix.ulswig.Expansion;
import dk.sdu.mmmi.embedix.ulswig.GroupElement;
import dk.sdu.mmmi.embedix.ulswig.Member;
import dk.sdu.mmmi.embedix.ulswig.PathElement;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class Utilities {
  public static List<String> computeGroupComponents(final GroupElement element, final Constructor context, final String head, final String dot) {
    List<String> _xblockexpression = null;
    {
      ArrayList<StringBuffer> _arrayList = new ArrayList<StringBuffer>();
      final ArrayList<StringBuffer> expansion = _arrayList;
      EList<PathElement> _path = element.getPath();
      for (final PathElement segment : _path) {
        String _simple = segment.getSimple();
        boolean _notEquals = (!Objects.equal(_simple, null));
        if (_notEquals) {
          ArrayList<String> _arrayList_1 = new ArrayList<String>();
          final List<String> x = _arrayList_1;
          String _simple_1 = segment.getSimple();
          x.add(_simple_1);
          Utilities.addGroupAccessSegment(expansion, x, head, dot);
        } else {
          Constructor _type = segment.getType();
          final ArrayList<String> name = Utilities.findAllDeclarations(context, _type);
          Utilities.addGroupAccessSegment(expansion, name, head, dot);
        }
      }
      final Function1<StringBuffer,String> _function = new Function1<StringBuffer,String>() {
          public String apply(final StringBuffer x) {
            String _string = x.toString();
            return _string;
          }
        };
      List<String> _map = ListExtensions.<StringBuffer, String>map(expansion, _function);
      _xblockexpression = (_map);
    }
    return _xblockexpression;
  }
  
  public static ArrayList<String> findAllDeclarations(final Constructor context, final Constructor target) {
    ArrayList<String> _arrayList = new ArrayList<String>();
    final ArrayList<String> result = _arrayList;
    EList<Member> _members = context.getMembers();
    for (final Member m : _members) {
      boolean _matched = false;
      if (!_matched) {
        if (m instanceof Expansion) {
          final Expansion _expansion = (Expansion)m;
          if (Objects.equal(m,_expansion)) {
            _matched=true;
            Constructor _constructor = _expansion.getConstructor();
            boolean _equals = Objects.equal(_constructor, target);
            if (_equals) {
              String _name = _expansion.getName();
              result.add(_name);
            }
          }
        }
      }
    }
    return result;
  }
  
  public static void addGroupAccessSegment(final List<StringBuffer> list, final List<String> strings, final String head, final String dot) {
    int _size = list.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      for (final String s : strings) {
        String _plus = (head + s);
        StringBuffer _stringBuffer = new StringBuffer(_plus);
        list.add(_stringBuffer);
      }
    } else {
      for (final StringBuffer ref : list) {
        for (final String s_1 : strings) {
          String _plus_1 = (dot + s_1);
          ref.append(_plus_1);
        }
      }
    }
  }
}
