/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Jcj
 */
public class PeopleManager
{
    public static void main(String[] args)
    {
        //addPeople();
        
        printPeople();
    }
    private static void addPeople()
    {
         try 
        {
            FileWriter fw = new FileWriter(new File("data/people.txt"), true);
            PrintWriter pw = new PrintWriter(fw);
            Person p1 = new Person("JC", "Jac", 16);
            Person p2 = new Person("Na", "Abb",16);
            Person p3 = new Person("Me", "Lou", 17);
            Person p4 = new Person("Ky", "Bal", 17);
            pw.append(p1.toString() + "\n"+ p2.toString()+ "\n"+ p3.toString() + "\n" + p4.toString() + "\n");
            
            pw.close();
            fw.close();
        }
        catch (java.io.IOException e)
        {
            e.printStackTrace();
        }
    }
    private static void printPeople()
    {
        PersonArray pa = new PersonArray();
        System.out.println("" +Arrays.toString(pa.personArray));
    }
}
