package Composite;

public class Test
{

   public static void main(String argv[])
   {
      Platoon platoon = new Unit();

      platoon.add(new Soldier());
      platoon.add(new Soldier());
      platoon.add(new Soldier());

      Platoon army = new Unit();

      army.add(platoon);
      army.add(new Soldier());
      army.add(new Grenadier());
      army.add(new Grenadier());

      army.moveTo("The hill");
   }
}
