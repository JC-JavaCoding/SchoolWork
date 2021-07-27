package If_Statements;

import javax.swing.*;

public class CompareNumChars
{
	public static void main(String [] args)
	{
		//Basic variables: 
		String wrd1 = JOptionPane.showInputDialog("Type your first word here: ");  
		String wrd2 = JOptionPane.showInputDialog("Type your second word here:"); 

      if((wrd1.length() < wrd2.length()) || (wrd1.length() == wrd2.length()))
      {
         System.out.println(wrd1 +"\t"+ wrd2);
      }
      else if (wrd1.length() > wrd2.length())
      {
         System.out.println(wrd2 +"\t"+ wrd1);
      }
	}
}