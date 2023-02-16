/**
* author:Jeevan Chapagain
* topic:String 
* subtopics: string length calculation
* goalDescription: Given a person name, the program finds out the length, i.e., the number of characters, of the name.
them by finding out the length of the respective string variables.
* source: N/A
* input: N/A
* output: Length of Lebron James is: 12
*/

public class StringLength {
  public static void main(String[] args) {
    /**
     * logical_step_1: Declare a variable called person_name to hold name of a person.
     * logical_step_details: Declare a variable person_name to hold name of a person to find out the length. The data type of the variable person_name is String. Variable person_name is assigned a value of Lebron James.
     * question_1: What does the following code block do?
     * answer_1: Declare a variable person_name to hold name of a person to find out the length.
     * question_2: What is the data type of variable person_name?
     * answer_2:  The data type of the variable person_name is String.
     * question_3: What is the value assigned to variable person_name?
     * answer_3: Variable person_name is assigned a value of Lebron James.
    */

    /**
     * stm_comment: String variable is declared using the keyword String.
     * question_1: How is string variable declared?
     * answer_1: String variable is declared using the keyword String.
     */

    String person_name = "Lebron James";

    /**
     * logical_step_2: Find the length of the name of a person and print out the result.
     * logical_step_details: Find the length of the name of a person. The length of the variable person_name is computed using the string method length().
     * question_1: What does the following code block do?
     * answer_1:  Find the length of the name of a person.
     * question_2: How is the length of the variable person_name computed?
     * answer_2: The length of the variable person_name is computed using the string method length().
    */

    /**
     * stm_comment: Prints the length of the variable person_name.
     * question_1: Please explain what the following code block does?.
     * answer_1: Prints the length of the variable person_name.
     */
    System.out.println("Length of " + person_name + " is: " + person_name.length());

  }
}
