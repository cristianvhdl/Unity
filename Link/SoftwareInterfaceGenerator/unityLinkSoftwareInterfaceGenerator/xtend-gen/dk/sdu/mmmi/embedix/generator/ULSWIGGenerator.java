package dk.sdu.mmmi.embedix.generator;

import com.google.common.collect.Iterables;
import dk.sdu.mmmi.embedix.generator.PythonCompiler;
import dk.sdu.mmmi.embedix.ulswig.LinkSpec;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class ULSWIGGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<LinkSpec> _filter = Iterables.<LinkSpec>filter(_iterable, LinkSpec.class);
    for (final LinkSpec e : _filter) {
      String _name = e.getName();
      String _plus = ("unitylink/python/" + _name);
      String _plus_1 = (_plus + ".py");
      CharSequence _compile = this.compile(e);
      fsa.generateFile(_plus_1, _compile);
    }
  }
  
  public CharSequence compile(final LinkSpec spec) {
    PythonCompiler _pythonCompiler = new PythonCompiler();
    return _pythonCompiler.generate(spec);
  }
}
