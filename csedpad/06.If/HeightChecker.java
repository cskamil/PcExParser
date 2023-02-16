/**
* author:Jeevan Chapagain
* topics:If
* subtopics: If greater than
* goalDescription: Given height of two players, this program finds if one player is taller than other or not.
* source: N/A 
* input: N/A
* output: Player1 is taller than Player2.
*/



public class HeightChecker{
	public static void main(String[] args){

		/**
		* logical_step_1: Declare two variables called player1 and player2 to indicate the height of the players.
		* logical_step_details: Declare variables player1 and player2 that indicates the height of the player. The variable player1 is of integer type and is
		assigned a value of 6. The variable player2 is also of integer type and assigned a value of 5.
		* question_1: What does the following code block do?
		* answer_1: Declares variable player1 and player2 to indicate the height of the players.
		* question_2: What is the data type of  variables player1 and player2?
		* answer_2: The data type of the variables player1 and player2 is integer.
		* question_3: What are the values of  variable player1 and player2?
		* answer_3: The value of player1 is assigned 6 and the value of player2 is assigned 5.
		*/

		int player1 = 6;
		
		int player2 = 5;



		/**
		* logical_step_2: Checks if height of the player1 is greater than player2.If so, print a message stating Player1 is taller than Player2.
		* logical_step_details: Checks if height of the player1 is greater than player2. If player1 is greater, the if-branch executes and prints the statement
		Player1 is taller than Player2.
		* question_1: What does the following code block do?
		* answer_1: It checks if height of the player1 is greater than player2.
		* question_2: When does the if-branch executes?
		* answer_2: If the value of the player1 variable is greater than the value of player2, then the if-then branch is executed.
		* question_3: What does the if-then branch of the if-statement do once executed?
		* answer_3: The if-then branch prints the message "Player1 is taller than Player2".
		*/
		
		/**
		 * stm_comment: The condition of the if-statement checks whether the value of the player1 is greater than the value of player2.
		 * question_1: Please explain what the following if statement does?
		 * * answer_1: The condition of the if-statement checks whether the value of the player1 is greater than the value of player2.
		*/
		if ( player1 > player2){

			/**
			 * stm_comment: The value of player1 is greater than the value of player2, the message "Player1 is taller than Player2." is printed.
			 * question_1: Please explain when and how the following statement runs?
			 * answer_1: The value of player1 is greater than the value of player2, the message "Player1 is taller than Player2." is printed.
			 */
			System.out.println("Player1 is taller than Player2.");
		
		}

	}
}
