package State;



public class Car implements CarConstants
{
private CarState state=Stopped;
public void click() {
   state.click(this);
}



public void setState(CarState state) {
   this.state = state;
   //  setChanged();
}

public String status() {
   return state.status();
}

public void stop() {
   state.stop(this);
}
}

