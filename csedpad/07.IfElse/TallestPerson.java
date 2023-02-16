/**
 * author: Priti Oli
 * topic: If-else
 * subTopic: demonstrating the use of if-else condition to  compare values and displaying the result
 * goalDescription: Find the tallest among three individuals whose heights are given.
 * source: N/A
 * output: Lisa is the tallest
 */

public class TallestPerson{

	public static void main(String[] args) {

		/**
		 * logical_step_1: Specify the height of the three individual.
		 * logical_step_details: Declare three variables Mary, Lisa and Rose which specifies the height of three individual.
		 * question_1: How is the heights of individual actually specified?
		 * answer_1: Declare 3 variable called Mary, Lisa and Rose that indicates the height of three individuals.
		 * question_2: What does the following code block do?
		 * answer_2: Specify the height of the 3 individuals.
		 * question_3: What is the data type of variables Lisa, Mary and Rose?
		 * answer_3: The data type of the variables is integer.
		 * question_4: What is the value of the variable Rose ?
		 * answer_4: The value of the variable Rose is 140.
		 */

		int Mary = 140, Lisa = 150, Rose = 140;

		/**
		 * logical_step_2: Find out the tallest among the three numbers by comparing the height against each other.
		 * logical_step_details: compare the height of each individual with the other two to find out the tallest
		 * amongst all.
		 * question_1: What does the following block of code do?
		 * answer_1: The following code block compares the height of three individual to find out the tallest individual
		 * question_2: What will be the output of the program?
		 * answer_2: 'Lisa is the tallest' will be displayed.
		 * question_3: which of the if-else block will evaluate to true/ will be executed?
		 * answer_3: 'else if (Lisa >= Mary && Lisa >= Rose)' block will be executed.
		 * question_4: what does the if-else if-else block do
		 * answer_5: in if-else if- else block the first if condition is checked, if true only the if block will be executed.
		 * If not satisfied the program execution moves to the next else if block and if the condition is satisfied
		 * only that block of code is executed, if not satisfied the program execution moves to the next if else block or else block.
		 */


		/**
		 * stm_comment: the if-else check for each condition to be true or false and executes the block which evaluates to true
		 * Because Lisa's height is greater than Rose and Mary's. Lisa is the tallest will be displayed.
		 * question_1: Please explain what does the else if block do
		 * answer_1: the if-else check for each condition to be true or false and executes the block which evaluates to true
		 * Because Lisa's height is greater than Rose and Mary's. Lisa is the tallest will be displayed.
		 * **/

		if( Mary >= Lisa && Mary >= Rose)
			System.out.println(" Mary is the tallest");

		else if (Lisa >= Mary && Lisa >= Rose)
			System.out.println("Lisa is the tallest");
		else
			System.out.println("Rose is the tallest");
	}
}
