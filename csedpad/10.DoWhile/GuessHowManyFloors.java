
/**
 * author: Scott Fleming
 * topics: do-while loops
 * subtopics: do-while loop control flow, do-while loop conditionals
 * goalDescription: Repeatedly prompt the user to guess the number of floors in the world's tallest building, the Burj Khalifa in Dubai. Each time the user enters an incorrect guess, tell them if their guess was too low or too high, and ask them to guess again. If the user enters the correct answer, congratulate them, and the game is over. A user can give up by entering -1.
 * source: N/A
 * input_1: [ 100, 200, 150, 175, 163 ]
 * output_1: [ Too low!, Too high!, Too low!, Too high!, Congratulations! You got it right! ]
 * input_2: [ 100, 200, -1 ]
 * output_2: [ Too low!, Too high!, The number of floors in the Burj Khalifa is 163. ]
 */

import java.util.Scanner;

public class GuessHowManyFloors {

    public static void main(String[] args) {
        /**
         * logical_step_1: Declare and initialize a variable that holds the correct answer (CORRECT_ANSWER) and a variable for storing user's guess (guess), and instantiate a Scanner object for accepting user input (scan).
         * logical_step_details: Declare a final int variable CORRECT_ANSWER to store the value of the correct answer, and initialize CORRECT_ANSWER to 163. Declare an int variable guess to store the guesses entered by the user, and  initialize guess to 0. Allocate a java.util.Scanner object and initialize it such that it can retrieve input from stdin (System.in). Declare a Scanner reference variable scan, and initialize it to reference the Scanner object.
         */
        final int CORRECT_ANSWER = 163;
        int guess = 0;
        Scanner scan = new Scanner(System.in);

        /**
         * logical_step_2: Prompt the user to input a guess as to the number of floors in the Burj Khalifa, and until they get the correct answer or enter -1 to give up, print a message telling them whether their guess was too high or too low and prompt them again.
         * logical_step_details: In a loop, print a prompt to stdout, asking the user to enter a guess as to the number of floors in the Burj Khalifa or -1 to quit. Then, retrieve the value inputted by the user and store it in the variable guess. If the value of guess is not -1 and it is less than or greater than the value of CORRECT_ANSWER, print a message to stdout, indicating that the guess was too low or too high, respectively. Repeat the above steps until the user enters the correct answer or -1. Once the user has entered the correct answer or -1, close the scanner, because no more input will be retrieved from the user.
         * 
         * question_1: If the variable guess was initialized to -1 (instead of 0), would the body of the do-while loop execute? 
         * answer_1: Yes, a do-while loop's exit condition is checked only after the body of the loop executes.
         * 
         * question_2: When a user enters the correct answer, 163, what happens with respect to the do-while loop's conditional? 
         * answer_2: When a user enters 163, the value 163 is stored in the variable guess. Once the loop body has finished executing, the loop's conditional expression (guess != CORRECT_ANSWER && guess != -1) is checked. Because CORRECT_ANSWER has the value 163, the conditional expression evaluates to false. As a result, the flow of control drops out of the loop, and the next line to execute is the one that closes the scanner.
         * 
         * question_3: Is it possible for the body of the do-while loop to execute infinitely many times?
         * answer_3: Yes, if the user never enters the correct answer or -1, the loop will execute infinitely many times.
         */
        /**
         * stm_comment: Unlike while and for loops, the body of a do-while loop executes first, before a conditional is checked.
         */
        do {
            System.out.print("\nHow many floors does the world's tallest building, the Burj Khalifa in Dubai, have? (Enter -1 to give up.)\n> ");
            guess = scan.nextInt();

            if (guess < CORRECT_ANSWER && guess != -1) {
                System.out.println("\nToo low!\nSorry, try again...");
            } else if (guess > CORRECT_ANSWER && guess != -1) {
                System.out.println("\nToo high!\nSorry, try again...");
            }

            /**
             * stm_comment: Check the conditional (guess != CORRECT_ANSWER && guess != -1), and if it evaluates to true, repeat the loop body; otherwise, if it evaluates to false, drop out of the loop. Note that a semicolon (;) must be placed on the end of a do-while loop -- it is easy to forget!
             */
        } while (guess != CORRECT_ANSWER && guess != -1);

        scan.close();

        /**
         * logical_step_3: Display the correct answer, and if the user answered correctly, congratulate them. 
         * logical_step_details: If the value of the guess variable equals the value of the CORRECT_ANSWER variable, print a message congratulating the user to stdout. Regardless of whether the user entered a correct answer or quit by entering -1, print the correct answer to stdout.
         */
        System.out.println("");
        if (guess == CORRECT_ANSWER) {
            System.out.println("Congratulations! You got it right!");
        }
        System.out.println("The number of floors in the Burj Khalifa is 163.");
    }

}
