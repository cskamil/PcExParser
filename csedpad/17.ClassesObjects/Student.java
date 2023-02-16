/**
 * author: Lasang Tamang
 * topics: Objects
 * subtopics: Initializing an object, accessing getter and setter
 * goalDescription: Create a Student object, stores Student's name and mark inforamtion, and display those information.
 * source: N/A
 * output: 
 Student name : Zak
 Student Marks : 98.0
*/
public class Student {
    /**
     * logical_step_1: Declare the variables needed to store name and marks of student.
     * logical_step_details: Declares variables needed to store name and marks of student. The data type of naem is string and marks is float.
     * question_1: What does the following code block do?
     * answer_1: Declares variables needed to store name and marks of student.
     * question_2: What is the data type of name?
     * answer_2: String
     * question_3: What is the data type of marks?
     * answer_3: float
     */
    String name;
    float marks;

    /**
     * logical_step_2: Defines getter and setter methods.
     * logical_step_details: Defines getter and setter methods for each the class fileds.
     * question_1: What does the following methods do?
     * answer_1: Defines getter and setter methods.
    */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public float getMarks() {
        return this.marks;
    }

    public static void main(String[] args) {
        /**
         * logical_step_3: Create a Student object to hold name and marks inforamtion for student.
         * logical_step_details: Create student object to hold name and marks inforamtion for student. The name is set to Zak and the mark is set to 98.
         * question_1: What does the following code block do?
         * answer_1: Create a Student object to hold name and marks inforamtion for student.
         * question_2: What value is assigned to name?
         * answer_2: Zak
         * question_3: What value is assigned to marks?
         * answer_3: 98
        */
        /**
         * stm_comment: Creates an object named "student1" 
         * question_1: What does the next statement do?
         * answer_1: Creates an object named "student1" 
         */
        Student student1 = new Student();
        /**
         * stm_comment: Set name field of stuent1 object to zak 
         * question_1: What does the next statement do?
         * answer_1: Set name field of stuent1 object to zak 
         */
        student1.setName("Zak");
        /**
         * stm_comment: Set marks property of student object with setter method setMarks 
         * question_1: What does the next statement do?
         * answer_1: Set makrs field of stuent1 object to 98
         */
        student1.setMarks(98);
        /**
         * logical_step_4: Get the student object inforamtion and prints their value.
         * logical_step_details: Get the student object inforamtion and prints their value. Prints the value of student name as Zak. It also prints the value of student marks as 98.
         * question_1: What does the following code block do?
         * answer_1: Get the student object inforamtion and prints their value.
         * question_2: What is the printed value for name?
         * answer_2: Zak
         * question_3: What is the printed value for mark?
          * answer_3: 98
         */
        /**
         * stm_comment: Access the value of name feild of object student1.
         * question_1:  What does the next statement do??
         * answer_1: Access the value of name feild of object student1.
         */
        System.out.println("Student name : " + student1.getName());
        /**
         * stm_comment: Access the value of marks feild of object student1.
         * question_1:  What does the next statement do??
         * answer_1: Access the value of mark feild of object student1.
         */
        System.out.print("Student Marks : " + student1.getMarks());

    }
}
