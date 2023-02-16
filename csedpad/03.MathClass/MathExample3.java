/*
 * author: Zeyad
 * topics: Math class
 * subtopics: using  Math.pow, Math.PI
 * goalDescription: Demonstrate understanding of Math class concepts by constructing a program that calculates and prints the surface area and volume of a sphere.
 * source: https://www.sanfoundry.com/java-program-find-volume-surface-area-sphere/
 * input: N/A
 * output: Volume = 268.08
 * Surface area = 201.06
*/

public class MathExample3 {


    public static void main(String[] args) {
    /*
       * logical_step_1: Declare a double variable called radius and assign a value 4 to it.
       * logical_step_details: Declare a double variable called radius. The variable radius is of type double. Then, assign a value of 4 to radius.
       * question_1: What does the following code block do?
       * answer_1: It declares a double variable called radius and assigns it a value 4.
       * question_2: What is the data type of variable radius?
       * answer_2: The data type is double.
     */
        double radius = 4;

        /*
           * logical_step_2: Calculate and print the the volume of the sphere.
           * logical_step_details: Calculate the volume of the sphere by using the formula (4 * radius^3 * PI)/3 and print the result.
           * question_1: What does the following code block do?
           * answer_1: It calculates and prints the volume of the sphere.
           * question_2: What is the output of the following block of code?
           * answer_2: Volume = 268.08
         */
         /**
         * stmt_comment: Print Volume = the value of (4*radius^3*PI)/3 
         * question_1: What is the value of Math.PI?
         * answer_1: The value of Math.PI is 3.14
         * question_2: What does the funciton Math.pow do? 
         * answer_2: The function Math.pow calculate value of the first argument to the power of the second argument
         */
        System.out.printf("Volume = %.02f\n" , (4*Math.pow(radius,3)*Math.PI)/3);

        /*
           * logical_step_3: Calculate and print the surface area of the sphere by using the formula (4 * PI * radius^2).
           * logical_step_details: Print surface area using formatting and the formula (4 * PI * radius^2).
           * question_1: What does the following code block do?
           * answer_1: It calculates the surface area using the formula (4 * PI * radius^2). Then it print the surface area.
           * question_2: What is the output of the following block of code?
           * answer_2: Surface area = 201.06
         */
         /**
         * stmt_comment: Print Surface area = the value of 4*PI*radius^2 
         * question_1: What is the value of Math.PI?
         * answer_1: The value of Math.PI is 3.14
         * question_2: What does the funciton Math.pow do? 
         * answer_2: The function Math.pow calculate value of the first argument to the power of the second argument
         */
        System.out.printf("Surface area = %.02f\n" , (4*Math.PI*Math.pow(radius,2)));
    }
}
