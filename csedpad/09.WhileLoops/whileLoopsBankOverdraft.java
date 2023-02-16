/**
* author: Vasile Rus
* topics: while loops
* subtopics: simple while loop
* goalDescription: Bank overdraft warning. We implement a computer program that monitors a bank account with an initial balance of $1,000 and from which a number of withdrawals are done each in the amount of $100. When balance drops below $150 a warning is displayed. When balance drops to 0 an bank overdraft message is displayed.
* source: none
* output: 
 
100 witdrawn from your account. New balance is 900.0.
100 witdrawn from your account. New balance is 800.0.
100 witdrawn from your account. New balance is 700.0.
100 witdrawn from your account. New balance is 600.0.
100 witdrawn from your account. New balance is 500.0.
100 witdrawn from your account. New balance is 400.0.
100 witdrawn from your account. New balance is 300.0.
100 witdrawn from your account. New balance is 200.0.
100 witdrawn from your account. New balance is 100.0.
Warning: Low Balance of 100.0
100 witdrawn from your account. New balance is 0.0.
Warning: Low Balance of 0.0
100 witdrawn from your account. New balance is -100.0.
Warning: Low Balance of -100.0
 
*/
 
import java.util.Scanner;

public class whileLoopsBankOverdraft {

	public static void main(String[] args) {

		/** logical_step_1: Declare the initial bank account balance and overdraft threshold. 
		* logical_step_details: A variable called balance is declared of type float (real values) that stores the initial balance of the bank account. Similarly, a variable called lowBalanceThreshold is declared of type float (real values) that indicates the low balance threshold. Another variable withdrawalAmount of type integer is declared indicating a typical amount to be withdrawn.
		* question_1: What does the following block of code do?
		* answer_1: Declare the initial bank account balance and overdraft threshold.
		* question_2: What is the type and initial value of the variable balance?
		* answer_2: Variable balance is of type float and it is initialized to value 1000.
		* question_3: What is the type and initial value of the variable lowBalanceThreshold?
		* answer_3: Variable lowBalanceThreshold is of type float and it is initialized to value 150.
		* question_4: What is the type and initial value of the variable withdrawalAmount?
		* answer_4: Variable withdrawalAmount is of type integer and it is initialized to value 100.
		*/
		float balance = 1000, lowBalanceThreshold = 150;
		
		int withdrawalAmount = 100;
		
		/** logical_step_2: While money are withdrawn from the account, the balance is checked and if the balance drops below the lowBalanceThreshold value a low balance message is being generated or an overdraft message is displayed if the balance is less than zero.
		* logical_step_details: A while loop is used to iteratively withdraw from the account balance the withdrawalAmount until the balance reaches zero. At each iteration, the balance is being compared with the lowBalanceThreshold value and if below a low balance message is being generated. If the balance is less than zero, an overdraft message is being displayed.
		* question_1: What does the following block of code do?
		* answer_1: While money are withdrawn from the account, the balance is checked and if the balance drops below the lowBalanceThreshold value a low balance message is being generated or an overdraft message is displayed if the balance is less than zero.
		* question_2: How are bank account withdrawals implemented and how many such withdrawals are being made?
		* answer_2: A while loop is used to iteratively withdraw from the account balance the withdrawalAmount until the balance becomes negative.
		* question_3: When is a low balance message displayed?
		* answer_3: At each iteration, the balance is being compared with the lowBalanceThreshold value and if below a low balance message is being generated.
		* question_4: When is an overdraft message displayed?
		* answer_4: If the balance is less than zero, an overdraft message is being displayed.
		*/

		/**
		* stm_comment: The following loop withdraws money from the account as long as the balance is greater than or equal to zero. 
		* question_1: When does the following while loop end?
		* answer_1: The following loop withdraws money from the account as long as the balance is greater than or equal to zero.
		*/
		while (balance >= 0) {

			/**
			* stm_comment: The value of the balance variable is changed, which is critical to modifying the conditional expression of the while loop and eventually end the loop.
			* question_1: Why is the following statement critical for the while loop to end?
			* answer_1: The value of the balance variable is changed, which is critical to modifying the conditional expression of the while loop and eventually end the loop.
			*/
			balance = balance - withdrawalAmount;
			System.out.println(withdrawalAmount + " witdrawn from your account. New balance is " + balance + ".");

			if (balance < lowBalanceThreshold)
				System.out.println("Warning: Low Balance of " + balance);
			else if (balance < 0)
				System.out.println("Bank overdraft: Your balance is negative " + balance);
		}				
	}
}

