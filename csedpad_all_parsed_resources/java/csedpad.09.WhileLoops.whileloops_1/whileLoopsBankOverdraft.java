/**
@goalDescription(Bank overdraft warning. We implement a computer program that monitors a bank account with an initial balance of $1,000 and from which a number of withdrawals are done each in the amount of $100. When balance drops below $150 a warning is displayed. When balance drops to 0 an bank overdraft message is displayed.)
**/
import java.util.Scanner;

public class whileLoopsBankOverdraft {

	public static void main(String[] args) {

//Declare the initial bank account balance and overdraft threshold.
		float balance = 1000, lowBalanceThreshold = 150;
		int withdrawalAmount = 100;
		
//While money are withdrawn from the account, the balance is checked and if the balance drops below the lowBalanceThreshold value a low balance message is being generated or an overdraft message is displayed if the balance is less than zero.
/**@helpDescription(The following loop withdraws money from the account as long as the balance is greater than or equal to zero. question_1: When does the following while loop end? answer_1: The following loop withdraws money from the account as long as the balance is greater than or equal to zero.)**/
		while (balance >= 0) {
/**@helpDescription(The value of the balance variable is changed, which is critical to modifying the conditional expression of the while loop and eventually end the loop. question_1: Why is the following statement critical for the while loop to end? answer_1: The value of the balance variable is changed, which is critical to modifying the conditional expression of the while loop and eventually end the loop.)**/
			balance = balance - withdrawalAmount;
			System.out.println(withdrawalAmount + " witdrawn from your account. New balance is " + balance + ".");
			if (balance < lowBalanceThreshold)
				System.out.println("Warning: Low Balance of " + balance);
			else if (balance < 0)
				System.out.println("Bank overdraft: Your balance is negative " + balance);
		}				
	}
}

