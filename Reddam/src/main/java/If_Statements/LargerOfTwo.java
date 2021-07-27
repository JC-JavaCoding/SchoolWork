package If_Statements;

import javax.swing.*;

public class LargerOfTwo
{
	public static void main(String [] args)
	{
		//Basic variables: 
		String strNum1 = JOptionPane.showInputDialog("First number?");  
		String strNum2 = JOptionPane.showInputDialog("Second number?"); 
		double num1 = Double.parseDouble(strNum1); 
		double num2 = Double.parseDouble(strNum2); 
      
      //find largest
      if (num1 > num2)
      {
         System.out.println(num1 +" is greater than "+ num2);
      }
      
      else if (num1 < num2)
      {
         System.out.println(num1 +" is smaller than "+ num2);
      }
      
      else 
      {
         System.out.println(num1 +" and "+ num2 +" is equal");
      }
	}
}