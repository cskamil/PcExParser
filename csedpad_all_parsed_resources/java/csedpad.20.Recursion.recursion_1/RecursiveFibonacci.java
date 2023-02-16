/**
@goalDescription(This program computes Fibonacci numbers using a recursive method.)
**/
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
  
/**@helpDescription(Define a function that computes a Fibonacci number by taking an integer param n and returning the nth Fibonacci number)**/
  public static long fib(int n){
//The recursion base case is whenever n is either 1 or 2, where the result of fib() is 1. This is the returned value of the function.
    if(n<=2) return 1;
//Whenever n is greater than 2, recursively call fib() of n-1 and fib() of n-2 in order to return the sum of both values.
    else return fib(n-1) + fib(n-2);
  }
}
