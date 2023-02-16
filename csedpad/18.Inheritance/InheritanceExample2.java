/**
 * author: Zeyad Alshaikh
 * topics: Inheritance
 * subtopics: Using Inheritance
 * goalDescription: This program create a cat object which is a sub-class from Animal class that inherits function eat and create a function mewo to simulate the sound of a cat.
 * Then it call the eat and mewo function.This program demonstrates how to use inheritance.
 * source: https://www.javatpoint.com/inheritance-in-java
 * input: N/A
 * output: meowing...
 * eating...
*/


class Animal
{

  /*
     * logical_step_1: Declare a function name eat.
     * logical_step_details: Declare a function name eat that prints "eating..." to the console.
     * question_1: What does the following code block do?
     * answer_1: Prints "eating..." to the console
   */
  void eat() {
    System.out.println ("eating...");
  }
}

/*
* logical_step_2: Declare a subclass name Cat that is inherited from Animal.
* logical_step_details: The Cat class extends the Animal class to inherit the features and functions contained in the Animal class.
* question_1: What does the following code block do?
* answer_1: Declares a subclass name Cat that is inherited from Animal.
* question_2: What does class Cat inherit from Animal?
* answer_2: The function eat.
*/

class Cat extends Animal
{

  /*
     * logical_step_3: Declare a function that prints "meowing...."
     * logical_step_details: Declare a function name meow that prints "meowing..." to the console.
     * question_1: What does the following code block do?
     * answer_1: It prints "meowing..." to the console.
   */
  void meow ()
  {
    
    System.out.println ("meowing...");
  }
}

class InheritanceExample2
{
  public static void main (String args[])
  {

    /*
       * logical_step_4: Declare an object c from the class Cat and initialize it by calling the default constructor. Then call the meow and eat functions.
       * logical_step_details: Declare an object c from the class Cat and initialize it by calling the default constructor.
       * question_1: What does the following code block do?
       * answer_1: Creates an object from the class Cat and calls the meow and eat function.
       * question_2: What is the output of the following block?
       * answer_2: meowing...
       eating...
     */

    /**
    * stmt_comment: Declare an object c from the class Cat 
    * question_1: What constructor will be called for the statment new Cat()?
    * answer_1: The default constructor of the class Cat
    * question_2: Will the constructor of the super class Animal be called for the statment new Cat()?
    * answer_2: The default constructor of the sueper class will be called from the constructor of class Cat
    */
    Cat c = new Cat ();
    
      c.meow ();
    /** 
    * stmt_comment: Call the function eat from the class Animal 
    * question_1:  Why the c object which is an object of Cat class is allow to call the function eat that is a function of Animal class?
    * answer_1: Because the Cat class extended the Anmial class and has access to its attribute and functions
    */
      c.eat ();

  }
}
