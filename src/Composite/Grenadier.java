package Composite;

public class Grenadier implements Platoon {
   private String position;

   @Override
   public void add(Platoon P) {
      // TODO Auto-generated method stub

   }

   @Override
   public void moveTo(String p) {
      System.out.println("On my way Sir! Moving to " + p);
      position = p;

   }

}
