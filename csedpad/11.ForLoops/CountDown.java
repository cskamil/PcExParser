/**
 * author: Priti Oli
 * topic: For Loops
 * subTopic: decremental for loop
 * goalDescription: this is a program for a countdown display for launching a rocket in space which must
 * show numbers in decreasing order from 10 to 1.
 * source:  N/A
 * output: counter = 10
 counter = 9
 counter = 8
 counter = 7
 counter = 6
 counter = 5
 counter = 4
 counter = 3
 counter = 2
 counter = 1

 */

public class CountDown {
	public static void main(String[] args) {
		/**
		 * logical_step_1: Display the value of counter in decreasing manner from 10 to 1.
		 * logical_step_details: Declare a for loop by initializing the value of the variable counter to be 10
		 *  and decrement the value of the variable counter by 1 in each iteration. Display the value of the variable counter
		 *  in each iteration.
		 * question_1: What does the following block of code do?
		 * answer_1: Display the value of counter in decreasing manner from 10 to 1.
		 * question_2: Explain in detail what does the following block of code do?
		 * answer_2: The code block declares a for loop by initializing the value of the variable counter to be 10
		 * and decrements the value of the variable counter in each iteration. Then it displays the value of the variable counter
		 * in each iteration.
		 * question_3: What is the initial value of the variable counter?
		 * answer_3: The initial value of the variable counter is 10.
		 * question_4: How many times will the body of the loop execute
		 * answer_4: the body of the loop will continue for 10 times
		 * question_5: What is the value of the variable counter after the for loop ends?
		 * answer_5: The value of the variable counter is 0 when the loop ends.
		 * question_6: What will be the output of the program if the line ' for(int counter=10;counter>0;counter--)
		 * {' is replaced by 'for(int counter=10;counter<0;counter--){'  ?
		 * answer_6: The program will not display any output as the loop doesn't execute.
		 */

		/**
		 *  stm_comment: the for loop has initial value of counter as 10, it checks the condition on whether the counter is greater than 0
		 *   if true the body of the for loop is executed and the couner value is displayed as it runs from 10 to 1 in decreasing manner.
		 *  question_1:Please explain what the following for loop does?
		 *  answer_1: the for loop has initial value of counter as 10, it checks the condition on whether the counter is greater than 0
		 *   if true, the body of the for loop is executed and the couner value is displayed as it runs from 10 to 1 in decreasing manner.
		 * */
		for(int counter=10;counter>0;counter--){
			System.out.println("counter = " + counter);
		}
	}
}
