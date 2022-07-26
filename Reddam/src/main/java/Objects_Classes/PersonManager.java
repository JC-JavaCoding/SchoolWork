/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects_Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jcj
 */
public class PersonManager
{
    private Person p;
    private ArrayList<Person> parr;
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
            
            parr.add( new Person(name, surname, age));
//            
//            size++;
            
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
            
            
            parr.add(new Person(name, surname, age));
            
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
    public void delete(int indx)
    {
        parr.remove(indx);
        try
        {
            FileWriter fw = new FileWriter(new File("src/main/resources/people.txt"));
            
            for (Person P: parr)
            {
                fw.append(p.toString() + "\n");
            }
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    private void moveLeft(int indx)
    {
        
        
    }
    private Person[] moveRight(int indx)
    {
        return null;
    }
    public void nameSort()
    {
        for (int startIndx = 0; startIndx < size; startIndx++)
        {
            int pos = startIndx;
            for (int i = startIndx +1; i < size; i++)
            {
                if ( parr.get(i).getName().compareTo( parr.get(startIndx).getName() ) < 0 )
                {
                    pos = i;
                }
            }
            
            Person temp = parr.get(startIndx);
            parr.set(startIndx, parr.get(pos));
            parr.set(pos, temp);
        }
    }
    public void ageSort()
    {
        for (int endIndx = size-1; endIndx >0; endIndx --)
        {
            boolean sorted = true;
            
            for (int j = 0; j < endIndx; j++)
            {
                if (parr.get(j).getAge() > parr.get(endIndx).getAge())
                {
                    Person temp = parr.get(j);
                    parr.set(j, parr.get(endIndx));
                    parr.set(endIndx, temp); 
                    
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }
    public Person nameSearch(String name)
    {
        for (Person p: parr)
        {
            if (p.getName().equalsIgnoreCase(name)) return p;
        }
        return null;
    }
    @Override
    public String toString()
    {
        String output =  "";
        for (Person p : parr)
        {
            output += p.toString()+ "\n";
        }
        
        return output;
    }
    
}
