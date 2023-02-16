/**
 * author: Hasan Mashrique
 * topic: Methods
 * subtopic: creating class object, method invoke/call using class object, storing data in  class variable using class objects.
 * goalDescription: The program will create a method that will show some information about a faculty on a campus. The program will declare a method that will print those information when invoked by a class object.The program will create object of the class, use that object to store data in the class variables declared, and call the method to show the faculty information by printing it. 
 * source:
 * output: anisur rahman
           male 
           901245698
 */

public class Faculty {

    /*
     * logical_step_1: Declare a method which displays faculty information of a university.
     * logical_step_details: Declare a class method which will show faculty information when invoked. The faculty information will be stored in the class variables by using class object instance. When the method is called using that object, it will print/display the faculty information (name, gender, number).
     * question_1: What does the following code block do?
     * answer_1: Declares a void method which displays faculty information stored in the class variables.
     * question_2: What does the method returns?
     * answer_2: The methods return type is void.
     * question_3: What are the parameters of the method ?
     * answer_3: The method has no parameters. It displays information stored in class variables.	
     * question_3: What are the variables declared?
     * answer_3: Two types of variables are declared. String variable name, gender, and integer variable number.   */

    String name, gender;
    int number;
        
    /*
     * stm_comment: Define a method 'displayInformation' that takes no parameters and returns no value. When it is run, it will print a string that contains the information of the faculty object it was called with.
     */
    void displayInformation() {
        System.out.println("Faculty name: " + name + '\n' + "Gender: " + gender + '\n' + "Phone Number: " + number);

    }

    public static void main(String[] args) {

    /*
     * logical_step_1: Declare an object of class Faculty, store faculty information in the variables using the class object.
     * logical_step_details: Declare a class object of class Faculty. Store faculty information using the object declared. Finally invoke the class method (using the object) displayInformation to show faculty information.
     * question_1: What does the following code block do?
     * answer_1: First, it declares an object of class Faculty. Then, it uses the object and stores the faculty information in the class variables. Finally it displays those information using the displayInformation method.
     * question_2: Why an object was created?
     * answer_2: In order to store faculty data in a variable an object of that class(Faculty) needs to be initialized. The same goes for using a method. The object is used to call/invoke the method.
     * question_3: Can we use another object to see the stored faculty information?
     * answer_3: No. In order to view the faculty information stored it needs to use the same object which was used to store the information. 	
     */

        Faculty anis = new Faculty();

        anis.name = "anisur rahman";
        anis.gender = "male";
        anis.number = 901245698;
        
        /*
         * stm_comment: Call the method displayInformation on the Faculty object 'anis'.
         */
        anis.displayInformation();

    }

}
