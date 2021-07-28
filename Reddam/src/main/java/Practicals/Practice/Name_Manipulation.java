/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicals.Practice;

import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class Name_Manipulation
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        String surname = JOptionPane.showInputDialog("What is your surname?");
        
        int request = Integer.parseInt(JOptionPane.showInputDialog("Do you want your: \n (1)Initials,\n (2)Name in UPPERCASE,\n (3)Number of Letters in your name, \n (4)Most alphabetical between your name and surname,\n (5)Your name and surname?"));
        
        switch(request)
        { 
            case 1:
                String initials = ""+name.charAt(0) + surname.charAt(0);
                System.out.println(initials);
                break;
            case 2:
                name = name.toUpperCase();
                surname = surname.toUpperCase();

                System.out.println(name +" "+ surname);
                break;
            case 3:
                int nameLength = name.length();
                int surnameLength = surname.length();

                System.out.println("Your name has "+ nameLength +" letters, and your surname has "+ surnameLength +" letters.");
                break;
            case 4:
                int comparison = name.compareTo(surname);
                if (comparison < 0)
                {
                    System.out.println("Name: "+ name +" is more alphabetical.");
                }
                else if (comparison > 0 )
                {
                    System.out.println("Surname: "+ surname +" is more alphabetical.");
                }
                else 
                {
                    System.out.println("Your name aned surname are the same??");
                }
                break;
            default:
                System.out.println(name + " " + surname);
        }
    }
}
