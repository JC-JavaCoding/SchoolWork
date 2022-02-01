/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_Characters;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class ReplaceChar
{
    public static void main(String[] args)
    {
//        String input =  JOptionPane.showInputDialog("Enter a sentence.");
//        String refactored = "";
//        int i = 0;
//        char currChar;
//        
//        while (i < input.length())
//        {
//            currChar = input.charAt(i);
//            
////            if (currChar == ' ') refactored += '*';
////            else refactored += currChar;   
//            
//            i ++;
//        }
        
        //System.out.println("new sentence: "+ refactored);
        
        String input2 =  JOptionPane.showInputDialog("Enter a sentence.");
        String refactored2 = "";
         Scanner sc = new Scanner(input2);
        char currChar2;
        
        while (input2.contains(" "))
        {
            int spaceIndex = input2.indexOf(" ");
            refactored2 = input2.substring(0, (spaceIndex)) + "*" + input2.substring(spaceIndex);//
            //input2 = refactored2;
            System.out.println(refactored2);
        }
        
        System.out.println("new sentence: "+ refactored2);
    }
}
