/**
* source: Here we keep the URL if there exist any source
* author : Jordan Barria-Pineda
* topics : Recursion
* subtopics: recursive method calling, recursion base case
* goalDescription: This program computes Fibonacci numbers using a recursive method.
* source: Big Java Book (3rd edition), page 603 (only difference is that original input n was 50)
* output : Enter n: 7
           fib(1)=1
           fib(2)=1
           fib(3)=2
           fib(4)=3
           fib(5)=5
           fib(6)=8
           fib(7)=13
*/

public class RecursiveFibonacci{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = in.nextInt();
    for(int i=1; i<=n; i++){
      long f = fib(i);
      System.out.println("fib("+ i ") = " + f);
    }
  }
  
  /**
  * stm_comment: Define a function that computes a Fibonacci number by taking an integer param n and returning the nth Fibonacci number
  */
  public static long fib(int n){
     /**
    * logical_step_1: The recursion base case is whenever n is either 1 or 2, where the result of fib() is 1. This is the returned value of the function.
    * logical_step_details: The base case corresponds to where the recursive function stops making subsequent calls, and instead it returns always 1. This happens whenever the parameter of the fib function is either 1 or 2.
    * question_1: What case for a recursive algorithm is this if-statement representing?
    * answer_1: The base case.
    * question_2: When does the base case happen?
    * answer_2: Whenever n is either 1 or 2.
    */
    if(n<=2) return 1;
     /**
    * logical_step_2: Whenever n is greater than 2, recursively call fib() of n-1 and fib() of n-2 in order to return the sum of both values.
    * logical_step_details: The recursive case is presented here. It calls the fib function twice, one with n-1 as parameter and the another one with n-2 as parameter. The results of both recursive calls are summed and returned as the output of the fib(n) function.
    * question_1: What case for recursive algorithms is this if statement representing?
    * answer_1: The recursive call case, where n is not equal to 1 or 2.
    * question_2: When is the recursive call triggered?
    * answer_2: Whenever n is greater than 2.
    */
    else return fib(n-1) + fib(n-2);
  }
}
