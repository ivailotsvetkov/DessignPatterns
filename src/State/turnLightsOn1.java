package State;

public class turnLightsOn1 extends CarState
{

   @Override
   public void click(Car car)
   {
      car.setState(turnLightsOff1);
   }

}
