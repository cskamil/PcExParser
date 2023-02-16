/**
@goalDescription(Repeatedly prompt the user to guess the number of floors in the world's tallest building, the Burj Khalifa in Dubai. Each time the user enters an incorrect guess, tell them if their guess was too low or too high, and ask them to guess again. If the user enters the correct answer, congratulate them, and the game is over. A user can give up by entering -1.)
**/
import java.util.Scanner;

public class GuessHowManyFloors {

    public static void main(String[] args) {
//Declare and initialize a variable that holds the correct answer (CORRECT_ANSWER) and a variable for storing user's guess (guess), and instantiate a Scanner object for accepting user input (scan).
        final int CORRECT_ANSWER = 163;
        int guess = 0;
        Scanner scan = new Scanner(System.in);
//Prompt the user to input a guess as to the number of floors in the Burj Khalifa, and until they get the correct answer or enter -1 to give up, print a message telling them whether their guess was too high or too low and prompt them again.
/**@helpDescription(Unlike while and for loops, the body of a do-while loop executes first, before a conditional is checked.)**/
        do {
            System.out.print("\nHow many floors does the world's tallest building, the Burj Khalifa in Dubai, have? (Enter -1 to give up.)\n> ");
            guess = scan.nextInt();
            if (guess < CORRECT_ANSWER && guess != -1) {
                System.out.println("\nToo low!\nSorry, try again...");
            } else if (guess > CORRECT_ANSWER && guess != -1) {
                System.out.println("\nToo high!\nSorry, try again...");
            }

/**@helpDescription(Check the conditional (guess != CORRECT_ANSWER && guess != -1), and if it evaluates to true, repeat the loop body; otherwise, if it evaluates to false, drop out of the loop. Note that a semicolon (;) must be placed on the end of a do-while loop -- it is easy to forget!)**/
        } while (guess != CORRECT_ANSWER && guess != -1);
        scan.close();

//Display the correct answer, and if the user answered correctly, congratulate them.
        System.out.println("");
        if (guess == CORRECT_ANSWER) {
            System.out.println("Congratulations! You got it right!");
        }
        System.out.println("The number of floors in the Burj Khalifa is 163.");
    }
}
