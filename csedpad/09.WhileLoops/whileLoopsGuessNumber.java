/**
* author: Vasile Rus
* topics: while loops
* subtopics: simple while loop
* goalDescription: Guess the number.
* source: Intro to Java by Liang (10th edition)
* output: 
 
Guess a magic number between 0 and 100

Enter your guess: 3
Your guess is too low

Enter your guess: 20
Your guess is too high

Enter your guess: 15
Your guess is too low

Enter your guess: 18
Your guess is too high

Enter your guess: 17
Yes, the number is 17
 
*/

 
import java.util.Scanner;

public class whileLoopsGuessNumber {

	public static void main(String[] args) {

		/**
		* logical_step_1: Declare the magic number. 
		* logical_step_details: An integer variable is declared called number that stores the value to be guessed and it is initialized to value 17.
		* question_1: What does the following block of code do?
		* answer_1: Declares the magic number.
		* question_2: What is the type and initial value of the variable number?
		* answer_2: Variable number is of type integer and it is initialized to value 17.
		*/
		int number = 17;

		/** 
		* logical_step_2: Establish an input channel with the user's input device. 
		* logical_step_details: An Scanner variable is declared called input to read input from the user's input device, i.e., keyboard.
		* question_1: What does the following block of code do?
		* answer_1: Establishes an input channel with the user's input device.
		* question_2: What is the type and initial value of the variable number?
		* answer_2: Variable input is of type Scanner.
		*/
		Scanner input = new Scanner(System.in);

		/**
		* logical_step_3: Displays instructions on screen for the user. 
		* logical_step_details: A message with instructions is displayed on screen.
		* question_1: What does the following block of code do?
		* answer_1: Displays instructions on screen for the user.
		* question_2: What is the type and initial value of the variable number?
		* answer_2: Variable number is of type integer and it is initialized to value 17.
		*/
		System.out.println("Guess a magic number between 0 and 100");

		/**
		* logical_step_4: Ask the user repeatedly for a number until they guess it. 
		* logical_step_details: A while loop is used to keep asking the user for a guess number. The guess number is compared to the actual value in the variable number and if equal the loop ends. The user is given feedback by telling them whether they guess is higher or lower than the actual value in the variable number.
		* question_1: What does the following block of code do?
		* answer_1: Asks the user repeatedly for a number until they guess it.
		* question_2: What is the type and initial value of the variable guess?
		* answer_2: Variable guess is of type integer and it is initialized to value -1.
		* question_3: When does the loop end?
		* answer_3: The loop ends when the guess entered by the user matches the value in the variable number.
		*/
		int guess = -1;
		
		/**
		* stm_comment: The while loop runs until the guess number equals the magic number.
		* question_1: When does the while loop end?
		* answer_1: The while loop runs until the guess number equals the magic number.
		*/
		while (guess != number) {

			/**
			* stm_comment: Prompting the user to guess the magic number which is critical to eventually end the while loop.
			* question_1: Why is the following statement critical for the while loop to end?
			* answer_1: Prompting the user to guess the magic number which is critical to eventually end the while loop.
			*/
			System.out.print("\nEnter your guess: ");
			guess = input.nextInt();

			if (guess == number)
				System.out.println("Yes, the number is " + number);
			else if (guess > number)
				System.out.println("Your guess is too high");
			else
				System.out.println("Your guess is too low");
		}

	}
}
