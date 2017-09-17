package challenge._2;

import java.util.Scanner;

/**
@goalDescription(Construct a program that receives an from the user, outputs that integer, and exits when the user enters a negative integer or an integer greater than 1000.)
@name(Receiving Input Integers Until a Certain Condition is Met (Case 3))
@input(999)
@input(1000)
@input(0)
@input(1001)
@distractor{code(while ( num > 0 && num <= 1000 ) {), helpDescription()}
@distractor{code(while ( num >= 0 && num < 1000 ) {), helpDescription()}
@distractor{code(while ( num <= 0 || num > 1000 ) {), helpDescription()}
@distractor{code(while ( num >= 0 || num <= 1000 ) {), helpDescription()}
 **/
public class JInput3 {

	public static void main(String[] args) {

		//Step 1: Read the first integer that the user enters
		/**@helpDescription(We need to read and process the values that the user enters. To read the input values from the user, we need to define a Scanner object.)**/
		/**@helpDescription(We can create a Scanner object using the operator new, as shown in this statement. The System.in object represents the standard input stream, which by default is the keyboard. It tells the java compiler that the input will be provided through keyboard.)**/
		Scanner scan = new Scanner(System.in);
		/**@helpDescription(We prompt the user to enter an integer.)**/
		System.out.println("Enter an integer:");
		/**@helpDescription(We need to read the integer that the user enters and store it in a variable. We read the integer by calling the nextInt() method because this input is an integer.) **/
		/**@helpDescription(Note that if the user provides a non-integer number, an exception will be thrown because the input type is inconsistent with the expected data type, i.e., int.)**/		
		int num = scan.nextInt();

		//Step 2:  Receive the input as long as the user enters an integer that is not negative and is not greater than 1000; otherwise stop
		/**@blank(We need to repeat receiving the integers from the user as long as the user enters an integer that not negative and is not greater than 1000. Therefore, we need to use a loop structure. Since we don't know ahead of time how many times the loop will be repeated, we need to use a while loop. The condition in the while loop tests whether the body of the loop should be repeated, so it should test whether the input integer is non-negative and not greater than 1000.<br><br>We could check whether the input integer is non-negative by checking whether the input integer is greater than or equal to zero. We could check whether the input integer is not greater than 1000 by checking whether the input integer is less than or equal to 1000.)**/
		/**@blank(The body of the while loop is repeated as long as the user enters an integer that is not negative and is not greater than 1000. The loop terminates when the loop condition evaluates to false, that is when the user enters a negative integer or an integer greater than 1000.)**/
		/**@blank(Note that the && operator yields the result true if both conditions are true.)**/
		while ( num >= 0 && num <= 1000 ) {
			/**@helpDescription(This statement prints to the default standard output stream the integer that the user has entered. The printed text is followed by the end-of-line character at the end.)**/
			/**@helpDescription(The expression in the argument of the println method returns a string that is obtained by concatenating the given string and value of the variable.)**/
			System.out.println("The integer entered is " + num);
			/**@helpDescription(We prompt the user to enter an integer.)**/
			System.out.println("Enter an integer:");
			/**@helpDescription(We need to read the integer that the user enters and store it in a variable. We read the integer by calling the nextInt() method because this input is an integer.) **/
			/**@helpDescription(Note that if the user provides a non-integer number, an exception will be thrown because the input type is inconsistent with the expected data type, i.e., int.)**/		
			num = scan.nextInt(); 
		}
		/**@helpDescription(We close the scanner as we do not want to process any input from the user in the rest of the program.)**/ 
		scan.close();
		/**@helpDescription(We prompt the user that this is the end of input.)**/
		System.out.println("End of input.");
	}
}
