/**
 * author: Lasang Tamang
 * topics: Objects
 * subtopics: Initalizing an object, setter method, calling object's methods
 * goalDescription: This program checks if the current speed of car is the max speed of car or not.
 * source:https://www.w3schools.com/java/java_class_methods.asp
 * output: The car is at max speed
*/

public class Car {
    /**
     * logical_step_1: Declare variables currentSpeed and maxSpeed.
     * logical_step_details: Declare two variables currentSpeed and variable maxSpeed of float type for holding the current and max speed of the car.
     * question_1: What does the following code block do?
     * answer_1: Declares variables needed to store the current speed and max speed of the car.
     * question_2: What is data type for variable currentSpeed and maxSpeed?
     * answer_2: float.
     */
    private float currentSpeed;
    private float maxSpeed;

    /**
     * logical_step_2: Define setter methods for setting variables currentSpeed and maxSpeed.
     * logical_step_details: Define setter methods for setting variables currentSpeed and maxSpeed. setCurrentSpeed methods sets the value of currentSpeed. setMaxSpeed method sets value of variable maxSpeed.
     * question_1: What does the following code block do?
     * answer_1: The code blockd defines setter methods for setting variables currentSpeed and maxSpeed.
     * question_2: What does setCurrentSpeed do?
     * answer_2: Sets value of variable currentSpeed.
     * question_3: What does setMaxSpeed do?
     * answer_3: Sets value of variable maxSpeed.
     */
    public void setCurrentSpeed(float currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * logical_step_3: Declare the method checkSpeed to check if the currentSpeed is same as maxSpeed or not.
     * logical_step_details: Declare a method checkSpeed to check if the currentSpeed is equal to maxSpeed of car or not. If they are equal, it prints "The car is at max speed". Otherwise, it prints "The car is not at max speed".
     * question_1: What does the following code block do?
     * answer_1:  Declares the method checkSpeed to check if the currentSpeed is same as  maxSpeed or not. The car is at max speed"
     * question_2: What is printed if the currentSpeed and maxSpeed are equal??
     * answer_2: The car is at max speed.
     * question_3: What is printed if the currentSpeed and maxSpeed are not equal??
     * answer_3: The car is not at max speed.

    */
    public void checkSpeed() {
    if (this.currentSpeed == this.maxSpeed) {
        System.out.println("The car is at max speed");
    } else {
        System.out.println("The car is not at max speed");
    }
    }

    public static void main(String[] args) {
        /**
         * logical_step_4: Create an Object car by instantiating class Car. Set values for currentSpeed and  maxSpeed variables.
         * logical_step_details:  Instantiate an Object car and sets its variables values for currentSpeed and maxSpeed. The currentSpeed is set to value 60. The variable maxSpeed is set to value 100.
         * question_1: What does the following code block do?
         * answer_1: Creates Object car by instantiating class Car and sets values for currentSpeed and  maxSpeed variable.
         * question_2: What is the value of currentSpeed after calling setCurrentSpeed method?
         * answer_2: 60
         * question_3: What is the value of maxSpeed after calling setmaxSpeed method?
         * answer_3: 100
        */
        Car car = new Car();
        /**
         * stm_comment: This statement invokes the method setCurrentSpeed to set value of currentSpeed variables values to 60
         */
        car.setCurrentSpeed(60);
        car.setMaxSpeed(100);

        /*
         * logical_step_5: Call the method for checking if the currentSpeed is max speed of car or not.
         * logical_step_details:  Call the method for checking if the currentSpeed is max speed of car or not. The method prints the car is at max speed.
         * question_1: What does the following code block do?
         * answer_1:  Calls method for checking if the currentSpeed is max speed of car or not.
         * question_2: What is printed once the checkSpeed method is executed?
         * answer_2: The car is at max speed.
         */
        /**
         * stm_comment: calls the method checkSpeed of the car object.
         */
        car.checkSpeed();

    }
}

