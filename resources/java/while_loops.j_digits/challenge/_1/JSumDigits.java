package challenge._1;
/**
@goalDescription(Construct a program that calculates the sum of the digits of a number.)
@name(The Digit Sum of a Number)
@distractor{code(} while (num > 1);), helpDescription()}
@distractor{code(} while (num > -1);), helpDescription()}
@distractor{code(total = lastDigit;), helpDescription()}
@distractor{code(total = total - lastDigit;), helpDescription()}
@distractor{code(total++;), helpDescription()}
 **/
public class JSumDigits {
	public static void main(String[] args) {

		//Step 1: Define the variables that we need for this program
		/**@helpDescription(We need variable num to store the number that we want to sum up its digits.)**/
		int num = 1234;
		/**@helpDescription(We need variable lastDigit to point to the digit in the 1's position of the number.)**/
		int lastDigit;
		/**@helpDescription(We need variable total to store the sum of the digits of the number. We initialize it to 0.)**/
		int total = 0;

		//Step 2: Sum up the digits of the number 
		/**@helpDescription(We need to iterate over the digits of the number and sum them up. The do statement is more appropriate than a while loop because a positive number always has at least one digit which results in the body of the loop performing at least once.)**/
		do {
			/**@helpDescription(We need to extract each digit from the number. We use modulus (%) operator to compute the remainder of the division of the number by 10.)**/
			lastDigit = num % 10;
			/**@blank(We add the extracted digit to the variable total that stores the sum of the digits of the number and store the result back into the variable total.)**/
			total = total + lastDigit;
			/**@helpDescription(We truncate the extracted digit that we processed from the original number by dividing the number by 10. Note that this statement performs an integer division because both operands of the / operator are integer. Therefore, this division will remove the digit that we processed (lastDigit) and we can move on to the next digit.)**/
			num = num / 10;
			/**@helpDescription(This statement prints to the default standard output stream the text "lastDigit:", the value of variable lastDigit, the text ", sum:", the value of variable total, the text ", number:", and the value of variable num. The printed text is followed by the end-of-line character at the end.)**/
			System.out.println("lastDigit: "+lastDigit+", sum: "+total+", number: "+num);
			/**@blank(We need to check for termination conditions to avoid infinite loops. The do loop terminates when we run out of digits to process, which corresponds to the point when the variable num reaches the value zero. If the number is greater than zero, we repeat the do/while body. Otherwise, we exit the loop and print the sum of the digits of the number.)**/
		} while (num > 0);

		/**@helpDescription(This statement prints the sum of the digits of the number to the default standard output stream. The expression in the argument of the println method returns a string that is obtained by concatenating the given string and value of the variable. The printed text is followed by the end-of-line character at the end.)**/
		System.out.println("The sum of the digits: " + total);
	}
}
