package Facade;

public class Client2UsingFacade {
   public void calculateAB() {

      SystemXFacade systemXFacade = new SystemXFacade();
      System.out.println("the result is: " + systemXFacade.calculateAB());

   }
}
