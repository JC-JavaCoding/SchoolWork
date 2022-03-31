/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.PracticalTaskTerm22021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jcj
 */
public class ExtractDomain
{
    private static File f = new File("data/ppterm22021/websites.txt");
    public static void main(String[] args)
    {
        Scanner filesc, linesc;
        int count = 0;
        try
        {
            filesc = new Scanner(f);
            for(count = 0;filesc.hasNextLine(); )
            {
                count ++;
                linesc = new Scanner(filesc.nextLine());
                linesc.useDelimiter("[.]");
                //in line:
                linesc.next();
                System.out.println("Domain "+count+": "+linesc.next());
                
                linesc.close();
            }
            filesc.close();
            
            System.out.println("Websites accesed: "+ count);
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
