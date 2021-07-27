package If_Statements;

import javax.swing.*;

public class EasterDate
{
	public static void main(String [] args)
	{
		//Basic variables: 
		String month; 
		String strEasterForYear = JOptionPane.showInputDialog("What year's Easter date do you wish to find?"); 
		int easterYrInt = Integer.parseInt(strEasterForYear);
       
		int a, b, c, d, e, f, g, day;
      a = easterYrInt - 1900;
      b = a % 19;
      c = (7*b + 1) / 19;
      d = (11*b + 4 -c) % 19;
      e = a / 4;
      f = (a + e + 31 - d) % 7;
      g = 25 - d - f;
      
      if (g <= 0)
      {
         month = "March";
         day = 31 + g;
      }
      else 
      {
         month = "April";
         day = g;
      }
		
      System.out.println("Easter was/is "+ day + month +" in "+ easterYrInt);
	}
}