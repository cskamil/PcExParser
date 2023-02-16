/**
@goalDescription(Given a number, this program checks whether the number is even or not.)
**/
public class EvenChecker{
	public static void main(String[] args){

//Declare a variable called num1 to check whether it is even or not.
		int num1 = 36;

//Check if the remainder is zero or not when divided by 2, and if so, print a message stating the number is even.

/**@helpDescription(The condition of the if-statement checks whether the remainder of the num1 is zero or not. question_1: Please explain what the following if statement does? answer_1: The condition of the if-statement checks whether the remainder of the num1 is zero or not.)**/
		if ( num1 % 2 == 0 ){


/**@helpDescription(The remainder of the num1 is zero, the message "The given number is positive." is printed. question_1: Please explain when and how the following statement runs? answer_1: The remainder of the num1 is zero, the message "The given number is positive." is printed.)**/
			System.out.println("Num1 is even");
		}
	}
}
