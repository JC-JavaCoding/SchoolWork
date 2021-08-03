/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicals.Practice;

/**
 *
 * @author Jcj
 */
public class Term3_Practice
{
    public static void main(String[] args)
    {
        
    }
    
    public static void mathCalculations(int [] nums)
    {
        int currentNum = 0;
        int highestNum = 0;
        int lowestNum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            currentNum = nums[i];
            if (currentNum > highestNum)
            {
                highestNum = currentNum;
            }
            if (i == 0)
            {
                lowestNum = currentNum;
            }
            else if (lowestNum > currentNum) 
            {
                
            }
        }
    }
}
