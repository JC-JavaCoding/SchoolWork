/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Jcj
 */
public class SortArray
{
    private static int [] arr = {1, 55, 23, 13, 17, 21, 55, 21, 28, 32, 17};
    private static int [] arr2 =  new int [11];
    
    public static void main(String[] args)
    {
        int curr = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > curr)
            {
                arr2[i] = curr;
            }
            curr = arr[i];
            System.out.println(curr);
        }
    }
}
