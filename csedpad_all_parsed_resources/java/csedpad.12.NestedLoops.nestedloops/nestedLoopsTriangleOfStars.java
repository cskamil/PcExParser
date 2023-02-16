/**
@goalDescription(Print a triangle of stars.)
**/
public class nestedLoopsTriangleOfStars {

	public static void main(String[] args) {
	
//Display a heading.
		System.out.println(" Triangle of Stars");

//Specify the size of the two edges of the triangle in terms of height and width measured in number of stars. The triangle is imagined as one half of a grid.
		int height = 3, width = 5;

//Use two nested loops to scan the grid and print a star in each cell of the grid that is in the upper top-right part.
/**@helpDescription(This is the outer loop with loop variable row and runs for a number of iterations specified by variable height. question_1: How do you call this first loop? answer_1: This is the outer loop. question_2: What is the loop variable for this outer loop? answer_2: The loop variable for the outer loop is variable row. question_3: How many times does outer loop run? answer_3: The outer loop runs for a number of iterations specified by variable height.)**/
		for ( int row = 0 ; row < height ; row++ )
		{
/**@helpDescription(This is the nested or inner loop with loop variable col and which in this case displays one row of stars and runs a number of iterations specified by variable width. question_1: How do you call this second loop? answer_1: This is the inner loop. question_2: What is the loop variable for this inner loop? answer_2: The loop variable for the inner loop is variable col. question_3: How many times does inner loop run? answer_3: The inner loop runs for a number of iterations specified by variable width.)**/
			for ( int col = 0 ; col < width ; col++ )
			{
				if (col > row)
/**@helpDescription(Only display a star if the cell is above the main diagonal of the grid which is indicated by the column number being greater than the row number. question_1: When is a start displayed? answer_1: Only display a star if the cell is above the main diagonal of the grid which is indicated by the column number being greater than the row number.)**/
					System.out.print( "*" ) ;
				else 

					System.out.print( " " ) ;

			}

/**@helpDescription(The next statement is needed in order to move to the new row by printing a new line character. question_1: Why is the next statement needed for? answer_1: The next statement is needed in order to move to the new row by printing a new line character.)**/
			System.out.println( "" ) ;
		}
  }
}
