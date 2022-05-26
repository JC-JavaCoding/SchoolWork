/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author janch
 */
public class CreateFromFile
{
    public static void main(String[] args)
    {
        boolean [][] classes;
        int rows = 0, collumns = 0;
        
        //scan the file to determine how large the array has to be
        try
        {
            //scanner for file
            Scanner filesc = new Scanner(new File("src/main/resources/ArrayInput.txt")).useDelimiter("#");
            
            //first is the number of rows then number of things per row (this case booleans)
            rows = filesc.nextInt();
            collumns  = filesc.nextInt();
            
            //now that we have these values, create the array of those dimensions
            classes = new boolean [rows][collumns];
            
            //now proceed to - for every row, for every boolean in the row - add from File to array
            int currRow = 0;
            while (filesc.hasNextLine())
            {
                //in the line, check fo rhte boolean values
                Scanner linesc = new Scanner(filesc.nextLine()).useDelimiter("#");
                int currCollumn = 0;
                while(linesc.hasNext())
                {
                    classes [currRow][currCollumn] = linesc.nextBoolean();                    
                    //increase the collumn nr (this for array purpose)
                    currCollumn++;
                }
                
                //increase row to the next
                currRow++;
            }
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
        //test to see if this actually worked.. use the proper method not print you lazy mf -_-
    }
}
