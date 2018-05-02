package Observerv2;

import java.util.Observable;
import java.util.Observer;

public class Scoreboard implements Observer
{
   private FootballGame game;
   
   Scoreboard(FootballGame game){
      this.game = game;
      game.addObserver(this);
   }
   
   public void showScore(){
      game.getScore();
   }
   
   @Override
   public void update(Observable o, Object arg) {
      System.out.println(game.getScore());
     
   }

  
   
}