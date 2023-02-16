/**
* author: Vasile Rus
* topics: nested loops
* subtopics: three nested for loop
* goalDescription: Generate the multiplication table.
* source: Liang - Introduction to Java Programming (10th edition)
* output:

 Multiplication Table
      1   2   3   4   5   6   7   8   9
———————————————————————————————————————
1 |   1   2   3   4   5   6   7   8   9
2 |   2   4   6   8  10  12  14  16  18
3 |   3   6   9  12  15  18  21  24  27
4 |   4   8  12  16  20  24  28  32  36
5 |   5  10  15  20  25  30  35  40  45
6 |   6  12  18  24  30  36  42  48  54
7 |   7  14  21  28  35  42  49  56  63
8 |   8  16  24  32  40  48  56  64  72
9 |   9  18  27  36  45  54  63  72  81 

  */


public class nestedLoopsMultiplicationTable {
	
	
	public static void main(String[] args) {

		/**
		* logical_step_1: Display the table heading.
		* logical_step_details: Display the "Multiplication Table" text.
		* question_1: What does the following code block do?
		* answer_1: Display the table heading.
		*/
		System.out.println(" Multiplication Table");

		/**
		* logical_step_2: Displays the numbers 1 through 9 as the labels for the columns of the multiplication table.
		* logical_step_details: Declare a loop variable n that will account for each of the numbers 1 to 9.
		* question_1: What does the following code block do?
		* answer_1: Displays the numbers 1 through 9 as the labels for the columns of the multiplication table.
		* question_2: What loop variable is declared?
		* answer_2: The loop variable n is of type integer and will take the values 1 to 9.
		*/
		System.out.print("   ");
		for (int n = 1; n <= 9; n++)
		  System.out.printf("%4d", n);
	
		System.out.println("\n———————————————————————————————————————");

		/**
		* logical_step_3: Generate and display on screen the multiplication table.
		* logical_step_details: Use two nessted for loops. The first for loop with the control variable i is the outer loop. The other for loop with control variable * j is the inner loop. Each time the outer loop is repeated, the inner loops are reentered, and started anew.
		* question_1: What does the following code block do?
		* answer_1: Generate and display on screen the multiplication table.
		* question_2: What variable is declared for the outer loop?
		* answer_2: The variable i of type integer is the loop variable for the outer loop.
		* question_3: What variable is declared for the inner loop?
		* answer_3: The variable j of type integer is the loop variable for the outer loop.
		* question_3: What is the relationship between the outer loop and the inner loop?
		* answer_3: Each time the outer loop is repeated, the inner loops are reentered, and started anew.
		*/

		/** 
		* stm_comment: This is the outer loop with loop variable i and runs for 9 iterations, one iteration for each digit 1 to 9. 
		* question_1: How do you call this first loop?
		* answer_1: This is the outer loop.
		* question_2: What is the loop variable for this outer loop?
		* answer_2: The loop variable for the outer loop is variable i.
		* question_3: How many times does outer loop run?
		* answer_3: The outer loop runs for 9 iterations, one iteration for each digit 1 to 9.
		*/
		for (int i = 1; i <= 9; i++) {

			System.out.print(i + " |");


			/**
			* stm_comment: This is the nested or inner loop with loop variable j and runs for 9 iterations, one iteration for each digit 1 to 9.
			* question_1: How do you call this second loop?
			* answer_1: This is the inner loop.
			* question_2: What is the loop variable for this inner loop?
			* answer_2: The loop variable for the inner loop is variable j.
			* question_3: How many times does inner loop run?
			* answer_3: The inner loop runs for 9 iterations, one iteration for each digit 1 to 9.
			*/
			for (int j = 1; j <= 9; j++) {
				/**
				* stm_comment: Display the product between digit i and digit j.
				* question_1: Which product is being displayed by the following print statement?
				* answer_1: Display the product between digit i and digit j.
				*/
				System.out.printf("%4d", i * j);
			}
	
			System.out.println();
		}

	}

}

