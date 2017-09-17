package challenge._2;
/**
@goalDescription(Construct a program to accept a positive integer (N) and then print all the positive numbers in the sequence N-1, N-4, N-7, N-10, ... .)
@input(13)
@name(Printing Numbers in Descending Order in Decrements of 3)
@distractor{code(for (int num = N; num > 0; num -= 1) {), helpDescription()}
@distractor{code(for (int num = N-1; num > -1; num -= 3) {), helpDescription()}
@distractor{code(for (int num = N-1; num > 0; num += 3) {), helpDescription()}
@distractor{code(for (int num = 0; num <= N-1; num += 3) {), helpDescription()}
 **/
import java.util.Scanner;

public class JPrintNumDesc3 {

	public static void main(String[] args) {	
		//Step 1: Read the integer from the user  
		/**@helpDescription(We need to read and process the value that user enters. To read the input values from user, we need to define a Scanner object.)
		/**@helpDescription(We can create a Scanner object using the operator new, as shown in this statement. The System.in object represents the standard input stream, which by default is the keyboard. It tells the java compiler that the input will be provided through keyboard.)**/
		Scanner scan = new Scanner(System.in);
		/**@helpDescription(We prompt the user to enter a positive integer.)**/
		System.out.println("Enter a positive integer: ");
		/**@helpDescription(The nextInt() method of the Scanner class reads the next input token as integer and returns it. We assign this integer to variable N.) **/
		/**@helpDescription(Note that if the user provide a non-integer number, an exception will be thrown because the input type is inconsistent with the expected data type, i.e., int.)**/		
		int N = scan.nextInt();
		/**@helpDescription(We close the scanner as we do not want to process any input from the user in the rest of the program.)**/ 
		scan.close();

		//Step 2: Iterate through the numbers in the sequence
		/**@blank(We need to repeat printing the numbers that are in the sequence. To do this, we need to use a for loop. In the for loop, we initialize the loop control variable (called num) to N-1, loop until num has not reached 0, and decrement num by 3 after each iteration of the loop.)**/
		/**@blank(We use for loops instead of a while loop because once we receive the integer from the user, we know how many times the loop will be repeated, and for loops are best-suited in cases like this when we know ahead of time the number of times that we need to repeat the loop.)**/		
		/**@blank(Here, we want the for loop to start at the number preceding the user integer (stored in variable N), go backward decrementing each number by 3 down to but not including 0 (0 is not positive). In the first part of the loop header, we define a control variable num and initialize it to N-1. In the second part of the loop header, we test whether the control variable has reached the termination threshold. The loop is repeated if the control variable is greater than 0 and terminates when the control variable reaches 0. In the third part of the loop header, we decrement the control variable by 3 after each iteration of the loop (because the consecutive numbers in the sequence differ by 3).)**/
		/**@blank(Note that the first part is executed once before the loop starts, the second part is executed before each iteration, and the third part is executed after each iteration of the loop. Also, note that the decrement operator (-=) subtract 3 from the value of variable num and the result is stored back into the variable num. Therefore, it is functionally equivalent to the statement num = num - 3. )**/
		for (int num = N-1; num > 0; num -= 3) {
			//Step 3: Print each number in the sequence
			/**@helpDescription(This statement prints each number in the sequence to the default standard output stream. Each printed value is followed by the end-of-line character at the end.)**/
			System.out.println(num);
		}
	}
}