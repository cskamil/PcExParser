
/*
 * author: Hasan Mashrique
 * topic: Sorting
 * subtopic: Insertion Sort
 * goalDescription: Given a list of unsorted game cards, sort them in ascending order using the insertion sort algorithm.
 * source:
 * Output: 5 6 11 12 13
 */

public class InsertionSort {

/*
 * logical_step_1: Declare a static method sort() which will sort a given unsorted array in ascending order.
 * logical_step_details: Declare a method named sort and give an array as its parameter because it will take an array and sort it.  
 * question_1: What does the following code block do?
 * answer_1: The code block declares a method named sort() which is taking an array as parameter. It will take this array and sort it using the insertion sort algorithm.
 * question_2: What is the 'key' used for?
 * answer_2: The key is an array element which is used to compare the array elements on its left side. 
 */
    
    void sort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {

        /*
         * stm_comment: starting from the 2nd array element as key
         */
            int key = arr[i];

        /*
         * stm_comment: define j as elements to be compared with key element(elements on the left side of key)
         */
            int j = i - 1;

        /*
         * stm_comment: compare each element with key until j >= 0. if arr[j] > key then swap element with key
         */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /*
     * stm_comment: define method printArray that will print any given array as parameter
     */ 
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    
    public static void main(String args[]) {

    /*
	 * logical_step_2: Declare an array with elements in it, call the method sort, and pass the array as a parameter.
     * logical_step_details: Create an object of the class InsertionSort, call the sort method, and pass the array as parameter. This will sort the unsorted array in ascending order by using the insertion sort algorithm.   
	 * question_1: What does the following code block do?
	 * answer_1: Declares an array with elements and calls the sort method to sort the unsorted array.
	 * question_2: What is sent as a parameter?
     * answer_2: The unsorted array because it takes an array as its parameter.
     * question_3: What does the method printArray do?
     * answer_3: It prints any array given as a parameter.
	 */
        

        int arr[] = { 12, 11, 13, 5, 6 };
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        printArray(arr);
    }

}