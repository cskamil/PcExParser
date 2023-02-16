/**
@goalDescription(Repeatedly prompt the user for a number between 0 and 9 until the user enters -1. Each time the user enters a number (other than -1) display the subtotal of the numbers entered so far. When the user enters -1, display the grand total of all the numbers entered.)
**/
import java.util.Scanner;

public class TotalNumbers {

    public static void main(String[] args) {
//Declare and initialize a variable for storing user input (number) and a variable for storing a running total (total), and instantiate a Scanner object for accepting user input (scan).
        int number = 0;
        int total = 0;
        Scanner scan = new Scanner(System.in);
//Repeatedly prompt the user to input a number from 0 to 9 (or -1 to quit), and add the number to the running total.
/**@helpDescription(Unlike while and for loops, the body of a do-while loop executes first, before a conditional is checked.)**/
        do {
            System.out.print("\nEnter an integer value between 0 and 9 (or -1 to quit): ");
            number = scan.nextInt();
            if (number >= 0 && number <= 9) {
                total += number;
                System.out.println("\nSubtotal: " + total);
            } else if (number < -1 || number > 9) {
                System.out.println("\nError: Invalid input, try again");
            }

/**@helpDescription(Check the conditional (number != -1), and if it evaluates to true, repeat the loop body; otherwise, if it evaluates to false, drop out of the loop. Note that a semicolon (;) must be placed on the end of a do-while loop -- it is easy to forget!)**/
        } while (number != -1);
        scan.close();

//Display the grand total of the numbers entered by the user.
        System.out.println("\nGrand Total: " + total);
    }
}
