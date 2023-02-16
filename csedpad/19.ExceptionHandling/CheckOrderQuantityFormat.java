/*
 * author: Zak Risha
 * topics: Exception Handling
 * subtopics: Strings, parseInt, processing array, NumberFormatException
 * goalDescription: This program checks that an input for an order is in the correct format, demonstrating how a NumberFormatException can occur.
 * output: NumberFormatException
 * 
 */ 

public class CheckOrderQuantityFormat{
  public static void main(String[] args) {
    /*
     * logical_step_1: Initalize a String variable called quantity and assign the string "five".
     * logical_step_details: Initalize a variable to serve as an example quantity input. In this case a String with the string "five".
     * question_1: What does the following code block do?
     * answer_1: Declares String variable called quantity and assigns a string "five" to it.
     * question_2: Is the value assigned to quantity a numeric or a word?
     * answer_2: A word.
    */
    String quantity = "five";

    /*
     * logical_step_2: Within a try block, attempt to parse the String quantity into an integer. 
     * logical_step_details: Within a try block, try to parse the String input into an integer to represent the quantity for an order.
     * question_1: What does the following code block do?
     * answer_1: Within a try block, it attempts to parse the String quantity into an integer. 
     * question_2: What is the value of the parameter passed into parseInt method?
     * answer_2: five.
     */

    /*
     * stm_comment: Try executing code, providing opportunity to catch and handle errors
     */
    try {

      /*
       * stm_comment: Method to convert a string into an integer 
       */
      int num = Integer.parseInt(quantity); 
      System.out.println(num);

     /*
      * logical_step_3: Catch exceptions thrown by the previous method parseInt and print out the name of the exception.
      * logical_step_details: Catch any exceptions if the quantity string inputed by a user is not in a number format. Print the exception name that caused the error.
      * question_1: What does the following code block do?
      * answer_1: It catches NumberFormatException exceptions thrown by the parseInt method by printing out the string "NumberFormatException".
      * question_2: Will this catch block trigger with the previous method call?
      * answer_2: Yes, as "five" is not a valid string format of a number.
      */

      /*
       * stm_comment: This exception is thrown when trying to convert a string with an inappropriate format to one of the numeric types
       */
    } catch(NumberFormatException e) { 
        System.out.println("NumberFormatException"); 
    }
  }
}