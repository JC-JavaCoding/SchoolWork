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
        try
        {
            Scanner scFile = new Scanner(new File("Names.txt"));
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(ReadNames.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
