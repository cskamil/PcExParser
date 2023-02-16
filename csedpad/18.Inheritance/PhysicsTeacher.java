/**
 * author: Zeyad
 * topics: Inheritance
 * subtopics: Using Inheritance
 * goalDescription: Demonstrate the inheritance concept by creating a superclass Teacher with private string variables designation and collegeName, and a does function.
 * Then create subclass PhysicsTeacher that extends the Teacher with private String variable mainSubject.
 * source: https://beginnersbook.com/2013/03/inheritance-in-java/
 * input: N/A
 * output: Beginnersbook
 * Teacher
 * Scince
 * Teaching
*/
/**

public class Teacher {
  /*
     * logical_step_1: Declare two private String variables called designation and collegeName. Initialize them to Teacher and Beginnersbook. Declare a function does that prints "Teaching".
     * logical_step_details: First, declare private two private String variables called designation and collegeName. Initialize them to Teacher and Beginnersbook. Then declare a function name does that prints "Teaching".
     * question_1: What does the following code block do?
     * answer_1: First, it declares two private String variables called designation and collegeName. Then it initializes them to Teacher and Beginnersbook. After this, it declares a function name does that prints "Teaching".
     * question_2: What variables are declared?
     * answer_2: private String designation and collegeName.
     * question_3: What is the scope of the private variable?
     * answer_3: The variable scope is the class Teacher.
     * question_4: What does the function "does" do?
     * answer_4: Prints "Teaching".
   */
 
   String designation = "Teacher";
  
   String collegeName = "Beginnersbook";
   
   void does(){
	    System.out.println("Teaching");
   }
}
 
/*
* logical_step_2: Declare a subclass name PhysicsTeacher that inherits from Teacher.
* logical_step_details: Declare a PhysicsTeacher class that extends the Teacher class to inherite its variables and functions.
* question_1: What does the following code block do?
* answer_1: Declares a PhysicsTeacher class that extends the Teacher class to inherite its variable and functions.
* question_2: What does class PhysicsTeacher inherited from Teacher?
* answer_2: The class PhysicsTeacher inherited the variable designation and collegeName, and the function does from the Teacher class.
*/

public class PhysicsTeacher extends Teacher{

  
   String mainSubject = "Physics";

   public static void main(String args[]){

     /*
        * logical_step_3: Declare an object name obj and use it to print collegeName, designation, mainSubject, and to call the function does.
        * logical_step_details: Declare an object name obj and use it to print collegeName, designation, mainSubject, and to call the function does.
        * question_1: What does the following code block do?
        * answer_1: Declares an object name obj and uses it to print collegeName, designation, mainSubject, and to call the function does.
        * question_2: In what class is the function does is located?
        * answer_2: In the is Teacher class.
        * question_3: In what class the variable collegeName, designation, and mainSubject is located?
        * answer_3: collegeName and designation are declared on Teacher class. mainSubject is declared in PhysicsTeacher class.
        * question_3: What is the return value of the function does?
        * answer_3: Teaching.
      */
      /**
      * stmt_comment: declare an object name obj from the class PhysicsTeacher
      * question_1: What constructor will be called for the statment new PhysicsTeacher()?
      * answer_1: The default constructor of the class PhysicsTeacher will be called
      * question_2: Will the constructor of the super class Teacher be called for the statment new PhysicsTeacher()?
      * answer_2: The default constructor of the sueper class will be called from the constructor of class PhysicsTeacher 
      */
	    PhysicsTeacher obj = new PhysicsTeacher();

      /**
      * stmt_comment:  Display the value of the collegeName attribute from the Teacher class 
      * question_1: How the object obj is able to access the attribute collegeName in Teacher class?
      * answer_1: Because the PhysicsTeacher class extended the Teacher class and has access to its attribute and functions
      */
	    System.out.println(obj.collegeName);
      /**
      * stmt_comment:  Display the value of the designation attribute from the Teacher class
      * question_1: How the object obj is able to access the attribute designation in Teacher class?
      * answer_1: Because the PhysicsTeacher class extended the Teacher class and has access to its attribute and functions
      */
	    System.out.println(obj.designation);
     
	    System.out.println(obj.mainSubject);
      /**
      * stmt_comment: call the function does from Teacher class 
      * question_1: How the object obj is able to access the function does in Teacher class?
      * answer_1: Because the PhysicsTeacher class extended the Teacher class and has access to its attribute and functions
      */
	    obj.does();
   }
}
