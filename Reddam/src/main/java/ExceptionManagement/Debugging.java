/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionManagement;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class Debugging
{
    public static void main(String[] args)
    {
        String name = "", surname = "", hobby = "";
        int age = 0;
        try
        {
            Scanner sc = new Scanner(new File("data/Info.txt"));
            
            while (sc.hasNextLine())
            {
                String ln = sc.nextLine();
                Scanner lnSc = new Scanner(ln);
                lnSc.useDelimiter("#");
                while (lnSc.hasNext())
                {
                    name = sc.next();
                    surname = sc.next();
                    age = sc.nextInt();
                    hobby = sc.next();
                }
                lnSc.close();
            }
            sc.close();
            
            System.out.println("Name: "+ name +"\nSurname: "+ surname +"\nAge: "+ age +"\nHobby: "+ hobby);
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("FileNotFOundException at 22: \"Scanner sc = new Scanner(new File(\"data/Info.txt\"));\"");
        }
        
    }
}
