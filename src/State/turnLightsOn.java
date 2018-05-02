package State;

public class turnLightsOn extends CarState
{

   @Override
   public void click(Car car)
   {
     car.setState(MovingBackwardWithLights);
   }

}
