/**
 * author: Priti Oli
 * topic: If-else condition
 * subTopic: if-else condition to check even/odd jersey_number
 * goalDescription: This program assigns a jersey to one of two teams, teamE if jersey number is even else to teamO
 * source:N/A
 * output: assigned to teamE
 */
public class TeamAssignment {
	public static void main(String[] args) {

		/**
		 * logical_step_1: Declare a variable called jersey_number to specify the jersey number
		 * logical_step_details: Declare a variable, jersey_number that specifist the jersey number of the givnen jersey.
		 * question_1: What does the following block of code do?
		 * answer_1:  It declares a variable jersey_number that specifies the  jersey number
		 * question_2: What is the data type of variable jersey_number?
		 * answer_2: Integer
		 * question_3: What is the value of the variable jersey_number?
		 * answer_3: 10
		 */
		int jersey_number = 10;

		/**
		 * logical_step_2: Check if the jersey jersey_number is even or odd and assign accordingly to a team . 
		 * logical_step_details: Check if the jersey_number is even or odd. If even assign to teamE else assign to teamO
		 * question_1: What does the following block of code do?
		 * answer_1:  Assign the jersey to one of the team: teamE or teamA
		 * question_2: Does the if condition evaluate to true or false?
		 * answer_2: True
		 * question_3: Which of the if block is executed : if block or else block?
		 * answer_3: the if block is executed
		 * question_4: what is the output of the program
		 * answer_3: 'assigned to teamE' is displayed in the output stream.
		 */

		/**
		 * stm_comment: If condition checks if the remainder of the variable jersey_number divided by 2 is 0 or not.Becuase the
		 * remainder of 10 divided by 2 is 0, the jersey is assigned to teamE
		 * question_1: Please explain what does the following if-else statement does?
		 * answer_1: T If condition checks if the remainder of the variable jersey_number divided by 2 is 0 or not.Becuase the
		 * remainder of 10 divided by 2 is 0, the jersey is assigned to teamE
		 * **/
		if (jersey_number % 2 == 0) {
			System.out.println("assigned to teamE ");
		}
		else {
			System.out.println("assigned to teamO ");
		}

	}
}
