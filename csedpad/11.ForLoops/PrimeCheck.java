/**
 * author: Priti Oli
 * topic: For Loops
 * subTopic: getting familiar with for loops
 * goalDescription: This program checks whether a number is a prime number or not and displays the result.
 * source: N/A
 * output:  79 is a prime number.
 */
public class PrimeCheck {

    public static void main(String[] args) {

        /*
		* logical_step_1: specify a variable  to check whether it is prime or not .
		* logical_step_details: Declare a variable,num to  check if it's prime or not,
		* question_1: What does the following block of code do?
		* answer_1: specify a variable  to check whether it is prime or not .
		* question_2: What is the value of variable num?
		* answer_2: The value of variable num is 79.
		* question_3: What is the data type of the variable num?
		* answer_3: num is an integer
		*/


        int num = 79;
        boolean flag = false;

        /*
		* logical_step_2: Check whether the number is prime or not.
		* logical_step_details:  We can start from 2 and iterate through the number/2. If any divisor is found we can break from the loop as
		* the number is not prime. Otherwise we can continue to iterate until we reach num/2 to find a divisor.
		* question_1: What does the following block of code do?
		* answer_1: The code checks whether a number is prime or not?
		* question_2: what is the output of the following code?
		* answer_2: 79 is a prime number.
		* question_3: Will the value of flag be set to true?
		* answer_3: no
		* question_4: What will be the output of the program if the value of num is 80?
		* answer_4:  80 is not a prime number.
		*/


        /**
         *  stm_comment: the for loop iterates from 2 to num/2 in an increasing manner. the if statement checks if the
         *  number is divisible by any number in the range 2 to num/2. If true, the loop breaks and the number is displayed
         *  as composite. here 79 is prime and is displayed as prime.
         *  question_1: explain what does the following block of code do ?
         *  answer_1:  the for loop iterates from 2 to num/2 in an increasing manner. the if statement checks if the
         *  number is divisible by any number in the range 2 to num/2. If true, the loop breaks and the number is displayed
         *  as composite. here 79 is prime and is displayed as prime.
         */

        for(int i = 2; i <= num/2; ++i)
        {

            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}