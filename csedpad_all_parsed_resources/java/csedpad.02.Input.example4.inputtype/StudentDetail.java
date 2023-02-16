/**
@goalDescription(This program collects various information about a student from the standard input device. The collected student information is then displayed on the screen.)
**/
import java.util.Scanner;

public class StudentDetail {

    public static void main(String[] args) 
    { 

//Create a new Scanner object to get the input from the user.
        Scanner stuDetails = new Scanner(System.in); 

//Prompt the user to input their name, faculty, gender, and mobileNo.
        System.out.println("Enter Name, Faculty, Gender and MobileNo");

/**@helpDescription(String, character and long integer variables are declared, which stores different types of input with the help of Scanner class object stuDetails using the various next methods. question_1: What next methods are used by a Scanner class object stuDetails to read variable like string, character and long integer? answer_1: To read string nextLine() is used, for character next().charAt(0) and for long integer nextLong() is used.)**/
        String name = stuDetails.nextLine();
        String faculty = stuDetails.nextLine(); 
        char gender = stuDetails.next().charAt(0); 
        long mobileNo = stuDetails.nextLong();  
//Prints out the whole details that the student has entered.
        System.out.println("Following are the details that you have provided:");
        System.out.println("Name: " + name); 
        System.out.println("Faculty: " + faculty); 
        System.out.println("Gender: " + gender);
        System.out.println("Mobile Number: " + mobileNo);  
    }
}
