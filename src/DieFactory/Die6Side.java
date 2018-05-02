package DieFactory;

public class Die6Side implements Die
{

   @Override
   public void throwDie()
   {
      int value;
      value = (int) (Math.random() * 6 + 1);
      System.out.println(value + " out of 6");

   }

}