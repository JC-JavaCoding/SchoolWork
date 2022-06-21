/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects_Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class PersonManager
{
    private Person p;
    private Person [] parr = new Person[50];
    private int size = 0;
    
    public PersonManager() throws FileNotFoundException
    {
        String name = "", surname = "";
        int age = 0;
        
        Scanner filesc = new Scanner(new File("src/main/resources/people.txt"));
        
        while(filesc.hasNextLine())
        {
            Scanner lineSc =new Scanner (filesc.nextLine());
            
            name = lineSc.next();
            surname= lineSc.next();
            age = lineSc.nextInt();
            
            parr[size] = new Person(name, surname, age);
            
            size++;
            
            lineSc.close();
        }
        
        filesc.close();
    }
        
    public void add(String name, String surname, int age)
    {
        try
        {
            FileWriter fw = new FileWriter(new File("src/main/resources/people.txt"), true);
            
            fw.append(name + " "+ surname + " "+ age +"\n");
            
            size ++;
            
            fw.close();
        }
        catch(java.io.FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(java.io.IOException e)
        {
            e.printStackTrace();
        }
    }
    public void delete(String name)
    {
        
    }
    private Person[] moveLeft(int indx)
    {
        return null;
    }
    private Person[] moveRight(int indx)
    {
        return null;
    }
    public void selectionSort(String firstName)
    {
        for (int startIndx = 0; startIndx < size; startIndx++)
        {
            int pos = startIndx;
            for (int i = startIndx +1; i < size; i++)
            {
                if ( parr[i].getName() .compareTo( parr[startIndx].getName() ) < 0 )
                {
                    pos = i;
                }
            }
            
            Person temp = parr[startIndx];
            parr[startIndx] = parr[pos];
            parr[pos]= temp;
        }
    }
    public void bubbleSort(int age)
    {
        for (int endIndx = size-1; endIndx >0; endIndx --)
        {
            boolean sorted = true;
            
            for (int j = 0; j < endIndx; j++)
            {
                if (parr[j].getAge() > parr[endIndx].getAge())
                {
                    Person temp = parr[j];
                    parr[j] = parr[endIndx];
                    parr[endIndx] = temp;
                    
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }

    @Override
    public String toString()
    {
        String output =  "";
        for (int i = 0; i < size; i++)
        {
            output += parr[i].toString()+ "\n";
        }
        
        return output;
    }
    
}
