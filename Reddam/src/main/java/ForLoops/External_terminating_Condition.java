package ForLoops;

import java.util.*;

public class External_terminating_Condition
{
   public static void main(String[] args)
   {
      //start condition
      int startCon;
      int start2 = 2;
      for(startCon = 0; externalBoolean(); startCon ++)
      {
         System.out.println("start variable 1: "+ startCon +", variable 2: "+ start2);
      }
   }
   private static boolean externalBoolean()
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Type something here, mate.");
      String input = scan.nextLine();
      boolean yesNo = ifStatement(input);
      return yesNo;
   }
   private static boolean ifStatement(String in)
   {
      if(in.equals("go"))
      {
         return true;
      }
      return false;
   }
}