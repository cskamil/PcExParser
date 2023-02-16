/**
@goalDescription(Generate a 5 x 5 Bingo board and initialize it with random numbers from 1 to 75. The board will be populated from the top-left corner, one row at a time, all the way to the bottom right corner.)
**/
//Use Java library Random that can help generate random numbers.
import java.util.Random; 
public class twoDimensionalArraysBingoBoard {
   public static void main(String[] args) {
		
//Declare variables.
		int[][] bingoBoard = new int[5][5];
		Random rand = new Random();
//Generate 25 random numbers in the range of 1 to 75 and populate the Bingo board.
		for ( int i = 0 ; i < 5 ; i++ )
		{
			for ( int j = 0 ; j < 5 ; j++ )
			{

/**@helpDescription(Access the element of binjo board using the index operator []. First specify the row of the element and then specify the column. bingoBoard[i][j] represents the element in ith row and jth column. question_1: Please explain what does the following code does? answer: Access the element of binjo board using the index operator []. First specify the row of the element and then specify the column. bingoBoard[i][j] represents the element in ith row and jth column.)**/
				while ( (bingoBoard[i][j] = rand.nextInt (75)) == 0) ;
				System.out.print( "board square [" + i + ", " + j + "]" + " = " + bingoBoard[i][j] + "\n") ;
			}

			System.out.println( "" ) ;

			}

//Print the Bingo board.
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

