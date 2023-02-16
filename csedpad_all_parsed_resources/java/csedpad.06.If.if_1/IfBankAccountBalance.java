/**
@goalDescription(Given a bank account balance, this program reports if the bank account balance is positive.)
**/
public class IfBankAccountBalance{
	public static void main(String[] args){
//Specify the balance of the bank account.
		int bankAccountBalance = 56;

//Check if the balance on the account is positive and if so, print a message stating the balance is positive.
/**@helpDescription(The condition of the if-statement checks whether the value of the bankAccountBalance is positive, i.e., greater than 0. question_1: Please explain what the following if statement does? answer_1: The condition of the if-statement checks whether the value of the bankAccountBalance is positive, i.e., greater than 0.)**/
		if ( bankAccountBalance > 0){

/**@helpDescription(Because the bankAccountBalance which equals 56 is positive, i.e., greater than 0, the message "The given number is positive." is printed. question_1: Please explain when and how the following statement runs? answer_1: Because the bankAccountBalance which equals 56 is positive, i.e., greater than 0, the message "The given number is positive." is printed.)**/
			System.out.println("The bank account balance is positive.");
		}

	}
}
