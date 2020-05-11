package challenge._8;
import java.util.Scanner;

/**
@goalDescription(Construct a program that receives an integer N from the user and prints a sequence of space-separated numbers from 1 to N such that each number in the sequence is repeated 5 times. For example, if N is 6, the program will print the following sequence:\n11111 22222 33333 44444 55555 66666)
@input(6)
@name(Printing A Sequence of Repeated Numbers )
@distractor{code( for (int j = 0; j <= 5; j++) {), helpDescription()}
@distractor{code( for (int j = 1; j <= 6; j++) {), helpDescription()}
@distractor{code( for (int j = 5; j <= N; j++) {), helpDescription()}
@distractor{code( for (int j = 5; j < N - i; j++) {), helpDescription()}

**/
public class JRepeatedSequence1_US {
	public static void main(String[] args){
		//Step 1: Read the integer N that the user enters
		/**@helpDescription(We need to read and process the integer that the user enters. To read the input integer from the user, we need to define a Scanner object.)**/
		/**@helpDescription(We can create a Scanner object using the operator new, as shown in this statement. The System.in object represents the standard input stream, which by default is the keyboard. It tells the java compiler that the input will be provided through keyboard.)**/
		Scanner scan = new Scanner(System.in);
		/**@helpDescription(We prompt the user to enter the integer N.)**/
		System.out.println("Enter the integer N: ");
		/**@helpDescription(We need to read the integer that the user enters and store it in a variable. We read the input integer by calling the nextInt() method because this input is an integer.) **/
		/**@helpDescription(Note that if the user provides a non-integer number, an exception will be thrown because the input type is inconsistent with the expected data type, i.e., int.)**/		
		int N = scan.nextInt();
		/**@helpDescription(We close the scanner as we do not want to process any input from the user in the rest of the program.)**/ 
		scan.close();
		
		//Step 2: Print N space-separated numbers
		/**@blank(The 1st number is printed five times, the 2nd number is printed five times. In general, the i-th number is printed five times. We can print this sequence by using two for loops. The outer for loop will iterate through the numbers from 1 to N whereas the inner for loop will print the i-th number five times.<br><br>This statement is the outer for loop. For the outer loop, we initialize variable i to 1, loop until reaching N (inclusive), and increment i by 1 after each iteration of the loop.)**/
		/**@blank(In the first part of the loop header, we define a control variable i and initialize it to 1. In the second part of the loop header, we test whether the control variable has reached the termination threshold. The loop is repeated if the control variable is less than or equal to N and terminates when the control variable reaches N+1. In the third part of the loop header, we increment the control variable by 1 after each iteration of the loop.)**/
		/**@blank(Note that the first part is executed once before the loop starts, the second part is executed before each iteration, and the third part is executed after each iteration of the loop.<br><br>Also note that the increment operator (++) adds 1 to the value of variable i and the result is stored back into the variable i. Therefore, it is functionally equivalent to the statement i = i + 1. )**/
		for (int i = 1; i <= N; i++) {
			//Step 2.1: Print the i-th number five times
			/**@blank(This statement is the inner for loop. Each iteration of inner loop will print the i-th number once. For the i-th number, the inner loop will iterate five times; thus, printing the i-th number five times. Note that all of the numbers appear on the same line because we are using a print instead of a println.<br><br>For the inner loop, we initialize variable j to 1, loop until reaching 5 (inclusive), and increment j by 1 after each iteration of the loop.)**/
			/**@blank(In the first part of the loop header, we define a control variable j and initialize it to 1. In the second part of the loop header, we test whether the control variable has reached the termination threshold. The loop is repeated if the control variable is less than or equal to 5 and terminates when the control variable reaches 6. In the third part of the loop header, we increment the control variable by 1 after each iteration of the loop.)**/
			/**@blank(Note that the first part is executed once before the loop starts, the second part is executed before each iteration, and the third part is executed after each iteration of the loop.<br><br>Also note that the increment operator (++) adds 1 to the value of variable j and the result is stored back into the variable j. Therefore, it is functionally equivalent to the statement j = j + 1. )**/
			/**@blank(Note that the name that we choose for the control variable in the inner loop should be different from the outer for loop. Here, i is the control variable in the outer loop and j is the control variable in the inner loop.)**/
		    for (int j = 1; j <= 5; j++) {
				/**@blank(This statement prints the i-th number.)**/
		        System.out.print(i);    
		   /**@blank()**/
		    } 
			/**@blank(We want to separate the repeated numbers by a space character; therefore, after repeating the i-th number five times, we print a space character.<br><br>Note that the space character appear on the same line as the numbers because we are using a print instead of a println.)**/
		    System.out.print(" ");
			   /**@blank()**/
		}
	}
}

