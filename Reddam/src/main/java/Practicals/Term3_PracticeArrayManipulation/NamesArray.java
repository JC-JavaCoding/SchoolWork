/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.Term3_PracticeArrayManipulation;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class NamesArray
{
    private String [] names;
    private int size = 0;

    public NamesArray()
    {
        //initialise string array
        names =  new String [100];
        
        //fill array:
        try
        {
            Scanner sc = new Scanner(new File("data/names.txt"));
            
            //scan through file:
            while (sc.hasNextLine())
            {
                names[size] = new Scanner(sc.nextLine()).next();
                size++;
            }
        }catch (java.io.FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    
    public void sort()
    {
        for (int endIndx = size-1; endIndx > 0; endIndx --)
        {
            boolean sorted = true;
            for (int i = 0; i < endIndx; i++)
            {
                
                if (names[i].compareTo(names[i+1]) > 0)
                {
                    String temp = names[i];
                    names[i] = names[i+1];
                    names[i+1] = temp;
                    sorted = false;
                }
            }
            if (sorted) break;
        }
    }
    public int search(String name)
    {
        //sort array:
        sort();
        
        //search for name, binary search:
        int startIndx = 0, endIndx = size,  middleIndx = (startIndx + endIndx) /2;
        while (startIndx <= endIndx)
        {
            if (names[middleIndx].equalsIgnoreCase(name)) return middleIndx;
            else if (names[middleIndx].compareTo(name) < 0) startIndx = middleIndx + 1;
            else if (names[middleIndx].compareTo(name) > 0) endIndx = middleIndx - 1;
            middleIndx = (startIndx + endIndx) / 2;
        }
        return -1;
    }
    public void insert(String name)
    {
        //sort array
        sort();
        
        int insertIndx = size-1;
        //find place to insert
        for (int i = 0; i < size; i ++)
        {
            if (names[i].compareTo(name) > 0) 
            {
                insertIndx = i;
                break;
            } 
            else insertIndx = size;
        }
        if(insertIndx != size) shiftRight(insertIndx);
        size++;
        names[insertIndx] = name;
    }
    public void delete(String name)
    {
        //find index
        int delIndx = search(name);
        //delete:
        if(delIndx != -1)shiftLeft(delIndx);
    }    
    private void shiftLeft(int shiftIndx)
    {
        for (int i = shiftIndx; i < size; i++)
        {
            names[i] = names[i+1];
        }
        size -=1;
    }
    private void shiftRight(int shiftIndx)
    {
        for (int i = size; i > shiftIndx; i--)
        {
            names[i] = names[i-1];
        }
    }
    @Override
    
    public String toString()
    {
        String output = "";
        for (int i = 0; i < size; i ++)
        {
            output += names[i] +" ";
        }
        return output;
    }
    
}
