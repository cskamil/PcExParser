package challenge._3;

import java.util.Scanner;

/**
@goalDescription(Construct a program that receives an integer from the user, outputs that integer, and exits when the user enters an even integer less than 10.)
@name(Receiving Input Integers Until a Certain Condition is Met (Case 4))
@input(16)
@input(10)
@input(3)
@input(1)
@input(4)
@distractor{code(while ( num % 2 == 0 && num < 10 ) {), helpDescription()}
@distractor{code(while ( num % 2 != 0 && num >= 10 ) {), helpDescription()}
@distractor{code(while ( num % 2 == 0 || num < 10 ) {), helpDescription()}
@distractor{code(while ( num % 2 != 0 || num > 10 ) {), helpDescription()}
 **/
public class JInput4 {

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

		//Step 2:  Receive the input as long as the user enters an integer that is not even or is not less than 10; otherwise stop
		/**@blank(We need to repeat receiving the integers from the user as long as the user enters an integer that is not even or is not less than 10. Therefore, we need to use a loop structure. Since we don't know ahead of time how many times the loop will be repeated, we need to use a while loop. The condition in the while loop tests whether the body of the loop should be repeated, so it should test whether the input integer is not even or not less than 10.<br><br>We check whether the input integer is not even by checking whether the remainder when the integer is divided by 2 is not zero. We could check whether the input integer is not less than 10 by checking whether the input integer is greater than or equal to 10.)**/
		/**@blank(The body of the while loop is repeated as long as the user enters an integer that is not even or is not less than 10. The loop terminates when the loop condition evaluates to false, that is when the user enters an even integer less than 10.)**/
		/**@blank(Note that the || operator yields the result true if at least one of the conditions is true. Also note that the % operator returns the remainder of the division.)**/
		while ( num % 2 != 0 || num >= 10 ) {
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
