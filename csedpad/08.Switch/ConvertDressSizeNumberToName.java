/**
 * author: Hasan Mashrique, Scott Fleming
 * topics: switch statements
 * subtopics: switch with int expression, switch case logic, break semantics in a switch statement, default case in a switch
 * title: Numeric Dress Size to Nominal Size Conversion
 * goalDescription: Given a user-supplied US dress size (2, 4, 6, etc.), output the corresponding size label (XS, S, M, L, etc.).
 * source: N/A
 * input_1: [ 4 ]
 * output_1: XS
 * input_2: [ 10 ]
 * output_2: L
 * input_3: [ 99 ]
 * output_3: Error: 99 is not a valid US dress size
 */

import java.util.Scanner;

public class ConvertDressSizeNumberToName {

     public static void main(String args[]) {
        /**
         * logical_step_1: Input a US dress size from the user.
         * logical_step_details: `java.util.Scanner` class is used to get an integer dress size from the user and store it in a `size` variable.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter a US dress size (2, 4, 6, 8, 10, or 12): ");
        int size = scan.nextInt();
        scan.close();
    
        /**
         * logical_step_2: Set the output string based on the user input.
         * logical_step_details: A string variable `output` is initialized with the first part of the output. Then, a switch statement is used to append the appropriate size name onto the `output` string. If the integer entered is not a valid size, the `output` string is set to an error message.
         * 
         * question_1: If the `break` statement immediately before the `case 6` label was accidentally omitted, what would the output be for a user input of 4?
         * answer_1: "XSS" (note the extra "S"), because the switch block would continue executing until the next `break` statement (the one after "S" is appended on the `output` string).
         * 
         * question_2: If the user entered "3", which label would be the one that matches?
         * answer_2: The `default` label, because none of the `case` labels would match.
         */
        String output = "Size: ";

        /**
         * stm_comment: The value of each `case` label is checked to see if it is equal to the value of the `size` variable. The statements in the switch body begin executing at the first label that matches.
         */
        switch (size) {
        /**
         * stm_comment: The dress sizes of 2 and 4 both map to the size XS.
         */
        case 2:
        case 4:
            output += "XS";
            /**
             * stm_comment: The `break` statement causes execution to jump to the end of the switch body.
             */
            break;
        case 6:
            output += "S";
            break;
        case 8:
            output += "M";
            break;
        case 10:
            output += "L";
            break;
        case 12:
            output += "XL";
            break;
        /**
         * stm_comment: If no other `case` label value matches the `size`, the `default` label will effectively match by default, and the statements following the label will execute.
         */
        default:
            output = "Error: " + size + " is not a valid US dress size";
            /**
             * stm_comment: Although a `break` statement at the end of the switch body is essentially redundant, it is considered a best practice to have it for sake of consistency with the other labeled sections.
             */
            break;
        }

        /**
         * logical_step_3: Print the output string.
         * logical_step_details: N/A
         */
        System.out.println("\n" + output);
    }
    
}
