/*
 * author: Zak Risha
 * topics: Exception Handling
 * subtopics: array initialization, assigning element to array, processing array, ArrayIndexOutOfBoundsException
 * goalDescription: This program demonstrates how arrays are initalized and how an ArrayIndexOutOfBoundsException can occur. 
 * output: 1
           3
           0
           4
           ArrayIndexOutOfBoundsException
 */ 

public class ArrayException {
  public static void main(String[] args) {
    /*
     * logical_step_1: Initalize an array variable called num of type integer, and of size 4.
     * logical_step_details: Initalize an empty array of size 4 to store values for later access.
     * question_1: What does the following code block do?
     * answer_1: Declares an array variable called num of type integer, and of size 4.
     * question_2: What is the size of array mynumber?
     * answer_2: The size of the array num is 4.
		*/

    int[] num = new int[4];

    /*
     * logical_step_2: Assign integer values 1, 3, and 4 to indexes 0, 1, and 3 of the array.
     * logical_step_details: Assign 3 values to the size 4 array, skipping index 2.
     * question_1: What does the following code block do?
     * answer_1: Assigns integer values of 1, 3, and 4 to indexes 0, 1, and 3 of array num.
     * question_2: Is each index assigned a value?
     * answer_2: No, index 2 is not assigned a value.
     */

    num[0] = 1;
    num[1] = 3;
    num[3] = 4;

    /*
     * logical_step_3: Within a try block, loop through array num outputing the item at each index. 
     * logical_step_details: Within a try block, loop through the array while i is less than or equal to the length of the array and print the values.
     * question_1: What does the following code block do?
     * answer_1: Within a try block, loops through array num, outputing the item at each index.
     * question_2: What is the value of i after the loop completes?
     * answer_2: 4
     */
    /*stm_comment: Try executing code, providing opportunity to catch and handle errors*/
    try {
      for (int i = 0; i <= num.length; i++) {
        System.out.println(num[i]);
      }
    /*
     * logical_step_4: Catch exceptions thrown by the previous loop, printing out the name of the exception.
     * logical_step_details: Print out the exception name should the code try to access an index out of bounds.
     * question_1: What does the following code block do?
     * answer_1: Catch ArrayIndexOutOfBoundsException exceptions thrown by the previous loop, printing out the string "ArrayIndexOutOfBoundsException".
     * question_2: Will this catch block trigger with the previous loop?
     * answer_2: Yes, as the loop will attempt to access index 4 which does not exist.
     */
    /*stm_comment: This exception is thrown when trying to access an index not within an array*/
    }catch (ArrayIndexOutOfBoundsException exception) {
      System.out.println("ArrayIndexOutOfBoundsException");
    }
  }

}