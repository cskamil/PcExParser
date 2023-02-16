
/**
 * author: Nisrine Ait Khayi
 * topic: Preliminary topics (constants)
 * subtopic: Declaring double variables, declare variables as final.
 * goalDescription: Your system doesn't have a set value mathematical constant for Pi. Assign a value of Pi in your system and make sure it remains set.
 * source:
 * output: 3.1416
 */
public class Constant {

    public static void main(String args[]) {
    
    /*
    * logical_step_1: Declare a variable of type double. Use and assign a double value (i.e. pi value). Declare the variable as final.
    * logical_step_details: Declare a double variable PI and assign a value to it. Then print PI.
    * question_1: What does the following code block do?
    * answer_1: Declares a double variable and assigns a value to it.
    * question_2: Why is final used before variable declaration?
    * answer_2: final is a keyword/modifier that is used to fix the value. Trying to change the variable value will give an error. It is used for defining constant variable (like PI).
    */ 
     
    /*
    * stm_comment: We declare a double variable which stores the value of PI. We use the modifier final to store it since in Java constants are declared as final.
    * question_1: What is the displayed value?
    * answewr_1: the displayed value is 3.1416
    */
        final double PI = 3.1416;
    
          
        System.out.println(PI);
     

    }

}
