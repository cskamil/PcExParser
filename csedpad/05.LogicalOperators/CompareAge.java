/**
 * author: Priti Oli, Rabin Banjade
 * topic: Logical Operators
 * subTopic: usage of various basic logical operators
 * goalDescription: Given the age of 3 individuals, this program compares their ages in order to check whether any
 * two individuals are of the same age.
 * source: N/A
 * input: N/A
 * output: Tom is tha same age as  Nick:false
 * Nick is tha same age as  Harry:false
 * Tom is tha same age as  Harry:false
 */
public class CompareAge {
    public static void main (String[] args){

        /**
         * logical_step_1: Specify the age of 3 people
         * logical_step_details: Declare 3 variables to store the age of three individual .Here, variables Tom, Nick and
         * Harry are used to store the ages of three individual
         * question_1: How is the age of individuals specified?
         * answer_1: Declare variable Tom , Nick and Harry to store the age of 3 individuals.
         * question_2: How is the age specified?
         * answer_2: The variables Tom, Nick and Harry hold the value for age
         * question_3: What is the data type of the variables Tom, dick and Harry ?
         * answer_3: The data type of the variables is integer.
         * question_4: What are the values of the variables Tom,dick and Harry ?
         * answer_4: the value of Tom is initialized to 40, Nick is initialized to 50 and Harry is initialized to 40
         * question_5:What does the following block of code do?
         * answer_5: Specify the age of 3 people
         */

        int Tom = 40, Nick=50, Harry=40;

        /**
         * logical_step_2: compare the age of Tom Nick and Harry to see if any of them are of same age.
         * logical_step_details: compare the age of Tom with the age of Nick and Harry.
         * Also, compare the age of Nick and Harry. If the age of two individual is equal display a message conforming that the age
         * of two is same.
         * question_1: What does the following block of code do?
         * answer_1:Checks if the age of Tom, dick or Harry is the same. The comparison is evaluated
         * and true or false evaluation is displayed
         * question_2: what is the value of Tom==Nick?
         * answer_2: false
         * question_3: which of the following print statement displays a True value?
         * answer_3: Tom is the same age as  Harry
         */

        /**
         * stm_comment: The '==' operator is used to compare the value of two variables.
         * if the value of the two variables are equal, the expression evaluates to True else False
         * question1: Please explain what does the '==' operator do.
         * answer_1: The '==' operator in the code block below compares the two values on two sides of the operand
         * to check if they are equal. If the two value are the same, it returns a true value, else returns a false value*/

        System.out.println("Tom is tha same age as  Nick:"+(Tom==Nick ));
        System.out.println("Nick is tha same age as  Harry:"+(Nick==Harry ));
        System.out.println("Tom is tha same age as  Harry:"+(Tom==Nick ));


    }

}