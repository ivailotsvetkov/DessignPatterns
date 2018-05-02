package Adapter;

public class Test
{

   public static void main(String[] args)
   {
      DigitalTranslator translator=new DigitalTranslator();
      
      translator.translate("bg", "ÇÄÐ");
      translator.translate("en", "hello");
      
   }

}
