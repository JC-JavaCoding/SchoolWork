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
public class CountWords
{
    public static void main(String[] args)
    {
        int count = 0;
        String word = JOptionPane.showInputDialog("Insert word, \'stop\' to exit");
        while(! word.equalsIgnoreCase("stop"))
        {
            count ++;
            word = JOptionPane.showInputDialog("Insert word, \'stop\' to exit");
        }
        
        System.out.println("Total number of words entered is: "+ count);
    }
}
