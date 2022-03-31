/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.PracticalTaskTerm22021;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class UserDetails
{
    public static void main(String[] args)
    {
        //input
        String input = JOptionPane.showInputDialog("Enter name, surname and age separated by spaces.");
        
        //scan data
        Scanner sc = new Scanner(input);
        String name = sc.next();
        String surname = sc.next();
        int age = sc.nextInt();
        
        System.out.println("Name: "+ name +"\nSurname: "+ surname +"\nAge: "+ age);
    }
}
