/**
 * author: Lasang Tamang
 * topics: preliminary topics
 * subtopics: Variables, Expressions, Constants, and Primitive Data Types
 * goalDescription: This program cacluates the area of circle.
 * source: Introduction to Java Programming, Y. Daniel Liang
 * input: N/A
 * output: The area for the circle of radius 5.80 is 105.68 
 */
 
public class ComputeAreaWithConstant {
  public static void main(String[] args) {
  
    /**
     * logical_step_1: declares the variable to store value of PI, radius and area of circle.
      * logical_step_details: declares the variable to stroe value of PI, radius and area of circle. The variable PI is constant whose value is 3.14159. The variable radius of double type whose value is 5.8.
     * question_1: What does the following chunk of code do?
     * answer_1: declares the variable to store value of PI, radius and area of circle.
     * question_2: What variables is constant and what is its value?
     * answer_2: The variable PI is constant and the value is 3.14159
     * question_3: What is the data type of variable radius and its value?
     * answer_3: The variable radius is of double type whose value is 5.8.
     */
      /**
      *stm_comment: final keyword is used to declare constant
     * question_1: Why is final keyword used for ?
     * answer_1: final keyword is used to declare constant
     */
    final double PI = 3.14159; // Declare a constant // final keyword is used to declare constant
    double radius = 5.8; // variable, primitive data type

   
    /**
     * logical_step_1: Cacluate the Area of cirlce and prints the value
     * logical_step_details: Cacluate the Area of cirlce using expression area = radius * radius * PI . Finally, the area of circle is printed.
     * question_1: What does the following chunk of code do?
     * answer_1: Cacluate the Area of cirlce and prints the value
     * question_2: Which expression calculate the area of circle?
     * answer_2: The expression area = radius * radius * PI calulates area of circle.
     */
    double area = radius * radius * PI;
    System.out.printf("The area for the circle of radius %.2f is %.2f ", radius, area);
  }
}
