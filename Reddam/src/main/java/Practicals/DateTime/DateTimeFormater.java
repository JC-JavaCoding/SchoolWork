/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalUnit;

/**
 *
 * @author Jcj
 */
public class DateTimeFormater
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalDate nBD = LocalDate.of(2005, 11, 8);
        LocalDate mayD = LocalDate.of(1991, 5, 18);
        LocalTime time = LocalTime.now();
        LocalTime appointment = LocalTime.of(15, 55);
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(today.format(dtf));
        
        dtf = DateTimeFormatter.ofPattern("dd-MMMM-yy");
        System.out.println(nBD.format(dtf));
        
        dtf = DateTimeFormatter.ofPattern("dd-MMM-yy");
        System.out.println(mayD.format(dtf));
        
        LocalDate dateFromString = LocalDate.parse("2004/01/17", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(dateFromString.format(dtf));
        
        Period p= Period.between(mayD, nBD);
        System.out.println("Period between 18 May 1991 and 8 November 2005: "+p.getYears() +"years "+ p.getMonths() +"months "+ p.getDays() +"days");
        
        Duration life = Duration.between(time, appointment);
        System.out.println("Time till suffering: "+ life.getSeconds()/60/60 +" hours "+ life.getSeconds()%60 +"minutes");
    }
}
