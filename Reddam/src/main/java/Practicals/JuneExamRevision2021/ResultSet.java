/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.JuneExamRevision2021;

import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class ResultSet
{
    private String name, email;
    private int scoreAlg, scoreGeo, scoreTrig;

    public ResultSet(String n, String e, int sA, int sG, int sT)
    {
        name = n;
        email = e;
        scoreAlg = sA;
        scoreGeo = sG;
        scoreTrig = sT;
    }
    @Override
    public String toString()
    {
        return name + "#" + email + "#" + scoreAlg + "#" + scoreGeo + "#" + scoreTrig ;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String reformatName()
    {
        Scanner nameSc = new Scanner(name);
        String surname = " ", previousName = "";
        String initials = " ";
        
        while (nameSc.hasNext())
        {
            surname = nameSc.next();
       }
        Scanner nameSc2 = new Scanner(name);
        while(nameSc2.hasNext())
        {
            String currName = nameSc2.next();
            if (!surname.equals(currName))
            {
                initials += currName.charAt(0);
            }
        }
        
        return surname.toUpperCase() + ", "+ initials.toUpperCase();
    }
    public double getRating()
    {
        return scoreAlg * 0.35 + scoreGeo * 0.45 + scoreTrig * 0.2;
    }
    public String nameAndRating()
    {
        return reformatName() + "\t" + getRating();
    }
}
