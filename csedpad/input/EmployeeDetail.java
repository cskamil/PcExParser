/**
 * author: Suraj Maharjan
 * topics: Input Type
 * subtopics: string, integer, double, boolean
 * goalDescription: This program takes user inputs where there are
 * different input types, as it collects details of the employee.
 * output: Prints the user inputs
 */

/**
 *  stm_comment: import Scanner java library to get the user inputs
 */
import java.util.Scanner;
public class EmployeeDetail {

      public static void main(String[] args) {

            /**
             * logical_step_1: Create a new Scanner object to get the input from the user, where user is an employee
             * logical_step_details: Creating a new Scaaner object "empDetails" which will extend the methods of Scanner and here we use this Scanner object to store the input * of the user to a variable
             * question_1: What is purpose creating the object "empDetails" of Scanner?
             * answer_1: empDetails will help in getting the user inputs
             */

            /**
             * stm_comment: Create new object "empDetails" of Scanner
             */
            Scanner empDetails = new Scanner(System.in);

            /**
             * logical_step_2: Prompt user to input their name, age and salary
             * logical_step_details: Prompts or asks user to type in their name, age, and salary, here the name can only be string, and for age is integer variable and for salary it take the type double
             * question_2: Why prompt user for input?
             * answer_2: To get the user inputs to provide in their name, age and salary
             * question_3: What type of variable is name?
             * answer_3: name is a String
             * question_4: What type of variable is position?
             * answer_4: position is a String
             * question_5: What type of variable is age?
             * answer_5: age is an integer
             * question_6: What type of variable is salary?
             * answer_6: salary is a double
             */

            /**
             * stm_comment: Prompt user for inputs
             */
            System.out.println("Enter Name, Position, Age and Salary");

            /**
             * stm_comment: get user input for name
             */
            String name = empDetails.nextLine();

            /**
             * stm_comment: get user input for position
             */
            String position = empDetails.nextLine();

            /**
             * stm_comment: get user input for age
             */
            int age = empDetails.nextInt();

            /**
             * stm_comment: get user input for salary
             */
            double salary = empDetails.nextDouble();

            /**
             * logical_step_3: Prompt user to input True or False for the given question
             * logical_step_details: Prompts or asks user to type in "True" or "False" and it takes input from user either "True" or "False" nothing other than that as it is store on the variable which is boolean
             * question_7: What type of variable is bn?
             * answer_7: bn is boolean which takes only true or false as input
             */

            /**
             * stm_comment: Prompt user for their contract and ask to enter either "True" or "False"
             */
            System.out.println("Are you permanent employee? (True or False)");

            /**
             * stm_comment: get user input for bn
             */
            boolean bn = empDetails.nextBoolean();

            System.out.println("Following are the details that you have provided!!");
            System.out.println("Name: " + name);
            System.out.println("Position: " + position);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Permanent Contract " + bn);
      }
}
