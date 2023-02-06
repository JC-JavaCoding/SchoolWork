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
import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class Student
{
    private String name, surname;
        private LocalDate bDay;
    
    public Student(String name, String surname, LocalDate bDay)
    {
        this.name = name;
        this.surname = surname;
        this.bDay = bDay;
    }

    @Override
    public String toString()
    {
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Student: " + "name = " + name + ", surname = " + surname + ", birthday = " + bDay.format(outputFormatter);
    }
    
}
