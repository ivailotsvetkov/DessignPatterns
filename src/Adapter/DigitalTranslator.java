package Adapter;

public class DigitalTranslator implements Translator
{
EnglishTranslate adapter;
   @Override
   public void translate(String wordType, String word)
   {
      if(wordType.equalsIgnoreCase("bg")||word.equalsIgnoreCase("ÇÄÐ" )){
         System.out.println("Translating bulgarian: Hello ");
      }
      else if (wordType.equalsIgnoreCase("en")||word.equalsIgnoreCase("hello")){
         System.out.println("Translating english: ÇÄÐ ");
      }
      else{
         System.out.println("Invalid word type."+wordType+"word not supported. ");
      }
   }

}
