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
public class GenerateEmail
{
    public static void main(String[] args)
    {
        String fullname = JOptionPane.showInputDialog("Enter your full name");
        
        System.out.println("Email: "+ getEmail(fullname));
    }
    private static String getEmail(String fullname)
    {
        String email = "";
        
        // firstname to lowercase + '.' + lastname to lowercase + reddam.house
        email += fullname.substring(0, fullname.indexOf(" ")).toLowerCase() +"." + fullname.substring(fullname.lastIndexOf(" ") +1).toLowerCase()+ "@reddam.house";
        
        return email;
    }
}
