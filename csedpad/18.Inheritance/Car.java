/**
 * author: Zeyad
 * topics: Inheritance
 * subtopics: Using Inheritance
 * goalDescription: This program create a car object which is a sub-class from Vehicle class that inherits public String feature modelName by using the default constructor.
 * Then it call the honk and print function.This program demonstrates how to use inheritance and function overwrite.
 * source: https://www.w3schools.com/java/java_inheritance.asp
 * input: N/A
 * output: Tuut, tuut!
 * Ford Mustang
*/

class Vehicle {
  /*
     * logical_step_1: Declare a protected String variable called brand and initialize it to Ford.
     * logical_step_details: Declare a protected String variable called brand and initialize it to Ford.
     * question_1: What does the following code block do?
     * answer_1: Declares a protected String variable called brand and initializes it to Ford.
     * question_2: What variable is declared?
     * answer_2: protected String brand.
     * question_3: What is the scope of the protected feature?
     * answer_3: subclasses in other package or any class within the package of the protected members' class.
   */
   
  protected String brand = "Ford";
  /*
     * logical_step_2: Declare a public function name honk that prints "Tuut, tuut!".
     * logical_step_details: Declare a public function name honk that prints "Tuut, tuut!".
     * question_1: What does the following code block do?
     * answer_1: Declare a public function name honk that prints "Tuut, tuut!".
     * question_2: What does this function do?
     * answer_2: the function prints "Tuut, tuut!".
   */
   
  public void honk() {
    
    System.out.println("Tuut, tuut!");
  }
}

/*
* logical_step_3: Declare a subclass name Car inherits from Vehicle.
* logical_step_details: Declare a Car class that extends the Vehicle class to inherite the variable and functions contained in the Vehicle class.
* question_1: What does the following code block do?
* answer_1: Declares a Car class that extends the Vehicle class to inherite the variable and functions.
* question_2: What does class Car inherited from Vehicle?
* answer_2: The class Car inherited the variable brand and the method honk from Vehicle.
*/

class Car extends Vehicle {
  /*
     * logical_step_4: Declare a private String variable called modelName and initialize it to Mustang.
     * logical_step_details: Declare a private String variable called modelName and initialize it to Mustang.
     * question_1: What does the following code block do?
     * answer_1: Declares private String variable called modelName and initializes it to Mustang.
     * question_2: What variable are declared?
     * answer_2: private String modelName.
     * question_3: What is the scope of the private feature?
     * answer_3: the scope is Car class only.
   */
  
  private String modelName = "Mustang";

  public static void main(String[] args) {

    /*
       * logical_step_5: Declare an object named MyCar and use it to call the function honk. Finally, print the brand and modelName.
       * logical_step_details: First, declare an object name myCar by calling the default Constructer of class Car. Then call the function honk by using the myCar object. Finally, print the variable brand and modelName using myCar object.
       * question_1: What does the following code block do?
       * answer_1: First, it declares an object name myCar by calling the default Constructer of class Car. Then it calls the function honk by using myCar object. Finally, it prints the variable brand and modelName using myCar object.
       * question_2: In what class the function honk is located?
       * answer_2: Vehicle class.
       * question_3: In what class the variable brand and modelName is located?
       * answer_3: the brand feature is declared in Vehicle class and modelName is declared in Car class.
     */

    /**
    * stmt_comment: declare an object of type Car name myCar 
    * question_1: What are the attribute of the object MyCar?
    * answer_1: the atribute are brand and modelName
    * Question_2: What constructor will be called for the object MyCar
    * answer_2: The default constructor of the class Car
    */
    Car myCar = new Car();

      /**
      * stmt_comment: call the function honk from Vehicle class by using myCar object 
      * question_1: Why myCar object which is an object of Car class is allow to call the function honk that is a function of Vehicle class?
      * answer_1: Because the Car class is extended the vehicle class and has access to its attribute and functions
      * question_2: What does the function honk do?
      * answer_2: the funciton print "Tuut, tuut!"
      */
    myCar.honk();

    /**
    * stmt_comment:  Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class 
    * question_1: What is the value of the attribute brand?
    * answer_1: the value is Ford
    * question_2: What is the value of the attribute modelName?
    * answer_2: The value of the attribute modelName is Mustang
    * question_3: How the object myCar is able to access the attribute brand in Vehicle class?
    * answer_3: Because the Car class is extended the vehicle class and has access to its attribute and functions
    */
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
