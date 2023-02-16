
/**
 * author: Scott Fleming
 * topics: do-while loops
 * subtopics: do-while loop control flow, do-while loops with always-true exit conditionals, break statements in a do-while loop
 * goalDescription: The world's tiniest command-line calculator. Repeatedly prompt the user for a command (add, sub, or exit). The add command increments an accumulator by 1. The sub command decrements the accumulator by 1. The exit command terminates the program. The state of the accumulator is printed whenever its value is updated.
 * source: N/A
 * input_1: [ add, add, add, sub, sub, sub, exit ]
 * output_1: [ 1, 2, 3, 2, 1, 0, Goodbye! ]
 * input_2: [ sub, sub, sub, add, add, add, exit ]
 * output_2: [ -1, -2, -3, -2, -1, 0, Goodbye! ]
 * input_3: [ dda, add, bus, sub, exit ]
 * output_3: [ Error, 1, Error, 0, Goodbye! ]
 * input_4: [ exit ]
 * output_4: [ Goodbye! ]
 */

import java.util.Scanner;

public class TiniestCommandLineCalculator {

    public static void main(String[] args) {
        /**
         * logical_step_1: Declare and initialize constant variables that hold the various commands accepted by the program.
         * logical_step_details: Declare and initialize three final string variables (ADD_CMD, SUB_CMD, and EXIT_CMD), one for each command accepted by the program.
         */
        final String ADD_CMD = "add";
        final String SUB_CMD = "sub";
        final String EXIT_CMD = "exit";

        /**
         * logical_step_2: Declare and initialize a variable to store the state of the accumulator and a scanner object to retrieve user input.
         * logical_step_details: Declare an int variable accumulator that will store the state of the accumulator, and initialize the variable to 0. Allocate a java.util.Scanner object that will be used to retrieve user input, and initialize that object to retrieve data from stdin. Declare a Scanner reference variable scan, and set it to refer to the Scanner object.
         */
        int accumulator = 0;
        Scanner scan = new Scanner(System.in);

        /**
         * logical_step_3: Print a welcome message.
         * logical_step_details: N/A
         */
        System.out.println("");
        System.out.println("Welcome to the world's tiniest command-line calculator!");
        System.out.println("");
        System.out.println("This program understands three commands:");
        System.out.println("");
        System.out.println("- add (to add 1 to the accumulator),");
        System.out.println("- sub (to subtract 1 from the accumulator), and");
        System.out.println("- exit (to quit the program).");
        System.out.println("");
        System.out.println("Time to start calculating!");

        /**
         * logical_step_4: Repeatedly print the state of accumulator, prompt the user for a command (add, sub, or exit), and process the command.
         * logical_step_details: In a loop, print to stdout the state of the accumulator followed by a command prompt. Then, retrieve the command inputted by the user and store it in the variable command. If the command entered is "add", increment the accumulator. If the command entered is "sub", decrement the accumulator. If the command entered is "exit", break out of the command loop. If the command entered is invalid, print an error message. Once control has dropped out of the command loop, close the scanner, because no more input will be retrieved from the user.
         * 
         * question_1: If the user entered "sub" at the prompt, what would happen before the next prompt appears?
         * answer_1: The accumulator would be decremented by 1, and the program would display the current state of the accumulator.
         * 
         * question_2: If the user entered "foobar" at the prompt, what would happen before the next prompt appears?
         * answer_2: An error message would be displayed.
         * 
         * question_3: Does this do-while loop always execute in an infinite loop?
         * answer_3: No, if the user enters "exit", then a break statement will execute, causing execution to drop out of the loop.
         */
        /**
         * stm_comment: Unlike while and for loops, the body of a do-while loop executes first, before a conditional is checked.
         */
        do {
            System.out.println("");
            System.out.println(accumulator);
            System.out.println("");
            System.out.print("~> ");
            String command = scan.next();

            if (command.equals(ADD_CMD)) {
                accumulator++;
            } else if (command.equals(SUB_CMD)) {
                accumulator--;
            } else if (command.equals(EXIT_CMD)) {
                /**
                 * stm_comment: When a break statement in a loop body is executed, it causes execution to drop out of the loop.
                 */
                break;
            } else {
                System.out.println("Error: \'" + command + "\' is not a valid command");
            }
            /**
             * stm_comment: The conditional expression for this do-while loop is true, and that means that the condition will always be true and the execution will always jump back to the top of the loop body. What prevents this code from always executing in an infinite loop is the break statement in the loop body. Note that a semicolon (;) must be placed on the end of a do-while loop -- it is easy to forget!
             */
        } while (true);

        scan.close();

        /**
         * logical_step_5: Display a goodbye message.
         * logical_step_details: N/A
         */
        System.out.println("\nThank you for using the world's tiniest command-line calculator.\nGoodbye!");
    }

}
