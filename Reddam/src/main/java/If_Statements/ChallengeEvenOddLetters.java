package If_Statements;

import javax.swing.JOptionPane;

public class ChallengeEvenOddLetters
{
   public static void main(String [] args)
   {
      String wordIn = JOptionPane.showInputDialog("Give me a word!!");
      if(wordIn.length()%2 == 0)
      {
         System.out.println("Your number has an even amount of letters.");
      }
      
      else
      {
         System.out.println("Your number has an odd number of letters.");
      }
   }
}