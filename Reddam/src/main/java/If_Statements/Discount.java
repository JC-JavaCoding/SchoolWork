package If_Statements;

import javax.swing.*;

public class Discount
{
	public static void main(String [] args)
	{
		//Basic variables: 
		String s = ""; 
		String strObjectPrice = JOptionPane.showInputDialog("How much is your purchase?"); 
	   double objPrice = Double.parseDouble(strObjectPrice);
      double eventualPrice = checkDiscount(objPrice); 
      
      System.out.println("Your price: "+ eventualPrice);
   }
   
   //if > 100: discount 10%
   private static double checkDiscount(double priceIn)
   {
      double total = 0;
      if (priceIn > 100)
      {
         priceIn -= (priceIn * 0.1);
         total = priceIn;
         return total;
      }
      
      total = priceIn;
      return total;
	}
}