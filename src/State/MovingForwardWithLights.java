package State;

public class MovingForwardWithLights extends CarState
{

   @Override
   public void click(Car car)
   {
      car.setState(turnLightsOff);
   }

}
