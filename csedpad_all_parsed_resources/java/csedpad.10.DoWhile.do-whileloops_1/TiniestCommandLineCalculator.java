/**
@goalDescription(The world's tiniest command-line calculator. Repeatedly prompt the user for a command (add, sub, or exit). The add command increments an accumulator by 1. The sub command decrements the accumulator by 1. The exit command terminates the program. The state of the accumulator is printed whenever its value is updated.)
**/
import java.util.Scanner;

public class TiniestCommandLineCalculator {

    public static void main(String[] args) {
//Declare and initialize constant variables that hold the various commands accepted by the program.
        final String ADD_CMD = "add";
        final String SUB_CMD = "sub";
        final String EXIT_CMD = "exit";
//Declare and initialize a variable to store the state of the accumulator and a scanner object to retrieve user input.
        int accumulator = 0;
        Scanner scan = new Scanner(System.in);
//Print a welcome message.
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
//Repeatedly print the state of accumulator, prompt the user for a command (add, sub, or exit), and process the command.
/**@helpDescription(Unlike while and for loops, the body of a do-while loop executes first, before a conditional is checked.)**/
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
/**@helpDescription(When a break statement in a loop body is executed, it causes execution to drop out of the loop.)**/
                break;
            } else {
                System.out.println("Error: \'" + command + "\' is not a valid command");
            }
/**@helpDescription(The conditional expression for this do-while loop is true, and that means that the condition will always be true and the execution will always jump back to the top of the loop body. What prevents this code from always executing in an infinite loop is the break statement in the loop body. Note that a semicolon (;) must be placed on the end of a do-while loop -- it is easy to forget!)**/
        } while (true);
        scan.close();

//Display a goodbye message.
        System.out.println("\nThank you for using the world's tiniest command-line calculator.\nGoodbye!");
    }
}
