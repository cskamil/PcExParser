/**
@goalDescription(Your bank account balance suddenly becomes zero and you are trying to find out what proportion of the current balance)
**/
public class Arithmetic {
  public static void main(String[] args) {

//Declare two variables called bankAccountBalance and bikeCost to specify the balance of the account and the cost of the bike for purchase.
    int bikeCost = 100;
    int bankAccountBalance = 0;

//Within a try block perform a division operation to find what porpotion of bank account balance you can use.
/**@helpDescription(Tries executing code, providing opportunity to catch and handle errors question_1: Please explain what the following block of code does? answer_1: Tries executing code, providing opportunity to catch and handle errors)**/

    try {

//Perform the division operation to find what porpotion of bank account balance you can use.

      int usable_money = bikeCost / bankAccountbalance;

      System.out.println("Result = " + usable_money);
    }

//Catch any exceptions thrown by the previous division operation and print out the error result.
/**@helpDescription(Arithmetic Exception is thrown when we try to divide a cost of a bike by bankAccountBalance which is zero. question_1: Please explain what the following code block does?. answer_1: Arithmetic Exception is thrown when we try to divide a cost of a bike by bankAccountBalance which is zero.)**/
    catch (ArithmeticException e) {
      System.out.println("You cannot buy a bike since your bankAccountbalance is zero");
    }
  }

}
