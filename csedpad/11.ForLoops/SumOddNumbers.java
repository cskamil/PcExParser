/**
 * author: Priti Oli
 * topic: For Loops
 * subTopic: getting familiar with the increment operator in for-loop
 * goalDescription: 50 chickens are separated in odd-numbered and even-numbered cages with the first chicken being in cage 1 and the last chicken in cage 50.
 * Each cage's number indicates the number of eggs that the chicken lays such that chicken in cage n lays n eggs.
 * How many eggs can be collected from all the chickens in the odd-numbered cages? This program computes that
 * source: N/A
 * output:  there are  625 eggs collected
 */

public class eggsCollectedOddNumbers {
    public static void main(String args[]){
        /*
		* logical_step_1: specify a variable to store the count of all the eggs collected .
		* logical_step_details: Declare a variable to store the total eggs collected and initiaze it's value to 0.
		* question_1: What does the following block of code do?
		* answer_1:  specify a variable to store the count of all the eggs collected.
		* question_2: What is the initial value of the variable eggsCollected ?
		* answer_2: The initial value of the variable eggsCollected is 0.
		* question_3: What is the data type of the variable eggsCollected
		* answer_3: eggsCollected is an integer
		* question_4: What will happen if you do not initialize the value of the variable eggsCollected?
		* answer_4: The program will throw a compile-time error.
		*/
        int eggsCollected=0;

        /*
		* logical_step_2: find the eggs collected from odd-numberered cages(1-50)
		* logical_step_details:Find the odd numbers from 1 to 50, add them up, and display the result as the total number of eggs collected
		* question_1: What does the following block of code do?
		* answer_1:find the eggs collected from odd-numberered cages(1-50)
		* question_2: What is the initial value of the iterator i?
		* answer_2: The initial value of the iterator is 1.
		* question_3: What is the condition of the for loop that is being checked to continue the loop
		* answer_3: the value of the variable i must be less than or equal to 50
		* question_4: What is the value of the variable eggsCollected when i=5?
		* answer_4: The value of the variable eggsCollected=9 when i=5.
		* question_5: what will be the value of i when the loop ends
		* answer_5: the value of i will be 51
		* question_6: What will be the output of the program if the for loop is initialised to o i.e i=0 is set instead of i=1?
		* answer_6: The program will output the eggsCollected from the even-numbered cages.
		*/

        /**
         * stm_comment: the for loop starts from 1 and iterates over the odd numbers less than 50. The eggsCollected in the body of the for loop sums up all the value of the eggs collected for
         * odd-numbered vages
         * question_1: Please explain what the following for loop does?
         * answer_1:the for loop starts from 1 and iterates over the odd numbers less than 50. The eggsCollected in the body of the for loop sums up all the value of the eggs collected for
         * odd-numbered vages
         * */
        for(int i=1; i<=50; i+=2){
            eggsCollected = eggsCollected + i;
        }
        System.out.println("There are " + eggsCollected+" eggs collected");
    }

}
