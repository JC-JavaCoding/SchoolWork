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
public class LastInLast
{
    public static void main(String[] args)
    {
        //setup variables
        String input = JOptionPane.showInputDialog("Enter name");
        String mostAlphabetic = input;
        int count;
        for (count = 0; !input.equals("@@@"); count++)
        {
            mostAlphabetic = getMostAlphabetical(input, mostAlphabetic);
            input = JOptionPane.showInputDialog("Enter name");
        }
        
        System.out.println("MostAlphabetic name: "+ mostAlphabetic +"\nNumber of names entered: "+ count);
    }
    private static String getMostAlphabetical (String str1, String str2)
    {
        String mostAlphabetic = "";
        
        if (str1.compareTo(str2) > 0) mostAlphabetic = str2;
        else mostAlphabetic = str1;
        
        return mostAlphabetic;
    }
}
