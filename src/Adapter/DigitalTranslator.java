package Adapter;

public class DigitalTranslator implements Translator
{
EnglishTranslate adapter;
   @Override
   public void translate(String wordType, String word)
   {
      if(wordType.equalsIgnoreCase("bg")||word.equalsIgnoreCase("���" )){
         System.out.println("Translating bulgarian: Hello ");
      }
      else if (wordType.equalsIgnoreCase("en")||word.equalsIgnoreCase("hello")){
         System.out.println("Translating english: ��� ");
      }
      else{
         System.out.println("Invalid word type."+wordType+"word not supported. ");
      }
   }

}
