package If_Statements;

import javax.swing.*;

public class TestAnotherNumber
{
	//is number positive or negative? //is number even or odd? //is num a factor of 7?
   public static String posOrNeg, evenOrOdd, factorOf7; 

   
   public static void main(String [] args)
	{
		//Basic variables: 
		String strNum = JOptionPane.showInputDialog("Give me a number"); 
		double dNum = Double.parseDouble(strNum); 
            
      //test number for conditions
      checkNum(dNum);
      
      //output answer
		System.out.println("Your number is "+ posOrNeg +", an "+ evenOrOdd +" number, and " + factorOf7);
	}
   
   private static void checkNum(double inNumber)
   {
      //run all the other checks methods in here
      posOrNeg = isPositive(inNumber);
      evenOrOdd = isEven(inNumber);
      factorOf7 = isFactor7(inNumber);
   }
   
   private static String isPositive(double inputNum)
   {
      //is num positive or negative?
      String posOrNeg;
      
      if (inputNum > 0)
      {
         posOrNeg = "positive";
      }
      
      else if(inputNum < 0)
      {
         posOrNeg = "negative";
      }
      
      else 
      {
         posOrNeg = "0";
      }
      
      return posOrNeg;
   }
   
   private static String isEven(double inputNum)
   {
      //is number even or odd?
      String evenOrOdd;
      
      if (inputNum % 2 == 0)
      {
         evenOrOdd = "even";
      }
      
      else 
      {
         evenOrOdd = "odd";
      }
      
      return evenOrOdd;
   }
   
   private static String isFactor7(double inputNum)
   {
      //is number divisable by 7?
      String factorOf7;
      
      if (inputNum % 7 == 0)
      {
         factorOf7 = "is divisable by seven(7)";
      }
      
      else 
      {
         factorOf7 = "is not divisable by seven(7)";
      }
      
      return factorOf7;
   }
}