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
public class CountIn
{
    public static void main(String[] args)
    {
//        String input = JOptionPane.showInputDialog("Enter a sentence");
//        Scanner sc = new Scanner(input);
//        int count = 0;
//        while (sc.hasNext())
//        {
//            if (sc.next().equalsIgnoreCase("in")) count ++;
//        }
//        System.out.println(""+ count);
        String input = JOptionPane.showInputDialog("Enter a sentence");
        String findValue = " in ";
        int count;
        for (count  = 0; input.contains(findValue); count ++)
        {
            input = input.substring(input.indexOf(findValue)+1);
        }
        System.out.println(""+ count);
    }
}
