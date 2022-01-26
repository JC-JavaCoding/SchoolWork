/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_Characters;

import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class IsolateChars
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter word");
        
        //get backwards form
        System.out.println("Backwards: "+ getBackwards(input));
        
        //get  from front back alternating
        
    }
    private static String getBackwards(String s)
    {
        //initialize
        String output = "";
        
        //main
        for (int i = s.length()-1; i > 0; i--)
        {
            output += s.charAt(i);
        }
        
        return output;
    }
    private static String getAlternating(String input)
    {
        String output = "";
        
        //use: even odd
        for (int i = 1; i <= input.length(); i++)
        {
            //if odd
            if (i % 2 != 0)
            {
                
            }//end if odd
            else
            {
                
            }//end else even
        }//end for 
        
        return output;
    }
}
