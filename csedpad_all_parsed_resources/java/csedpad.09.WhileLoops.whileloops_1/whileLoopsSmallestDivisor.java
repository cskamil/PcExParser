/**
@goalDescription(Construct a program that finds the smallest divisor (other than 1) of a positive number. For example, the smallest divisor of 4 is 2.)
**/
public class whileLoopsSmallestDivisor {
  public static void main(String[] args) {

//Define needed variables.
	int num = 15;
	int divisor = 2;
//Find the smallest divisor of the number num. To find the smallest divisor of the number num, all values from 2 to the number itself are considered potential candidates and the first value in this range which proves to be a divisor is the smallest divisor.
/**@helpDescription(The following loop runs as long as the rest of dividing num by divisor is different from zero. question_1: When does the following while loop end? answer_1: The following loop runs as long as the rest of dividing num by divisor is different from zero.)**/
	while (num % divisor != 0) {
    divisor += 1;
	}
//Print to standard output the smallest divisor of the number num.
	System.out.println("The smallest divisor of " + num + " is " + divisor);

	}
}
