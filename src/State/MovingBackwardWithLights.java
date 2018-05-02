package State;

public class MovingBackwardWithLights extends CarState
{

   @Override
   public void click(Car car)
   {
      car.setState(Stopped2);
   }


}
