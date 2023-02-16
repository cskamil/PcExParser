/**
* author: Vasile Rus
* topics: nested loops
* subtopics: two nested for loop
* goalDescription: Print a triangle of stars.
* source: a variation of this example https://www.cs.umd.edu/~clin/MoreJava/ControlFlow/nested-loops.html
* output:
 
 Triangle of Stars 

 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *

  */

public class nestedLoopsTriangleOfStars {

	public static void main(String[] args) {
	
		/**
		* logical_step_1: Display a heading.
		* logical_step_details: Display on screen the "Triangle of Stars" text.
		* question_1: What does the following code block do?
		* answer_1: Displays on screen the heading "Triangle of Stars".
		*/

		System.out.println(" Triangle of Stars");

		/**
		* logical_step_2: Specify the size of the two edges of the triangle in terms of height and width measured in number of stars. The triangle is imagined as one half of a grid.
		* logical_step_details: Declare two integer variables height and width that indicate the edges of the triangle and initialize them to 3 and 5, respectively.
		* question_1: What does the following code block do?
		* answer_1: Specifies the size of the two of the triangle edges in terms of height and width measured in number of stars.
		* question_2: How is the height of the grid that embedds the triangle accounted for?
		* answer_2: The height of the grid is specified by the integer variable height which is initialized to value 3.
		* question_3: How is the width of the grid that contains the triangle?
		* answer_3: The width of the grid is specified by the integer variable width which is initialized to value 5.
		*/

		int height = 3, width = 5;

		/**
		* logical_step_3: Use two nested loops to scan the grid and print a star in each cell of the grid that is in the upper top-right part.
		* logical_step_details: Use two for loops to scan the grid one row at a time from left to right and print a star in each cell of the grid that belongs to the triangle.
		* question_1: What does the following code block do?
		* answer_1: Use two nested loops to scan the grid and print a star in each cell of the grid.
		* question_2: What does the first loop do?
		* answer_2: The first loop scans all the rows of the grid using a loop variable row.
		* question_3: What does the nested or inner loop do?
		* answer_3: The the nested or inner loop scans all the columns given the current row indicated by the outer loop.
		*/

		/** 
		* stm_comment: This is the outer loop with loop variable row and runs for a number of iterations specified by variable height. 
		* question_1: How do you call this first loop?
		* answer_1: This is the outer loop.
		* question_2: What is the loop variable for this outer loop?
		* answer_2: The loop variable for the outer loop is variable row.
		* question_3: How many times does outer loop run?
		* answer_3: The outer loop runs for a number of iterations specified by variable height.
		*/
		for ( int row = 0 ; row < height ; row++ )
		{

			/**
			* stm_comment: This is the nested or inner loop with loop variable col and which in this case displays one row of stars and runs a number of iterations specified by variable width.
			* question_1: How do you call this second loop?
			* answer_1: This is the inner loop.
			* question_2: What is the loop variable for this inner loop?
			* answer_2: The loop variable for the inner loop is variable col.
			* question_3: How many times does inner loop run?
			* answer_3: The inner loop runs for a number of iterations specified by variable width.
			*/
			for ( int col = 0 ; col < width ; col++ )
			{

				if (col > row)
					/**
					* stm_comment: Only display a star if the cell is above the main diagonal of the grid which is indicated by the column number being greater than the row number.
					* question_1: When is a start displayed?
					* answer_1: Only display a star if the cell is above the main diagonal of the grid which is indicated by the column number being greater than the row number.
					*/
					System.out.print( "*" ) ;

				else 

					System.out.print( " " ) ;

			}

			/**
			* stm_comment: The next statement is needed in order to move to the new row by printing a new line character.
			* question_1: Why is the next statement needed for?
			* answer_1: The next statement is needed in order to move to the new row by printing a new line character.
			*/
			System.out.println( "" ) ;
		}
  }
}
