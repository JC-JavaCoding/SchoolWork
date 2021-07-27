package If_Statements;

import javax.swing.*;

public class Driving
{
	public static void main(String [] args)
	{
		//Basic variables: 
		String strDriverAge = JOptionPane.showInputDialog("What is your age?"); 
		double driverAge = Double.parseDouble(strDriverAge); 
		int j = 0;
      
      //test legality of driver on road
		if (driverAge >= 18 && driverAge <= 75)
      {
         System.out.println("Age Ok. Have you got a driving license?");
      }
      
      else if (driverAge < 18)
      {
         System.out.println("Too young to drive. GET OFF THE ROAD YOU MUPPET!");
      }
      
      else 
      {
         System.out.println("SORRY, YOU ARE OVER THE LEGAL AGE LIMIT FOR DRIVING.");
      }
	}
}