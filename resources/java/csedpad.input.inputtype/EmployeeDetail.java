/**
@goalDescription(This program takes user inputs where there are different input types, as it collects details of the employee.)
**/
/**@helpDescription(import Scanner java library to get the user inputs)**/
import java.util.Scanner;
public class EmployeeDetail {
      public static void main(String[] args) {

//Create a new Scanner object to get the input from the user, where user is an employee
/**@helpDescription(Create new object "empDetails" of Scanner)**/
            Scanner empDetails = new Scanner(System.in);
//Prompt user to input their name, age and salary
/**@helpDescription(Prompt user for inputs)**/
            System.out.println("Enter Name, Position, Age and Salary");
/**@helpDescription(get user input for name)**/
            String name = empDetails.nextLine();
/**@helpDescription(get user input for position)**/
            String position = empDetails.nextLine();
/**@helpDescription(get user input for age)**/
            int age = empDetails.nextInt();
/**@helpDescription(get user input for salary)**/
            double salary = empDetails.nextDouble();
//Prompt user to input True or False for the given question
/**@helpDescription(Prompt user for their contract and ask to enter either "True" or "False")**/
            System.out.println("Are you permanent employee? (True or False)");
/**@helpDescription(get user input for bn)**/
            boolean bn = empDetails.nextBoolean();
/**@helpDescription(Prints the message for the user)**/
            System.out.println("Following are the details that you have provided!!");
/**@helpDescription(Print the user input for name)**/
            System.out.println("Name: " + name);
/**@helpDescription(Print the user input for age)**/
            System.out.println("Position: " + position);
/**@helpDescription(Print the user input for age)**/
            System.out.println("Age: " + age);
/**@helpDescription(Print the user input for salary)**/
            System.out.println("Salary: " + salary);
/**@helpDescription(Print the user input for bn)**/
            System.out.println("Permanent Contract " + bn);
      }
}
