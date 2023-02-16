/**
 * author: Zeyad 
 * topics: Math class 
 * subtopics: using Math.sqrt, Math.pow, Math.PI, Math.acos 
 * goalDescription: Demonstrate understanding of Math class concepts by constructing a program that finds the length of the hypotenuse in of a right triangle by using the Pythagoras theorem. Then this program finds the angles of that triangle. 
 * source: http://javauk.blogspot.com/2013/07/java-hypotenuse-right-triangle.html
 * input: N/A
 * output: The length of the hypotenuse (c) is: 10.0. The angles are A = 36.87, B=53.13, C= 90.
 */
public class MathExample1 {

  public static void main(String[] args) {

    /*
     * logical_step_1: Declare double variables called a, b, and c to represent each side of the triangle. Assign a value of 6 to a and 8 to b. 
     * logical_step_details: First, we declare double variables a and b. Then we assign values to variables a and b. We also declare another a double variable c to hold the length of the hypotenuse. 
     * question_1: What does the following code block do? 
     * answer_1: Declare three double variables called a, b, and c to represent each side of the triangle and assigns a value of 6 to a and 8 to b. 
     * question_2: What variables are declared? 
     * answer_2: Three double variables a, b, and c are declared. 
     * question_3: What are the values of each variable? 
     * answer_3: The value of a is 6, b is 8, and c is 0.0d.
     */

    double a = 6, b = 8, c;

    /*
     * logical_step_2: Calculate the length of the hypotenuse (c) by using the Pythagoras theorem. 
     * logical_step_details: calculate the length of the hypotenuse (c) by using Math.sqrt and Math.pow functions. 
     * question_1: What does the following code block do? 
     * answer_1: It calculates the length of the hypotenuse (c) by using Pythagoras theorem where c = square root of power 2 of a plus the power 2 of b. 
     * question_2: What the value of c? 
     * answer_2: 10
     */
    /**
     * stm_comment: Assign the result of sqr root of a^2 + b^2 to c
     * question_1: what does the function Math.pow do?
     * answer_1: The function return the result of the first argument to the power of the second argument
    */
    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    /*
     * logical_step_3: Declare two double variables A and B. Assign the calculated values of the angles of the right triangle to these variables. 
     * logical_step_details: First, find the angle A by applying the arc cosine to the formula (b * b + c* c - a * a) / (2 * b * c). Then convert it into degrees by multiplying it by 180 and divide it by PI. After that, find the angle B by applying the arc cosine to the formula (a * a + c * c - b * b) / (2 * a * c). Then convert it into degrees by multiplying it by 180 and divide it by PI. 
     * question_1: What does the following code block do? 
     * answer_1: First, it finds the angle A by applying the arc cosine to the formula (b * b + c * c - a* a) / (2 * b * c). Then it converts the angle into degrees by multiplying it by 180 and dividing it by PI. After that, it finds the angle B by applying the arc cosine to the formula (a * a + c * c - b * b) / (2 * a * c) . Then it converts it into degrees by multiplying it by 180 and dividing it by PI.
     * question_2: What the value of A? 
     * answer_2: 36.86 
     * question_3: What the value of B? 
     * answer_3: 53.13
     */
    /**
     * stm_comment: Initialize the variables A to the value of arc cosine((b * b + c * c - a * a) / (2 * b * c))
     * question_1: What does the function Math.acos do?
     * answer_1: The function Math.acos calculate the arc cosin of an angle
    */
    double A = Math.acos((b * b + c * c - a * a) / (2 * b * c));
    /**
     * stm_comment: Assign the variable A to the value of (A * 180) divided by PI
     * question_1: What is the value of Math.PI? 
     * answer_1: The value of Math.PI is 3.14
     */
    A = (A * 180) / Math.PI;

    /**
     * stm_comment: Initialize the variables B to the value of arc cosine((a * a + c * c - b * b) / (2 * a * c))
     * question_1: What does the function Math.acos do?
     * answer_1: The function Math.acos calculate the arc cosin of an angle
     */
    double B = Math.acos((a * a + c * c - b * b) / (2 * a * c));
    /**
     * stm_comment: Assign the variable B to the value of (B * 180) divided by PI
      * question_1: What is the value of Math.PI? 
     * answer_1: The value of Math.PI is 3.14
     */
    B = (B * 180) / Math.PI;

    /**
     * logical_step_4: Print the length of the hypotenuse (c) and the angles of A and B. 
     * logical_step_details: First, print the length of the hypotenuse (c). Then print the angles of A and B on a new line. 
     * question_1: What does the following code block do? 
     * answer_1: First, it prints the length of the hypotenuse (c). Then it prints the angles of A and B on a new line. 
     * question_2: What the output of the following block? 
     * answer_2: The length of the hypotenuse (c) is 10.0. The angles are A = 36.86, B = 53.130, and C = 90.
     */

    System.out.println("The length of the hypotenuse (c) is: " + c);

    System.out.printf("Angles are A = %.02f, B = %.02f, C = 90\n", A, B);

  }

}
