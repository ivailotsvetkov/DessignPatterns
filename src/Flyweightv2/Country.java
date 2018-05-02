package Flyweightv2;

public abstract class Country
{
private String countryCode;
private String country;
public Country(String countryCode,String country){
   this.country=country;
   this.countryCode=countryCode;
}
public  void setCountryCode(String countryCode){
   this.countryCode=countryCode;
}
public  void setCountry(String country){
   this.country=country;
}
public  String getCountry(){
   return country;
}
public String getCountryCode(){
   return countryCode;
}
public String toString(){
   return "fdsfsdf";
}
public boolean equals(Object obj){
   if(!(obj instanceof Object)){
      return false;}
   else{
      Country other=(Country) obj;
      return country.equals(other.country)&& countryCode.equals(other.countryCode);
   }
      
}
}
