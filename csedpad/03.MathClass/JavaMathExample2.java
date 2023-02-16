/*
 * author: Zeyad
 * topics: Math class
 * subtopics: using Math.PI
 * goalDescription: Demonstrate understanding of Math class concepts by construct a program that finds the area and circumference of a circle.
 * source:https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/
 * input: N/A
 * output: The area of circle is: 28.27
 * The circumference of the circle is: 18.85
*/
public class JavaMathExample2{

 public static void main (String[]args)
  {

    /*
       * logical_step_1: Declare a variable radius and assign it a value of 3.
       * logical_step_details: Declare a variable radius and assign it a value of 3. The data type of the variable radius is double.
       * question_1: What does the following code block do?
       * answer_1: Declare a variable radius and assign it a value of 3.
       * question_2: What is the data type of variable radius?
       * answer_2: double
     */
    double radius = 3;

    /*
       * logical_step_2: Calculate the area of the circle and the circumference.
       * logical_step_details: First declare a double variable called area and assign the result from the formula Math.PI * (radius * radius) to it.
       * Then declare another double variable named circumference and assign the result from the formula Math.PI * 2 * radius to it.
       * question_1: What does the following code block do?
       * answer_1: Calculate the area of the circle and the circumference.
       * question_2: What does double area = Math.PI * (radius * radius); do?
       * answer_2: It declares a double variable called area and assigns the result from the formula Math.PI * (radius * radius) to it.
       * question_3: What does double circumference = Math.PI * 2 * radius; do?
       * answer_3: It declare a double variable named circumference and assigns the result from the formula Math.PI * 2 * radius to it.
     */
     /**
     * stmt_comment: Declare and initialize the variable area to the value of PI * (radius * radius) 
     * question_1: What is the value of Math.PI?
     * answer_1: The value of Math.PI is 3.14
     */
    double area = Math.PI * (radius * radius);
    /**
    * stmt_comment: Declare and initialize the variable circumference to the value of PI * 2 * radius 
    * question_1: What is the value of Math.PI?
     * answer_1: The value of Math.PI is 3.14
    */
    double circumference = Math.PI * 2 * radius;
    /*
       * logical_step_3: Print the value of area and circumference of the circle.
       * logical_step_details: The area of circle is: 28.274333882308138. The circumference of the circle is: 18.84955592153876.
       * question_1: What does the following code block do?
       * answer_1: It prints the value of the area and circumference of the circle.
       * question_2: What is the area of the circle?
       * answer_2: The area of circle is 28.27.
       * question_3: What is the circumference of the circle?
       * answer_3: The circumference of the circle is 18.84.
     */
      System.out.printf("The area of circle is: %.02f\n" , area);
      System.out.printf("The circumference of the circle is: %.02f\n" ,
			  circumference);

  }

}
