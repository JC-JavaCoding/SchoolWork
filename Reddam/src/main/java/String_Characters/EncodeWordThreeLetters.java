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
public class EncodeWordThreeLetters
{
    public static void main(String[] args)
    {
        //get input
        String input = JOptionPane.showInputDialog("Enter a word");
        
        System.out.println("new string: "+ convert(input));
    }
    private static String convert(String input)
    {
        String output = "";
        
        //make uppercase:
        output = input.toUpperCase();
        
        if (longerThan3Char(output))
        {
            output = moveChars(output);
            output = encode(output);
        }
        else 
        {
            output = reverse(output);
            output = encode(output);
        }
        return output;
    }
    private static boolean longerThan3Char(String input)
    {
        if (input.length() > 3) return true;
        return false;
    }
    private static String moveChars(String input)
    {
        String output = "";
        
        output += input.substring(0, 2) + input.substring(3, input.length()-1);
        
        return output;
    }
    private static String encode(String input)
    {
        String output = "";
        
        for (char c: input.toCharArray())
        {
            switch(c)
            {
                case 'z':
                    output += "a";
                    break;
                default:
                    output += (char)((int)c + 1);
            }
        }
        
        return output;
    }
    private static String reverse(String input)
    {
        String output = "";
        
        for (int i = input.length(); i >=0; i++)
        {
            output += input.charAt(i);
        }
        
        return output;
    }
}
