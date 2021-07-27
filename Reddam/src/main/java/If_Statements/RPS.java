package If_Statements;

import java.util.Scanner;

public class RPS
{
   public static void main(String [] args)
   {
      //initiate variables
      boolean playOn = true;
      for(int i = 0; playOn; i++)
      {
         Scanner scan = new Scanner(System.in);
         String userIn = scan.nextLine();
         
         String winOrLoose = RPSPlay(userIn);
         System.out.println("You "+ winOrLoose);           
         System.out.println("Wanna play again?");
         String playYesNo = scan.nextLine();
         if (playYesNo.equals("yes") || playYesNo.equals("Yes"))
         {
            playOn = true;
         }
         else {playOn = false;}
      }
   }
   
   private static String RPSPlay(String userInput)   
   {
      String winLooseTie = "";
      int cUChoice = (int)Math.random() * 2;
      String[] choiceObject = {"R", "P", "S"};
      
      //for tie
      if (userInput.equals(choiceObject[cUChoice]))
      {
         System.out.println("You tie");
         winLooseTie = "Tie";
      }
      //for Scissors < Paper & for Rock < Scissors
      else if ( (choiceObject[cUChoice].equals("S") && userInput.equals("P")) || (choiceObject[cUChoice].equals("R") && userInput.equals("S")))
      {
         System.out.println("You Loose");
         winLooseTie = "Loose";
      }
      //for Paper > Scissors & For R > Paper
      else if ( (choiceObject[cUChoice].equals("P") && userInput.equals("S")) || (choiceObject[cUChoice].equals("S") && userInput.equals("R")))
      {
         System.out.println("You Win");
         winLooseTie = "Win";
      }
      return winLooseTie;
//       //for Rock < Scissors
//       else if (choiceObject[cUChoice].equals("R") && userInput.equals("S")))
//       {
//          System.out.println("You tie");
//       }
//       //For R > Paper
//       else if (choiceObject[cUChoice].equals("S") && userInput.equals("R")))
//       {
//          System.out.println("You tie");
//       }
   }
}