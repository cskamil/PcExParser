/**
@name(FirstThreeChars.java)
**/
import java.util.Scanner;

public class FirstThreeChars {
    public static void main(String[] args){
/**@helpDescription(Create a scanner to read from keyboard)**/
        Scanner keyboard = new Scanner(System.in);
/**@helpDescription(Prompt user for typing text input)**/
        System.out.print("Enter any string: ");
/**@helpDescription(Store user input in a String variable)**/
        String input = keyboard.nextLine();
/**@helpDescription(Define variable firstThreeChars to store the first X characters of the user input)**/
        String firstThreeChars = "";
/**@helpDescription(Assign firstThreeChars the characters subset starting from position 0 until position 2)**/
        firstXChars = input.substring(0,3);
/**@helpDescription(Prints to the console the three first characters of the user input)**/
        System.out.println("First 3 characters: " + firstThreeChars);
  }
}
