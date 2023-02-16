/**
* author: Vasile Rus
* topics: two dimensional arrays
* subtopics: two dimensional arrays
* goalDescription: Generate a 5 x 5 Bingo board and initialize it with random numbers from 1 to 75. The board will be populated from the top-left corner, one row at a time, all the way to the bottom right corner.
* source: N/A
* output:
board square [0, 0] = 62
board square [0, 1] = 30
board square [0, 2] = 55
board square [0, 3] = 52
board square [0, 4] = 56

board square [1, 0] = 11
board square [1, 1] = 65
board square [1, 2] = 28
board square [1, 3] = 49
board square [1, 4] = 21

board square [2, 0] = 72
board square [2, 1] = 35
board square [2, 2] = 47
board square [2, 3] = 7
board square [2, 4] = 27

board square [3, 0] = 53
board square [3, 1] = 9
board square [3, 2] = 24
board square [3, 3] = 12
board square [3, 4] = 3

board square [4, 0] = 71
board square [4, 1] = 66
board square [4, 2] = 34
board square [4, 3] = 36
board square [4, 4] = 12

62 30 55 52 56
11 65 28 49 21
72 35 47 7 27
53 9 24 12 3
71 66 34 36 12
 
*/

/**
* logical_step_0: Use Java library Random that can help generate random numbers.
* logical_step_details: import java.util.Random in order to be able to use the random generator in that library.
* question_1: What does the following code block do?
* answer_1: Use Java library Random that can help generate random numbers 
*/ 
import java.util.Random; 

public class twoDimensionalArraysBingoBoard {
   public static void main(String[] args) {
		
		/**
		* logical_step_1: Declare variables. 
		* logical_step_details: A two dimensional array of integers is declared to represent the 5 x 5 Bingo board. Also, an instance of the class Random is declared to generate random integers.
		* question_1: What does the following code block do?
		* answer_1: Declare variables.
		* question_2: What variables are declared?
		* answer_2: A two dimensional array of integers called bingoBoard and a rand variable which is an instane of the class Random.
		* question_3: What is the size of two dimensional array bingoBoard?
		* answer_3: The size of the array is 5 x 5 or 25 cells.	
		*/
		int[][] bingoBoard = new int[5][5];
		Random rand = new Random();
		
		/**
		* logical_step_2: Generate 25 random numbers in the range of 1 to 75 and populate the Bingo board.
		* logical_step_details: Two loops are used to scan all the cells on a Bingo board. The outer loop accounts for the rows and the inner loop for all the cells in one row. For each scanned cell on the Bingo board, a random number is generated and stored in the cell.
		* question_1: What does the following code block do?
		* answer_1: Generate 25 random numbers in the range of 1 to 75 and populate the Bingo board.
		* question_2: How many times does the outer loop execute?
		* answer_2: The outer loop iterates 5 times.
		* question_3: How many times does the inner loop execute?
		* answer_3: The inner loop exectues 5 times.	
		*/
		for ( int i = 0 ; i < 5 ; i++ )
		{

			for ( int j = 0 ; j < 5 ; j++ )
			{

				/**
				 *  stm_comment: Access the element of binjo board using the index operator []. First specify the row of
				 *  the element and then specify the column. bingoBoard[i][j] represents the element in ith row and jth column.
				 *  question_1: Please explain what does the following code does?
				 *  answer: Access the element of binjo board using the index operator []. First specify the row of
				 *  the element and then specify the column. bingoBoard[i][j] represents the element in ith row and jth column.
				 *  */
				while ( (bingoBoard[i][j] = rand.nextInt (75)) == 0) ;
				
				System.out.print( "board square [" + i + ", " + j + "]" + " = " + bingoBoard[i][j] + "\n") ;
			}

			System.out.println( "" ) ;

			}

		/**
		* logical_step_3: Print the Bingo board.
		* logical_step_details: Scan the Bingo board from the top left corner to the bottom right corner and print the numbers one row at a time.
		* question_1: what does the following code block do?
		* answer_1: Print the Bingo board. 
		* question_2: How many times does the outer loop execute?
		* answer_2: The outer loop iterates 5 times.
		* question_3: How many times does the inner loop execute?
		* answer_3: The inner loop exectues 5 times.	
		*/
		for ( int i = 0 ; i < 5 ; i++ )
		{


			for ( int j = 0 ; j < 5 ; j++ )
			{
				System.out.print(bingoBoard[i][j] + " ") ;
			}

			System.out.println( "" ) ;

			}
   }

}

