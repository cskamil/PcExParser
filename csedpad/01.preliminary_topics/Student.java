/**
 * author: Nisrine Ait Khayi 
 * topics: Variables, Expressions,primitive data types
 * subtopics: declaring variables 
 * goalDescription: This program displays a student' s profile within a university. 
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
     * logical_step_1: Declare the variables needed to store a student profile.
     * logical_step_details: Declare six variables of appropriate types to store the following: first name, last name, age, GPA, address, and graduate status. 
     * question_1: What does the following code block do? 
     * answer_1: Declare the initial profile of the student.
     * question_2: What is the type and initial value of the variable firstName?
     * answer_2: Variable firstName is of type string and it is initialized to value Sarah.
     * question_3: What is the type and initial value of the variable age?
     * answer_3: Variable age  is of type integer and it is initialized to value 24.
     * question_4: What is the type and initial value of the variable GPA?
     * answer_4: Variable age  is of type double and it is initialized to value 3.5.
     * question_5: What is the type and initial value of the variable isGraduate?
     * answer_5: Variable age  is of type boolean and it is initialized to value true.
     */

    String firstName = "Sarah";    
    String lastName = "Lee";  
    int age = 24; 
    double GPA = 3.5;    
    String address = "530 S Highland";   
    boolean isGraduate = true;
   
    /*
     * stm_comment: The following block displays the profile of the student
     * question_1: what is the displayed value of firstName variable?
     * answer_1: "Sarah"
     * question_2: what is the displayed value of lastName variable?
     * answer2: "Lee"
     * question_3: what is the displayed value of age variable?
     * answer2: 24
     * question_4: what is the displayed value of GPA variable?
     * answer4: 3.5
     * question_5: what is the displayed value of address variable?
     * answer5: "530 S Highland"
     * question_6: what is the displayed value of  isGraduate variable?
     * answer6: true
     */

    System.out.println("First name is:" + firstName);
    System.out.println("Last name is:" + lastName);
    System.out.println("Age is :" + Age);
    System.out.println("GPA is : " + GPA);
    System.out.println("Address: " + address);
    System.out.println("Is he/she a graduate student?" + isGraduate);
  }
}
