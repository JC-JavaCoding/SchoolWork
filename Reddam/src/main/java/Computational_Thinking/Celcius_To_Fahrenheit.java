package Computational_Thinking;

import java.util.Scanner;

public class Celcius_To_Fahrenheit
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      
      //input temp in celcius
      System.out.println("What is the celcius temperature?");
      String celciusTemp = scan.nextLine();
      
      // convert to double
      double celciusDouble = Double.parseDouble(celciusTemp);
      double lastVal = fahrenheitCalc(celciusDouble);
      System.out.println("This is the  temperature  in fahrenheit for the \'Mericans!" + lastVal);
      
   }
   public static double fahrenheitCalc(double celcius)
   {
      //do calculation here
      double fahrenheit = (9 * celcius)/5.0 + 32;
      return fahrenheit;
   }
}