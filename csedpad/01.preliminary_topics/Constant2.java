/**
 * author: Nisrine Ait Khayi
 * topic: Preliminary topics (constants)
 * subtopic: Declaring double variables, using Math function.
 * goalDescription: As a class assignment, calculate the area of a circle given its radius.
 * source:
 * output: 78.53999999
 */

public class Constant2 {

    /*
     * logical_step_1: Declare a variable PI and a variable radius. Calculate the area of the circle using thecircle area formula and print the result. 
     * logical_step_details: Declare a final double variable PI and assign a value to it. Declare another variable for the radius. Calculate the circle area using formula. Then store the result into a new variable. Finally print the result using the new variable.
     * question_1: What does the following code block do?
     * answer_1: Declares a double and assigns a value to it.
     * question_2: Why is final used before the variable's declaration?
     * answer_2: final is a keyword/modifier is used to fix the value of the variable. Trying to change the variable value will give an error. It is used for defining constant variables (like PI).
     * question_3: What is the use of Math?
     * answer_3: Math is a Java keyword to execute mathematical operations. The method pow(X,2) means X raised to the power of 2.
     */
    
         /**
         * stm_comment:The following block displays the area of a circle with a radius equal to 5
         * question_1: what is the area of the given circle?
         * answer_1: 78.54
         */
    

    public static void main(String args[]) {
        
       
        final double PI = 3.1416;    
        int radius = 5;
        double areaOfCircle = PI * Math.pow(radius, 2);       
        
        System.out.println(AreaOfCircle); 
        
        
    }

}
