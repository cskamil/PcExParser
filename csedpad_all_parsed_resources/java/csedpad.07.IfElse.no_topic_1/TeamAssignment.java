/**
@goalDescription(This program assigns a jersey to one of two teams, teamE if jersey number is even else to teamO)
**/
public class TeamAssignment {
	public static void main(String[] args) {
//Declare a variable called jersey_number to specify the jersey number
		int jersey_number = 10;
//Check if the jersey jersey_number is even or odd and assign accordingly to a team .
/**@helpDescription(If condition checks if the remainder of the variable jersey_number divided by 2 is 0 or not.Becuase the remainder of 10 divided by 2 is 0, the jersey is assigned to teamE question_1: Please explain what does the following if-else statement does? answer_1: T If condition checks if the remainder of the variable jersey_number divided by 2 is 0 or not.Becuase the remainder of 10 divided by 2 is 0, the jersey is assigned to teamE)**/
		if (jersey_number % 2 == 0) {
			System.out.println("assigned to teamE ");
		}
		else {
			System.out.println("assigned to teamO ");
		}
	}
}
