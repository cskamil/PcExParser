/**
@name(Seconds to Minutes Conversion)
@goalDescription(Construct a program that calculates the minutes and remaining seconds from the user input for seconds and prints to the console. For example, 500 seconds contains 8 minutes and 20 seconds.)
**/
//Import Scanner class.
/**@helpDescription(In Java, the import keyword is used to make classes available and accessible to the current program. By importing java.util.Scanner from the java.util package, Scanner class can be used in the program by just typing Scanner, without specifying fully qualified package names (i.e. java.util.Scanner). Imports are use outside/before the class declaration.)**/
import java.util.Scanner;
public class ConvertSecondsToMinutes {

    public static void main(String[] args) {
//Use Scanner to read user input from the keyboard.
/**@helpDescription(A Scanner object is created and assigned to a variable called scan. A Scanner object is required to read the input value from the user. Because it has already been imported using the import keyword, Scanner is declared by only using the name Scanner and not its full name java.util.Scanner. System.in represents the standard input stream, which by default is the keyboard. It tells the Java compiler that the input will be provided through the keyboard. )**/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer for seconds: ");
/**@helpDescription(We read the seconds entered by the user through the keyboard by calling the nextInt() method because the user will enter an integer input. This lines makes the program halt until the user enters the input from the keyboard. Note that if the user enters a non-integer number, this line will throw an exception stating that an integer value is expected.)**/
        int seconds = scan.nextInt();
/**@helpDescription(The scanner objects are closed using close method. This method is called when the program will not use the scanner object anymore to read a new input value.)**/
        scan.close();
//Calculate the minutes and remaining seconds from the information the user input.
        int minutes = seconds / 60;
/**@helpDescription(% is a modulus or remainder arithmetic operator. % calculates the remainder of a division. seconds%60 returns the remainder of the division seconds/60.)**/
        int remainingSeconds = seconds % 60;
//Print the minutes and remaining seconds to the console.
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds."); 
    }
}
