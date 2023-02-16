/**
 * author: Vasile Rus
 * topics: while loops
 * subtopics: loop with simple loop variable increment
 * goalDescription: Assume you have a list of 1,000 people in alphabetical order and you are assigned to collect from the first person on the list $1, from the second person $2, and so on fomr the 1,000th person you collect $1,000. How much money will you collect in total. This is equivalent to finding the sum of natural numbers from 1 to 1,000.
 * source:
 * output: 500500
 */

public class whileLoopsSum1to1000 {
  public static void main(String[] args) {

    /**
	 * logical_step_1: Declare and initialize variables needed. 
	 * logical_step_details: The sum variable will hold the total ammount that will be collected. Variable i is a loop variable that will iterate over all values from 1 to 1,000.
     * question_1: What does the following block of code do?
     * answer_1: Declare and initialize variables needed.
     * question_2: What is the type and initial value of the sum variable?
     * answer_2: The sum variable is of type integer and its initial value is 0.
     * question_3: What is the type and initial value of the i variable?
     * answer_3: The i variable is of type integer and is being initialized to value 1.
     */ 
    int sum = 0, i = 1;

    /**
	 * logical_step_step_2: Add all the values from $1 to $1,000 using a loop.
	 * logical_step_details: the loop variable i scans all values from 1 to 1,000. Variable sum is updated at each iteration with the current value of variable i.
     * question_1: What does the following code do?
     * answer_1: Sum all the values from $1 to $1,000.
     * question_2: What is the value of the sum before the loop starts?
     * answer_2: The value of sum before the loop starts is zero.
     * question_3: By what amount is the loop variable i incremented in each iteration? 
     * answer_3: The loop variable i is incremented by a value of 1 at each iteration.
     * question_4: When does the loop end? 
     * answer_4: The loop ends when the variable i reaches 1000.
     */
    while (i <= 1000) {

		sum += i;
    
		/**
		* stm_comment: The loop variable i is being incremented which is important in order for the loop condition to change.
		* question_1: Why is the following statement important for the loop?
		* answer_1: The loop variable i is being incremented which is important in order for the loop condition to change and eventually for the loop to end.
		*/
		i++;
    }

    /** logical_step_3: print the total amount collected.
	 * logical_step_details: Print the sum variable which contains the total amount collected.
     * question_1: What does the following code do?
     * answer_1: print the total amount collected in the sum variable.
     * question_2: How do you call the part in double quotes in the System.out.println method call? 
     * answer_2: The part in double quotes is a string.
     */
    System.out.println("Sum = " + sum);
  }
}
