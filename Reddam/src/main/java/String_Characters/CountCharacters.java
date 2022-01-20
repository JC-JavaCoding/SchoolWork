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
public class CountCharacters
{
    private static double totalChars = 0;
    private static File file = new File("C:\\Users\\Jcj\\Documents\\NetBeansProjects\\SchoolWork\\Reddam\\src\\main\\resources\\sample-2mb-text-file.txt");
    private static int[] charCount = new int[27];//for alphabet and other

    public static void main(String[] args)
    {
        loop();
       countChars();
    }

    private static void loop()
    {
        try
        {
            Scanner sc = new Scanner(file);

            while (sc.hasNext())
            {
                String group = sc.next().toLowerCase();
                for (int i = 0; i < group.length(); i++)
                {
                    char currChar = group.charAt(i);
                    
                    addCharCount(currChar);
                }//for end
            }//while end
            sc.close();
        }//try end
        catch (java.io.FileNotFoundException e)
        {
        }
    }

    private static void addCharCount(char currChar)
    {
        if (Character.isAlphabetic(currChar)) charCount[(int) currChar - 97]++;
        else charCount[26] ++;
        totalChars ++;
    }
    private static void countChars()
    {
         for (int i = 0; i < 26; i++)
        {
            int currAmount = charCount[i];
            System.out.println(((char) (i +97)) + ": "+ currAmount/totalChars*100);
//System.out.println( ((char) (i+97)) + "hi " + i/totalChars * 100);
        }
        System.out.println("Total Chars: "+ totalChars);
    }
}
