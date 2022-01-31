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
        
        //get first and last
        System.out.println( getFirstLastOf(input));
        
        //get backwards form
        System.out.println("Backwards: "+ getBackwards(input));
        
        //get  from front back alternating
        System.out.println("Alternaating: "+ getAlternating(input));
        
        //get the middle character
        System.out.println("Middle character: "+ getMiddleChar(input));
        
        //get vowels
        System.out.println("Vowels: "+ getVowelsOf(input));
        
        //get spaces
        System.out.println("White space: "+ getWhiteSpaceOf(input));
        
    }
    private static String getFirstLastOf(String input)
    {
        String output = "first letter: "+input.charAt(0) +", last letter: "+ input.charAt(input.length() - 1);
        
        return output;
    }
    private static String getBackwards(String s)
    {
        //initialize
        String output = "";
        
        //main
        for (int i = s.length()-1; i >= 0; i--)
        {
            output += s.charAt(i);
        }
        
        return output;
    }
    private static String getAlternating(String input)
    {
        String output = "";
        
        //use: even odd
        for (int i = 1; i <= input.length()/2; i++)
        {
            output += "\n"+ input.charAt(i - 1) ;
            output += "\n"+ input.charAt(input.length() - i);
       }//end for 
        
        return output;
    }
    private static String getMiddleChar(String input)
    {
        String output = "";
        
        if (input.length() % 2 == 0) output = ""+ input.charAt(input.length()/2) +""+ input.charAt(input.length()/2 +1);
        else output = ""+ input.charAt(input.length()/2);
        
        return output;
    }
    private static String getVowelsOf(String input)
    {
        String output = "";
        
        for (char c : input.toCharArray())
        {
            switch (c)
            {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    output += c;
                    break;
                default:
            }
        }
        
        return output;
    }
    private static int getWhiteSpaceOf(String input)
    {
        int numSpaces = 0;
        
        for (char c: input.toCharArray())
        {
            if (Character.isWhitespace(c)) numSpaces ++;
        }
        
        return numSpaces;
    }
}
