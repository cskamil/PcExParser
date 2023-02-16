/**
@goalDescription(This program implements Linear Search Algorithm to take the size of the array and then if a user inputs lets say "6" then ask to input 6 random integers and shuffles the elements of the array and then ask for the number what the user want to search in that array then returns the index of the array (which has been shuffled) if it is found as it must the integer value that the user have entered.)
**/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class LinearSearchAlgorithm {
	
	public static void main(String[] args) {
		
//Create a new Scanner object "commandReader" to get the input from the user
		Scanner commandReader = new Scanner(System.in);
		System.out .println("Welcome to Java Program to perform linear search on int array where you will be prompted for some inputs!!!!"); 
		
		System.out.println("Enter length of array : ");
		int length = commandReader.nextInt(); 
		
/**@helpDescription(Initializing an array that will store number of elements. question_1: What is the size of the array? answer_1: The size of the array depends upon the user input for the length of an array.)**/
		int[] array = new int[length]; 
/**@helpDescription(print statement that is asking for users to enter the number of integer values where "%d" is the "length" value and "%n" for  new-line symbol, so the user entered "6" for "length" then it will prompt user to input 6 random integer values question_1: What type of variable is accepted here? answer_1: It only accepts the integer variable.)**/
		System.out.printf("Enter %d numbers %n", length); 
//The for loop is used here to take the input from user as long as the user input is reached as the value of "length", so if the user entered "6" for "length" then it takes "6" complete inputs which must be integer
		for (int i = 0; i < length; i++) { 
			array[i] = commandReader.nextInt(); 
		
		} 
		
//Create an object "rand" of Random class which will be used to call the methods from the Random class.
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}


		System.out.println("Please enter target number"); 
		int target = commandReader.nextInt(); 
		
/**@helpDescription(Integer variable index is used to call the method linearSearch whcih take the parameter array and target question_1: What happens if correct parameters are not passed to the method linearSearch? answer_1: If the corrext parameteres are not passed then the program will throw error and stop working.)**/
		int index = linearSearch(array, target); 
/**@helpDescription(if statement to check the value of index if it is equal to -1 question_1: When will the value of the variable index be -1? answer_1: The value of the variable will be -1 when the target number is not found in the given array and this value is returned from the method linearSearch.)**/
		if (index == -1) { 
			System.out.printf("Sorry, %d is not found in array %n", target); 
		} else { 
/**@helpDescription(print statement if the target number is found the given array question_1: What value is stored in the variable index when the target number is found in the array? answer_1: The variable index will store the index of target number which was found in the array.)**/
			System.out.printf("%d is found in array at index %d %n", target, index); 
		} 
		commandReader.close(); 

	} 

	public static int linearSearch(int[] array, int target) {
		
//The for loop is used here to iterate through the elements of the array and it start from "0" until it reaches the value which is lesser that the valur of "array/length" wher the value increases after each iteration
		for (int i = 0; i < array.length; i++) { 
			if (array[i] == target) {

				return i; 
			} 
		} 

		return -1; 
	} 
}
