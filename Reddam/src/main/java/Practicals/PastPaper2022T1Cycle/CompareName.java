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
public class CompareName
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter a name");
        String mostAlphabetical = name;
        for (int i = 0; i < 4; i++)
        {
            name = JOptionPane.showInputDialog("Enter a name");
            if (name.compareTo(mostAlphabetical) < 0) mostAlphabetical = name;
        }
        
        System.out.println("Most alphabetical name: "+ mostAlphabetical);
    }
}
