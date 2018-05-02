package Singleton;

public class Singleton2
{
   private static Singleton2 instance = null;

   private Singleton2()
   {
   }

   public static Singleton2 getInstance()
   {
      if (instance == null)
      {
         instance = new Singleton2();
      }

      return instance;
   }

   public void whatEverMethod()
   {
      System.out.println("Hello Singleton");
   }

}
