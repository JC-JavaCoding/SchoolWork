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
public class WordGame
{
    public static void main(String[] args)
    {
        String wordIn = JOptionPane.showInputDialog("Welcome to wordgame! Here are the rules:\n1)the word entered must start with the letter the last ended with. \nenter your word!");
        System.out.println("You got "+ doGame(wordIn) +" points");
    }
    private static int doGame(String input)
    {
        int points = 0;
        char endChar = input.charAt(input.length()-1);
        char startChar = endChar;
        
        for(points = 0; endChar == startChar; points++)
        {
            endChar = input.charAt(input.length()-1);
            input = JOptionPane.showInputDialog("Enter a word");
            startChar = input.charAt(0);
        }
        
        return points;
    }
}
