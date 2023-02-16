/**
* author: Suraj Maharjan
* topics: Searching (Binary Search)
* subtopics: given an array with elements that is sorted in ascending order and a number is searched in the given array using the recursive binary search algorithm
* goalDescription: This program implements Binary Search using a recursive algorithm (recursion is used in this algorithm 
   					because with each pass a new array is created by cutting the old one in half. The binary search 
   					procedure is then called recursively, this time on the new array. Typically the array's size is adjusted 
   					by manipulating a beginning and ending index. The algorithm exhibits a logarithmic order of growth 
   					because it essentially divides the problem domain in half with each pass) to search the index. In this case, "index will be the rank of prizes you get if the users lottery number is present in the array".
					So, if the index is "0" then rank is "1" and you get the highest prize.
* input: N/A
* output: 2
*/

public class RecursiveBinarySearchAlgorithm {

    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int lotNumber) {
        
	    /**
	    * logical_step_1: Declaring an if-statement which is used and operates if the value of variable "start" is lesser than the value of the variable "end". Otherwise it does not enter if-statement.
	    * logical_step_details: An if-statement is used to check the value of start is lesser than the end value. The variable mid is an integer. Its purpose is to hold the value obtained after the operation: "start + (end - start) / 2" . The mid value will work as an index value for the sortedArray. An if-condition hee is used to check if the lotNumber value is lesser than the value that is in the sortedArray[mid]. If this is the case, it returns sortedArray, start, mid, and lotNumber. An else-if statement here is used to check if the lotNumber is greater than the value that is in the sortedArray[mid]. If this is true, it returns sortedArray, start, mid, and lotNumber. If the "if" and "else-if" statements are not statisfied, else works at the end and returns mid.
	    * question_1: Why use an if-statement?
	    * answer_1: An if-statement is used to check the value of start is lesser than the end value.
	    * question_2: What is the type and purpose of the variable mid here?
	    * asnwer_2: The variable mid is an integer. Its purpose is to hold the value obtained after the operation: "start + (end - start) / 2" . The mid value will work as an index value for the sortedArray.
	    * question_3: Why use an if-statement comparing lotNumber and sortedArray[mid]?
	    * answer_3: An if-statement here is used to check if the lotNumber value is lesser than the value that is in the sortedArray[mid]. If this is the case, it returns sortedArray, start, mid, and lotNumber.
	    * question_4: Why use an else-if statement?
	    * answer_4: An else-if statement here is used to check if the lotNumber is greater than the value that is in the sortedArray[mid]. If this is true, it returns sortedArray, start, mid, and lotNumber.
	    * question_5: Why is there an else-statement?
	    * answer_5: If the "if" and "else-if" statements are not statisfied, else works at the end and returns mid.
	    */
        if (start < end) {
            
		int mid = start + (end - start) / 2;
		
            if (lotNumber < sortedArray[mid]) {

                return recursiveBinarySearch(sortedArray, start, mid, lotNumber);

            } else if (lotNumber > sortedArray[mid]) {

                return recursiveBinarySearch(sortedArray, mid+1, end , lotNumber);
 
            } else {

                return mid;   
            }
        }

        return -(start + 1);  
    }

    public static void main(String[] args) {
        
	 /**
	 * stm_comment: Initialiing and array with 8 different integer variables as its elements
	 * question_1: Why the elements in the array is sorted in ascending order?
	 * answer_1: For the binary search algorithm to work the array should be sorted in ascending order.
	 */
        int[] array = {2,45,234,567,876,900,976,999};

        int lotNumber = 45;
        
       /**
        * logical_step_2: Call the method recursiveBinarySearch to search for the value of the variable "lotNumber" in the array and will return the index of array if present.
        * logical_step_details: The method recursiveBinarySearch is already defined and follows the Recursive Bineary Search algorithm to search for the particular lotNumber in the array. Also, it will return the index of that searched lotNumber if present. if and else statement is used here to check if the value of the index is not equal to "-1". If the "if" statement is satisfied it prints the index. This means the lotNumber searched for is present on the array. If it is not present it prints out "Sorry, Please Try Again!!!"
        * question_1: Why are we calling the method recursiveBinarySearch?
        * answer_1: The method recursiveBinarySearch is already defined and follows the Recursive Bineary Search algorithm to search for the particular lotNumber in the array. Also, it will return the index of that searched lotNumber if present.
        * question_2: Why use the "if" and "else" statement after the call of the method recursiveBinarySearch?
        * answer_2: if and else statement is used here to check if the value of the index is not equal to "-1". If the "if" statement is satisfied it prints the index. This means the lotNumber searched for is present on the array. If it is not present it prints out "Sorry, Please Try Again!!!"
        */
        int index = recursiveBinarySearch(array,0,array.length,lotNumber);

        if (index != -1) {
		
        	index = index + 1;

        	System.out.println(lotNumber + " is present at rank: " + index + " and the highest prize pull starts from '1' and then 2, 3 and so on.");

        } else {

        	System.out.println("Sorry, Please Try Again!!!");
      	}
    }
}
