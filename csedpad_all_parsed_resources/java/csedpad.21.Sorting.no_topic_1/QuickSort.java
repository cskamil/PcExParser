@goalDescription(Given a list of unsorted game cards, sort them in ascending order using the quick sort algorithm.)
**/

public class QuickSort
{ 
//Declare a method partition() which will swap the position of the array element according to the pivot value.
    public int partition(int arr[], int low, int high)
    { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
/**@helpDescription(If current element is smaller than the pivot , swap arr[i] and arr[j])**/
            if (arr[j] < pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
/**@helpDescription(swap arr[i+1] and arr[high] (or pivot))**/
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    } 
  
  
//Declare static method sort() which will sort a given unsorted array in ascending order.
    public void sort(int arr[], int low, int high)
    { 
        if (low < high) 
        { 
/**@helpDescription(pi is partitioning index, arr[pi] is now at right place)**/
            int pi = partition(arr, low, high); 
/**@helpDescription(Recursively sort elements before partition and after partition)**/
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
/**@helpDescription(A utility function to print array of size n)**/
    public static void printArray(int arr[])
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
//Declare an array with elements in it, call the method sort, and pass the array as a parameter.
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
