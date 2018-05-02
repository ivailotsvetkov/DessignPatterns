package DieFactory;

public class Die4Side implements Die
{

   @Override
   public void throwDie()
   {
      int value;
      value = (int) (Math.random() * 4 + 1);
      System.out.println(value + " out of 4");

   }

}