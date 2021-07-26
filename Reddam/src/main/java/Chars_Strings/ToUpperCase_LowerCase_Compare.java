/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chars_Strings;

import javax.swing.JOptionPane;

/**
 *
 * @author jjaac
 */
public class ToUpperCase_LowerCase_Compare
{
    public static void main(String[] args)
    {
        String word1 = JOptionPane.showInputDialog("First word.");
        String word2 = JOptionPane.showInputDialog("Second word.");
        String alphabetical = "";
        int result = word1.compareTo(word2);
        
        if (result > 0)
        {
            alphabetical = word2;
        }
        else if (result < 0)
        {
            alphabetical = word1;
        }
        else 
        {
            System.out.println("Your words are the same you fool!");
            alphabetical = word1;
        }
        
        System.out.println("Word: \""+ alphabetical +"\" is more alphabetical.");
        alphabetical = alphabetical.toUpperCase();
        System.out.println(alphabetical);
    }
}
