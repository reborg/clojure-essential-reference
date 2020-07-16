import java.beans.PropertyChangeSupport;
import java.beans.PropertyChangeListener;

public class ClassWithProperty { // <1>
   private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
   private String value;

   public String getValue() { return this.value; }

   public void addPropertyChangeListener(PropertyChangeListener listener) {
       this.pcs.addPropertyChangeListener(listener);
   }

   public void setValue(String newValue) { // <2>
       String oldValue = this.value;
       this.value = newValue;
       this.pcs.firePropertyChange("value", oldValue, newValue);
   }
}