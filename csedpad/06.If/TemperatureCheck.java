/**
* author:Jeevan Chapagain
* topics:If 
* subtopics: If greater or equal to
* goalDescription: You are give temperature of today and your goal is to find out whether it is hot today.
* source: N/A
* input: N/A  
* output: The temperature is hot today.
*/

public class TemperatureCheck{
	public static void main(String[] args){

		/**
		* logical_step_1: Declare a variable temperature to specify the temperature of today.
		* logical_step_details: Declare a variable called temperature that indicates the temperature of today. The data type of the temperature variable is integer. The temperature variable is initialized to value 110.
		* question_1: What does the following code block do?
		* answer_1:  Declare a variable called temperature that indicates the temperature of today.
		* question_2: What is the data type of the variable temperature?
		* answer_2: The data type of the temperature variable is integer.
		* question_3: What is the value of variable temperature?
		*answer_3: The temperature variable is initialized to value 110.

		*/

		int temperature = 110;

		/**
		* logical_step_2:  Check if the temperature is hot or not, if so print a message stating the temperature is hot today.
		* logical_step_details: Check if the value of the temperature is greater than or equal to 90. If the value is greater than or equal to 90, then the if-then branch is executed. The if-then branch prints the message "The temperature is hot today".
		* question_1: What does the following code block do?
		* answer_1: Check if the value of the temperature is greater than or equal to 90.
		* question_2: When does the loop execute?
		* answer_2: If the value is greater than or equal to 90, then the if-then branch is executed.
		 * question_3: What does the if-then branch of the if-statement do once executed?
		 * answer_3: The if-then branch prints the message "The temperature is hot today".
		*/


		/**
		 * stm_comment: The condition of the if-statement checks whether the value of the temperature is greater than or equal to 90.
		 * question_1: Please explain what the following if statement does?
		 * answer_1: The condition of the if-statement checks whether the value of the temperature is greater than or equal to 90.
		 */

		if ( temperature >= 90){

			/**
			 * stm_comment: The  value of the variable temperature is 1110 which is greater than 90, the message "The temperature is hot today" is printed.
			 * question_1: Please explain when and how the following statement runs?
			 * answer_1:  The  value of the variable temperature is 1110 which is greater than 90, the message "The temperature is hot today" is printed.
			 */

			System.out.println("The temperature is hot today");
		}

	}
}
