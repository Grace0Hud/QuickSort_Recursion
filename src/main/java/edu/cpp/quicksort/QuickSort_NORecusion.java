package edu.cpp.quicksort;

import java.util.Stack;

public class QuickSort_NORecusion
{


    // Swap value positions
    for (int j = low; j < high; j++){
        if (arr[j] <= pivot){
            i++;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    // Place the pivot in the correct spot
    temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
    }
}
