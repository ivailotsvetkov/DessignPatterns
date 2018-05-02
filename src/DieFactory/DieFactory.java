package DieFactory;

public class DieFactory
{
   public static Die getDie(String criteria)
   {
      if (criteria.equals("4"))
         return new Die4Side();
      else if (criteria.equals("6"))
         return new Die6Side();
      return null;
   }

}