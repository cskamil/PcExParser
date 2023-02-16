/**
 * author: Kamil Akhuseyinoglu
 * topics: Variables, Expressions, Constants
 * subtopics: declaring and using constant variables in arithmetic expression and printing with printf
 * title: How tall are you in meters?
 * goalDescription: Construct a program that converts the height in feet (stored in variable heightInFeet) to 
 *                  meters using the constant feet to meter conversion rate 0.30479. Then print the height in meters with 3 digits after the decimal point to the console.
 * source: CS007 Lab1 partial content
 * input: NA
 * output: The height in meters is: 1878
 */
public class HowTallAreYou {
    public static void main(String[] args) {
        /**
         * logical_step_1: Declare the conversion rate as a constant variable. Declare a variable to hold the height in feet's value.
         * logical_step_details: Declare a double constant variable to store feet to meter conversion rate. Declare a double variable for height in feet to be used to convert the given height in feet to meters. 
         * question_1: Which variables are declared in the following code block?
         * answer_1: FEET_TO_METERS and heightInFeet variables.
         * question_2: Which variable is declared as a constant?
         * answer_2: FEET_TO_METERS
         * question_3: How do you know if a variable is a constant or not?
         * answer_3: The use of final modifier before the variable type keyword.
         */

         /**
         * stm_comment: The variable FEET_TO_METERS is declared as double type and initialized to 0.30479. The final modifier is used to make FEET_TO_METERS a constant variable, which means that it is immutable. 
         *              Constant variables are assigned to a value exactly once and this value cannot be changed after the initialization. 
         *              The constant variables have to be initialized to a value when they declared. By Java naming conventions for constants, upper case letters are used and words are separated with '_'.
         */
        final double FEET_TO_METERS = 0.30479;

        double heightInFeet = 6.16;


        /**
         * logical_step_2: Calculate height in meters by using the constant variable.
         * logical_step_details: The constant variable declared previously is accessed in an arithmetic expression to calculate the height in meters.
         * question_1: What is the difference of using a constant variable in an arithmetic expression compared to other variables?
         * answer_1: There is no difference in using a constant variable in an arithmetic expression. 
         */

         /**
          * stm_comment: The value of FEET_TO_METERS constant is accessed and multiplied by the heightInFeet variable. The use of a constant variable is the same as with other variables.
          */
        double heightInMeters = heightInFeet * FEET_TO_METERS;

        /**
         * logical_step_3: Print the value of heigthInMeters to console using the printf method.
         * logical_step_details: The calculated height in meters value is printed to the console output using the printf method to print the double variable with exactly 3 digits after the decimal point.
         * question_1: Why is the printf method is used to print the value of the heightInMeters?
         * answer_1: The printf method is used to ensure that the output has exactly 3 digits after the decimal point. 
         * question_2: What does %.3f mean?
         * answer_2: It means that the floating point parameter should be formatted to String with exactly 3 digits after the decimal point.
         * question_3: What would be printed to the console if the following code executed: System.out.printf("%.3f", 1.8775)
         * answer_3: 1.878 is printed because %.3f rounds the number. It does not cut-off the 4th digit after the decimal. 
         */

        /**
         * stm_comment: The System.out.printf method is used to print formatted output to the console. 
         *              Format specifiers are defined using %. Here, %.3f means that %.3f should be replaced with the heightInMeters value and exactly 3 digits should be printed after the decimal point.
         *              The number after the '.' defines the number of digits printed after the decimal. f defines that the heightInMeters is a double or a float number.
         */
        System.out.printf("The height in meters is: %.3f", heightInMeters );

    }
}