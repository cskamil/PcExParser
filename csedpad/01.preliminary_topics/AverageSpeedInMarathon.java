/**
 * author: Kamil Akhuseyinoglu
 * topics: Variables, Expressions, Constants
 * subtopics: declaring and using constant variables in arithmetic expression and printing with System.out.format
 * title: What is the average speed?
 * goalDescription: Construct a program that calculates the average speed in miles per hour using the values stored in the given variables.
 *          Then print (to the console) the height in meters with 2 digits after the decimal point.
 * source: CS007 Lab1 partial content
 * input: NA
 * output: Average MPH was: 12.22 mph
 */
public class AverageSpeedInMarathon {
    public static void main(String[] args) {
        /**
         * logical_step_1: Declare multiple constant variables 
         * logical_step_details: Declare a double constant variable to store the miles per marathon; declare two integer constant variables for seconds per hour and seconds per minutes. 
         * question_1: Which variable(s) is declared as constant?
         * answer_1: MILES_PER_MARATHON, SEC_PER_HR, SEC_PER_MIN
         * question_2: How do you know if a variable is a constant or not?
         * answer_2: The use of final modifier before the variable type keyword.
         */

         /**
         * stm_comment: The variable MILES_PER_MARATHON is declared as double type and initialized to 26.21875. The final modifier is used to make MILES_PER_MARATHON a constant variable, which means it is immutable. 
         *              Constant variables are assigned to a value exactly once and this value cannot be changed after their initialization. 
         *              The constant variables have to be initialized to a value when they are declared. By Java naming conventions for constants, upper case letters are used and words are separated with '_'.
         */
        // i.e 26 miles 285 yards
        final double MILES_PER_MARATHON = 26.21875; 

         /**
         * stm_comment: The variable SEC_PER_HR is declared as int type and initialized to 3600. The final modifier is used to make SEC_PER_HR a constant variable, which means it is immutable. 
         *              Constant variables are assigned to a value exactly once and this value cannot be changed after the initialization. 
         *              The constant variables have to be initialized to a value when they declared. By Java naming conventions for constants, upper case letters are used and words are separated with '_'.
         */
        final int SEC_PER_HR = 3600;

         /**
         * stm_comment: The variable SEC_PER_MIN is declared as int type and initialized to 60. The final modifier is used to make SEC_PER_MIN a constant variable, which means it is immutable. 
         *              Constant variables are assigned to a value exactly once and this value cannot be changed after the initialization. 
         *              The constant variables have to be initialized to a value when they declared. By Java naming conventions for constants, upper case letters are used and words are separated with '_'.
         */
		final int SEC_PER_MIN = 60;


        /**
         * logical_step_2: Declare multiple variables to keep track of marathon run time.
         * logical_step_details: Declare double variables to store the marathon time in hours, minutes and seconds.
         */
        double runtimeHrs = 2.0;
        double runtimeMins = 8.0;
        double runtimeSecs = 44.0;


        /**
         * logical_step_3: Calculate the average miles per hour speed using the constant variables.
         * logical_step_details: The constant variable declared previously is accessed in an arithmetic expression to calculate the average miles per hour speed.
         * question_1: What is the difference of using a constant variable in an arithmetic expression compared to other variables?
         * answer_1: There is no difference in using a constant variable in an arithmetic expression. 
         */

         /**
          * stm_comment: The values of MILES_PER_MARATHON,SEC_PER_MIN,SEC_PER_HR constants are accessed and used in multiplication, division and addition arithmetic operations. 
                         The usage of a constant variable is the same as other variables.
          */
        double totalSecs = runtimeHrs*SEC_PER_HR + runtimeMins*SEC_PER_MIN + runtimeSecs;
        double aveMPH = MILES_PER_MARATHON/(totalSecs/SEC_PER_HR);

        /**
         * logical_step_4: Print the value of aveMPH to console using the format method.
         * logical_step_details: The calculated average miles per hour value is printed to the console output using the format method to print the decimal variable with exactly 2 digits after the decimal point.
         * question_1: Why is the format method used to print the value of the aveMPH?
         * answer_1: The format method is used to ensure that the output has exactly 2 digits after the decimal point. 
         * question_2: What does %.2f mean?
         * answer_2: It means that the floating point parameter should be formatted to String with exactly 2 digits after the decimal point.
         * question_3: What would be printed to the console if the following code executed: System.out.format("%.3f", 1.8775)
         * answer_3: 1.878 is printed because %.3f rounds the number. It does not cut-off the 4th digit after the decimal. 
         */

        /**
         * stm_comment: The System.out.format method is used to print formatted output to the console. 
         *              Format specifiers are defined using %. Here, %.2f means that %.2f should be replaced with the aveMPH value and exactly 2 digits should be printed after the decimal(.).
         *              The number comes after the '.' defines the number of digits printed after the decimal and f defines that the heightInMeters is a double or a float number.
         */
        System.out.format("Average MPH was: %.2f mph\n", aveMPH);

    }
}