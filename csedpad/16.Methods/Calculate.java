    /**
     * author: Hasan Mashrique
     * topic: Methods
     * subtopic: creating class objects, storing result in a variable, printing variable.
     * goalDescription: You are given a side of a cube. By using methods in Java, you have to calculate the volume of the cube.
     * source:
     * output: 125
     */    


    class Calculate{  
        
    /*
     * logical_step_1: Call the method cube to calculate the volume of a cube from its given side. Then print the result to the console.
     * logical_step_details: Call the method cube and assign it to a variable (result) which will store its result. Then print the variable to the consolenb
     * question_1: What does the following code block do?
     * answer_1: It declares a static method cube to calculate the volume of a cube.
     * question_2: What is the return value of the method?
     * answer_2: The return value type is integer.
     * question_3: What does keyword static means before a method name?
     * answer_3: Static means it doesn't require a class object to call the method.	
     */      

        /*
         * stm_comment: Create a method called Cube that returns an integer and takes an integer x as a parameter.
         */
        static int cube(int x){

            /*
             * stm_comment: Return the value of x^3.
             */
            return x*x*x;  
        }  

    /*
     * logical_step_1: Call the method cube to calculate the volume of a cube from its given side. Then print the result in the console.
     * logical_step_details: Call the method cube and assign it to a variable (result) which will store its result. Then print the variable.
     * question_1: What does the following code block do?
     * answer_1: It calculates the output of the method cube() , stores in a variable (result) and finally prints it.
     * question_2: What variables are declared?
     * answer_2: An integer 'result' is declared to store the result returned by the method cube().
     * question_3: What objects are declared to call the method?
     * answer_3: Since its a static method, it doesn't require a class object to call the method cube().	
     */   

        public static void main(String args[]){  
        
            /*
             * stm_comment: Call the method 'cube' with the parameter x = 5. Store the returned value in a variable called 'result'.
             */
            int result = Calculate.cube(5);  

            System.out.println(result);  
        } 
    }  