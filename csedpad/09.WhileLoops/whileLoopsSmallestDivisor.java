/**
* author: Vasile Rus
* topics: while loops
* subtopics: loop with simple loop variable increment
* goalDescription: Construct a program that finds the smallest divisor (other than 1) of a positive number. For example, the smallest divisor of 4 is 2.
* source: Pittsburgh pool of examples
* output: 3
*/

public class whileLoopsSmallestDivisor {
  public static void main(String[] args) {

	/**
	* logical_step_1: Define needed variables. 
	* logical_step_details: Num represents the number whose smallest divisor is to be found. Variable divisor represents a temporary variable which will hold values from 2 to the number num itself which is the range of potential smallest divisors.
	* question_1: What does the following block of code do?
	* answer_1: Defines variables.
	* question_2: What is the type and initial value of the variable num?
	* answer_2: Variable num is of type integer and it is initialized to value 15.
	* question_3: What is the type and initial value of the variable divisor?
	* answer_3: Variable divisor is of type integer and it is initialized to value 2.
	*/
	int num = 15;
	int divisor = 2;

	/**
	* logical_step_2: Find the smallest divisor of the number num. To find the smallest divisor of the number num, all values from 2 to the number itself are considered potential candidates and the first value in this range which proves to be a divisor is the smallest divisor.
	* logical_step_details: A while loop is being used to generate potential divisor candidates from 2 to the number itself. The first value in this range which proves to be a divisor is the smallest divisor and makes the loop to end. At each iteration the divisor variable is incremented by 1.
	* question_1: What does the following block of code do?
	* answer_1: Find the smallest divisor of the number.
	* question_2: When does the while loop end?
	* answer_2: The while loop ends when the remainder of the division between num and divisor is zero, which means the value of divisor is the smallest divisor of num. 
	* question_3: By how much is divisor changed in each loop iteration?
	* answer_3: At each iteration, the divisor's value is incremented by 1.
	*/
	
	/**
	* stm_comment: The following loop runs as long as the rest of dividing num by divisor is different from zero. 
	* question_1: When does the following while loop end?
	* answer_1: The following loop runs as long as the rest of dividing num by divisor is different from zero.
	*/
	while (num % divisor != 0) {
    divisor += 1;
	}

	/**
	* logical_step_3: Print to standard output the smallest divisor of the number num.
	* logical_step_details: The smallest divisor of the number num is in variable divisor.
	* question_1: What does the following block of code do?
	* answer_1: Print to standard output the smallest divisor of the number num which will be in the variable divisor.
	*/
  
	System.out.println("The smallest divisor of " + num + " is " + divisor);

	}
}
