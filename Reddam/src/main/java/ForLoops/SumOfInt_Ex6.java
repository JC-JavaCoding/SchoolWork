package ForLoops;

import javax.swing.*;

public class SumOfInt_Ex6
{
   public static void main(String [] args)
   {
      //1:
      String strNumInts = JOptionPane.showInputDialog("How many Integers do you wish to type?");
      int numInts = Integer.parseInt(strNumInts);
      int total = 0;
      int avg; 
      int numPositives = 0;
      int numNegatives = 0;
      int numGreater10 = 0;
      for( int i = 0; i < numInts; i++)
      {
         String strCurrentNum =JOptionPane.showInputDialog("Enter the integer here:");
         int currentNum = Integer.parseInt(strCurrentNum);
         total += currentNum;
         //for 1.5
         if (currentNum < 0)
         {
            numNegatives ++;
         }
         else if (currentNum > 0)
         {
            numPositives ++;
         }
         else if (currentNum > 10)
         {
            numGreater10 ++;
         }
      }
      avg = total / numInts;
      System.out.println("The average: "+ avg + ", and the num of integers entered: "+ numInts +", the number of positive numbers: "+ numPositives + ", the number of negatives: "+ numNegatives + ", the number nums greater than 10: " + numGreater10);
   }
}