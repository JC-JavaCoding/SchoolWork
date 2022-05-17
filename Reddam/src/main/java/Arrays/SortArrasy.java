/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jcj
 */
public class SortArrasy
{
    public static void main(String[] args)
    {
        int [] arr = getArray();
        
        int index = binarySearch(arr, 5);
        //bubbleSort(arr);
        bubbleSort(arr);
        //DISPLAY:
        System.out.println("Index: "+ index);
        System.out.println(Arrays.toString(arr));
    }
    
    static int binarySearch(int[] arr, int num)
    {
        int index = 0;
        int i = arr.length / 2;
        int start = 0, end = arr.length;
        while(arr[i] != num) 
        {
            if (arr[i] > num)
            {
                start = i+1;
            }
            else if (arr[i] < num)
            {
                end = i-1;
            }
            i = (start + end)/2;
        }
        return arr[i];
    }
    static int indexSearch(int[] arr, int num)
    {
        
        for (int i = 0; i < arr.length; i ++)
        {
            if (arr[i] == num) return i;
        }
        return -1;
    }
    static int[] getArray()
    {
        int[] arr = {};
        try
        {
            Scanner fileSc = new Scanner(new File("data/arrays.txt")).useDelimiter("#");
            Scanner arrSc = new Scanner(new File("data/arrays.txt")).useDelimiter("#");
            int count = 0;
            
            //number of nums in array
            while (fileSc.hasNext())
            {
                fileSc.next();
                count ++;
            }
            arr = new int[count];
            
            for (int i = 0; arrSc.hasNext(); i++)
            {
                arr[i] = arrSc.nextInt();
            }
        }catch(java.io.FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return arr;
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
            if (sorted)break;
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
            int largest = arr[startIndex];
            for (int i = startIndex+1; i < arr.length; i++)
            {
                if(arr[i] > largest)
                {
                    largest = arr[i];
                }
                
            }
        }
    }
}
