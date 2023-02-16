/**
* author: Suraj Maharjan
* topics: Searching (Binary Search)
* subtopics: given an array having elements where the array elements have to be sorted in ascending order, then searching in the array if a number is present in the array which uses the Binary Search for this process 
* goalDescription: This program uses the binary search algorithm to search the index, where "index will be the rank of prizes you get if the users lottery number is present in the array". If the index is "0", then the rank is "0 + 1 = 1", so being 1st ont the rank you get the highest prize.
* input_1: [ 10 ]
* output_1: 1
* input_2: [ 20 ]
* output_2: 2
* input_3: [ 30 ]
* output_3: 3
* input_4: [ 40 ]
* output_4: 4
* input_5: [ 50 ]
* output_5: 5
* input_1: [ 60 ]
* output_1: 6
*/

import java.util.Scanner;

public class BinarySearch {
   
   public static int binarySearch(int arr[], int first, int last, int lotNumber){

      /**
      * logical_step_1: Declare a while-loop.
      * logical_step_details: while-loop is used to check the value of first is lesser or equal to the last value. To check if the middle value of the array is lesser than the value of the lotNumber. To check if the middle value of the array is equal to the value of the lotNumber. If the "if" and "else if" conditions are not statisfied else works at the end.
      * question_1: Why use a while-loop?
      * answer_1: while-loop is used to check the value of first is lesser or equal to the last value.
      * question_2: Why use the if statement?
      * answer_2: To check if the middle value of the array is lesser than the value of the lotNumber.
      * question_3: Why use else-if statement?
      * answer_3: To check if the middle value of the array is equal to the value of the lotNumber.
      * question_4: Why use the else statement?
      * answer_4: If the "if" and "else if" statement is not statisfied else statement works at the end.
      */

      int mid = (first + last)/2;

      while( first <= last ){

         if ( arr[mid] < lotNumber ){
            first = mid + 1;
         }

         else if ( arr[mid] == lotNumber ){  
            return mid;
         }

         else{
            last = mid - 1;
         }
         mid = (first + last)/2;
      }
      return -1;                    
   }
                      
   public static void main(String a[]) {

      /**
      * logical_step_2: Create an array of lottery numbers.
      * logical_step_details: Create an array that will store lottery numbers. An array is a data structure consisting of a collection of elements. We are taking 2 digit integer input from user as a lottery ticket number. That number will be searched in our array for its presence. Length is a final variable applicable for arrays. With the help of the length variable, we can obtain the size of the array.
      * question_1: What is an array?
      * answer_1: An array is a data structure consisting of a collection of elements.
      * question_2: Why are we taking input from the user?
      * answer_2: We are taking 2 digit integer input from user as a lottery ticket number. That number will be searched in our array for its presence.
      * question_3: Why do we need the length of an array?
      * answers_3: Length is a final variable applicable for arrays. With the help of the length variable, we can obtain the size of the array.
      */

      Scanner luckyNumber = new Scanner(System.in);

      int[] array = { 10, 20, 30, 40, 50, 60 };

      System.out.println("Enter your two digit lottery number: ");

      int lotNumber = luckyNumber.nextInt();

      int last=array.length-1;

      /**
      * logical_step_3: Call the method binarySearch.
      * logical_step_details: Call the binarySearch method to search for the value of the variable "lotNumber" i.e., user input. The method binarySearch is already defined and follows the Binary Search algorithm to search for the particular lotNumber in the array. It will return the index of that searched lotNumber if present. To check if the value of the index is not equal to "-1". If the "if" condition is satisfied it prints the index, we will know that the lotNumber we searched for is present in the array. If it is not present it simply prints out "Sorry, Please Try Again!!!"
      * question_1: Why are we calling the method binarySearch?
      * answer_1: The method binarySearch is already defined and follows the Binary Search algorithm to search for the particular lotNumber in the array. It will return the index of that searched lotNumber if present.
      * question_2: Why "if" and "else" statements after the call of the method binarySearch?
      * answer_2: To check if the value of the index is not equal to "-1". If the "if" statement is satisfied it prints the index, we will know that the lotNumber we searched for is present in the array. If it is not present it enters else statement and it simply prints out "Sorry, Please Try Again!!!"
      */
      
      /**
      * stm_comment: Integer variable index is declared and that variable is assigned with the index value that is returned from the function binarySearch().
      * question_1: What and how many types of parameters are accepted by the binarySearch function?
      * answer_2: The binarySearch function accepts 4 parameters, the first one should be array of integers and the remaining 3 are integer variables. 
      */
      int index = binarySearch(array,0,last,lotNumber);

      if (index != -1) {
         index = index + 1;
         System.out.println(lotNumber + " is present at rank: " + index + " and the highest prize pull starts from '1' and then 2, 3 and so on.");
      } else {
         System.out.println("Sorry, Please Try Again!!!");
      }
   }
}
