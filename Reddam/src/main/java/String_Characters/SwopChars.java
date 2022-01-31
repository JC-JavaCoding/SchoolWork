/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_Characters;

import javax.swing.JOptionPane;

/**
 *
 * @author janch
 */
public class SwopChars
{
    public static void main(String[] args)
    {
        String wrd1 = JOptionPane.showInputDialog("Enter a word");
        String wrd2 = JOptionPane.showInputDialog("Enter a word again");
        
        char c1 = wrd1.charAt(0);
        char c2 = wrd2.charAt(0);
        
        System.out.println("Word 1: "+ swopSChars(c2, wrd1));
        System.out.println("Word 2: "+ swopSChars(c1, wrd2));
        
    }
    private static String swopSChars(char c, String str)
    {
        String output = ""+c;
        
        for (int i = 1; i < str.length(); i++)
        {
            output += str.charAt(i);
        }
        
        return output;
    }
}
