/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.DateTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jcj
 */
public class StudentManager
{
    private ArrayList<Student> students = new ArrayList<>();    
    private static final File file = new File("src/main/resources/students.txt"); 

    public StudentManager()
    {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        try
        {
            Scanner sc = new Scanner(file);
            
            while (sc.hasNextLine())
            {
                //for line
                String line = sc.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");
                String name = linesc.next(), surname = linesc.next();
                
                //for birthday
                String bdStr = linesc.next();
                LocalDate bDate = LocalDate.parse(bdStr, inputFormatter);
                
                students.add(new Student(name, surname, bDate));
            }
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public String toString()
    {
        String output = "";
        for(Student s : students)
        {
            output += s.toString()+"\n";
        }
        return output;
    }
}
