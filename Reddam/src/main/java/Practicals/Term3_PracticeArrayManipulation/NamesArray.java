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
                names[size] = sc.nextLine();
                size++;
            }
        }catch (java.io.FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    
    public void sort()
    {
        for (int endIndx = size; endIndx >0; endIndx ++)
        {
            for (int i = 0; i < endIndx; i++)
            {
                boolean sorted = true;
                if (names[i].compareTo(names[i+1]) > 0)
                {
                    String temp = names[i];
                    names[i] = names[i+1];
                    names[i+1] = temp;
                    sorted = false;
                }
                if (sorted) break;
            }
        }
    }
    public int search(String name)
    {
        int startIndx = 0, endIndx = size,  middleIndx = (startIndx + endIndx) /2;
        while (startIndx != endIndx)
        {
            if (names[middleIndx].equalsIgnoreCase(name)) return middleIndx;
            else if (names[middleIndx].compareTo(name) < 0) startIndx = middleIndx;
            else if (names[middleIndx].compareTo(name) > 0) endIndx = middleIndx;
        }
        return -1;
    }
    public void insert(String name)
    {
        int insertIndx = 0;
        //find place to insert
        for (int i = 0; i < size; i ++)
        {
            if (names[i].compareTo(name) < 0 && names[i+1].compareTo(name) > 0) insertIndx = i+1;
            else insertIndx = size;
        }
        if(insertIndx != size) shiftRight(insertIndx);
        
        names[insertIndx] = name;
    }
    private void shiftLeft(int shiftIndx)
    {
        for (int i = shiftIndx; i < size--; i++)
        {
            names[i] = names[i+1];
        }
    }
    private void shiftRight(int shiftIndx)
    {
        for (int i = ++size; i > shiftIndx; i--)
        {
            names[i] = names[i-1];
        }
    }
    public void delete(String name)
    {
        
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
