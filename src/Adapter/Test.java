package Adapter;

public class Test
{

   public static void main(String[] args)
   {
      DigitalTranslator translator=new DigitalTranslator();
      
      translator.translate("bg", "���");
      translator.translate("en", "hello");
      
   }

}
