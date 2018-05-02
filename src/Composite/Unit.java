package Composite;

import java.util.LinkedList;

public class Unit implements Platoon {

   @Override
   public void add(Platoon P) {
      units.add(P);

   }

   @Override
   public void moveTo(String p) {
      for (Platoon unit : units)
         unit.moveTo(p);

   }

   private LinkedList<Platoon> units;

   public Unit() {
      units = new LinkedList<Platoon>();
   }

}
