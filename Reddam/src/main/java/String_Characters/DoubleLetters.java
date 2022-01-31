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
public class DoubleLetters
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter a word fool");
        char prevChar = input.charAt(0);
        String output = ""+ prevChar;
        
        for (int i = 1; i < input.length(); i ++)
        {
            if(prevChar != input.charAt(i)) output += input.charAt(i);
            
            prevChar = input.charAt(i);
        }
        
        System.out.println("New word: "+ output);
    }
}
