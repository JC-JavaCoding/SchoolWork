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
public class EncodeWord
{
    public static void main(String[] args)
    {
        String wrd1 = JOptionPane.showInputDialog("Enter a word");
        
        System.out.println(encode(wrd1));
    }
    private static String encode(String word)
    {
        String output = "";
        
        for(char c : word.toCharArray())
        {
            switch(c)
            {
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    output += (char) ((int) c -1);
                    break;
                 default:
                    output += (char)((int)c +1);
            }
        }
        
        return output;
    }
}
