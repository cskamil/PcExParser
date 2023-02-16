/**
 * author: Hasan Mashrique, Scott Fleming
 * topics: switch statements
 * subtopics: nested switch statements, switch statements with int expressions, switch statements with String expressions, switch case logic, break semantics in switch statements, default cases in switch statements
 * title: Course Recommendations by Major and Year of Study
 * goalDescription: Prompt an undergraduate engineering student for their major (CSE or ECE) and a year of study (1, 2, 3, or 4), and recommend some appropriate courses they might take during that year of study.
 * source: N/A
 * input_1: [ CSE, 1 ]
 * output_1: Elective Courses: Advanced English, Algebra
 * input_2: [ CSE, 2 ]
 * output_2: Elective Courses: Machine Learning, Big Data
 * input_3: [ ECE, 3 ]
 * output_3: Elective Courses: Optimization
 */

import java.util.Scanner;

public class RecommendCoursesByMajorAndYear {

    public static void main(String[] args) {        
        /**
         * logical_step_1: Input a major subject and a year of study from the user.
         * logical_step_details: The `java.util.Scanner` class is used to get a major subject (CSE or ECE) from the user and store it in a string variable `major`. If the user entered an invalid major, an error message is printed and the program exits. The `java.util.Scanner` class is then used to get a year of study (1, 2, 3, or 4) from the user and store it in an integer variable `year`. If the user entered an invalid year of study, an error message is printed and the program exits.
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter your major (CSE or ECE): ");
        String major = scan.next();

        if (!major.equals("CSE") && !major.equals("ECE")) {
            System.out.println("\nError: \"" + major + "\" is not a valid major");
            /**
             * stm_comment: It is a best practice to close the scanner before exiting.
             */
            scan.close();
            /**
             * stm_comment: This `return` statement causes the `main` method to finish, effectively exiting the program.
             */
            return;
        }

        System.out.print("\nEnter the year of study for which you would like course recommendations (1, 2, 3, or 4): ");
        int year = scan.nextInt();

        if (year < 1 || year > 4) {
            System.out.println("\nError: " + year + " is not a valid year of study");
            scan.close();
            return;
        }

        scan.close();

        /**
         * stm_comment: Print a blank line.
         */
        System.out.println("");

        /**
         * logical_step_2: Print the recommended courses based on the major and year of study that were inputted.
         * logical_step_details: A nested `switch` statement is used to decide which recommendations to print based on the major and year inputted. The top-level `switch` statement has a `case` label for each of years 1 and 2. Years 3 and 4 are covered by the `default` label. The year 1, 3, and 4 recommendations are the same for both majors; however, the year 2 recommendations differ by major. Thus, the section of code that follows the `case 2` label contains an inner `switch` statement with a `case` label for each of the majors.
         * 
         * question_1: If the user entered ECE for the major and 4 for the year of study, which lines of code in the switch body/bodies would execute?
         * answer_1: In the outer `switch` statement, the line `System.out.println("Elective Courses: Optimization")` followed by a `break` statement would execute, because the `default` label would be the only one that matches in the outer `switch` statement.
         * 
         * question_2: Imagine that the `break` statement immediately before the `default` label were removed. What would be outputted if the user entered ECE for the major and 2 for the year of study?
         * answer_2: Two lines of text would be outputted: the first line would say "Elective Courses: Antenna Engineering", and the second line would say "Elective Courses: Optimization".
         * 
         * question_3: Which labels (across all `switch` statements) would match if the user inputted CSE for the major and 2 for the year?
         * answer_3: The `case 2` label would match in the outer `switch` statement, and the `case "CSE"` label would match in the inner `switch` statement.
         */
        /**
         * stm_comment: The value of each `case` label in the body of the outer `switch` statement is checked to see if it is equal to the value of the `year` variable. The statements in the body begin executing at the first label that matches. If the `case 2` label matches, an inner `switch` statement will execute such that the value of each of the `case` labels in its body is checked to see if it is equal to the value of the `major` variable. The statements in this inner switch body begin executing at the first label that matches.
         */
        switch (year) {
        case 1:
            System.out.println("Elective Courses: Advanced English, Algebra");
            /**
             * stm_comment: The `break` statement causes execution to jump to the end of the switch body.
             */
            break;
        case 2:
            /**
             * stm_comment: The inner `switch` statement begins here.
             */
            switch (major)  {
            case "CSE":
                System.out.println("Elective Courses: Machine Learning, Big Data");
                  break;
            case "ECE":
                System.out.println("Elective Courses: Antenna Engineering");
                break;
            }
            break;
        default:
            System.out.println("Elective Courses: Optimization");
            /**
             * stm_comment: Although a `break` statement at the end of the switch body is essentially redundant, it is considered a best practice to have it for sake of consistency with the other labeled sections.
             */
            break;
        }
    }

}
