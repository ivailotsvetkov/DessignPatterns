package State;

public abstract class CarState implements CarConstants
{
public abstract void click(Car car);
public String status() {
   String s = getClass().getName();
   return s.substring(s.lastIndexOf('.') + 1);
}
public void stop(Car car)
{
}
}
