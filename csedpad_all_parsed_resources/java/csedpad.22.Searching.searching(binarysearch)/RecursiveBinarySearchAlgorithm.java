/**
@goalDescription(This program implements Binary Search using a recursive algorithm (recursion is used in this algorithm)
**/
public class RecursiveBinarySearchAlgorithm {

    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int lotNumber) {
        
//Declaring an if-statement which is used and operates if the value of variable "start" is lesser than the value of the variable "end". Otherwise it does not enter if-statement.
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
        
/**@helpDescription(Initialiing and array with 8 different integer variables as its elements question_1: Why the elements in the array is sorted in ascending order? answer_1: For the binary search algorithm to work the array should be sorted in ascending order.)**/
        int[] array = {2,45,234,567,876,900,976,999};
        int lotNumber = 45;
        
//Call the method recursiveBinarySearch to search for the value of the variable "lotNumber" in the array and will return the index of array if present.
        int index = recursiveBinarySearch(array,0,array.length,lotNumber);
        if (index != -1) {
		
        	index = index + 1;

        	System.out.println(lotNumber + " is present at rank: " + index + " and the highest prize pull starts from '1' and then 2, 3 and so on.");

        } else {

        	System.out.println("Sorry, Please Try Again!!!");
      	}
    }
}
