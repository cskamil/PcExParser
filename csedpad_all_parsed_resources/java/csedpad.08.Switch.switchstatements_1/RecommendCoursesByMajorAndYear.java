/**
@name(Course Recommendations by Major and Year of Study)
@goalDescription(Prompt an undergraduate engineering student for their major (CSE or ECE) and a year of study (1, 2, 3, or 4), and recommend some appropriate courses they might take during that year of study.)
**/
import java.util.Scanner;

public class RecommendCoursesByMajorAndYear {

    public static void main(String[] args) {        
//Input a major subject and a year of study from the user.
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter your major (CSE or ECE): ");
        String major = scan.next();

        if (!major.equals("CSE") && !major.equals("ECE")) {
            System.out.println("\nError: \"" + major + "\" is not a valid major");
/**@helpDescription(It is a best practice to close the scanner before exiting.)**/
            scan.close();
/**@helpDescription(This `return` statement causes the `main` method to finish, effectively exiting the program.)**/
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

/**@helpDescription(Print a blank line.)**/
        System.out.println("");
//Print the recommended courses based on the major and year of study that were inputted.
/**@helpDescription(The value of each `case` label in the body of the outer `switch` statement is checked to see if it is equal to the value of the `year` variable. The statements in the body begin executing at the first label that matches. If the `case 2` label matches, an inner `switch` statement will execute such that the value of each of the `case` labels in its body is checked to see if it is equal to the value of the `major` variable. The statements in this inner switch body begin executing at the first label that matches.)**/
        switch (year) {
        case 1:
            System.out.println("Elective Courses: Advanced English, Algebra");
/**@helpDescription(The `break` statement causes execution to jump to the end of the switch body.)**/
            break;
        case 2:
/**@helpDescription(The inner `switch` statement begins here.)**/
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
/**@helpDescription(Although a `break` statement at the end of the switch body is essentially redundant, it is considered a best practice to have it for sake of consistency with the other labeled sections.)**/
            break;
        }
    }
}
