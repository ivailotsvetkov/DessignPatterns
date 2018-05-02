package DieFactory;

public class Test
{
   public static void main(String[] args)
   {
      Die die = DieFactory.getDie("4");
      die.throwDie();
      die.throwDie();
      die.throwDie();
      die.throwDie();
      die.throwDie();

      die = DieFactory.getDie("6");
      die.throwDie();
      die.throwDie();
      die.throwDie();
      die.throwDie();
      die.throwDie();

   }
}
