
/*
 * author: Hasan Mashrique
 * topic: Sorting
 * subtopic: Quick Sort
 * goalDescription: Given a list of unsorted game cards, sort them in ascending order using the quick sort algorithm.
 * source:
 * Output: 1 5 7 8 9 10
 */


public class QuickSort
{ 
    /*
     * logical_step_1: Declare a method partition() which will swap the position of the array element according to the pivot value.
     * logical_step_details: Declare a method named partition and give an array as its parameter. The parameters also include two other values: low and high.
     * question_1: What does the following code block do?
     * answer_1: The code block declares a method named sort() which is taking an array as parameter. The method will swap elements of the array according to the pivot value set inside the method. The method places all smaller values (smaller than pivot) to left of pivot and all greater elements to right of pivot. 
     * question_2: What is the parameters low and high used for?
     * answer_2:The low and high parameters are lowest and highest index of the array.
     */

    public int partition(int arr[], int low, int high)
    { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            /* 
             * stm_comment: If current element is smaller than the pivot , swap arr[i] and arr[j] 
             */  
            if (arr[j] < pivot) 
            { 
                i++; 
  
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        /* 
         * stm_comment: swap arr[i+1] and arr[high] (or pivot) 
         */  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
/*
 * logical_step_2: Declare static method sort() which will sort a given unsorted array in ascending order.
 * logical_step_details: Declare a method named sort and give an array, lowest index, and highest index as its parameter. This method will sort the array according to the pivot value.  
 * question_1: What does the following code block do?
 * answer_1: The code block declares a method named sort() which partitions the given array and recursively sorts every array according to the pivot value.
 * question_2: Why is the sort method called twice?
 * answer_2: The first sort method call sorts the left side of the partition and the 2nd sort call sorts the right side of the partition. 
 */
    public void sort(int arr[], int low, int high)
    { 
        if (low < high) 
        { 
            /*
             * stm_comment: pi is partitioning index, arr[pi] is now at right place
             */
            int pi = partition(arr, low, high); 
  
            /*
             * stm_comment: Recursively sort elements before partition and after partition
             */  
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
  
    /*
     * stm_comment: A utility function to print array of size n
     */
    public static void printArray(int arr[])
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
 /*
  * logical_step_3: Declare an array with elements in it, call the method sort, and pass the array as a parameter.
  * logical_step_details: Create an object of the class QuickSort, call the sort method, and pass the array 
  * as parameter. This will sort the unsorted array in ascending order by using the quick sort algorithm.   
  * question_1: What does the following code block do?
  * answer_1: Declares an array with elements and calls the sort method to sort the unsorted array.
  * question_2: What is sent as a parameter to sort()?
  * answer_2: The unsorted array because it takes an array as a parameter.
  * question_3: What does the method printArray do?
  * answer_3: It prints any array given as its parameter.
  */
    
    public static void main(String args[]) 
    { 
        int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array"); 
        printArray(arr); 
    } 
} 