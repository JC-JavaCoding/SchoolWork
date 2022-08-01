/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicals.Term3_PracticeArrayManipulation;

/**
 *
 * @author Jcj
 */
public class NamesArrayUI
{
    public static void main(String[] args)
    {
        NamesArray na = new NamesArray();
        System.out.println(na.toString());
        
        //sort
        na.sort();
        System.out.println(na.toString());
        
        //delete 'Callie'
        na.delete("Callie");
        System.out.println(na.toString());
        
        //insert 'Carrie':
        na.insert("Carrie");
        System.out.println(na.toString());
        
        //test something
        na.sort();
    }
}
