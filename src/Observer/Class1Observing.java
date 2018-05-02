package Observer;

import java.util.Observable;
import java.util.Observer;

public class Class1Observing implements Observer
{
   private String name;
   private ClassBeingObserved observable;

   public Class1Observing(String name, ClassBeingObserved obs)
   {
      this.name = name;
      observable = obs;
      observable.addObserver(this);
   }

   @Override
   public void update(Observable o, Object arg)
   {
      // TODO Auto-generated method stub

   }
}