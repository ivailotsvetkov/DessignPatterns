package Flyweightv2;

public class Student
{
   private int studyNumber;
   private Name name;
   private Country country;

   public Student(int studyNumber, String firstName, String lastName,
         String countryCode, String country)
   {

      this.name = new Name(firstName, lastName);
      this.studyNumber = studyNumber;
      this.country = CountryFactory.getNationality(countryCode, country);
   }

   public Name getName()
   {
      return name;

   }

   public Country getNationality()
   {
      return country;
   }

   public int getStudyNumber()
   {
      return studyNumber;
   }

   public void setName(Name name)
   {
      this.name = name;
   }

   public void setNationality(String countryCode, String country)
   {

      this.country = CountryFactory.getNationality(countryCode, country);
   }

   public void setStudyNumber(int studyNumber)
   {
      this.studyNumber = studyNumber;
   }

   public String toString()
   {
      return "Student ,number: " + studyNumber + "name: " + name + " "
            + country.toString();
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Student))
      {
         return false;
      }
      else
      {
         Student other = (Student) obj;
         return studyNumber == other.studyNumber
               && country.equals(other.country) && name.equals(other.name);
      }
   }
}
