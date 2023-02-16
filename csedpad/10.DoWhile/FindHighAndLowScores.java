/**
 * author: Hasan Mashrique, Scott Fleming
 * topics: do-while loops
 * subtopics: do-while loop control flow, do-while loop conditionals
 * goalDescription: Given a collection of test scores with values between 0 and 100, find and display the low and high scores on the test.
 * source: N/A
 * input: N/A
 * output: Low Score: 25
 * High Score: 95
 */
public class FindHighAndLowScores {

    public static void main(String[] args) {
        /**
         * logical_step_1: Declare and initialize a constant array of integers (SCORES) that contains the student scores on the test.
         * logical_step_details: N/A
         */
        final int SCORES[] = { 41, 80, 47, 38, 59, 74, 56, 37, 85, 27, 49, 61, 25, 81, 95 };

        /**
         * logical_step_2: Declare and initialize three variables, one to hold the lowest score found so far (low_score), one to hold the highest score found so far (high_score), and one to hold the current array index (i).
         * logical_step_details: Declare int variables low_score and high_score to hold the lowest score and the highest score found so far, respectively. The low_score variable is set initially to the highest possible score (100), and the high_score is set initially to the lowest possible score (0). Declare an array index counter i, and initialize it to 0.
         */
        int low_score = 100;
        int high_score = 0;
        int i = 0;

        /**
         * logical_step_3: Iterate through the array of scores and record the lowest score and the highest score found.
         * logical_step_details: Use a do-while loop to iterate through each score stored in the SCORES array, inspecting each score. If the score is less than the lowest score found so far (stored in low_score), set the low_score variable's value to the new lower score. If the score is greater than the highest score found so far (stored in high_score), set the high_score variable's value to the new higher score. When all the scores have been inspected, the low_score and high_score variables will hold the lowest and highest scores, respectively.
         * 
         * question_1: If the low_score variable was initialized to 0, would this code work correctly?
         * answer_1: No, because the if statement inside the loop body updates the low_score variable only if a lower score is found. No score is lower than 0, so the program would erroneously report the low score as the initial value of 0.
         * 
         * question_2: What would happen if the i++ statement was moved to be after line with the do-while condition?
         * answer_2: This change would cause the program to malfunction. The do-while loop would always execute in an infinite loop, because the counter variable i would no longer increase with each iteration, and thus, would never grow to be greater than or equal to the length of the array, which is necessary to make the loop condition evaluate to false.
         * 
         * question_3: Would this code work correctly if SCORES referenced an empty array?
         * answer_3: No, because the do-while loop body would try to access the SCORES array item at index 0, and that would cause an array out-of-bounds error. Note that if an empty SCORES array was possible, then a while loop or a for loop would be preferable, because they check the loop condition before executing the body.
         */
        /**
         * stm_comment: Unlike while and for loops, the body of a do-while loop executes first, before a conditional is checked.
         */
        do {
            if (SCORES[i] < low_score) {
                low_score = SCORES[i];
            }
            if (SCORES[i] > high_score) {
                high_score = SCORES[i];
            }
            i++;
            /**
             * stm_comment: Check the conditional (i < SCORES.length), and if it evaluates to true, repeat the loop body; otherwise, if it evaluates to false, drop out of the loop. Note that a semicolon (;) must be placed on the end of a do-while loop -- it is easy to forget!
             */
        } while (i < SCORES.length);

        /**
         * logical_step_4: Print the lowest score and the highest score (now held by low_score and high_score, respectively).
         * logical_step_details: N/A
         */
        System.out.println("");
        System.out.println("Low Score: " + low_score);
        System.out.println("High Score: " + high_score);
    }

}
