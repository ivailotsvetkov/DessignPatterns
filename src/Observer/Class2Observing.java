package Observer;

import java.util.Observable;
import java.util.Observer;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Class2Observing extends JFrame implements Observer
{
   private JLabel label1;
   private JTextField textField1;
   private ClassBeingObserved observable;

   public Class2Observing(ClassBeingObserved obs)
   {
      // ...
      observable = obs;
      observable.addObserver(this);
   }

   @Override
   public void update(Observable arg0, Object arg1)
   {
      // TODO Auto-generated method stub

   }
}