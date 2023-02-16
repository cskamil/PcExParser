

/**
 * author: Hasan Mashrique
 * topic: Methods
 * subtopic: Defining static methods, calling static methods.
 * goalDescription: Calculate the area of a circle given its radius.
 * source:
 * output: 31.40
 */    


    class CircleArea{  
        
        /*
         * logical_step_1: Define a method that will take the radius of a circle as parameter, and calculate its area.
         * logical_step_details: Declare a method circleArea(). It will take the radius as input, calculate the area, and return the result.
         * question_1: What does the following code block do?
         * answer_1: It declares a static method circleArea to calculate the area of a circle.
         * question_2: Why is the return value of the method double?
         * answer_2: Because the area will be  a double value, it needs a double variable to store the area value.
         * question_3: What does keyword static means before a method name?
         * answer_3: Static means it doesn't require a class object to call the method.	
         */      
    
            /*
             * stm_comment: Create a method called circleArea that returns a double and takes an integer r as a parameter.
             */
            static double circleArea(int r){  

            double area = 2 * 3.14 * r; 
            
            /*
             * stm_comment: Return the value held in the variable 'area'.
             */
            return area;  
            
        }  
    
        /*
         * logical_step_1: Call the method circleArea to calculate the area of a circle from its given radius. Print the result in the console.
         * logical_step_details: Call the method circleArea and assign it to a variable (result) which will store its result. Then print the variable.
         * question_1: What does the following code block do?
         * answer_1: It calculates the output of the method circleArea(), stores in a variable (result), and finally prints it in the console.
         * question_2: What variables are declared?
         * answer_2: An integer 'result' is declared to store the result returned by the method circleArea().
         * question_3: What objects are declared to call the method?
         * answer_3: Since its a static method, it doesn't require a class object to call the method circleArea().	
         */   
    
            public static void main(String args[]){  
            
                /*
                 * stm_comment: Call the method circleArea with the parameter r = 5. Store the returned value in the variable 'result'.
                 */
                double result = CircleArea.circleArea(5);  
    
                System.out.println(result);  
            } 
        }  