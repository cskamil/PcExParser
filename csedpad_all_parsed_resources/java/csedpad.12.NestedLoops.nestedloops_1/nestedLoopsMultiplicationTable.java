/**
@goalDescription(Generate the multiplication table.)
**/

public class nestedLoopsMultiplicationTable {
	
	
	public static void main(String[] args) {

//Display the table heading.
		System.out.println(" Multiplication Table");
//Displays the numbers 1 through 9 as the labels for the columns of the multiplication table.
		System.out.print("   ");
		for (int n = 1; n <= 9; n++)
		  System.out.printf("%4d", n);
		System.out.println("\n———————————————————————————————————————");

//Generate and display on screen the multiplication table.
/**@helpDescription(This is the outer loop with loop variable i and runs for 9 iterations, one iteration for each digit 1 to 9. question_1: How do you call this first loop? answer_1: This is the outer loop. question_2: What is the loop variable for this outer loop? answer_2: The loop variable for the outer loop is variable i. question_3: How many times does outer loop run? answer_3: The outer loop runs for 9 iterations, one iteration for each digit 1 to 9.)**/
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " |");


/**@helpDescription(This is the nested or inner loop with loop variable j and runs for 9 iterations, one iteration for each digit 1 to 9. question_1: How do you call this second loop? answer_1: This is the inner loop. question_2: What is the loop variable for this inner loop? answer_2: The loop variable for the inner loop is variable j. question_3: How many times does inner loop run? answer_3: The inner loop runs for 9 iterations, one iteration for each digit 1 to 9.)**/
			for (int j = 1; j <= 9; j++) {
/**@helpDescription(Display the product between digit i and digit j. question_1: Which product is being displayed by the following print statement? answer_1: Display the product between digit i and digit j.)**/
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}

	}

}

