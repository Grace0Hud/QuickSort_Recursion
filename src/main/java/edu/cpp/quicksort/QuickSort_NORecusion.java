package edu.cpp.quicksort;

public class QuickSort_NORecusion
{
  // Main method
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quicksort(arr, arr.length);
    
        System.out.print("Sorted Array: ");
        for (int i : arr){
            System.out.print(i + ", ");
        }
        
    }
   
    
    // Uses a 2 digit stack to represent boundaries 
    public static void quicksort(int[] arr, int length){
        
        Stack<int[]> stack = new Stack<>();
        // First set of boundaries for the entire array
        stack.push(new int[]{0, length -1});
        
        while(!stack.isEmpty()){
            int[] range = stack.pop();
            int low = range[0];
            int high = range[1];
            
            // Partition if there are 2 or more values
            if (low < high) {
                // Split the current arr
                int part = partition(arr, low, high);
                
                //Sort each side
                if(part - 1 > low)
                    stack.push(new int[]{low, part - 1});
                if(part + 1 < high)
                    stack.push(new int[]{part + 1, high});
            }
        }

    }
    
    
    // Selects last element as pivot, then applies the idea behind quicksort 
    // to rearrange the elements so that values less than the pivot are sorted
    // to the left and greater values are sorted to the right
    public static int partition(int[] arr, int low, int high){
    int pivot = arr[high];
    int i = low - 1;
    int temp;

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
