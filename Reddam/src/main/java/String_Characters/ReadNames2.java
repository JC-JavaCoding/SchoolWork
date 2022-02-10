/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_Characters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class ReadNames2
{
    public static void main(String[] args)
    {
        System.out.println("Names: "+ getNames("src\\main\\resources\\Names.txt"));
    }
    private static String getNames(String fileName)
    {
        String names = "";
        try
        {
            Scanner scFile = new Scanner(new File(fileName));
            
            while (scFile.hasNextLine())
            {
                String fullname = scFile.nextLine();
                names += fullname +":"+ getInitials(fullname) +" \n";
            }
            
            scFile.close();
        } 
        catch (FileNotFoundException ex)
        {
            System.out.println("Error");
        }
        return names;
    }
    
    private static String getInitials(String fullname)
    {
        String initials = "";
        Scanner nameSc = new Scanner(fullname);
        
        while (nameSc.hasNext())
        {
            initials += nameSc.next().charAt(0) +". ";
        }
        
        return initials;
    }
}
