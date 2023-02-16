/**
 * author: Zeyad 
 * topics: Inheritance
 * subtopics: Using Inheritance, method Override
 * goalDescription: Demonstrate the inheritance concept by creating a superclass Bicycle with two public integer variable gear and speed, and the toString function.
 * Then create subclass MountainBike that extends the Bicycle with public integer variable seatHeight and Override toString function.
 * source: https://www.geeksforgeeks.org/inheritance-in-java/
 * input: N/A
 * output: Number of gears are 3
 * speed of bicycle is 100
 * seat height is 25
*/


class Bicycle
{

  /*
     * logical_step_1: Declare two public integer variables called gear and speed.
     * logical_step_details: First, declare public integer variable gear. Next, declare a public integer variable speed.
     * question_1: What does the following code block do?
     * answer_1: First, it declares a public integer variable gear. Next, it declares a public integer variable speed.
     * question_2: What variable are declared?
     * answer_2: Public integer gear and speed.
     * question_3: What is the scope of the public variable?
     * answer_3: The scope of the public variable is anywhere.
   */

  
  public int gear;
  
  public int speed;

  /*
     * logical_step_2: Declare a parameterized constructor for class Bicycle.
     * logical_step_details: Declare a parameterized constructor that receives two integer parameters gear and speed. Assign the variables' value to the correspoding variable.
     * question_1: What does the following code block do?
     * answer_1: Declares a parameterized constructor that receives two integer parameters gear and speed. Then it assigns the variables' value to the corresponding variable.
     * question_2: What is the number and type of arguments the constructor accepts?
     * answer_2: The constructor accepts two integer parameters.
   */
  public Bicycle (int gear, int speed)
  {
    
    this.gear = gear;
    
    this.speed = speed;
  }

  /*
     * logical_step_3: Declare a function that returns a well-formatted String.
     * logical_step_details: Declare a function the returns a formatted String. This String should contain "Number of gears are the value of gear variable", and in new line "Speed of bicycle is the value of speed variable".
     * question_1: What does the following code block do?
     * answer_1: Declare a function the return a formated String that contains "Number of gears are the value of gear variable" and in new line "Speed of bicycle is the value of speed variable".
     * question_2: What is the return value of this function?
     * answer_2: "Number of gears are the value of gear variable", and in new line "speed of bicycle is the value of speed variable".
   */
  public String toString ()
  {
    
    return ("Number of gears are " + gear
	    + "\n" + "speed of bicycle is " + speed);
  }
}

/*
* logical_step_4: Declare a subclass name MountainBike that inherits from Bicycle.
* logical_step_details: The MountainBike extends the Bicycle class to inherite its variables and functions.
* question_1: What does the following code block do?
* answer_1: Declares a subclass name MountainBike that inherits from Bicycle.
* question_2: What does class MountainBike inherit from Bicycle?
* answer_2: The class MountainBike inherits the variables gear and speed, and all functions from Bicycle.
*/

class MountainBike extends Bicycle
{

  /*
     * logical_step_5: Declare a public integer variable called seatHeight.
     * logical_step_details: Declare a public integer variable seatHeight.
     * question_1: What does the following code block do?
     * answer_1: Declares a public integer variable seatHeight.
     * question_2: What are the variable that MountainBike has access to?
     * answer_2: gear, speed, and seatHeight.
   */

  
  public int seatHeight;

  /*
     * logical_step_6: Declare a parameterized constructor for class MountainBike.
     * logical_step_details: Declare a parameterized constructor that receives three integer parameters: gear, speed, and seatHeight. Then call the constructor of Bicycle using the keyword super and assign the value of seatHeight to the variable seatHeight.
     * question_1: What does the following code block do?
     * answer_1: Declares a parameterized constructor that receives three integer parameters: gear, speed, and seatHeight. Then it calls the constructor of Bicycle using the keyword super and assigns the vale of seatHeight to the variable seatHeight.
     * question_2: What is the number and type of arguments the constructor accepts?
     * answer_2: The constructor accepts three integer parameters.
   */
  public MountainBike (int gear, int speed, int seatHeight)
  {
    /**
    * stmt_comment:  invoking base-class(Bicycle) constructor 
    * question_1: What is the goal of using the keyword super?
    * answer_1: The goal of using the keyword super is to call the constructor of the super class 
    */
    super (gear, speed);
    
    this.seatHeight = seatHeight;
  }

  /*
     * logical_step_7: Declare an Override function to the toString function in Bicycle class.
     * logical_step_details: Declare a function the returns a formated String. This String should contain a string from the toString function in Bicycle class, and in a new line "seat height is the value of seatHeight variable".
     * question_1: What does the following code block do?
     * answer_1: Declares a function the returns a formated string that contains a string from the toString function in Bicycle class, and in a new line "seat height is the value of seatHeight variable".
     * question_2: What is the return value of this function?
     * answer_2: "Number of gears are the value of gear variable", in new line "speed of bicycle is the value of speed variable", then in new line "seat height is the value of seatHeight".
   */
   @Override public String toString ()
  {
    /**
    * stmt_comment: return the following string: "Number of gears are the value of gear variable", in new line "speed of bicycle is the value of speed variable" then in new line "seat height is the value of seatHeight" 
    * question_1: What is the goal of using the keyword super?
    * answer_1: The goal of using the keyword super is to call the toString function of the super class 
    */
    return (super.toString () + "\nseat height is " + seatHeight);
  }

}


public class InheritanceExample1
{
  public static void main (String args[])
  {

    /*
       * logical_step_1: Declare an object mb from the class MountainBike and initialize it by calling the constructor with 3, 100, and 25 as parameters. Then print the returned value from calling the toString function.
       * logical_step_details: Declare an object mb from the class MountainBike and initialize it by calling the constructor with 3, 100, and 25 as parameters. Then print the returned value from calling the toString function.
       * question_1: What does the following code block do?
       * answer_1: It declares an object mb from the class MountainBike and prints the returned value from calling the toString function.
       * question_2: What are the values of gear, speed, and seatHeight?
       * answer_2: 3, 100, and 25.
       * question_3: What is the output of the following block?
       * answer_3: Number of gears are 3
       * speed of bicycle is 100
       * seat height is 25
     */

    /**
    * stmt_comment: Declare an object mb from the class MountainBike and initialize it with the following values 3,100, and 25
    * qeustion_1: What class constructor will be called by using new MountainBike?
    * answer_1: The constructor of class MountainBike will be called and it will call the constructor of the super class
    * question_2: What attribute will be set by the MountainBike class?
    * answer_2: The setHight attribute will set by the MountainBike class
    * question_3: What attributes will be set by the Bicycle class?
    * answer_3: The gear and speed attributes will be set by the Bicycle class
    */
    MountainBike mb = new MountainBike (3, 100, 25);
    /**
    * stmt_comment: Print the returned value from toString function in MountainBike class
    * question_1: What toString function will be invoked by calling mb.toString 
    * answer_1: The funciton in MountainBike will be invoked
    * question_2: How the function toString print the attributes gear and speed?
    * answer_2: The function toString in class MountainBike uses the super keword to call toString function from class Bicycle
    */
      System.out.println (mb.toString ());

  }
}
