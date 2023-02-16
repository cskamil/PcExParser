/**
 * author: Jordan Barria-Pineda
 * topic: Strings
 * title: FirstThreeChars.java
 * goalDescrption: JAVA program to extract the three first characters from input entered by the user
 * source:
 * output: The first three characters of any input
 **/

import java.util.Scanner;

public class FirstThreeChars {
    public static void main(String[] args){
        /** 
         * stm_comment: Create a scanner to read from keyboard
         */
        Scanner keyboard = new Scanner(System.in);
        
        /** 
         * stm_comment: Prompt user for typing text input
         */
        System.out.print("Enter any string: ");

        /**
         *  stm_comment: Store user input in a String variable
         */
        String input = keyboard.nextLine();
        
        /**
         * stm_comment: Define variable firstThreeChars to store the first X characters of the user input
         */
        String firstThreeChars = "";
        
        /** 
         * stm_comment: Assign firstThreeChars the characters subset starting from position 0 until position 2
         */
        firstXChars = input.substring(0,3);
        
        /**
         * stm_comment: Prints to the console the three first characters of the user input
         */
        System.out.println("First 3 characters: " + firstThreeChars);
  }
}
