/**
 * author: Nisrine Ait Khayi
 * topics: Recursion
 * subtopics: recursion, factorial.
 * goalDescription: This program desrcibes how many different ways we can arrange  n T-Shirts.
 * source: Here we keep the URL if there exist any source 
 *  For example, given 3 T-shirts, there are 3*2 (6) to arrange them.
 */

public class Factorial {

   
    static int factorial(int n){   
         /**
            * logical_step_1: Given one T-shirt, there is one way to arrange it. When there are n T-shirts, there are n! different ways to arrange them. 
            * question_1: When the first block of code is executed?
            * answer_1: When there is one t-shirt.   
            * question_2: When the second block of code is executed?
            * answer_1: When there is many different t-shirt.   
         */
         /**
	     * stm_comment: Making the user define the number of t-shirts will define the number of different ways to arrange them
	     * question_1: why the number of t-shirts is important?
	     * answer_1: the number of t-shirts triggers the execution of one the following blocks.
	*/
          if (n==1){ 
          
            return 1; 
           }        
          else  { 
         
            return(n * factorial(n-1));
          }
    }      
  
    public static void main(String[] args) {  
     
      System.out.print("\nEnter the numner of t-shirts: ");
      n = input.nextInt();
   
      System.out.println("Factorial of n is: "+factorial(n));  
  }  
}  
