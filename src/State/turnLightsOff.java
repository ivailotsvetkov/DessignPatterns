package State;

public class turnLightsOff extends CarState
{

   @Override
   public void click(Car car)
   {
     
   car.setState(turnLightsOn);
   }

}
