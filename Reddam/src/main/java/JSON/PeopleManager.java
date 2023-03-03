/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Jcj
 */
public class PeopleManager
{
    public static void main(String[] args)
    {
        
        
        jarrMethod();
    }
    
    public static void mapStorage()
    {
        try
        {
            HashMap <String, String> mapStorage = new HashMap<>();
            
            String fileStr = "";
            Scanner filesc = new Scanner(new File("data/people.json"));
            
            while (filesc.hasNext())
            {
                fileStr += filesc.next();
            }
            JSONArray jar  = new JSONArray(fileStr);
            
            for (Object jo : jar)
            {
                jo
            }
            mapStorage.put(key, value);
            } catch (FileNotFoundException ex)
        {
            Logger.getLogger(PeopleManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
    For  making object arrays in javascript:
    var person = {
        id = 10,
        name = "Bob" 
        surname = " Builder" 
    }
    
    var people = 
    [
    {
        id = 10,
        name = "Bob" 
        surname = " Builder" 
    },
    {
        id = 1,
        name = "Narita" 
        surname = " Builder" 
    }
    ]
    */
    public static void jarrMethod()
    {
        JSONArray jar;
        
        try
        {
            String fileStr = "";
            Scanner filesc = new Scanner(new File("data/people.json"));
            
            while (filesc.hasNext())
            {
                fileStr += filesc.next();
            }
            
            jar  = new JSONArray(fileStr);
            
            System.out.println(jar.getJSONObject(1).get("name"));
        }catch (java.io.FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
