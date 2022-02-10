/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String_Characters;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class ReadNums
{
    private static String filepath = "data\\IntNums";
    public static void main(String[] args)
    {
        //get sum
        System.out.println("Sum: " + getSum());
    }
    private static int getSum()
    {
        int sum = 0;
        
        try
        {
            Scanner sc =  new Scanner(new File(filepath));
            
            while (sc.hasNextInt())
            {
                sum += sc.nextInt();
            }
            
            sc.close();
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("Error");
        }
        
        return sum;
    }
}

