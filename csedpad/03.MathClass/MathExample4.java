/*
 * author: Zeyad
 * topics: Math class
 * subtopics: using  Math.pow, Math.PI, Math.sqrt
 * goalDescription: Demonstrate understanding of Math class concepts by constructing a program that calculates and prints the volume of a cone.
 * source: https://www.sanfoundry.com/java-program-find-surface-area-volume-cone-2/
 * input: N/A
 * output: Volume = 94.25
 * Surface area = 126.67
*/
public class MathExample4 {

    public static void main(String[] args) {
      /*
     * logical_step_1: Declare three double type variables radius, height, and slantHeight. Assign their values.
     * logical_step_details: First, declare a double variable radius and assign a value 3 to it. Then, declare a double variable height 
     * and assign it a value of 10. Finally, declare a double variable slantHeight and initialize it to the calculated value 
     * from Math.sqrt(Math.pow(radius,2) + Math.pow(height,2)), which is equal to 10.44.
     * question_1: What does the following code block do?
     * answer_1: Declares double type variable radius, height, and slantHeight and assigns their values.
     * question_2: What is data type of those variables?
     * answer_2: The data type is double.
     * question_3: What are the values of variables radius, height, and slantHeight?
     * answer_3: 3, 10, and 10.44.
   */
        double radius = 3, height = 10;

        /**
        * stmt_comment: declare a double variable slantHeight and initialize it to Math.sqrt(radius^2 + height^2)
        * question_1: What does the function Math.sqrt do?
        * answer_1: The function Math.sqrt calculate the square root of a given argument
        * question_2: What does the funciton Math.pow do? 
         * answer_2: The function Math.pow calculate value of the first argument to the power of the second argument
        */
        double slantHeight = Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
        
        /*
           * logical_step_2: Calculate and print the volume of the cone.
           * logical_step_details: Print the volume, which is calculated by using the formula PI * radius^2 * height/3.
           * question_1: What does the following code block do?
           * answer_1: It calculates and prints the volume of the cone.
           * question_2: What the output of the following block?
           * answer_2: Volume = 94.24
         */
         /**
         * stmt_comment: Print Volume = PI * radius^2 * height/3
         * question_1: What is the value of Math.PI?
         * answer_1: The value of Math.PI is 3.14
         * question_2: What does the funciton Math.pow do? 
         * answer_2: The function Math.pow calculate value of the first argument to the power of the second argument
         */
        System.out.printf("Volume = %.02f\n", (Math.PI*Math.pow(radius,2)*height/3));
        /*
           * logical_step_3:  Calculate and print the surface area of the cone.
           * logical_step_details: Cacluate and print the surface area of the cone. The surface area of the cone is 126.67.
           * question_1: What does the following code block do?
           * answer_1: It calculates and prints the surface area of the cone.
           * question_2: What the output of the following block?
           * answer_2: Surface area = 126.67
         */
         /**
         * stmt_comment: Print Volume = PI * radius^2 * height/3 
         * question_1: What is the value of Math.PI?
         * answer_1: The value of Math.PI is 3.14
         */
        System.out.printf("Surface area = %.02f", ((Math.PI * radius * slantHeight)
                                                 + (Math.PI * radius * radius)));
    }
}
