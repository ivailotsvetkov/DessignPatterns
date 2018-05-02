package State;

public class Stopped extends CarState
{

   @Override
   public void click(Car car)
   {
      car.setState(MovingForwardWithLights);

   }

}
