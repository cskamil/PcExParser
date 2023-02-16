/**
 * author: Suraj Maharjan 
 * topics: Input Type 
 * subtopics: string, integer, double, boolean
 * goalDescription: This program collects various information about an employee from the standard input device. The collected employee information is then displayed on the screen.
 * input_1: [ Jane, Senior Java Developer, 30, 10000 ]
 * input_2: [ True ] 
 * output: Following are the details that you have provided!!
 * Name: Jane
 * Position: Senior Java Developer
 * Age: 30
 * Salary: 10000
 * Permanent Contract: True
 */

import java.util.Scanner;

public class EmployeeDetail {

  public static void main(String[] args) {
        
        /**
        * logical_step_1: Create a new Scanner object to get the input from the user, where the user is an employee.
        * logical_step_details: Create a new Scanner object "empDetails". The purpose of Scanner object "empDetails" is storing the input of the user. Scanner class object helps to obtain the input of the primitive types like int, double, etc. and strings. A simple text scanner which can parse primitive types and strings uses regular expressions. The input are broken into tokens by a Scanner which uses a delimeter pattern that matrches whitespace by default. Then the tokens are converted into different types of values using the various next methods.
        * question_1: What is purpose of creating the Scanner object "empDetails"?
        * answer_1: The purpose of Scanner object "empDetails" is storing the input of the user.
        * question_2: What kinds of input does the Scanner class object helps to obtain from the user?
        * answer_2: Scanner class object helps to obtain the input of the primitive types like int, double, etc. and strings.
        * question_3: What is used to parse primitive types and strings by a simple text scanner?
        * answer_3: A simple text scanner which can parse primitive types and strings uses regular expressions.
        * question_4: Why and how does a Scanner breaks the input into tokens?
        * answer_4: The input are broken into tokens by a Scanner which uses a delimeter pattern that matrches whitespace by default. Then the tokens are converted into different types of values using the various next methods.
        */
    
        Scanner empDetails = new Scanner(System.in);

        /**
         * logical_step_2: Prompt the user to input their name, age, and salary.
         * logical_step_details: Prompt the user for input to get them to provide their name, position, age, and salary. "name" is a String. "position" is a String. age is an integer. salary is a double.
         * question_1: Why prompt the user for input?
         * answer_1: Prompt the user for input to get them to provide their name, position, age, and salary.
         * question_2: What type of variable is name?
         * answer_2: name is a String.
         * question_3: What type of variable is position?
         * answer_3: position is a String.
         * question_4: What type of variable is age?
         * answer_4: age is an integer.
         * question_5: What type of variable is salary?
         * answer_5: salary is a double.
        */

        System.out.println("Enter Name, Position, Age and Salary (per month)");
        
        /**
        * stm_comment: Integer, String and double variable are declared, which stores different types of input with the help of Scanner class object empDetails using the various next methods.
        * question_1: What next methods are used by a Scanner class object empDetails to read variable like integer, string and double?
        * answer_1: To read string nextLine() is used, for integer nextInt() and for double nextDouble() is used.
        */
        String name = empDetails.nextLine();    
        String position = empDetails.nextLine();
        int age = empDetails.nextInt();   
        double salary = empDetails.nextDouble();
        
        /**
         * logical_step_3: Prompt the user to input True or False for the given question
         * logical_step_details: Prompt the user to type in "True" or "False". bn is boolean which takes only True or False as input.
         * question_1: What type of variable is bn?
         * answer_1: bn is boolean which takes only True or False as input.
        */
    
        System.out.println("Are you permanent employee? (Please enter True or False)");
        
        /**
        * stm_comment: Boolean variable is declared, which stores boolean input with the help of Scanner class object empDetails using the nextBoolean().
        * question_1: What input is accepted by nextBoolean()?
        * answer_1: The input that is accepted by nextBoolean is either true or false.
        */
    
        boolean bn = empDetails.nextBoolean();
        
        /**
        * logical_step_4: Prints out the whole details that the employee has entered.
        * logical_step_details: The purpose for displaying the user inputs is to show them what they have entered for the various topics. The + operator is used here to concatenate or join the string and the different types of variables.
        * question_1: What is the purpose of displaying the user inputs?
        * answer_1: The purpose for displaying the user inputs is to show them what they have entered for the various topics.
        * question_2: Why + operator is used between string and the different types of variables?
        * answer_2: The + operator is used here to concatenate or join the string and the different types of variables.
        */
    
        System.out.println("Following are the details that you have provided!!");
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent Contract " + bn);
      }
}
