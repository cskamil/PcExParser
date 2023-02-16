/**
@goalDescription(Demonstrate understanding of Math class concepts by constructing a program that finds the length of the hypotenuse in of a right triangle by using the Pythagoras theorem. Then this program finds the angles of that triangle.)
**/
public class MathExample1 {
  public static void main(String[] args) {

//Declare double variables called a, b, and c to represent each side of the triangle. Assign a value of 6 to a and 8 to b.
    double a = 6, b = 8, c;

//Calculate the length of the hypotenuse (c) by using the Pythagoras theorem.
/**@helpDescription(Assign the result of sqr root of a^2 + b^2 to c question_1: what does the function Math.pow do? answer_1: The function return the result of the first argument to the power of the second argument)**/
    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//Declare two double variables A and B. Assign the calculated values of the angles of the right triangle to these variables.
/**@helpDescription(Initialize the variables A to the value of arc cosine((b * b + c * c - a * a) / (2 * b * c)) question_1: What does the function Math.acos do? answer_1: The function Math.acos calculate the arc cosin of an angle)**/
    double A = Math.acos((b * b + c * c - a * a) / (2 * b * c));
/**@helpDescription(Assign the variable A to the value of (A * 180) divided by PI question_1: What is the value of Math.PI? answer_1: The value of Math.PI is 3.14)**/
    A = (A * 180) / Math.PI;
/**@helpDescription(Initialize the variables B to the value of arc cosine((a * a + c * c - b * b) / (2 * a * c)) question_1: What does the function Math.acos do? answer_1: The function Math.acos calculate the arc cosin of an angle)**/
    double B = Math.acos((a * a + c * c - b * b) / (2 * a * c));
/**@helpDescription(Assign the variable B to the value of (B * 180) divided by PI question_1: What is the value of Math.PI? answer_1: The value of Math.PI is 3.14)**/
    B = (B * 180) / Math.PI;
//Print the length of the hypotenuse (c) and the angles of A and B.
    System.out.println("The length of the hypotenuse (c) is: " + c);

    System.out.printf("Angles are A = %.02f, B = %.02f, C = 90\n", A, B);

  }

}
