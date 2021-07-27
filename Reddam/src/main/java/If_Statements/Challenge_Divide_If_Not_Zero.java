package If_Statements;

import javax.swing.JOptionPane;


public class Challenge_Divide_If_Not_Zero
{
   public static void main(String [] args) 
   {
      String strNumber1 = JOptionPane.showInputDialog("Type 1st number to be divided");
      String strNumber2 = JOptionPane.showInputDialog("Type 2nd number to divide");      
      double dblNumber1 = Double.parseDouble(strNumber1);
      double dblNumber2 = Double.parseDouble(strNumber2);      
      double total;
      if (dblNumber2 != 0)
      {
         total = dblNumber1/dblNumber2;
         System.out.println("total: "+ total);
      }
      else
      {
         System.out.println("Cannot divide by 0");
      }
      
   }
}