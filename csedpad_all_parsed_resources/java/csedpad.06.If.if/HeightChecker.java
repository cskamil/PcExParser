/**
@goalDescription(Given height of two players, this program finds if one player is taller than other or not.)
**/


public class HeightChecker{
	public static void main(String[] args){

//Declare two variables called player1 and player2 to indicate the height of the players.
		int player1 = 6;
		
		int player2 = 5;



//Checks if height of the player1 is greater than player2.If so, print a message stating Player1 is taller than Player2.
/**@helpDescription(The condition of the if-statement checks whether the value of the player1 is greater than the value of player2. question_1: Please explain what the following if statement does? * answer_1: The condition of the if-statement checks whether the value of the player1 is greater than the value of player2.)**/
		if ( player1 > player2){
/**@helpDescription(The value of player1 is greater than the value of player2, the message "Player1 is taller than Player2." is printed. question_1: Please explain when and how the following statement runs? answer_1: The value of player1 is greater than the value of player2, the message "Player1 is taller than Player2." is printed.)**/
			System.out.println("Player1 is taller than Player2.");
		}

	}
}
