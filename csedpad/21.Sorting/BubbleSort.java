/*
 * author: Hasan Mashrique
 * topic: Sorting
 * subtopic: Bubble Sort
 * goalDescription: Sort a given unsorted array using bubble sort in ascending order.
 * source:
 * Output: -9 -7 -3 -2 0 2 4 5 6 8 
 */
public class BubbleSort {
  
    static void sorting(int[] list) {
	/*
	 * logical_step_1: Declare a static method sorting() which will sort a given unsorted array in ascending order.
     * logical_step_details: Declare a method named sorting and give an array as its parameter. This is because it will take an array and sort it.  
	 * question_1: What does the following code block do?
     * answer_1: The code block declares a method named sorting() which takes an array as a parameter. It will take this array and sort it using the bubble sort algorithm.	
     */
        int n = list.length;
        int temp = 0;
        
         /* 
          * stm_comment: for each element of the list, it compares with the rest of the values in the array and swap their position when list[j - 1] > list[j].
          */
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

		/*
         * stm_comment: comparing each element with the next element. If the previous element is bigger then it gets swapped with each other. 
         */
                if (list[j - 1] > list[j]) { 

		    /*
             * stm_comment: swapping elements using a temp variable.
             */
                    temp = list[j - 1]; 
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
    
	/*
	 * logical_step_2: Declare an integer array that stores unsorted books with numbers items in a shelf.
	 * logical_step_details: Declare a integer array which takes integer values in unsorted order. The values are given in the declaration of the array.  
	 * question_1: What does the following code block do?
	 * answer_1: It declares an integer array that stores a list of unsorted values.
	 * question_2: What variables are declared?
	 * answer_2: The integer array and the values stored in it.
	 * question_3: What is the size of array mynumber ?
	 * answer_3: Since the size is not defined but values are given directly, the number of values is the array size.	
	 */

        /*
         * stm_comment: We define the unsorted list and its values.
         */
        int UnsortedList[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        System.out.println("Array Before Bubble Sort");
        
	/*
	 * logical_step_3: Print the unsorted array using a for-loop. 
	 * logical_step_details: Print the declared array by iterating through the entire array. Print each value in each iteration of the loop.  
	 * question_1: What does the following code block do?
	 * answer_1: It prints the declared array by using a for-loop.
	 * question_2: How does it get the array size?
	 * answer_2: By calling the .length method which returns the size of the array.
	 * question_3: What does it print in each iteration?
	 * answer_3: Each iteration prints one array index value starting from index 0.	
	 */

        /*
         * stm_comment: Print the unsorted list as given.
         */
        for (int i = 0; i < UnsortedList.length; i++) {
            System.out.print(UnsortedList[i] + " ");
        }
        System.out.print('\n' + "Array after Bubble Sort" + '\n');
        
	/*
	 * logical_step_4: Call the sorting method and pass the array as a parameter.
	 * logical_step_details: call the static sorting method and pass the array as parameter. This method will sort the unsorted array in ascending order by using the bubble sort algorithm.   
	 * question_1: What does the following code block do?
	 * answer_1: It calls the sorting methods to sort the unsorted array.
	 * question_2: What is sent as a parameter?
	 * answer_2: The unsorted array because it takes an array as parameter.	
	 */
        sorting(UnsortedList); 

        /*
         * stm_comment: Print the sorted list after bubble sort
         */
        for (int i = 0; i < UnsortedList.length; i++) {
            System.out.print(UnsortedList[i] + " ");
        }

    }
}
