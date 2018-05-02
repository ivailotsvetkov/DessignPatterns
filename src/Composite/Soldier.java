package Composite;

public class Soldier implements Platoon {
   private String position;

   @Override
   public void add(Platoon P) {
      // TODO Auto-generated method stub

   }

   @Override
   public void moveTo(String p) {
      System.out.println("Yes, Sir! Moving to " + p + ", Sir!");
      position = p;

   }

}
