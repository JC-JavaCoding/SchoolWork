/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.JuneExamRevision2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jcj
 */
public class ResultSetManager
{
    private String filePath = "src\\main\\java\\Practicals\\JuneExamRevision2021\\Results.txt";

    public ResultSetManager(String f)
    {
        filePath = f;
    }
    public void saveResult(String n, String e, int sA, int sG, int sT)
    {
        ResultSet rS = new ResultSet(n, e, sA, sG, sT);
        FileWriter fw;
        try
        {
            fw = new FileWriter(new File(filePath), true);
            fw.append(rS.toString());
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
   }
    
    public void printRatings()
    {
        //THIS IS AN APPROPRIATE HEADER - header
        System.out.println("THIS IS AN APPROPRIATE HEADER");
        int count = 0;
        double totalRating = 0;
        //this makes the keeping of the highest easier
        ResultSet highestRS = new ResultSet("", "", 0, 0, 0);
        try
        {
            //GET info from the file
            Scanner fileSc = new Scanner(new File(filePath));
            
            while(fileSc.hasNextLine())
            {
                //GET info from the line
                Scanner lineSc = new Scanner(fileSc.nextLine()).useDelimiter("#");
                String name = lineSc.next();
                String email = lineSc.next();
                int scoreAlg = lineSc.nextInt();
                int scoreGeo = lineSc.nextInt();
                int scoreTrig = lineSc.nextInt();
                
                //make object
                ResultSet rs = new ResultSet(name, email, scoreAlg, scoreGeo, scoreTrig);
                
                //display the name and rating of the person
                System.out.println(rs.nameAndRating());
                
                //getHighestRating
                if(rs.getRating() > highestRS.getRating()) 
                {
                    highestRS = rs;
                }
                
                //increase number of lines read
                count++;
            }
            //display average
            System.out.println("Average rating: "+ totalRating/count);
            
            //display highest resultset
            System.out.println("Highest ResultSet: "+ highestRS.nameAndRating());
        } catch (FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }
}
