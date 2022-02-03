/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.PastPaper2022T1Cycle;

import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class RemoveChars
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter some string");
        String unwanted = JOptionPane.showInputDialog("Enter unwanted characters/letters");
        System.out.println("Output: "+ getFiltered(input, unwanted));
    }
    private static String getFiltered(String input, String unwanted)
    {
        String output = "";
        
        for (char c: unwanted.toCharArray())
        {
            while (input.contains(""+c)) 
            {
                input = input.substring(0, input.indexOf(""+c)) + input.substring(input.indexOf(""+ c)+1);
            }
        }
        output = input;
        return output;
    }
}
