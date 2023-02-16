/**
@goalDescription(This program desrcibes how many different ways we can arrange  n T-Shirts.)
**/
public class Factorial {

   
    static int factorial(int n){   
//Given one T-shirt, there is one way to arrange it. When there are n T-shirts, there are n! different ways to arrange them.
/**@helpDescription(Making the user define the number of t-shirts will define the number of different ways to arrange them question_1: why the number of t-shirts is important? answer_1: the number of t-shirts triggers the execution of one the following blocks.)**/
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
