/**
 * author: Hasan Mashrique, Scott Fleming
 * topics: switch statements
 * subtopics: switch statements with String expression, switch case logic, break semantics in a switch statement, default case in a switch
 * title: Letter-Grade Comment Generator
 * goalDescription: Prompts a user to enter their letter grade (A+, A, A-, etc.) and provides some words of encouragement based on the grade.
 * source: N/A
 * input_1: [ A- ]
 * output_1: Excellent work!
 * input_2: [ B+ ]
 * output_2: Good job!
 * input_3: [ Z- ]
 * output_3: Error: "Z-" is not a valid letter grade
 */

import java.util.Scanner;

public class GenerateCommentBasedOnGrade {

    public static void main(String args[]) {
        /**
         * logical_step_1: Input a letter grade from the user.
         * logical_step_details: `java.util.Scanner` class is used to get a letter grade from the user and store it in a string variable `grade`.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter your letter grade (A+, A, A-, etc.): ");
        String grade = scan.next();
        scan.close();

        /**
         * stm_comment: Print a blank line to separate the input from the output.
         */
        System.out.println("");

        /**
         * logical_step_2: Print the words of encouragement based on the letter grade that was inputted.
         * logical_step_details: A `switch` statement is used to decide which words of encouragement to output based on the value of the `grade` variable. If `grade` contains an invalid letter grade, an error message is printed.
         * 
         * question_1: If the `grade` variable matches the `case "A+"` label, which lines of code in the switch body will execute?
         * answer_1: The line `System.out.println("Excellent work!")` followed by a `break` statement will execute.
         * 
         * question_2: Imagine that the `break` statement immediately before the `case "B+"` label were removed. What would be outputted if the user entered "A"?
         * answer_2: Two lines of text would be outputted: the first line would say "Excellent work!", and the second line would say "Good job!".
         * 
         * question_3: Which label would match if the user inputted "F+"?
         * answer_3: The `default` label would match, because "F+" is not equal to any of the `case` label values.
         */
        /**
         * stm_comment: The value of each `case` label in the switch body is checked to see if it is equal to the value of the `grade` variable. The statements in the switch body begin executing at the first label that matches.
         */
        switch (grade) {
        /**
         * stm_comment: If grade equals A+, A, or A-, the message "Excellent work!" will be printed.
         */
        case "A+":
        case "A":
        case "A-":
            System.out.println("Excellent work!");
            /**
             * stm_comment: The `break` statement causes execution to jump to the end of the switch body.
             */
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
        /**
         * stm_comment: If no other `case` label value matches the value of `grade`, the `default` label will effectively match by default, and the statements following the label will execute.
         */
        default:
            System.out.println("Error: \"" + grade +"\" is not a valid letter grade");
            /**
             * stm_comment: Although a `break` statement at the end of the switch body is essentially redundant, it is considered a best practice to have it for sake of consistency with the other labeled sections.
             */
            break;
        }
    }

}
