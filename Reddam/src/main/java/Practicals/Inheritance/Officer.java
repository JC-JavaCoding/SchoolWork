/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.Inheritance;

import java.time.LocalDate;

/**
 *
 * @author Jcj
 */
public class Officer extends CrewMember
{
private int rank;
private LocalDate datePromoted;
    public Officer(String inFN, int inCID, String inDT, int inRK, LocalDate inDP)
    {
        super(inFN, inCID, inDT);
        this.rank = inRK;
        this.datePromoted = inDP;
    }

    public int getRank()
    {
        return rank;
    }
    public String getTitle()
    {
        return (rank == 1?"Ensign": rank ==2? "Lieutenant": rank == 3? "Lt Commander": rank == 4? "Commander": rank == 5? "Captain": "N/A");
    }
    public void promote()
    {

    }

    @Override
    public String toString()
    {
        return super.toString()+ getTitle();
    }
    
}
