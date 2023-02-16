/**
@goalDescription(This program checks if the current speed of car is the max speed of car or not.)
**/
public class Car {
//Declare variables currentSpeed and maxSpeed.
    private float currentSpeed;
    private float maxSpeed;
//Define setter methods for setting variables currentSpeed and maxSpeed.
    public void setCurrentSpeed(float currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

//Declare the method checkSpeed to check if the currentSpeed is same as maxSpeed or not.
    public void checkSpeed() {
    if (this.currentSpeed == this.maxSpeed) {
        System.out.println("The car is at max speed");
    } else {
        System.out.println("The car is not at max speed");
    }
    }
    public static void main(String[] args) {
//Create an Object car by instantiating class Car. Set values for currentSpeed and  maxSpeed variables.
        Car car = new Car();
/**@helpDescription(This statement invokes the method setCurrentSpeed to set value of currentSpeed variables values to 60)**/
        car.setCurrentSpeed(60);
        car.setMaxSpeed(100);
//Call the method for checking if the currentSpeed is max speed of car or not.
/**@helpDescription(calls the method checkSpeed of the car object.)**/
        car.checkSpeed();
    }
}

