package dk.sdu.mmmi.embedix.generator;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class TopicHolder {
  private final String _baseName;
  
  public String getBaseName() {
    return this._baseName;
  }
  
  private final String _rosName;
  
  public String getRosName() {
    return this._rosName;
  }
  
  private final String _pythonName;
  
  public String getPythonName() {
    return this._pythonName;
  }
  
  public TopicHolder(final String baseName, final String rosName, final String pythonName) {
    super();
    this._baseName = baseName;
    this._rosName = rosName;
    this._pythonName = pythonName;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_baseName== null) ? 0 : _baseName.hashCode());
    result = prime * result + ((_rosName== null) ? 0 : _rosName.hashCode());
    result = prime * result + ((_pythonName== null) ? 0 : _pythonName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    TopicHolder other = (TopicHolder) obj;
    if (_baseName == null) {
      if (other._baseName != null)
        return false;
    } else if (!_baseName.equals(other._baseName))
      return false;
    if (_rosName == null) {
      if (other._rosName != null)
        return false;
    } else if (!_rosName.equals(other._rosName))
      return false;
    if (_pythonName == null) {
      if (other._pythonName != null)
        return false;
    } else if (!_pythonName.equals(other._pythonName))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
