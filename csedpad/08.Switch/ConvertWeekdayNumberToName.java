/**
 * author: Hasan Mashrique, Scott Fleming
 * topics: switch statements
 * subtopics: switch with int expression, switch case logic, break semantics in a switch statement, default case in a switch
 * title: Numeric Day of the Week to Name Conversion
 * goalDescription: Given a user-supplied numeric day of the week (1, 2, 3, etc.), output the corresponding name for the day (Monday, Tuesday, Wednesday, etc.).
 * source: N/A
 * input_1: [ 3 ]
 * output_1: Wednesday
 * input_2: [ 0 ]
 * output_2: Error: 0 is not a valid numeric day of the week
 */

import java.util.Scanner;

public class ConvertWeekdayNumberToName {

    public static void main(String args[]) {
        /**
         * logical_step_1: Input a numeric day of the week.
         * logical_step_details: `java.util.Scanner` class is used to get an integer day of the week from the user and store it in a `day` variable.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter a numeric day of the week (a number between 1 and 7): ");
        int day = scan.nextInt();
        scan.close();

        /**
         * stm_comment: Print a blank line to separate the input from the output.
         */
        System.out.println("");

        /**
         * logical_step_2: Print the name of the weekday (Monday, Tuesday, etc.) based on the numeric day of the week that was inputted.
         * logical_step_details: A `switch` statement is used to decide which weekday name to output based on the value of the `day` variable. If `day` contains an invalid numeric day of the week, an error message is printed. 
         *  
         * question_1: If the `break` statement immediately before the `case 6` label were accidentally omitted, what would the output be for an input value of 5?
         * answer_1: Two lines would be outputted, one with "Friday" and one with "Saturday", because all the switch-body lines starting from the `case 5` label would execute until the next `break` was reached (in this case, the one immediately before the `case 7` label).
         * 
         * question_2: Why is it that, for each section of code following a `case` label, the section of code ends with a `break` statement?
         * answer_2: The `break` statement causes execution to jump to the end of the switch body. Without the `break` statement, all subsequent lines in the switch body would continue to execute.
         * 
         * question_3: If `day` variable was set to 0, which label would be the one that matches?
         * answer_3: The `default` label, because none of the `case` labels would match.
		 */
        /**
         * stm_comment: The value of each `case` label in the switch body is checked to see if it is equal to the value of the `day` variable. The statements in the switch body begin executing at the first label that matches.
         */
        switch (day) {
        case 1:
            System.out.println("Monday");
            /**
             * stm_comment: The `break` statement causes execution to jump to the end of the switch body.
             */
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        /**
         * stm_comment: If no other `case` label value matches the value of `day`, the `default` label will effectively match by default, and the statements following the label will execute.
         */
        default:
            System.out.println("Error: " + day + " is not a valid numeric day of the week");
            /**
             * stm_comment: Although a `break` statement at the end of the switch body is essentially redundant, it is considered a best practice to have it for sake of consistency with the other labeled sections.
             */
            break;
        }
    }

}
