/**
* author: Vasile Rus
* topics: nested loops
* subtopics: simple nested for loop
* goalDescription: Label all squares on a chessboard with numbers from 1 to 64 such that the top row's squares are labeled 1 to 8 from left to right, the row below's square's are labeled 9-16 from left to right, and so on.
* source: Pittsburgh pool of examples
* output:
 Outer loop iteration 1
Square i = 1; j = 1 has label 1
Square i = 1; j = 2 has label 2
Square i = 1; j = 3 has label 3
Square i = 1; j = 4 has label 4
Square i = 1; j = 5 has label 5
Square i = 1; j = 6 has label 6
Square i = 1; j = 7 has label 7
Square i = 1; j = 8 has label 8
Outer loop iteration 2
Square i = 2; j = 1 has label 2
Square i = 2; j = 2 has label 4
Square i = 2; j = 3 has label 6
Square i = 2; j = 4 has label 8
Square i = 2; j = 5 has label 10
Square i = 2; j = 6 has label 12
Square i = 2; j = 7 has label 14
Square i = 2; j = 8 has label 16
Outer loop iteration 3
Square i = 3; j = 1 has label 3
Square i = 3; j = 2 has label 6
Square i = 3; j = 3 has label 9
Square i = 3; j = 4 has label 12
Square i = 3; j = 5 has label 15
Square i = 3; j = 6 has label 18
Square i = 3; j = 7 has label 21
Square i = 3; j = 8 has label 24
Outer loop iteration 4
Square i = 4; j = 1 has label 4
Square i = 4; j = 2 has label 8
Square i = 4; j = 3 has label 12
Square i = 4; j = 4 has label 16
Square i = 4; j = 5 has label 20
Square i = 4; j = 6 has label 24
Square i = 4; j = 7 has label 28
Square i = 4; j = 8 has label 32
Outer loop iteration 5
Square i = 5; j = 1 has label 5
Square i = 5; j = 2 has label 10
Square i = 5; j = 3 has label 15
Square i = 5; j = 4 has label 20
Square i = 5; j = 5 has label 25
Square i = 5; j = 6 has label 30
Square i = 5; j = 7 has label 35
Square i = 5; j = 8 has label 40
Outer loop iteration 6
Square i = 6; j = 1 has label 6
Square i = 6; j = 2 has label 12
Square i = 6; j = 3 has label 18
Square i = 6; j = 4 has label 24
Square i = 6; j = 5 has label 30
Square i = 6; j = 6 has label 36
Square i = 6; j = 7 has label 42
Square i = 6; j = 8 has label 48
Outer loop iteration 7
Square i = 7; j = 1 has label 7
Square i = 7; j = 2 has label 14
Square i = 7; j = 3 has label 21
Square i = 7; j = 4 has label 28
Square i = 7; j = 5 has label 35
Square i = 7; j = 6 has label 42
Square i = 7; j = 7 has label 49
Square i = 7; j = 8 has label 56
Outer loop iteration 8
Square i = 8; j = 1 has label 8
Square i = 8; j = 2 has label 16
Square i = 8; j = 3 has label 24
Square i = 8; j = 4 has label 32
Square i = 8; j = 5 has label 40
Square i = 8; j = 6 has label 48
Square i = 8; j = 7 has label 56
Square i = 8; j = 8 has label 64
*/
 
public class nestedLoopsChessboard {
   public static void main(String[] args) {
     
	/**
	* logical_step_1: Declare variable needed to store the label to be placed on a square.
	* logical_step_details: Declare a variable squareLabel which will store the value of the number to be placed on a square. The value will be generated on the fly as we scan the chessboard.
	* question_1: What does the following code block do?
	* answer_1: Declare variable needed to store the label to be placed on a square.
	* question_2: What variables are declared?
	* answer_2: The variable squareLabel is declared of type integer.
	* question_3: To what value is the variable squareLabel initialized to?
	* answer_3: The variable squareLabel is initialized to -1.	
	*/
	int squareLabel = -1;

	/**
	* logical_step_2: Scan all the squares on the chessboard, scanning one row at a time.
	* logical_step_details: Scan all the squares on the chessboard using two nested loops. The first loop accounts for the rows 1 to 8 and once a row is selected for scanning, the inner loop will scan all the squares in that row from 1 to 8.
	* question_1: What does the following code block do?
	* answer_1: Scan all the squares on the chessboard, scanning one row at a time.
	* question_2: What does the outer loop do?
	* answer_2: The outer loop uses an integer variable i to scan all values from 1 to 8 corresponding to each of the eight rows.
	* question_3: What does the inner or nested loop do?
	* answer_3: The inner loop uses a second integer variable j that scans all the values from 1 to 8 accounting for the eight columns.	
	*/

	/** 
	* stm_comment: This is the outer loop with loop variable i and runs for eight iterations. 
	* question_1: How do you call this first loop?
	* answer_1: This is the outer loop.
	* question_2: What is the loop variable for this outer loop?
	* answer_2: The loop variable for the outer loop is variable i.
	* question_3: How many times does outer loop run?
	* answer_3: The outer loop runs for eight iterations.
	*/
	for (int i = 1; i <= 8; ++i) {
		System.out.println("Outer loop iteration " + i);
		
		/** 
		* stm_comment: This is the inner loop with loop variable j and runs for eight iterations. 
		* question_1: How do you call this second loop?
		* answer_1: This is the inner loop.
		* question_2: What is the loop variable for this inner loop?
		* answer_2: The loop variable for the inner loop is variable j.
		* question_3: How many times does inner loop run?
		* answer_3: The inner loop runs for eight iterations.
		*/
        for (int j = 1; j <=8; ++j) {
			/** 
			* stm_comment: The label for square at row i and position j in that row is generated.
			* question_1: What element of the chessboard is the following label generated for?
			* answer_1: The label for square at row i and position j in that row is generated.
			*/
			squareLabel = i * j;
			System.out.println("Square i = " + i + "; j = " + j + " has label " + squareLabel);
         }
    }
  }
}