/**
@goalDescription(This program generates the numbers from 0 to 10 which represent the numbers to be printed on the t-shirts of a soccer team which consists of 11 players. The goalkeeper prefers number 0 which is why the numbers will be from 0 to 10 instead of 1 to 11. The numbers are stored together in a collection of values called an array. This program demonstrates how to create an array, how to assign values to the elements of the array and how to print the values of the array.)
**/
public class arraysExampleWithAStory{
	public static void main(String[] args) {

//Declare variables needed to store 11 numbers corresponding to the t-shirts of 11 soccer players.
		int size = 11;
/**@helpDescription(Declare an array variable called myNumber of type integer and size 11 and allocate memory for it. question_1: What does the next statement do? answer_1: It declares an array variable called myNumber of type integer and size 11 and allocates memory for it. question_2: What data type does int[] refer to? answer_2: An array of integers.)**/
		int[] myNumber = new int[size]; 
//Store soccer player's t-shirt numbers, 0 to 10, in the array myNumber.
/**@helpDescription(The size of the array is given by myNumber.length which is 11. question_1: How is the size of the array referred to in the following for loop? answer_1: The size of the array is obtained by the expression myNumber.length and it is 11 in this case.)**/
		for(int i = 0; i < myNumber.length; i++) { 
/**@helpDescription(The i-th element of the array myNumber which is denoted by myNumber[i] is assigned the value of i. question_1: How is the a particular element of the array referred to in the following statement? answer_1: The i-th element of the array myNumber which is denoted by myNumber[i].)**/
			myNumber[i] = i; 
		}
//Display the t-shirt numbers, 0 to 10, that are stored in the array myNumber.
/**@helpDescription(The myNumber.length obtains the length of array myNumber which is needed to indicate when to stop the for loop. question_1: How is the size of the array referred to in the following for loop? answer_1: The size of the array is given by the expression myNumber.length and the value is 11.)**/
		for(int i = 0; i < myNumber.length; i++) { 
/**@helpDescription(The construct myNumber[i] accesses the value of element at index position i in myNumber array. question_1: What can you say about the expression myNumber[i] in the next statement? answer_1: The construct myNumber[i] accesses the value of element at index position i in myNumber array..)**/
			System.out.println(myNumber[i]); 
		}
	}
}
