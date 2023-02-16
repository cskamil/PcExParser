/**
 * author: Priti Oli
 * topic: For Loops
 * subTopic: getting familiar with for-loop in java
 * goalDescription: This program displays the multiplication table of 6.
 * source: N/A
 * output:  the sum is:   6 * 1 = 6
 6 * 2 = 12 
 6 * 3 = 18 
 6 * 4 = 24 
 6 * 5 = 30 
 6 * 6 = 36 
 6 * 7 = 42 
 6 * 8 = 48 
 6 * 9 = 54 
 6 * 10 = 60 

 */

public class MultiplicationTable {
	public static void main(String args[]){
		/**
		 * logical_step_1:  Specify a number whose multiplication table is to be displayed
		 * logical_step_details: Specify a number whose multiplication table is to be displayed
		 * question_1: what does the following block of code do
		 * answer_1: Specify a number whose multiplication table is to be displayed
		 * question_2: What is the value of the variable var?
		 * answer_2: The value of the variable var is 6.
		 * question_3: What is the data type of the variable var?
		 * answer_3: the variable var is an integer.
		 * question_4: What will be the output of the program if you initialise the value of variable to 9?
		 * answer_4: The program will output the multiplication table for 9.
		 */
		int var=6;
		/**
		 * logical_step_2: Display the multiplication table of the number var
		 * logical_step_details: display the multiplication table of variable var(6). Use for loop to iterate from 1 to 10
		 * in order to display the multiplication table of 6.
		 * question_1: What does the following block of code do?
		 * answer_1:Display the multiplication table of the number var
		 * question_2: What is the initial value of the iterator i?
		 * answer_2: The initial value of the iterator is 1
		 * question_3: How many times will the loop execute?
		 * answer_3: The loop will execute 10 times.
		 * question_5: what will be tha value of variable var when the for loop ends?
		 * answer_5: 11
		 * question_6: What is the output when the value of i=3?
		 * answer_6: The output will be '6 * 3 = 18 '.
		 */

		/**
		 *  stm_comment: the for loop has the initial value of iterator i as 1, the increment operator increase the value of i by 1 in each iteration.
		 *  In the body of the for loop we display the multiplication of 6 with varying value of i each iteration. the loop continues till loop termination
		 *  criteria is set to true i.e the value of is greater than or equal to 10.
		 *  question_1: Please explain what the following for loop does?
		 *  answer_1: the for loop has the initial value of iterator i as 1, the increment operator increase the value of i by 1 in each iteration.
		 *  In the body of the for loop we display the multiplication of 6 with varying value of i each iteration. the loop continues till loop termination
		 *  criteria is set to true i.e the value of is greater than or equal to 10.
		 *  */
		for(int i=1;i<=10;i++){
			System.out.println(" " + var + " * " + i + " = " + var * i + " ");
		}

	}

}
