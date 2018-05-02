package Adapter;

public class BulgarianAdapter implements Translator
{
AdvancedTranslator advancedTranslator;
public BulgarianAdapter(String wordType){
   if(wordType.equalsIgnoreCase("bg")){
      advancedTranslator=new BulgarianTranslate();
   }
   else if(wordType.equalsIgnoreCase("en")){
      advancedTranslator=new EnglishTranslate();
   }
}
   @Override
   public void translate(String wordType, String word)
   {
      if(wordType.equalsIgnoreCase("bg")){
         advancedTranslator.translateFromBulgarian(word);
      }
      else if(wordType.equalsIgnoreCase("en")){
         advancedTranslator.translateFromEnglish(word);
      }
   }

}
