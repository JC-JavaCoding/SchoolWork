/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_Characters;

import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class ExtractInitials
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter full name");
        
        System.out.println("Initials: "+ getInitials(input));
    }
    private static String getInitials(String input)
    {
        String initials = "";
        String surname = getSurname(input);
        int prevBlankIndx = 0;
        
        while (input.contains(" ") )//&& input.indexOf(" ") != input.lastIndexOf(" "))
        {
            initials += input.charAt(0);
            System.out.println("charAt: "+ input.charAt(prevBlankIndx));
            input = input.substring(input.indexOf(" ")+1);
        }
        initials+= surname;
        initials = initials.toUpperCase();
        return initials;
    }
    private static String getSurname(String input)
    {
        String surname ="";
        
        if(input.contains(" "))
        {
            surname = input.substring(input.lastIndexOf(" "));
        }
        
        return surname;
    }
}
