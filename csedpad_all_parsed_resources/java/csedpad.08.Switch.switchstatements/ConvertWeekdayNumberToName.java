/**
@name(Numeric Day of the Week to Name Conversion)
@goalDescription(Given a user-supplied numeric day of the week (1, 2, 3, etc.), output the corresponding name for the day (Monday, Tuesday, Wednesday, etc.).)
**/
import java.util.Scanner;

public class ConvertWeekdayNumberToName {

    public static void main(String args[]) {
//Input a numeric day of the week.
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter a numeric day of the week (a number between 1 and 7): ");
        int day = scan.nextInt();
        scan.close();
/**@helpDescription(Print a blank line to separate the input from the output.)**/
        System.out.println("");
//Print the name of the weekday (Monday, Tuesday, etc.) based on the numeric day of the week that was inputted.
/**@helpDescription(The value of each `case` label in the switch body is checked to see if it is equal to the value of the `day` variable. The statements in the switch body begin executing at the first label that matches.)**/
        switch (day) {
        case 1:
            System.out.println("Monday");
/**@helpDescription(The `break` statement causes execution to jump to the end of the switch body.)**/
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
/**@helpDescription(If no other `case` label value matches the value of `day`, the `default` label will effectively match by default, and the statements following the label will execute.)**/
        default:
            System.out.println("Error: " + day + " is not a valid numeric day of the week");
/**@helpDescription(Although a `break` statement at the end of the switch body is essentially redundant, it is considered a best practice to have it for sake of consistency with the other labeled sections.)**/
            break;
        }
    }
}
