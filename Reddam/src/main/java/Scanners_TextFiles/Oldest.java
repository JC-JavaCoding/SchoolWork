/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanners_TextFiles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class Oldest
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter name and age");
        Scanner sc; 
        String oldestName = "";
        int oldestAge = 0;

        while (!input.equals("stop"))
        {
            sc = new Scanner(input);
            String currName = sc.next();
            int currAge = sc.nextInt();
            if (oldestAge < currAge)
            {
                oldestName = currName;
                oldestAge = currAge;
            }
            input = JOptionPane.showInputDialog("Enter name and age");
        }
    }
}
