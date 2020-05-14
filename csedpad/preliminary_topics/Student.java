/**
 * author: Nisrine Ait Khayi 
 * topics: Variables, Expressions,primitive data types
 * subtopics: declaring variables 
 * goalDescription: This program displays students' profiles within a university. 
 * output: 
 * Sarah 
 * Lee 
 * 24 
 * 3.5
 * 530 S Highland 
 * True
 */
public class Student {
  public static void main(String[] args) {

    /*
     * logical_step_1: Declare variables needed to store a student profile.
     * logical_step_details: Declare six variables with differnt types to store first name,last name,age,GPA,address and graduate status. 
     * question_1: What does the following code block do? 
     * answer_1: Displays the student's profile information.
     */

    String FirstName = "Sarah";
    /*
     * stm_comment: declare a string variable named FirstName, assign a value to it
     * and allocate memory for it
     */
    String LastName = "Lee";
    /*
     * stm_comment: declare a string variable named LastName, assign a value to it
     * and allocate memory for it
     */
    int Age = 24;
    /*
     * stm_comment: declare an integer variable named Age, assign a value to it and
     * allocate memory for it
     */
    double GPA = 3.5;
    /*
     * stm_comment: declare a double variable named GPA, assign a value to it and
     * allocate memory for it
     */
    String Address = "530 S Highland";
    /*
     * stm_comment: declare a string variable named Address, assign a value to it
     * and allocate memory for it
     */
    boolean Isgraduate = true;
    /*
     * stm_comment: declare a boolean variable named Isgraduate, assign a value to
     * it and allocate memory for it
     */

    System.out.println("First name is:" + FirstName);
    System.out.println("Last name is:" + LastName);
    System.out.println("Age is :" + Age);
    System.out.println("GPA is : " + GPA);
    System.out.println("Address: " + Address);
    System.out.println("Is he/she a graduate student?" + Isgraduate);
  }
}
