/**
@goalDescription(Guess the number.)
**/
 
import java.util.Scanner;

public class whileLoopsGuessNumber {

	public static void main(String[] args) {

//Declare the magic number.
		int number = 17;
//Establish an input channel with the user's input device.
		Scanner input = new Scanner(System.in);
//Displays instructions on screen for the user.
		System.out.println("Guess a magic number between 0 and 100");
//Ask the user repeatedly for a number until they guess it.
		int guess = -1;
/**@helpDescription(The while loop runs until the guess number equals the magic number. question_1: When does the while loop end? answer_1: The while loop runs until the guess number equals the magic number.)**/
		while (guess != number) {
/**@helpDescription(Prompting the user to guess the magic number which is critical to eventually end the while loop. question_1: Why is the following statement critical for the while loop to end? answer_1: Prompting the user to guess the magic number which is critical to eventually end the while loop.)**/
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
