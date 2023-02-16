/**
* author:Jeevan Chapagain
* topics:If Statement
* subtopics: If remainder is zero
* goalDescription: Given a number, this program checks whether the number is even or not.
* source: N/A 
* input: N/A
* output: Num1 is even
*/

public class EvenChecker{
	public static void main(String[] args){

	/**
	* logical_step_1: Declare a variable called num1 to check whether it is even or not.
	* logical_step_details: Declare a variable called num1 that indicates the number being used to check whether it is even or not. The data type of the num1 variable is integer. The num1 variable is initialized to value 36.
	* question_1: What does the following code block do?
	* answer_1: Declare a variable called num1 to check whether it is even or not.
	* question_2: What is the data type of  variable num1?
	* answer_2: The data type of the num1 variable is integer.
	* question_3: What is the value of variable num1?
	* answer_3: The num1 variable is initialized to value 36.

	*/

		int num1 = 36;

	/**
	 * logical_step_2: Check if the remainder is zero or not when divided by 2, and if so, print a message stating the number is even.
	* logical_step_details: Check if the remainder is zero or not when the variable num1 is divided by 2. If the remainder is zero, then the if-then branch is executed. The if-then branch prints the message "Num1 is even."
	* question_1: What does the following code block do?
	* answer_1: Check if the remainder is zero or not when the variable num1 is divided by 2.
	* question_2: When does the if-branch executes?
	* answer_2: If the remainder is zero, then the if-then branch is executed.
	 * question_3: What does the if-then branch of the if-statement do once executed?
	 * answer_3: The if-then branch prints the message "Num1 is even".
	 */


	/**
	 * stm_comment: The condition of the if-statement checks whether the remainder of the num1 is zero or not.
	 * question_1: Please explain what the following if statement does?
	 * answer_1: The condition of the if-statement checks whether the remainder of the num1 is zero or not.
	 */

		if ( num1 % 2 == 0 ){


			/**
			 * stm_comment: The remainder of the num1 is zero, the message "The given number is positive." is printed.
			 * question_1: Please explain when and how the following statement runs?
			 * answer_1: The remainder of the num1 is zero, the message "The given number is positive." is printed.
			 */
			System.out.println("Num1 is even");
		}
	}
		
}