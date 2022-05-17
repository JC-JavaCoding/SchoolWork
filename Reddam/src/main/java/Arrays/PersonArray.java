/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jcj
 */
public class PersonArray
{
    int size = 50;
    public Person [] personArray;
    public PersonArray ()
    {
        
        personArray = new Person [size];
        
        try
        {
            //get people
            Scanner sc = new Scanner(new File ("data/people.txt")).useDelimiter("#");
            for (int i = 0; sc.hasNextLine(); i ++)
            {
                String line = sc.nextLine(); 
                Scanner linesc = new Scanner(line).useDelimiter("#");
                String name = linesc.next();
                String surname = linesc.next();
                int age = linesc.nextInt();
                personArray [i] = new Person(name, surname, age);
                
                linesc.close();
            }
            sc.close();
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    public void sortPeopleBecauseWeAreDumbAndLazy()
    {
        //bubble sort with the age now pls
    }
}
