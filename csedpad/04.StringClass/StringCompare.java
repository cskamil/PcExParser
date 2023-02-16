/**
 * author: Jeevan Chapagain
 * topic: Strings
 * subtopics: string comparison
 * goalDescription: Given two names of two places, the program checks if they are equal in length.
 * source: N/A
 * input: N/A
 * output: False
*/

public class StringCompare {

  public static void main(String[] args) {
    
    /**
     * logical_step_1: Declare two variables called first_place and second_place to specify the name of the places.
     * logical_step_details: Declare two variables called first_place and second_place to check whether they are equal in length or not. The data type of both the variables is String. Variable first_place is assigned value of Memphis and variable second_place is assigned value of Nashville.
     * question_1: What does the following code block do?
     * answer_1: Declare two variables called first_place and second_place to check whether they are equal in length or not.
     * question_2: What is the data type of the variables declared?
     * answer_2:The data type of both the variables is String.
     * question_3: What is the value of variable first and second?
     * answer_3: Variable first_place is assigned value of Memphis and variable second_place is assigned value of Nashville.
    */


    /**
     * stm_comment: String variable is declared using the keyword String.
     * question_1: How is string variable declared?
     * answer_1: String variable is declared using the keyword String.
     */

    String first_place = "Memphis";
    



    String second_place = "Nashille";

    /**
     * logical_step_2: Check whether two places name are equal in length or not and prints the result.
     * logical_step_details: Check whether the two places are equal or not in terms of length. The two places are compared using the String method equals().
     * question_1: What does the following code block do?
     * answer_1: Check whether the two places are equal or not in terms of length.
     * question_2: How are the two places compared?
     * answer_2: Two strings are compared using the String method equals().
    */


    /**
     * stm_comment: Prints the result of the string comparision.
     * question_1: Please explain what the following code block does?.
     * answer_1: Prints the result of the string comparision.
     */
    System.out.println(second_place.equals(first_place));

  }
}
