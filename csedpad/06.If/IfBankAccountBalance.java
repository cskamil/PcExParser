/**
 * author: Jeevan Chapagain
 * topics: If
 * subtopics: If greater than
 * goalDescription: Given a bank account balance, this program reports if the bank account balance is positive.
 * source: N/A
 * input: N/A 
 * output: The bank account balance is positive.
*/
public class IfBankAccountBalance{
	public static void main(String[] args){

		/**
		 * logical_step_1: Specify the balance of the bank account.
		 * logical_step_details: Declare a variable called bankAccountBalance that indicates the balance of the bank account. The data type of the bankAccountBalance variable is integer. The bankAccountBalance variable is initialized to value 56.
		 * question_1: How is the balance of the bank account actually specified?
		 * answer_1: Declare a variable called bankAccountBalance that indicates the balance of the bank account.
		 * question_2: What does the following code block do?
		 * answer_2: Specify the balance of the bank account.
		 * question_3: What is the data type of variable bankAccountBalance?
		 * answer_3: The data type of the bankAccountBalance variable is integer.
		 * question_4: What is the value of variable bankAccountBalance?
		 * answer_4: The bankAccountBalance variable is initialized to value 56.
		 */
		int bankAccountBalance = 56;


		/**
		 * logical_step_2: Check if the balance on the account is positive and if so, print a message stating the balance is positive.
		 * logical_step_details: Check if the value of the bankAccountBalance is positive or not. If the value is positive, then the if-then branch is executed. The if-then branch prints the message "The given number is positive".
		 * question_1: What does the following code block do?
		 * answer_1: Check if the balance on the account is positive and if so, print a message stating the balance is positive.
		 * question_2: What does the if statement do with respect to the bankAccountBalance variable?
		 * answer_2: It checks if the value of the bankAccountBalance is positive or not.
		 * question_3: When does the if-then branch execute?
		 * answer_3: If the value of the bankAccountBalance variable is positive, then the if-then branch is executed.
		 * question_4: What does the if-then branch of the if-statement do once executed?
		 * answer_4: The if-then branch prints the message "The given number is positive".
		 */

		/**
		 * stm_comment: The condition of the if-statement checks whether the value of the bankAccountBalance is positive, i.e., greater than 0.
		 * question_1: Please explain what the following if statement does?
		 * answer_1: The condition of the if-statement checks whether the value of the bankAccountBalance is positive, i.e., greater than 0.
		 */

		if ( bankAccountBalance > 0){

			/**
			 * stm_comment: Because the bankAccountBalance which equals 56 is positive, i.e., greater than 0, the message "The given number is positive." is printed.
			 * question_1: Please explain when and how the following statement runs?
			 * answer_1: Because the bankAccountBalance which equals 56 is positive, i.e., greater than 0, the message "The given number is positive." is printed.
			 */
			
			System.out.println("The bank account balance is positive.");
		}

	}
}
