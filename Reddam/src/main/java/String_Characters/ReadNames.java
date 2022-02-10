/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_Characters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jcj
 */
public class ReadNames
{
    public static void main(String[] args)
    {
        String names = "";
        try
        {
            Scanner scFile = new Scanner(new File("Names.txt"));
            
            while (scFile.hasNextLine())
            {
                names += scFile.nextLine();
            }
        } 
        catch (FileNotFoundException ex)
        {
            System.out.println("Error");
        }
        
        System.out.println("Names: "+ names);
    }
}
