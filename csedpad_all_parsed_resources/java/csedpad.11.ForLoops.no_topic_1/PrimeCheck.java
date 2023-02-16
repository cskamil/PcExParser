/**
@goalDescription(This program checks whether a number is a prime number or not and displays the result.)
**/
public class PrimeCheck {
    public static void main(String[] args) {

//specify a variable  to check whether it is prime or not .

        int num = 79;
        boolean flag = false;

//Check whether the number is prime or not.

/**@helpDescription(the for loop iterates from 2 to num/2 in an increasing manner. the if statement checks if the number is divisible by any number in the range 2 to num/2. If true, the loop breaks and the number is displayed as composite. here 79 is prime and is displayed as prime. question_1: explain what does the following block of code do ? answer_1:  the for loop iterates from 2 to num/2 in an increasing manner. the if statement checks if the number is divisible by any number in the range 2 to num/2. If true, the loop breaks and the number is displayed as composite. here 79 is prime and is displayed as prime.)**/
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
