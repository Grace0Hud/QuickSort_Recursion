package edu.cpp.quicksort;

import java.util.ArrayList;

public class RecursiveQuickSort
{
    public static void main(String[] args)
    {
	  int [] arr = {7,5,6,8,2,4};
	  quicksort(arr, 0, arr.length-1);
	  //printing out the sorted array.
	  System.out.print("Sorted Array: ");
	  for (int i : arr)
	  {
		System.out.print(i + ", ");
	  }
    }//end main method

    static void quicksort(int[] arr, int low, int high)
    {
	  //checking for end case.
	  if(low < high)
	  {
		int pivot = partition(arr, low,high);
		//sort left side of list
		quicksort(arr, low,pivot-1);
		//sort right side of list.
		quicksort(arr, pivot+1,high);
	  }
    }//end quicksort

    static int partition(int[] arr, int low, int high)
    {
	  int pivot = arr[high];
	  int i = low - 1;
	  for(int j = low; j <= high - 1; j++)
	  {
		//moving any values less than to the left side of pivot
		if(arr[j] < pivot)
		{
		    i++;
		    swap(arr,i,j);
		}//end if
	  }//end for
	  //swapping pivot back in.
	  swap(arr,i+1, high);
	  return i + 1;
    }//end partition

    static void swap(int[] arr, int i, int j) {
	  int temp = arr[i];
	  arr[i] = arr[j];
	  arr[j] = temp;
    }//swap
}//end RecursiveQuickSort
