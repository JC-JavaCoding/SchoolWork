/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import java.io.File;
import java.util.Scanner;
import org.json.JSONArray;

/**
 *
 * @author Jcj
 */
public class PeopleManager
{
    public static void main(String[] args)
    {
        JSONArray jar ;
        
        try
        {
            Scanner filesc = new Scanner(new File("data/people.json"));
            
        }catch (java.io.FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
