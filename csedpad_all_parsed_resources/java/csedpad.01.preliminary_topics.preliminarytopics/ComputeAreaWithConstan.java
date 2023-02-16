/**
@goalDescription(This program cacluates the area of circle.)
**/
public class ComputeAreaWithConstant {
  public static void main(String[] args) {
  
//declares the variable to store value of PI, radius and area of circle.
/**@helpDescription(final keyword is used to declare constant question_1: Why is final keyword used for ? answer_1: final keyword is used to declare constant)**/
    final double PI = 3.14159; // Declare a constant // final keyword is used to declare constant
    double radius = 5.8; // variable, primitive data type
   
//Cacluate the Area of cirlce and prints the value
    double area = radius * radius * PI;
    System.out.printf("The area for the circle of radius %.2f is %.2f ", radius, area);
  }
}
