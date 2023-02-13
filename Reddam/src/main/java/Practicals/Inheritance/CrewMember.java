/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.Inheritance;

/**
 *
 * @author Jcj
 */
public class CrewMember
{
    private String fullname, department;
    private int crewID;
    public int numPromotedCrew = 0;

    public CrewMember(String inFN, int inCID, String inDT)
    {
        this.fullname = inFN;
        this.department = inDT;
        this.crewID = inCID;
    }

    public String getFullname()
    {
        return fullname;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getCrewID()
    {
        return crewID;
    }

    @Override
    public String toString()
    {
        return fullname + "\tCrewID:" + crewID +"\t["+department +']';
    }
    
    
}
