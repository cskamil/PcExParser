/**
@goalDescription(Demonisterate the understanding of Math class concepts by construct a program that finds the length of the hypotenuse in of a right triangle by using the Pythagoras theorem then finds the angles of that triangle.)
**/
public class MathExample1 {
  public static void main(String[] args) {

//Declare double variables called a, b, and c to represent each side of the triangle and assign a to 6 and b to 8.
    double a = 6, b = 8, c;

//Calculate the length of the hypotenuse (c) by using the Pythagoras theorem.
/**@helpDescription(Assign the result of sqr root of a^2 + b^2 to c)**/
    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//Declare two double variables A and B and assign it the calculated value the angles of the right triangle.
/**@helpDescription(Initialize the variables A to the value of arc cosine((b * b + c * c - a * a) / (2 * b * c)))**/
    double A = Math.acos((b * b + c * c - a * a) / (2 * b * c));
/**@helpDescription(Assign the variable A to the value of (A * 180) divided by PI)**/
    A = (A * 180) / Math.PI;
/**@helpDescription(Initialize the variables B to the value of arc cosine((a * a + c * c - b * b) / (2 * a * c)))**/
    double B = Math.acos((a * a + c * c - b * b) / (2 * a * c));
/**@helpDescription(Assign the variable B to the value of (B * 180) divided by PI)**/
    B = (B * 180) / Math.PI;
//Print the length of the hypotenuse (c) and the angles of A and B. logical_step_details: First, it prints the length of the hypotenuse (c), then it prints the angles of A and B in a new line.
    System.out.println("The length of the hypotenuse (c) is: " + c);

    System.out.printf("Angles are A = %.02f, B = %.02f, C = 90\n", A, B);

  }

}
