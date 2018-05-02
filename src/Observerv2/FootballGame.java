package Observerv2;

import java.util.Observable;
import java.util.Observer;

public class FootballGame extends Observable
{
   private int homeTeamGoal, awayTeamGoal;
   private String homeTeam, awayTeam;

   public FootballGame(String homeTeam, String awayTeam)
   {
      homeTeamGoal = 0;
      awayTeamGoal = 0;
      this.awayTeam = awayTeam;
      this.homeTeam = homeTeam;
   }

   public String getHomeTeam()
   {
      return homeTeam;
   }

   public String getAwayTeam()
   {
      return awayTeam;
   }

   public void scoreGoal(String team)
   {
      if (team.equals(homeTeam))
      {
         homeTeamGoal++;
         setChanged();
         notifyObservers(homeTeamGoal);
      }

      else
      {
         awayTeamGoal++;
         setChanged();
         notifyObservers(awayTeamGoal);
         
      }

   }

   public String getScore()
   {
      return homeTeam + " " + homeTeamGoal + ":" + awayTeamGoal + " "
            + awayTeam;

   }

}
