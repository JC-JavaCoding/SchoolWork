/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author Jcj
 */
public class SortArrasy
{
    public static void main(String[] args)
    {
        int [] arr = {13, 6, 2, 38, 9, 99, 5, 1, 17};
        
        //bubbleSort(arr);
        selectionSort(arr);
        //DISPLAY:
        System.out.println(Arrays.toString(arr));
    }
    
    /*
    BUBBLE SORT
    */
    static void bubbleSort(int [] arr)
    {
        for (int sortedIndx = arr.length -1; sortedIndx >= 0; sortedIndx --)
        {
            bubbleSecond(arr, sortedIndx);
        }
    }
    static void bubbleSecond(int[] arr, int endIndx)
    {
        for (int i = 0; i < endIndx; i ++)
        {
            if (arr[i] > arr[endIndx])
            {
                int temp = arr[i];
                arr[i] = arr[endIndx];
                arr[endIndx] = temp;
            }
        }
    }
    /*
    IMPROVED BUBBLE SORT
    */
      static void improvedBubbleSort(int [] arr)
    {
        for (int sortedIndx = arr.length -1; sortedIndx >= 0; sortedIndx --)
        {
            boolean sorted = true;
            improvedBubbleSecond(arr, sortedIndx, sorted);
            if (sorted)break;
        }
    }
    static void improvedBubbleSecond(int [] arr,int sortedIndx, boolean sorted)
    {
        for (int i = 0; i < sortedIndx; i ++)
        {
            if (arr[i] > arr[sortedIndx])
            {
                int temp = arr[i];
                arr[i] = arr[sortedIndx];
                arr[sortedIndx] = temp;
                sorted = false;
            }
        }
    }
    /*
    SLECTION SORT
    */
    static void selectionSort(int [] arr)
    {
        for (int startIndex = 0; startIndex < arr.length; startIndex++)
        {
            selectionSecond(arr, startIndex);
        }
    }
    static void selectionSecond(int[] arr, int startIndex)
    {
        for (int i = startIndex+1; i < arr.length; i++)
        {
            if(arr[i] < arr[startIndex])
            {
                int temp = arr[i];
                arr[i] = arr[startIndex];
                arr[startIndex] = temp;
            }
        }
    }
    /*
    IMPROVED  SELECTION SORT
    */
    static void improvedSelectionSort(int [] arr)
    {
        for (int startIndex = 0; startIndex < arr.length; startIndex++)
        {
            selectionSecond(arr, startIndex);
        }
    }
}
