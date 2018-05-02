package Observerv2;

import java.util.Observable;
import java.util.Observer;

public class FootballFan implements Observer
{
   private boolean homeTeamFan;
   private FootballGame game;

   public FootballFan(FootballGame game, boolean homeTeamFan)
   {
      this.homeTeamFan = homeTeamFan;
      this.game = game;
      game.addObserver(this);

   }

   public void cheer()
   {
      System.out.println("WOWOWOWO");
   }

   public void reactOnGoal(boolean isHomeTeam)
   {

      if (homeTeamFan)
      {
         if (isHomeTeam)
         {
            cheer();
         }
         else
         {
            System.out.println("BOOOOOOO");
         }
      }
      else
      {
         if (!isHomeTeam)
         {
            cheer();
         }
         else
         {
            if (isHomeTeam)
            {
               System.out.println("BOOOOOOO");

            }
         }
      }

   }

   @Override
   public void update(Observable o, Object arg)
   {
      reactOnGoal(homeTeamFan);
   }

}