package State;

public class turnLightsOff1 extends CarState
{

   @Override
   public void click(Car car)
   {
      car.setState(MovingForwardWithLights1);
   }

}
