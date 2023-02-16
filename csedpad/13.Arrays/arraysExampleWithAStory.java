/**
* author: Lasang Tamang, refined by Vasile Rus
* topics: Arrays
* subtopics: declaring array variables, assign values to array elements, display the array
* goalDescription: This program generates the numbers from 0 to 10 which represent the numbers to be printed on the t-shirts of a soccer team which consists of 11 players. The goalkeeper prefers number 0 which is why the numbers will be from 0 to 10 instead of 1 to 11.
* The numbers are stored together in a collection of values called an array. This program demonstrates how to create an array, how to assign values to the elements of the array and how to print the values of the array.
* source: N/A
* input: N/A
* output: 0
 	 1
	 2
	 3
	 4
	 5
	 6
	 7
	 8
	 9
	 10
*/
public class arraysExampleWithAStory{

	public static void main(String[] args) {

		/**
		* logical_step_1: Declare variables needed to store 11 numbers corresponding to the t-shirts of 11 soccer players.
		* logical_step_details: Declare a variable size which indicates the size of a soccer team and thus of the array that will store the values to be printed on the t-shirts. Variable size is initialized to 11, i.e., the number of soccer players in a team. An array of integers to store the numbers is also declared and its size is given by the value of variable size. 
		* question_1: What does the following code block do?
		* answer_1: Declare variables needed to store 11 numbers corresponding to the t-shirts of 11 soccer players.
		* question_2: What variables are declared?
		* answer_2: The variable integer size and array myNumber are declared in order to specify how many players in a team and an array to store the actual numbers to be printed on t-shirts.
		* question_3: What can you say about the value of variable size?
		* answer_3: The size of the array myNumber is 11.	
		* question_4: Now, what is the size of array mynumber?
		* answer_4: The size of the array myNumber is 11.	
		*/
		int size = 11;

		/**
		* stm_comment: Declare an array variable called myNumber of type integer and size 11 and allocate memory for it.
		* question_1: What does the next statement do?
		* answer_1: It declares an array variable called myNumber of type integer and size 11 and allocates memory for it.
		* question_2: What data type does int[] refer to?
		* answer_2: An array of integers.
		*/
		int[] myNumber = new int[size]; 

		/**
		* logical_step_2: Store soccer player's t-shirt numbers, 0 to 10, in the array myNumber.
		* logical_step_details: Each t-shirt number is stored in one element of the array myNumber. This is done by iterating over each value from 0 to 10 and then storing the corresponding value in the corresponding element of the array.
		* question_1: What does the following code block do?
		* answer_1: It stores soccer player's t-shirt numbers, 0 to 10, in the array myNumber.
		* question_2: What is the start value of loop variable i and stopping condition for the loop?
		* answer_2: The for loop starts at i = 0 and stops when i reaches 11, which is the length of the array.
		* question_3: What does the code inside the for loop do?
		* answer_3: The loop body assigns the value of i to the element at index position i of the array myNumber.
		*/
		/**
		* stm_comment: The size of the array is given by myNumber.length which is 11.
		* question_1: How is the size of the array referred to in the following for loop?
		* answer_1: The size of the array is obtained by the expression myNumber.length and it is 11 in this case.
		*/
		for(int i = 0; i < myNumber.length; i++) { 
			/**
			* stm_comment: The i-th element of the array myNumber which is denoted by myNumber[i] is assigned the value of i.
			* question_1: How is the a particular element of the array referred to in the following statement?
			* answer_1: The i-th element of the array myNumber which is denoted by myNumber[i].
			*/
			myNumber[i] = i; 
		}

		/**
		* logical_step_3: Display the t-shirt numbers, 0 to 10, that are stored in the array myNumber.
		* logical_step_details: The algorithm iterates over the elements of the array myNumber using a loop which uses a loop variable i. At each element, it displays the number stored in the i-th element of the array myNumber. The result is that the values from 0 to 10 are displayed.
		* question_1: What does the following code block do?
		* answer_1: The code displays the t-shirt numbers, 0 to 10, that are stored in the array myNumber.
		* question_2: What is the start value of loop variable i and stopping condition for the loop?
		* answer_2: The for loop starts at i = 0 and stops when i reaches 11.
		* question_3: What does the code inside the for loop do?
		* answer_3: It displays the value of the element in array myNumber at index position i.
		*/
		/**
		* stm_comment: The myNumber.length obtains the length of array myNumber which is needed to indicate when to stop the for loop.
		* question_1: How is the size of the array referred to in the following for loop?
		* answer_1: The size of the array is given by the expression myNumber.length and the value is 11.
		*/
		for(int i = 0; i < myNumber.length; i++) { 
			/**
			* stm_comment: The construct myNumber[i] accesses the value of element at index position i in myNumber array.
			* question_1: What can you say about the expression myNumber[i] in the next statement?
			* answer_1: The construct myNumber[i] accesses the value of element at index position i in myNumber array..
			*/
			System.out.println(myNumber[i]); 
		}
	}
}