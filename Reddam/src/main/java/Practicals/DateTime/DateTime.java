/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author Jcj
 */
public class DateTime
{
    public static void main(String [] args)
    {
        LocalDate today = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime time = LocalTime.now();
        
        
        LocalDate bDay = LocalDate.of(2005, Month.JUNE, 6);
        System.out.println("Years: "+ (LocalDate.now().getYear() - bDay.getYear()));
        
        LocalDate narBD = LocalDate.of(2005, Month.NOVEMBER, 8);
        System.out.println((narBD.isBefore(bDay))? "Narita is older" : "JC is older");
        
        LocalDate newD = today.plusWeeks(3);
        newD = newD.plusDays(4);
        System.out.println("Y: " + newD.getYear() +", M: "+ newD.getMonth().name() +", D: "+ newD.getDayOfMonth());
    }
}
