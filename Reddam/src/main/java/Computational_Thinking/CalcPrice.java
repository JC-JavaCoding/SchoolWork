package Computational_Thinking;

import java.util.Scanner;

public class CalcPrice
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("What is the original price of the T-Shirt?");
      String tPrice = scan.nextLine();
      double doublePrice = Double.parseDouble(tPrice);
      double vat = 0.15;
      double discount = 0.05 * doublePrice;
      double discountPrice = (doublePrice - discount);
      double vatPrice = vat* discountPrice;
      double total = discountPrice + vatPrice;
      System.out.println("this is the last total: "+ total);
   }
}