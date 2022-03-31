/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.PracticalTaskTerm22021;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class StoreLoginDetails
{
    public static void main(String[] args)
    {
        FileWriter fw = null;
        int count  = 0;
        try
        {
            fw = new FileWriter(new File("data/ppterm22021/loginDetails.txt"), true);
            String input = JOptionPane.showInputDialog("Enter username, password separated by spaces.");
            String username = "", password = "";
            //scan data
            Scanner sc = new Scanner(input);
            for (int i = 0;sc.hasNext(); i++)
                {
                    switch(i)
                    {
                        case 0 -> username = sc.next();
                        case 1 -> password = sc.next();
                    }
                }
           for(count  = 0;!username.equalsIgnoreCase("STOP"); count ++)
           {
                fw.append(username+"#"+password+"\n");
                input = JOptionPane.showInputDialog("Enter username, password separated by spaces.");
                for (int i = 0;sc.hasNext(); i++)
                {
                    switch(i)
                    {
                        case 0 -> username = sc.next();
                        case 1 -> password = sc.next();
                    }
                    System.out.println("username: "+ username);
                    System.out.println("password: "+ password);
                }
            }
            fw.close();
            
        } catch (IOException ex)
        {
            ex.printStackTrace();
        } 
        System.out.println("Num logins accessed: "+ count);
    }
}
