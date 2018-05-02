package Flyweightv2;

import java.util.HashMap;

public class CountryFactory
{
   private static HashMap<Nationality, Country> countries = new HashMap<Nationality, Country>();

   public static Country getNationality(String countryCode, String country)
   {
      Country item = countries.get(new Nationality(countryCode, country));
      if (item == null)
      {
         item = (Country) new Nationality(countryCode, country);
         countries.put(new Nationality(countryCode, country),
               (Country) new Nationality(countryCode, country));
      }
      return item;
   }

   public static void updateCountry(String countryCode, String country)
   {

   }
}
