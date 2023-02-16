/**
  * author:Jeevan Chapagain 
  * topics :Exception Handling 
  * subtopics: null pointer exception 
  * goalDescription: You have an empty string. You are trying to find out whether you can find  
                    which character is present at the certain index position of that string.
  * source: N/A
  * input: N/A
  * output: NullPointerException
*/

public class NullExpect {
  public static void main(String[] args) {

    /**
     * logical_step_1: Declare a variable called empty to hold a string.
     * logical_step_details: Declare a variable called empty to hold string. The data type of variable empty is string. Variable empty is assigned a null value.
     * question_1: What does the following code block do?
     * answer_1: Declares a variable called empty to hold a string.
     * question_2: What is the data type of the variable empty?
     * answer_2: The data type of variable empty is string.
     * question_3: What is the value of variable empty?
     * answer_3: Variable empty is assigned a null value.
     * 
    */

    String empty = null;

    /**
     * logical_step_2: Within a try block, find the character present at 0th index position.
     * logical_step_details: Within a try block, find the character present at 0th index position of the variable empty. We can find character present at the 0th index position using the method charAt().
     * question_1: What does the following code block do?
     * answer_1: Within a try block, it finds the character present at 0th index position of the variable empty.
     * question_2: How do you find the character present at the 0th index position?
     * answer_2: We can find character present at the 0th index position using the method charAt().
    */

    /**
     * stm_comment: Tries executing code, providing opportunity to catch and handle errors
     * question_1: Please explain what the following block of code does?
     * answer_1: Tries executing code, providing opportunity to catch and handle errors
     */
    
    try {

    /**
     * stm_comment: printing out the character present at index position 0 in the variable empty.
     * question_1: Please explain what the following block of code does?
     * answer_1: printing out the character present at index position 0 in the variable empty.
     */
      System.out.println(empty.charAt(0));
    }

    /**
     * logical_step_3: Catch exceptions thrown by the previous try block. Then print out the name of the exception.
     * logical_step_details: Catch exceptions thrown by the previous try block. NullPointer Exception will occur in this case.
     * question_1: what does the following code block do?
     * answer_1: Catch NullPointerException thrown by the previous code of block.
     * question_2: What exception will occur?
     * answer_2: NullPointer Exception will occur in this case.
     */

    /**
     * stm_comment: NullPointer Exception is thrown when we try to access the index of a string which is null.
     *  question_1: Please explain what the following block of code does?
     *  answer_1: NullPointer Exception is thrown when we try to access the index of a string which is null.
     */

    catch (NullPointerException e) {

      System.out.println("NullPointerException");
    }
  }

}
