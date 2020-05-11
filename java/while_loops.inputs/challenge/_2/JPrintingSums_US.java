package challenge._9;
import java.util.Scanner;

/**
@goalDescription(Construct a program that receives an integer N and then prints the sum of integers from 1 to i, where i ranges from 1 to N. More specifically, the following sums will be printed:\n1\n1+2\n1+2+3\n...\n1+2+3+...+N)
@name(Printing Sum of Integers from 1 to i, Where i Ranges from 1 to N)
@input(5)
@distractor{code(for (int j = i; j < N; j++) {), helpDescription()}
@distractor{code(for (int j = 1; j <= N; j++) {), helpDescription()}
@distractor{code(for (int j = 1; j <= N-i; j++) {), helpDescription()}
@distractor{code(sum = 1;), helpDescription()}
@distractor{code(sum = sum + i;), helpDescription()}
@distractor{code(sum = i;), helpDescription()}

**/
public class JPrintingSums_US {
	public static void main(String[] args) {

		//Step 1: Read the integer N
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

		//Step 2: Define the variable for storing the sum
		/**@helpDescription(We need variable sum for calculating the sum of the integers from 1 to i, where i is an integer in the range from 1 to N.)**/
		int sum;
		//Step 3: Iterate through integers from 1 to N, one by one
		/**@blank(The outer for loop will determine the i in every iteration whereas the inner for loop will calculate the sum of the integers from 1 to i.<br><br>This statement is the outer for loop. For the outer loop, we initialize variable i to 1, loop until reaching N (inclusive), and increment i by 1 after each iteration of the loop.)**/
		/**@blank(In the first part of the loop header, we define a control variable i and initialize it to 1. In the second part of the loop header, we test whether the control variable has reached the termination threshold. The loop is repeated if the control variable is less than or equal to N and terminates when the control variable reaches N+1. In the third part of the loop header, we increment the control variable by 1 after each iteration of the loop.)**/
		/**@blank(Note that the first part is executed once before the loop starts, the second part is executed before each iteration, and the third part is executed after each iteration of the loop.<br><br>Also note that the increment operator (++) adds 1 to the value of variable i and the result is stored back into the variable i. Therefore, it is functionally equivalent to the statement i = i + 1. )**/
		for (int i = 1; i <= N; i++) {

			//Step 3.1: Initialize the variable that we need to store the sum
			/**@blank(We need to set the sum to 0 before we want to start calculating the sum of the integers from 1 to i.)**/
			/**@blank(Note that this statement cannot be placed inside the inner loop because in that case in every iteration of the inner loop variable sum would be set to 0 and that means that sum would always be equal to the last integer (i.e., integer i). We cannot place this statement outside the outer loop either because in that case sum would get accumulated from previous iterations. Therefore, the only place that we could place this statement is in the outer loop body before reaching to the inner loop.)**/
			sum = 0;

		    //Step 3.2: Calculate the sum of the integers from 1 to i
			/**@blank(This statement is the inner loop of the nested loop. It iterates through the integers in the range from 1 to i, where i changes after each iteration of the outer loop.)**/
			/**@blank(In the first part of the loop header, we define a control variable j and initialize it to 1. In the second part of the loop header, we test whether the control variable has reached the termination threshold. The loop is repeated if the control variable is less than or equal to i and terminates when the control variable reaches i+1. In the third part of the loop header, we increment the control variable by 1 after each iteration of the loop.)**/
			/**@blank(Note that the first part is executed once before the loop starts, the second part is executed before each iteration, and the third part is executed after each iteration of the loop.<br><br>Also note that the increment operator (++) adds 1 to the value of variable j and the result is stored back into the variable j. Therefore, it is functionally equivalent to the statement j = j + 1. )**/
			/**@blank(Note that the name that we choose for the control variable in the inner loop should be different from the outer for loop. Here, i is the control variable in the outer loop and j is the control variable in the inner loop.)**/
			for (int j = 1; j <= i; j++) {
		        		        
				/**@blank(In each iteration of the inner loop, we add the integer j to the sum and the result is stored back into the variable sum.)**/ 
				sum = sum + j;
			/**@blank()**/
			}

			//Step 3.3: Print the sum of integers in the range of 1 to i
			/**@helpDescription(This statement concatenates the given text and value of variable sum and prints the sum of the integers from 1 to i. The printed text is followed by the end-of-line character at the end.)**/
			/**@helpDescription(Note that we concatenate the content of two strings using the + operator. Also, note that the concatenating and printing are done in the same line. That is, we don't have to store the concatenated string to a new variable at first and then print it in the next line.)**/
			System.out.println("Sum of integers from 1 to " + i + ": " + sum);
		/**@blank()**/
		}
	}
}
