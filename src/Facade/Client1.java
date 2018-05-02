package Facade;

import FacadeSystemX.A;
import FacadeSystemX.B;

public class Client1 {
   public void calculateAB() {
      A a = new A();
      B b = new B();
      int c = b.bMethod(a.aMethod(5));

      System.out.println("the result is: " + c);

   }
}
