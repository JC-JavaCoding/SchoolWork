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
public class Details
{
    public static void main(String[] args)
    {
        String info = JOptionPane.showInputDialog("Enter name, ID, Height in metres and smoking (true or false)");
        Scanner sc = new Scanner(info);
        String name = sc.next();
        int idNum = sc.nextInt();
        double height = Double.parseDouble(sc.next());
        boolean smoker = sc.nextBoolean();
        
        System.out.println("Name: "+ name +", ID: "+ idNum +", height: "+ height +", smoker: "+ smoker);
    }
}
