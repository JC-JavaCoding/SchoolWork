package ForLoops;

import java.util.Scanner;

public class FindLCM
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] num1Multiples = new int[0]; 
      
      //input numbers
      System.out.println("Enter number 1");
      String strFact1 = scan.nextLine();
      System.out.println("Enter number 2");
      String strFact2 = scan.nextLine();
      int num1;
      int num2;
      // convert to integer
      int fact1 = Integer.parseInt(strFact1);
      int fact2 = Integer.parseInt(strFact2);
      
      //int lowestCM = findLCM(fact1, fact2);
      findLCM(fact1, fact2);
      System.out.println("This is the lowest common multiple: ");
   }
   public static int findLCM(int factor1, int factor2)
   {
      boolean lcmFound = false;
      int lcm = 0;
      while (!lcmFound)
      {
         if(factor1 < factor2)
         {
            factor1 += factor1;
            lcmFound = false;
         }
         else if (factor2 < factor1)
         {
            factor2 += factor2;
            lcmFound = false;
         }
         else if (factor1 == factor2)
         {
            lcm += 1;
//             lcmFound = true;
            break;
         }
         else 
         {
            lcmFound = false;
         }
      }
      System.out.println("This is the lowest common multiple: "+ lcm);
      
      return lcm;
   }
}