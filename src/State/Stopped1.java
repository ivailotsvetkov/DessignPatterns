package State;

public class Stopped1 extends CarState
{

   @Override
   public void click(Car car)
   {
      car.setState(turnLightsOff);
   }

}
