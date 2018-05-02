package Observerv2;

public class Test
{

   public static void main (String[] args)
   {
      FootballGame game = new FootballGame("Rilski", "CSKA");
     
      
      new Scoreboard(game);
      new FootballFan(game, false);
      
      game.scoreGoal("Rilski");
      game.scoreGoal("Rilski");
      game.scoreGoal("CSKA");
      game.scoreGoal("Rilski");
      game.scoreGoal("Rilski");
      game.scoreGoal("CSKA");
      game.scoreGoal("Rilski");
      game.scoreGoal("Rilski");
      game.scoreGoal("Rilski");


      
      
      
   }

}
