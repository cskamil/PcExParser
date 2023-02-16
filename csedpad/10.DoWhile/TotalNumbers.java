
/**
 * author: Hasan Mashrique, Scott Fleming
 * topics: do-while loops
 * subtopics: do-while loop control flow, do-while loop conditionals
 * goalDescription: Repeatedly prompt the user for a number between 0 and 9 until the user enters -1. Each time the user enters a number (other than -1) display the subtotal of the numbers entered so far. When the user enters -1, display the grand total of all the numbers entered.
 * source: N/A
 * input_1: [ 1, 2, 3, 4, 5, -1 ]
 * output_1: [ 1, 3, 6, 10, 15, 15 ]
 * input_2: [ 1, 2, 99, 3, 4, -1 ]
 * output_2: [ 1, 3, Error, 6, 10, 10 ]
 * input_3: [ -1 ]
 * output_3: [ 0 ]
 */

import java.util.Scanner;

public class TotalNumbers {

    public static void main(String[] args) {
        /**
         * logical_step_1: Declare and initialize a variable for storing user input (number) and a variable for storing a running total (total), and instantiate a Scanner object for accepting user input (scan).
         * logical_step_details: Declare an int variable number to store numbers inputted by the user, and initialize number to 0. Declare an int variable total to store a running total of the numbers entered by the user, and initialize total to 0. Allocate a java.util.Scanner object and initialize it such that it can retrieve input from stdin (System.in). Declare a Scanner reference variable scan, and initialize it to reference the Scanner object.
         */
        int number = 0;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        /**
         * logical_step_2: Repeatedly prompt the user to input a number from 0 to 9 (or -1 to quit), and add the number to the running total.
         * logical_step_details: In a loop, print a prompt to stdout, asking the user to enter a number from 0 to 9 or -1 to quit. Then, retrieve the value inputted by the user and store it in the variable number. If the value of number is between 0 and 9, add it to the running total stored in the variable total, and print the running total to stdout. If the user inputted an invalid value, print an error message. Repeat the above steps until the user enters a -1. Once the user has entered a -1, close the scanner, because no more input will be retrieved from the user.
         * 
         * question_1: If the variable number was initialized to -1 (instead of 0), would the body of the do-while loop execute?
         * answer_1: Yes, a do-while loop's exit condition is checked only after the body of the loop executes.
         * 
         * question_2: When a user enters -1, what happens with respect to the do-while loop's conditional?
         * answer_2: When a user enters -1, the value -1 is stored in the variable number. Once the loop body has finished executing, the loop's conditional expression (number != -1) is checked. Because number has the value -1, the conditional expression evaluates to false. As a result, the flow of control drops out of the loop, and the next line to execute is the one that closes the scanner.
         * 
         * question_3: Is it possible for the body of the do-while loop to execute infinitely many times?
         * answer_3: Yes, if the user never enters the value -1, the loop will execute infinitely many times.
         */
        /**
         * stm_comment: Unlike while and for loops, the body of a do-while loop executes first, before a conditional is checked.
         */
        do {
            System.out.print("\nEnter an integer value between 0 and 9 (or -1 to quit): ");
            number = scan.nextInt();

            if (number >= 0 && number <= 9) {
                total += number;
                System.out.println("\nSubtotal: " + total);
            } else if (number < -1 || number > 9) {
                System.out.println("\nError: Invalid input, try again");
            }

            /**
             * stm_comment: Check the conditional (number != -1), and if it evaluates to true, repeat the loop body; otherwise, if it evaluates to false, drop out of the loop. Note that a semicolon (;) must be placed on the end of a do-while loop -- it is easy to forget!
             */
        } while (number != -1);

        scan.close();

        /**
         * logical_step_3: Display the grand total of the numbers entered by the user.
         * logical_step_details: Print a message with the value of the total variable to stdout.
         */
        System.out.println("\nGrand Total: " + total);
    }

}
