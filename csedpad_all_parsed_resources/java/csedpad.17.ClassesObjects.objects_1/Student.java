/**
@goalDescription(Create a Student object, stores Student's name and mark inforamtion, and display those information.)
**/
public class Student {
//Declare the variables needed to store name and marks of student.
    String name;
    float marks;
//Defines getter and setter methods.
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
//Create a Student object to hold name and marks inforamtion for student.
/**@helpDescription(Creates an object named "student1" question_1: What does the next statement do? answer_1: Creates an object named "student1")**/
        Student student1 = new Student();
/**@helpDescription(Set name field of stuent1 object to zak question_1: What does the next statement do? answer_1: Set name field of stuent1 object to zak)**/
        student1.setName("Zak");
/**@helpDescription(Set marks property of student object with setter method setMarks question_1: What does the next statement do? answer_1: Set makrs field of stuent1 object to 98)**/
        student1.setMarks(98);
//Get the student object inforamtion and prints their value.
/**@helpDescription(Access the value of name feild of object student1. question_1:  What does the next statement do?? answer_1: Access the value of name feild of object student1.)**/
        System.out.println("Student name : " + student1.getName());
/**@helpDescription(Access the value of marks feild of object student1. question_1:  What does the next statement do?? answer_1: Access the value of mark feild of object student1.)**/
        System.out.print("Student Marks : " + student1.getMarks());
    }
}
