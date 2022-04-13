/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Jcj
 */
public class NumsInArray
{
    public static void main(String[] args)
    {
        int [] numArr = {1,2,3,4,5};
        double sum = 0;
        
        for (int i: numArr)
        {
            sum += i;
        }
        double avg = sum/numArr.length;
        System.out.println("Average: "+ avg);
    }
}
