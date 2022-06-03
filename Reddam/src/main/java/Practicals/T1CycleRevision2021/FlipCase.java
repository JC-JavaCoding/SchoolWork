/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.T1CycleRevision2021;

import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class FlipCase
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Input string");
        System.out.println("Refactored: "+ reverseCase(input));
    }
    private static String reverseCase(String input)
    {
        String output = "";
        
        for (char c: input.toCharArray())
        {
            String charStr = "" + c;
            //if lowercase
            if(Character.isLowerCase(c)) output += charStr.toUpperCase();
            
            //if uppercase
            else if(Character.isUpperCase(c)) output += charStr.toLowerCase();
            
            else output += c;
        }
        
        return output;
    }
}
