 /**
 * author:Jeevan Chapagain 
 * topics:Exception Handling 
 * subtopics: string index out of bounds exception 
 * goalDescription: You wrote a setence about a  fruit that you love. You are trying to find out whether you can find  
                    which character is present at the certain index position of that sentence.
 * source: N/A
 * input: N/A
 * output: StringIndexOutOfBoundsException
*/

public class IndexOut {
  public static void main(String args[]) {

    /**
     * logical_step_1: Declare a variable called fruit.
     * logical_step_details: Declare a variable fruit to hold a string. The data type of variable fruit is String. Variable fruit assigned a value of "I love apple".
     * question_1: What does the following code block do?
     * answer_1: Declare a variable fruit to hold a string.
     * question_2: What is the data type of the variable fruit?
     * answer_2: The data type of variable fruit is String.
     * question_3: What is the value of variable fruit?
     * answer_3: Variable fruit assigned a value of "I love apple".
    */




    String fruit = "I love apple ";

    /**
     * logical_step_2: Within a try block, find the character present at 13th index position.
     * logical_step_details: Within a try block, find the character present at 13th index position. character present at the 13th index position can be fund using the method charAt().
     * question_1: What does the following code block do?
     * answer_1: Within a try block, it find the character present at 13th index position.
     * question_2: How do you find the character present at the 13th index position?
     * answer_2: character present at the 13th index position can be fund using the method charAt().
     * 
    */

    /**
     * stm_comment: Tries executing code, providing opportunity to catch and handle errors
     * question_1: Please explain what the following block of code does?
     * answer_1: Tries executing code, providing opportunity to catch and handle errors
     */


    try {



      System.out.println(fruit.charAt(13));
    }

    /**
     * logical_step_3: Catch any exceptions thrown by the previous try block. Then print out the name of the exception.
     * logical_step_details: Catch exceptions thrown by the previous try block. StringIndexOutOfBoundsException will occur
     * question_1: What does the following code block do?
     * answer_1:Catch exceptions thrown by the previous try block.
     * question_2: What exception is occur?
     * answer_2: StringIndexOutOfBoundsException
    */

    /**
     * stm_comment: StringIndexOutofBounds Exception is thrown when we try to access the index of a string beyond its length.
     * question_1: Please explain what the following code block does?.
     * answer_1: StringIndexOutofBounds Exception is thrown when we try to access the index of a string beyond its length.
    */


    catch (StringIndexOutOfBoundsException e) {


      System.out.println("StringIndexOutOfBoundsException");
    }
  }
}