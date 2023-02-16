/**
* author: Jeevan Chapagain
* topics: Strings
* subtopics: conversion to uppercase and lowercase
* goalDescription: Given a person name, this program converts the name into uppercase and lowercase.
* source: N/A
* input: N/A
* output: CRISTIANO RONALDO
       cristiano ronaldo
*/

public class ChangeCase {
  public static void main(String[] args) {

    /**
     * logical_step_1: Declare a variable called fullName to hold the name of a person.
     * logical_step_details:  Declare a variable called fullName to hold the name of a person. The data type of variable fullName is String. The variable fullName is assigned with a value of Cristiano Ronaldo
     * question_1: What does the following code block do? 
     * answer_1:  Declare a variable called fullName to hold the name of a person.
     * question_2: What is the data type of the variable fullName?
     * answer_2: The data type of variable fullName is String.
     * question_3: What is the value of variable fullName?
     * answer_3: The variable fullName is assigned with a value of Cristiano Ronaldo.
     */


    /**
     * stm_comment: String variable is declared using the keyword String.
     * question_1: How is string variable declared?
     * answer_1: String variable is declared using the keyword String.
    */
    String fullName = "Cristiano Ronaldo";

    /**
     * logical_step_2: Convert the name of the person into uppercase and lowercase and print the name in respective cases.
     * logical_step_details: The  variable fullName is converted into uppercase using the string methods toUppercase. The  variable fullName is converted into lowercase using the string methods toLowerCase.
     * question_1: What does the following code block do? 
     * answer_1: Convert the name of the person into uppercase and lowercase and print the name in respective cases.
     * question_2: How is the variable fullName converted to uppercase?
     * answer_2: The  variable fullName is converted into uppercase using the string methods toUppercase.
     * question_3: How is the string converted to lowercase? 
     * answer_3: The  variable fullName is converted into uppercase using the string methods toLowerCase.
    */

    /**
     * stm_comment: Variable fullName is converted to uppercase and the result is printed.
     * question_1: Please explain what the following code block does?
     * answer_2: Variable fullName is converted to uppercase and the result is printed.
    */
    System.out.println(fullName.toUpperCase());

    /**
     * stm_comment: Variable fullName is converted to lowercase and the result is printed.
     * question_1: Please explain what the following code block does?
     * answer_2: Variable fullName is converted to lowercase and the result is printed.
     */
    System.out.println(fullName.toLowerCase());
  }
}
