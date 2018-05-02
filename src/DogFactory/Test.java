package DogFactory;

public class Test
{
   public static void main(String[] args)
   {
      Dog dog = DogFactory.getDog("small");
      dog.speak();

      dog = DogFactory.getDog("big");
      dog.speak();

   }
}
