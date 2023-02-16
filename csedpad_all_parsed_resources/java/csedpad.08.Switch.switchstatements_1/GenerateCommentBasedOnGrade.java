/**
@name(Letter-Grade Comment Generator)
@goalDescription(Prompts a user to enter their letter grade (A+, A, A-, etc.) and provides some words of encouragement based on the grade.)
**/
import java.util.Scanner;

public class GenerateCommentBasedOnGrade {

    public static void main(String args[]) {
//Input a letter grade from the user.
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter your letter grade (A+, A, A-, etc.): ");
        String grade = scan.next();
        scan.close();
/**@helpDescription(Print a blank line to separate the input from the output.)**/
        System.out.println("");
//Print the words of encouragement based on the letter grade that was inputted.
/**@helpDescription(The value of each `case` label in the switch body is checked to see if it is equal to the value of the `grade` variable. The statements in the switch body begin executing at the first label that matches.)**/
        switch (grade) {
/**@helpDescription(If grade equals A+, A, or A-, the message "Excellent work!" will be printed.)**/
        case "A+":
        case "A":
        case "A-":
            System.out.println("Excellent work!");
/**@helpDescription(The `break` statement causes execution to jump to the end of the switch body.)**/
            break;
        case "B+":
        case "B":
        case "B-":
            System.out.println("Good job!");
            break;
        case "C+":
        case "C":
        case "C-":
            System.out.println("There's nothing wrong with being average!");
            break;
        case "D+":
        case "D":
            System.out.println("At least you passed!");
            break;
        case "F":
            System.out.println("Better luck next time!");
            break;
/**@helpDescription(If no other `case` label value matches the value of `grade`, the `default` label will effectively match by default, and the statements following the label will execute.)**/
        default:
            System.out.println("Error: \"" + grade +"\" is not a valid letter grade");
/**@helpDescription(Although a `break` statement at the end of the switch body is essentially redundant, it is considered a best practice to have it for sake of consistency with the other labeled sections.)**/
            break;
        }
    }
}
