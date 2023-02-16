/**
* author: Suraj Maharjan
* topics: Searching (Linear Search)
* subtopics: an array is initialized and elements are stored in the given array where linear search is used to get the index of the searched element
* goalDescription: This program implements Linear Search Algorithm to take the size of the array and then if a user inputs lets say "6" then ask to input 6 random integers and shuffles the elements of the array and then ask for the number what the user want to search in that array then returns the index of the array (which has been shuffled) if it is found as it must the integer value that the user have entered.
* input_1: [ 6 ]
* input_2: [ 1, 3, 6, 8, 10, 13]
* input_3: [13]
* output: 5
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class LinearSearchAlgorithm {
	
	public static void main(String[] args) {
		
		/**
		* logical_step_1:  Create a new Scanner object "commandReader" to get the input from the user
		* logical_step_details:  Creating a new Scaaner object "commandReader" which will extend the methods of Scanner. The purpose of commandReader is it will help in getting the user inputs. The length of an array means it returns or sets the number of elements in an given array.
		* question_1: What is purpose creating the object "commandReader" of Scanner?
        	* answer_1: The purpose of commandReader is it will help in getting the user inputs.
		* question_2: What do you mean by the length of an array?
		* answer_2: The length of an array means it returns or sets the number of elements in an given array.
		*/
		Scanner commandReader = new Scanner(System.in);
		
		System.out .println("Welcome to Java Program to perform linear search on int array where you will be prompted for some inputs!!!!"); 
		
		System.out.println("Enter length of array : ");
		int length = commandReader.nextInt(); 
		
		/** 
		* stm_comment: Initializing an array that will store number of elements.
		* question_1: What is the size of the array?
		* answer_1: The size of the array depends upon the user input for the length of an array.
		*/
		int[] array = new int[length]; 
		
		/**
		* stm_comment: print statement that is asking for users to enter the number of integer values where "%d" is the "length" value and "%n" for  new-line symbol, so the user entered "6" for "length" then it will prompt user to input 6 random integer values 
		* question_1: What type of variable is accepted here?
		* answer_1: It only accepts the integer variable.
		*/
		System.out.printf("Enter %d numbers %n", length); 
		
		/**
		* logical_step_2: The for loop is used here to take the input from user as long as the user input is reached as the value of "length", so if the user entered "6" for "length" then it takes "6" complete inputs which must be integer
		* logical_step_details: The for loop is to iterate along with the user input until the user input reaches the value of "length". The array[i] stores or gets the user input, where "i" is the index of the array. So, the value will be stored to the array starting from "0 to so on .." which are the values entered by the user 
		* question_1: Why for loop?
        	* answer_1: The for loop is to iterate along with the user input until the user input reaches the value of "length".
		* question_2: What does the array[i] store?
		* answer_2: The array[i] stores or gets the user input, where "i" is the index of the array. So, the value will be stored to the array starting from "0 to so on .." which are the values entered by the user 
		*/
		for (int i = 0; i < length; i++) { 
			
			array[i] = commandReader.nextInt(); 
		
		} 
		
		/**
		* logical_step_3: Create an object "rand" of Random class which will be used to call the methods from the Random class.
		* logical_step_details: We need to create the object so as to help us to call the methods of the class Random. A for-loop is used to iterate through the elements of array where array.length (which get the length of the array) is used to iterate. The use for "randomIndexToSwap" here is to store the random index value. The use of "temp" here is to store the value of the array element at the index given by "array[randomIndexToSwap]" and temp is just used for the temporary purpose. if else statement is used here to check where it enters if statement if the index value is equal to -1 and enters else if not.
		* question_1: Why we need to create the object of Random class?
		* answer_1: We need to create the object so as to help us to call the methods of the class Random.
		* question_2: Why is a for-loop used?
		* answer_2: A for-loop is used to iterate through the elements of array where array.length (which get the length of the array) is used to iterate.
		* question_3: What is the need of integer variable "randomIndexToSwap"?
		* answer_3: The use for "randomIndexToSwap" here is to store the random index value.
		* question_4: What is the need of integer variable "temp"?
		* answer_4: The use of "temp" here is to store the value of the array element at the index given by "array[randomIndexToSwap]" and temp is just used for the temporary purpose.
		* question_5: Why if else statement?
		* answer_5: if else statement is used here to check where it enters if statement if the index value is equal to -1 and enters else if not.
		*/
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {

			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}


		System.out.println("Please enter target number"); 
		int target = commandReader.nextInt(); 
		
		/** 
		* stm_comment: Integer variable index is used to call the method linearSearch whcih take the parameter array and target
		* question_1: What happens if correct parameters are not passed to the method linearSearch?
		* answer_1: If the corrext parameteres are not passed then the program will throw error and stop working.
		*/
		int index = linearSearch(array, target); 
		
		/** 
		* stm_comment: if statement to check the value of index if it is equal to -1
		* question_1: When will the value of the variable index be -1?
		* answer_1: The value of the variable will be -1 when the target number is not found in the given array and this value is returned from the method linearSearch.
		*/
		if (index == -1) { 
			System.out.printf("Sorry, %d is not found in array %n", target); 
		} else { 
			
			/**
			* stm_comment: print statement if the target number is found the given array
			* question_1: What value is stored in the variable index when the target number is found in the array?
			* answer_1: The variable index will store the index of target number which was found in the array.
			*/
			System.out.printf("%d is found in array at index %d %n", target, index); 
	
		} 
		commandReader.close(); 

	} 

	public static int linearSearch(int[] array, int target) {
		
		/**
		* logical_step_4: The for loop is used here to iterate through the elements of the array and it start from "0" until it reaches the value which is lesser that the valur of "array/length" wher the value increases after each iteration
		* logical_step_details: The for loop is used to iterate through the elements of the array and it start from "0" until it reaches the value which is lesser that the valur of "array/length". The if condtion is used to check the value from the array which is in the particular index where array[i] is used to get the value form the array and "i" is the index value that leads array[i] to get that particuale element from the array at that index "i" and returns "i"
		* question_1: Why for loop?
		* answer__1: The for loop is used to iterate through the elements of the array and it start from "0" until it reaches the value which is lesser that the valur of "array/length"
		* question_2: Why if statement?
		* answer_2: The if condtion is used to check the value from the array which is in the particular index where array[i] is used to get the value form the array and "i" is the index value that leads array[i] to get that particuale element from the array at that index "i" and returns "i"
		*/
		for (int i = 0; i < array.length; i++) { 

			if (array[i] == target) {

				return i; 
			} 
		} 

		return -1; 
	} 
}
