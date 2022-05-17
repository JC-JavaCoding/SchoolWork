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
    int size = 0;
    public Person [] personArray = new Person[50];
    public PersonArray ()
    {
        try
        {
            //get people
            Scanner sc = new Scanner(new File ("data/people.txt")).useDelimiter("#");
            while (sc.hasNextLine())
            {
                String line = sc.nextLine(); 
                Scanner linesc = new Scanner(line).useDelimiter("#");
                String name = linesc.next();
                String surname = linesc.next();
                int age = linesc.nextInt();
                personArray [size] = new Person(name, surname, age);
                size++;
                linesc.close();
            }
            sc.close();
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
    public void print()
    {
        for (int i = 0; i < size; i ++)
        {
            if (personArray[i] == null) System.out.println("null");
            
            else System.out.println(personArray[i].toString());
        }
    }
    public void sortPeopleBecauseWeAreDumbAndLazy()
    {
        //bubble sort with the age now pls
        for (int sortedIndx = size-1; sortedIndx >= 0; sortedIndx --)
        {
            boolean sorted = true;
            //for every loop through from start, compare to end num
            for (int i = 0; i < sortedIndx; i ++)
            {
                if (personArray[i].getAge() > personArray[i+1].getAge())
                {
                    Person tempP = personArray[i];
                    personArray[i] = personArray[i+1];
                    personArray[i+1] = tempP;
                    sorted = false;
                }
            }
            if (sorted)break;
        }
    }
}
