/**
 * author:Jeevan Chapagain 
 * topics:Exception Handling 
 * subtopics: Arithmetic exception
 * goalDescription: Your bank account balance suddenly becomes zero and you are trying to find out what proportion of the current balance
                    you can spent on a bike that costs $100.
 * source: N/A
 * input: N/A  
 * output: You cannot buy a bike since your bankAccountbalance is zero.
*/

public class Arithmetic {
  public static void main(String[] args) {

    /**
     * logical_step_1: Declare two variables called bankAccountBalance and bikeCost to specify the balance of the account and the cost of the bike for purchase. 
     * logical_step_details: Declare two variables called bankAccountBalance and bikeCost to specify the balance of the account and the cost of the bike for purchase. The data type of both the variables is integer.Variable bikeCost is assigned a value of 100 and variable bankAccountBalance is assigned a value of 0.
     * question_1: What does the following code block do? 
     * answer_1: Declare two variables called bankAccountBalance and bikeCost to specify the balance of the account and the cost of the bike for purchase.
     * question_2: What is the data type of the variables?
     * answer_2: The data type of both the variables is integer.
     * question_3: What are the values of variables bikeCost and bankAccountbalance?
     * answer_3: Variable bikeCost is assigned a value of 100 and variable bankAccountbalance is assigned a value of 0.
    */

    int bikeCost = 100;
    int bankAccountBalance = 0;

    /**
     * logical_step2: Within a try block perform a division operation to find what porpotion of bank account balance you can use.
     * logical_step_details: Within a try block perform a division operation to find what porpotion of bank account balance you can use.
     * question_1: What does the following code block do?
     * answer_1: Within a try block perform a division operation to find what porpotion of bank account balance you can use.
    */

    /**
     * stm_comment: Tries executing code, providing opportunity to catch and handle errors
     * question_1: Please explain what the following block of code does?
     * answer_1: Tries executing code, providing opportunity to catch and handle errors
    */


    try {

      /**
       * logical_step3: Perform the division operation to find what porpotion of bank account balance you can use.
       * logical_step_details: Perform the division operation to find what porpotion of bank account balance you can use.
       * question_1: What does the following code block do?
       * answer_1:  Perform the division operation to find what porpotion of bank account balance you can use.
      */


      int usable_money = bikeCost / bankAccountbalance;

      System.out.println("Result = " + usable_money);
    }

    /**
     * logical_step_3: Catch any exceptions thrown by the previous division operation and print out the error result. 
     * logical_step_details: The catch block will catch any exceptions thrown by the code executed in the try block and says whether you can buy bike or not. ArithmeticException will occur in this case because the divisor has the value of zero.
     * question_1: What does the following code block do? 
     * answer_1: The catch block will catch any exceptions thrown by the code executed in the try block and says whether you can buy bike or not.
     * question_2: What exception will occur?
     * answer_2: ArithmeticException will occur in this case because the divisor has the value of zero.
    */

    /**
     * stm_comment: Arithmetic Exception is thrown when we try to divide a cost of a bike by bankAccountBalance which is zero.
     * question_1: Please explain what the following code block does?.
     * answer_1: Arithmetic Exception is thrown when we try to divide a cost of a bike by bankAccountBalance which is zero.
     */
    catch (ArithmeticException e) {

      System.out.println("You cannot buy a bike since your bankAccountbalance is zero");
    }
  }

}
