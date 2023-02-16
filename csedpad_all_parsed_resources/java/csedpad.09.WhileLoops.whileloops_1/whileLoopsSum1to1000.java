/**
@goalDescription(Assume you have a list of 1,000 people in alphabetical order and you are assigned to collect from the first person on the list $1, from the second person $2, and so on fomr the 1,000th person you collect $1,000. How much money will you collect in total. This is equivalent to finding the sum of natural numbers from 1 to 1,000.)
**/
public class whileLoopsSum1to1000 {
  public static void main(String[] args) {

//Declare and initialize variables needed.
    int sum = 0, i = 1;
//Add all the values from $1 to $1,000 using a loop.
    while (i <= 1000) {
		sum += i;
    
/**@helpDescription(The loop variable i is being incremented which is important in order for the loop condition to change. question_1: Why is the following statement important for the loop? answer_1: The loop variable i is being incremented which is important in order for the loop condition to change and eventually for the loop to end.)**/
		i++;
    }
//print the total amount collected.
    System.out.println("Sum = " + sum);
  }
}
