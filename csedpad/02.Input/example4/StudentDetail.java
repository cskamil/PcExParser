/**
* author: Suraj Maharjan
* topics: Input Type
* subtopics: string, character, long
* goalDescription: This program collects various information about a student from the standard input device. The collected student information is then displayed on the screen.
* input: [ Jane Doe, Computer Science, Female, 9016012456 ]
* output: Following are the details that you have provided:
* Name: Jane Doe
* Faculty: Computer Science
* Gender: Female
* Mobile Number: 9016012456  
*/

import java.util.Scanner;

public class StudentDetail {

    public static void main(String[] args) 
    { 

        /**
        * logical_step_1: Create a new Scanner object to get the input from the user.
        * logical_step_details: The purpose of Scanner object "stuDetails" is storing the input of the user. Scanner class object helps to obtain the input of the primitive types like int, double, etc. and strings. A simple text scanner which can parse primitive types and strings uses regular expressions. The input are broken into tokens by a Scanner which uses a delimeter pattern that matrches whitespace by default. Then the tokens are converted into different types of values using the various next methods.
        * question_1: What is the purpose of creating the Scanner object "stuDetails"?
        * answer_1: The purpose of Scanner object "stuDetails" is storing the input of the user.
        * question_2: What kinds of input does the Scanner class object helps to obtain from the user?
        * answer_2: Scanner class object helps to obtain the input of the primitive types like int, double, etc. and strings.
        * question_3: What is used to parse primitive types and strings by a simple text scanner?
        * answer_3: A simple text scanner which can parse primitive types and strings uses regular expressions.
        * question_4: Why and how does a Scanner breaks the input into tokens?
        * answer_4: The input are broken into tokens by a Scanner which uses a delimeter pattern that matrches whitespace by default. Then the tokens are converted into different types of values using the various next methods.
        */
        
        Scanner stuDetails = new Scanner(System.in); 

        /**
        * logical_step_2: Prompt the user to input their name, faculty, gender, and mobileNo.
        * logical_step_details: To get the user to provide in their name, faculty, gender, and mobileNo. name is a String. faculty is a String. gender is a character. gender is a character. mobileNo is a long.
        * question_1: Why prompt the user for input?
        * answer_1: To get the user to provide in their name, faculty, gender, and mobileNo.
        * question_2: What type of variable is name?
        * answer_2: name is a String.
        * question_3: What type of variable is faculty?
        * answer_3: faculty is a String.
        * question_4: What type of variable is gender?
        * answer_4: gender is a character.
        * question_5: What type of variable is mobileNo?
        * answer_5:  mobileNo is a long.
        */

        System.out.println("Enter Name, Faculty, Gender and MobileNo");

        /**
        * stm_comment: String, character and long integer variables are declared, which stores different types of input with the help of Scanner class object stuDetails using the various next methods.
        * question_1: What next methods are used by a Scanner class object stuDetails to read variable like string, character and long integer?
        * answer_1: To read string nextLine() is used, for character next().charAt(0) and for long integer nextLong() is used. 
        */
        String name = stuDetails.nextLine();
        String faculty = stuDetails.nextLine(); 
        char gender = stuDetails.next().charAt(0); 
        long mobileNo = stuDetails.nextLong();  
        
        /**
        * logical_step_3: Prints out the whole details that the student has entered.
        * logical_step_details: The purpose for displaying the user inputs is to show them what they have entered for the various topics. The + operator is used here to concatenate or join the string and the different types of variables.
        * question_1: What is the purpose of displaying the user inputs?
        * answer_1: The purpose for displaying the user inputs is to show them what they have entered for the various topics.
        * question_2: Why + operator is used between string and the different types of variables?
        * answer_2: The + operator is used here to concatenate or join the string and the different types of variables.
        */       
        System.out.println("Following are the details that you have provided:");
        System.out.println("Name: " + name); 
        System.out.println("Faculty: " + faculty); 
        System.out.println("Gender: " + gender);
        System.out.println("Mobile Number: " + mobileNo);  
    }
}
