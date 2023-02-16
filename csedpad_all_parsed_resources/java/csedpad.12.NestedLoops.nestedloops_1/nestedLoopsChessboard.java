/**
@goalDescription(Label all squares on a chessboard with numbers from 1 to 64 such that the top row's squares are labeled 1 to 8 from left to right, the row below's square's are labeled 9-16 from left to right, and so on.)
**/
public class nestedLoopsChessboard {
   public static void main(String[] args) {
     
//Declare variable needed to store the label to be placed on a square.
	int squareLabel = -1;
//Scan all the squares on the chessboard, scanning one row at a time.
/**@helpDescription(This is the outer loop with loop variable i and runs for eight iterations. question_1: How do you call this first loop? answer_1: This is the outer loop. question_2: What is the loop variable for this outer loop? answer_2: The loop variable for the outer loop is variable i. question_3: How many times does outer loop run? answer_3: The outer loop runs for eight iterations.)**/
	for (int i = 1; i <= 8; ++i) {
		System.out.println("Outer loop iteration " + i);
/**@helpDescription(This is the inner loop with loop variable j and runs for eight iterations. question_1: How do you call this second loop? answer_1: This is the inner loop. question_2: What is the loop variable for this inner loop? answer_2: The loop variable for the inner loop is variable j. question_3: How many times does inner loop run? answer_3: The inner loop runs for eight iterations.)**/
        for (int j = 1; j <=8; ++j) {
/**@helpDescription(The label for square at row i and position j in that row is generated. question_1: What element of the chessboard is the following label generated for? answer_1: The label for square at row i and position j in that row is generated.)**/
			squareLabel = i * j;
			System.out.println("Square i = " + i + "; j = " + j + " has label " + squareLabel);
         }
    }
  }
}
