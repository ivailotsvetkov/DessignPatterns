package Observer;

import java.util.Observable;

public class ClassBeingObserved extends Observable {
   private int value;

   public ClassBeingObserved() {
      this.value = 0;
   }

   public int getValue() {
      return value;
   }

   public void setValue(int value) {
      this.value = value;
      setChanged();
      notifyObservers(getValue());
   }
}