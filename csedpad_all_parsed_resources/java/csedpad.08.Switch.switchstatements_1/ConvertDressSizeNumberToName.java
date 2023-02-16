/**
@name(Numeric Dress Size to Nominal Size Conversion)
@goalDescription(Given a user-supplied US dress size (2, 4, 6, etc.), output the corresponding size label (XS, S, M, L, etc.).)
**/
import java.util.Scanner;

public class ConvertDressSizeNumberToName {

     public static void main(String args[]) {
//Input a US dress size from the user.
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter a US dress size (2, 4, 6, 8, 10, or 12): ");
        int size = scan.nextInt();
        scan.close();
//Set the output string based on the user input.
        String output = "Size: ";
/**@helpDescription(The value of each `case` label is checked to see if it is equal to the value of the `size` variable. The statements in the switch body begin executing at the first label that matches.)**/
        switch (size) {
/**@helpDescription(The dress sizes of 2 and 4 both map to the size XS.)**/
        case 2:
        case 4:
            output += "XS";
/**@helpDescription(The `break` statement causes execution to jump to the end of the switch body.)**/
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
/**@helpDescription(If no other `case` label value matches the `size`, the `default` label will effectively match by default, and the statements following the label will execute.)**/
        default:
            output = "Error: " + size + " is not a valid US dress size";
/**@helpDescription(Although a `break` statement at the end of the switch body is essentially redundant, it is considered a best practice to have it for sake of consistency with the other labeled sections.)**/
            break;
        }
//Print the output string.
        System.out.println("\n" + output);
    }
}
