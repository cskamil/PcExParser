/**
 * author: Jeevan Chapagain
 * topics: Strings
 * subtopics: string concatenation
 * goalDescription: Given a first name and last name of a person, the program concatenates them to form a full name.
 * source: N/A
 * input: N/A
 * output: DavidBeckham
*/

public class Concat {

  public static void main(String[] args) {
    /**
     * logical_step_1: Declare variables called firstName and lastName to hold the first name and last name of a person.
     * logical_step_details: Declare variables called firstName and lastName to hold the first name and last name of a person. The data type of variable firstName and lastName
      is String. Variable firstName is assigned value of David and variable lastName is assigned a value of Beckham.
     * question_1: What does the following code block do?
     * answer_1: It declares variables called firstName and lastName to hold string to concatenate.
     * question_2: What is the data type of the variables declared?
     * answer_2:  The data type of variable firstName and lastName is String.
     * question_3: What is the value of variable firstName and lastName? 
     * answer_3: Variable firstName is assigned value of David and variable lastName is assigned a value of Beckham.
    */


    /**
     * stm_comment: String variable is declared using the keyword String.
     * question_1: How is string variable declared?
     * answer_1: String variable is declared using the keyword String.
     */

    String firstName = "David";
    


    String lastName = "Beckham";

    /**
     * logical_step_2: Concatenate firstName and lastName to form a full name and prints the full name of a person.
     * logical_step_details: Concatenate lastName with firstName to form a full name of a person.New variable fullName is declared to store the result of the concatenation. Two strings are concatenated using the String method concat().
     * question_1: What does the following code block do?
     * answer_1: Concatenate lastName with firstName to form a full name of a person.
     * question_2: Why new variable fullName is declared?
     * answer_2: New variable fullName is declared to store the result of the concatenation.
     * question_3: How are the two strings concatenated?
     * answer_3: Two strings are concatenated using the String method concat().
    */


    /**
     * stm_comment: Concatenates  the variable lastName with  variable firstName.
     * question_1: Please explain what the following code block does?.
     * answer_1:  Concatenates  the variable lastName with  variable firstName.
    */

    String fullName = firstName.concat(lastName);

    /**
     * stm_comment: Prints the result of the concatenation.
     * question_1: Please explain what the following code block does?.
     * answer_1: Prints the result of the concatenation.
     */

    System.out.println(fullName);

  }
}
