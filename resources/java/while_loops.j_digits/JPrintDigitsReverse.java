
/**
@goalDescription(Construct a program that prints the digits of a number from right to left.)
@name(Printing Digits of a Number from Right to Left)
@distractor{code(} while (num > 1);), helpDescription()}
@distractor{code(} while (num >= 0);), helpDescription()}
@distractor{code(lastDigit = num % 100;), helpDescription()}
@distractor{code(lastDigit = num % 1000;), helpDescription()}
 **/
public class JPrintDigitsReverse {
	public static void main(String[] args) {

		//Step 1: Define the variables that we need for this program
		/**@helpDescription(We need variable num to store the integer that we want to print its digits.)**/
		int num = 1234;
		/**@helpDescription(We need variable lastDigit to point to the digit in the 1's position of the number.)**/
		int lastDigit;

		//Step 2: Print the digits of the number from right to left
		/**@helpDescription(We need to iterate over the digits of the integer from right to left and print them. The do statement is more appropriate than a while loop because a positive integer always has at least one digit which results in the body of the loop performing at least once.)**/
		do {
			/**@blank(We need to extract each digit from the number. We use modulus (%) operator to compute the remainder of the division of the number by 10.)**/
			lastDigit = num % 10;
			/**@helpDescription(This statement prints each digit in the number to the default standard output stream. Each printed digit is followed by the end-of-line character at the end.)**/
			System.out.println(lastDigit);
			/**@helpDescription(We truncate the extracted digit that we processed from the original number by dividing the number by 10. Note that this statement performs an integer division because both operand of the / operator are integer. Therefore, this division will remove the digit that we processed (lastDigit) and we can move on to the next digit.)**/
			num = num / 10;
			/**@blank(We need to check for termination conditions to avoid infinite loops. The do loop terminates when we run out of digits to process, which corresponds to the point when the variable num reaches the value zero. If the number is greater than zero, we repeat the do/while body. Otherwise, we exit the loop.)**/
		} while (num > 0);
	}
}
