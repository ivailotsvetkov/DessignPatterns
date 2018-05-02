package Facade;

import FacadeSystemX.A;
import FacadeSystemX.B;

public class SystemXFacade
{
   public int calculateAB()
   {
      A a = new A();
      B b = new B();
      int c = b.bMethod(a.aMethod(5));

      return c;
   }
}