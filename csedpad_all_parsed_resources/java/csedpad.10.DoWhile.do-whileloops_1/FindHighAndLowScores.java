/**
@goalDescription(Given a collection of test scores with values between 0 and 100, find and display the low and high scores on the test.)
**/
public class FindHighAndLowScores {
    public static void main(String[] args) {
//Declare and initialize a constant array of integers (SCORES) that contains the student scores on the test.
        final int SCORES[] = { 41, 80, 47, 38, 59, 74, 56, 37, 85, 27, 49, 61, 25, 81, 95 };
//Declare and initialize three variables, one to hold the lowest score found so far (low_score), one to hold the highest score found so far (high_score), and one to hold the current array index (i).
        int low_score = 100;
        int high_score = 0;
        int i = 0;
//Iterate through the array of scores and record the lowest score and the highest score found.
/**@helpDescription(Unlike while and for loops, the body of a do-while loop executes first, before a conditional is checked.)**/
        do {
            if (SCORES[i] < low_score) {
                low_score = SCORES[i];
            }
            if (SCORES[i] > high_score) {
                high_score = SCORES[i];
            }
            i++;
/**@helpDescription(Check the conditional (i < SCORES.length), and if it evaluates to true, repeat the loop body; otherwise, if it evaluates to false, drop out of the loop. Note that a semicolon (;) must be placed on the end of a do-while loop -- it is easy to forget!)**/
        } while (i < SCORES.length);
//Print the lowest score and the highest score (now held by low_score and high_score, respectively).
        System.out.println("");
        System.out.println("Low Score: " + low_score);
        System.out.println("High Score: " + high_score);
    }
}
