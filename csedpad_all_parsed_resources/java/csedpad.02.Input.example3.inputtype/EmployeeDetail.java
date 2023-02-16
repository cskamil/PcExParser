/**
@goalDescription(This program collects various information about an employee from the standard input device. The collected employee information is then displayed on the screen.)
**/
import java.util.Scanner;

public class EmployeeDetail {

  public static void main(String[] args) {
        
//Create a new Scanner object to get the input from the user, where the user is an employee.
        Scanner empDetails = new Scanner(System.in);

//Prompt the user to input their name, age, and salary.
        System.out.println("Enter Name, Position, Age and Salary (per month)");
        
/**@helpDescription(Integer, String and double variable are declared, which stores different types of input with the help of Scanner class object empDetails using the various next methods. question_1: What next methods are used by a Scanner class object empDetails to read variable like integer, string and double? answer_1: To read string nextLine() is used, for integer nextInt() and for double nextDouble() is used.)**/
        String name = empDetails.nextLine();    
        String position = empDetails.nextLine();
        int age = empDetails.nextInt();   
        double salary = empDetails.nextDouble();
//Prompt the user to input True or False for the given question
        System.out.println("Are you permanent employee? (Please enter True or False)");
        
/**@helpDescription(Boolean variable is declared, which stores boolean input with the help of Scanner class object empDetails using the nextBoolean(). question_1: What input is accepted by nextBoolean()? answer_1: The input that is accepted by nextBoolean is either true or false.)**/
        boolean bn = empDetails.nextBoolean();
        
//Prints out the whole details that the employee has entered.
        System.out.println("Following are the details that you have provided!!");
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent Contract " + bn);
      }
}
