/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.Inheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class CrewMemberManager
{
    private CrewMember [] cArr = new CrewMember[80];
    private int size = 0;

    public CrewMemberManager() throws FileNotFoundException
    {
        Scanner filesc = new Scanner(new File("data\\crewmembers.txt"));
        
        while(filesc.hasNext())
        {
            Scanner linesc = new Scanner(filesc.nextLine()).useDelimiter("#");
            
            int numVars = 0;
            ArrayList <String> vars = new ArrayList<>();
            
            while (linesc.hasNext())
            {
                vars.add(linesc.next());
                numVars++;
            }
            //diferentiate between the officer and the crewmember
            if (numVars > 3) 
            {
                cArr [size] = new Officer(vars.get(0),
                        Integer.parseInt(vars.get(1)), 
                        vars.get(2),
                        Integer.parseInt(vars.get(3)),
                        LocalDate.parse(vars.get(4), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
            else {
                cArr [size] = new CrewMember(vars.get(0),
                        Integer.parseInt(vars.get(1)), 
                        vars.get(2)
                );
            }
            size ++;
        }
    }

    @Override
    public String toString()
    {
        String output = "";
        
        //go through array to print the tostrings
        for (int i = 0; i < size; i ++)
        {
            output += (cArr[i] instanceof Officer)? ((Officer) cArr[i]).toString() : cArr[i].toString() + "\n";
        }
        
        return output;
    }
    
    public int findCrewMember(int crewID)
    {
        for (int i = 0; i < size; i ++)
        {
            if (cArr[i].getCrewID() == crewID) return i;
        }
//        int start = 0, end = size, mid = (start+end)/2;
//        while (start != mid)
//        {
//            if (cArr[mid].getCrewID() == crewID) return mid;
//            else if (cArr[mid].getCrewID() == crewID) return mid;
//            else if (cArr[mid].getCrewID() > crewID) return mid;
//            
//        }
        
        return -1;
    }
    
    public void processTestResults() throws FileNotFoundException
    {
        Scanner filesc = new Scanner(new File("data/testResults.txt"));
        
    }
}
