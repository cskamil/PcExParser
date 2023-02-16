@goalDescription(Given a list of unsorted game cards, sort them in ascending order using the insertion sort algorithm.)
**/
public class InsertionSort {

//Declare a static method sort() which will sort a given unsorted array in ascending order.
    public void sort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {

/**@helpDescription(starting from the 2nd array element as key)**/
            int key = arr[i];
/**@helpDescription(define j as elements to be compared with key element(elements on the left side of key))**/
            int j = i - 1;
/**@helpDescription(compare each element with key until j >= 0. if arr[j] > key then swap element with key)**/
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
/**@helpDescription(define method printArray that will print any given array as parameter)**/
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String args[]) {

//Declare an array with elements in it, call the method sort, and pass the array as a parameter.

        int arr[] = { 12, 11, 13, 5, 6 };
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }

}
