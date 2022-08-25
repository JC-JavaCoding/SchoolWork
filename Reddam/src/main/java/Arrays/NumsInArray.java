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
        int [] arr = {52,1,7,3,6,5,9,10};
        double sum = 0;
        
        //insertion sort
         for (int startIndex = 0; startIndex < arr.length - 1; startIndex++)//'arr.length' here can be size in practical
        {
            int largestIndx = startIndex;
            for (int i = startIndex+1; i < arr.length; i++)
            {
                if(arr[i] < arr[largestIndx])
                {
                    largestIndx = i;
                }
            }
            int temp = arr[largestIndx];
            arr[largestIndx] = arr[startIndex];
            arr[startIndex] = temp;
        }
        
         //output:
         System.out.print("[");
         for (int i: arr)
         {
             System.out.print(i  + " ");
         }
         System.out.println("]");
    }
}
