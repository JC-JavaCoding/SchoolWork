/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_Characters;

import javax.swing.JOptionPane;

/**
 *
 * @author janch
 */
public class ConvertDate
{
    public static void main(String[] args)
    {
        String dateStr = JOptionPane.showInputDialog("Enter date (DDMMYY)");
        
        System.out.println("YYMMDD: "+ refactorDate(dateStr));
    }
    private static String refactorDate(String dateStr)
    {
        String newDate = "";
        int strLength = dateStr.length();
        dateStr = dateStr.substring(strLength-2, strLength) + "" +dateStr.substring(strLength-4, strLength-2) + "" + dateStr.substring(0, strLength - 4) ;
        
        for(char c :  dateStr.toCharArray())
        {
            switch (c)
            {
                case '0':
                    break;
                default:
                    newDate += c;
            }
        }
        return newDate;
    }
}
