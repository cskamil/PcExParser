/**
@goalDescription(Print a grid of stars.)
**/
public class nestedLoopsGridOfStars {

	public static void main(String[] args) {
	
//Display a heading.
	System.out.println(" Grid of Stars");

//Specify the size of the grid in terms of height and width measured in number of stars.
	int height = 3, width = 5;
	
//Use two nested loops to scan the grid and print a star in each cell of the grid.
/**@helpDescription(This is the outer loop with loop variable row and runs for a number of iterations specified by height. question_1: How do you call this first loop? answer_1: This is the outer loop. question_2: What is the loop variable for this outer loop? answer_2: The loop variable for the outer loop is variable row. question_3: How many times does outer loop run? answer_3: The outer loop runs for height iterations.)**/
	for ( int row = 0 ; row < height ; row++ )
	{
/**@helpDescription(This is the nested or inner loop with loop variable col and which in this case displays one row of stars and runs for a number of iterations given by the value of variable width. question_1: How do you call this second loop? answer_1: This is the inner loop. question_2: What is the loop variable for this inner loop? answer_2: The loop variable for the inner loop is variable col. question_3: How many times does inner loop run? answer_3: The inner loop runs for width iterations.)**/
	for ( int col = 0 ; col < width ; col++ )
      {
         System.out.print( "*" ) ;
      }
/**@helpDescription(Move to the new line when ending one row by printing a new line character. question_1: Why is the following statement needed? answer_1: The following println statement is needed in order to move to the new row by printing a new line character, i.e., in order to print one row of stars in  a separate line.)**/
    System.out.println( "" ) ;
	}
  }
}
