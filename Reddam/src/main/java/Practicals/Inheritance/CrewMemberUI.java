/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.Inheritance;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jcj
 */
public class CrewMemberUI
{
    public static void main(String[] args)
    {
        try
        {
            //create crew member manager
            CrewMemberManager cmm = new CrewMemberManager();
            System.out.println("Hello world");
            //display all crew members:
            System.out.println(cmm.toString());
            
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
