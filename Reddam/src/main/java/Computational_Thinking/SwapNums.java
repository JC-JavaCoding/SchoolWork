package Computational_Thinking;

import java.util.Scanner;

public class SwapNums
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      //input num values
      System.out.println("what is num1\'s value?");
      String strNum1 = scan.nextLine();
      System.out.println("what is num2\'s value?");
      String strNum2 = scan.nextLine();
      
      //convert to doubles
      double num1 = Double.parseDouble(strNum1);
      double num2 = Double.parseDouble(strNum2);
      
      double temp = num2;
      num2 = num1;
      num1 = temp;
      System.out.println("This is the value of num1: "+ num1 +", and the value of num2: "+ num2);
   }
}