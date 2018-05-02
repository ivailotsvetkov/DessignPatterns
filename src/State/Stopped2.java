package State;

public class Stopped2 extends CarState
{

   @Override
   public void click(Car car)
   {
      car.setState(turnLightsOn1);
   }

}
