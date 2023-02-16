/**
 * author: Priti Oli
 * topic: If-else condition
 * subTopic: demonstration of usage of if-else condition
 * goalDescription: Assign letter grades to a given score by comparing the test score with the test score range for a given grade
 * source: N/A
 * output: Grade = A
 */
public class Grades {
    public static void main(String[] args) {

        /**
         * logical_step_1: Specify the test score
         * logical_step_details: Declare a variable called testscore that indicates the test score.
         * question_1: How is the testscore specified?
         * answer_1: Declare a variable called testscore that indicates the test score.
         * question_2: What does the following code block do?
         * answer_2: Specify the test score.
         * question_3: What is the data type of variable testScore?
         * answer_3: The data type of the testScore variable is integer.
         * question_4: What is the value of variable testScore?
         * answer_4: The testScore variable is initialized to value 90.
         */


        int testScore = 90;
        char grade;

        /**
         * logical_step_2: assign the grade to a given test score.
         * logical_step_details: Compare the test score against different threshold value and assign a test score.
         * question_1: What does the following block of code do?
         * answer_1: The code below assigns the appropiate letter grade to a given test score.
         * question_2: What is the grade assigned to the testScore?
         * answer_2: Grade A
         * question_3: Which if-else block will be executed in the program below?
         * answer_3: The block ' if (testScore >= 90) { grade = 'A';}' evaluates a true condition and gets executed.
         * question_4: What will be the value of variable grade if testScore=70
         * answer_4: Grade = C
         */

        /**
         * stm_comment: The if-else condition compares the testScore with different values and assigns an appopriate letter grade.
         * Since the value of test score is 90, it is assigned.
         * question_1: Please explain what does the follwoing if-else block do?
         * answer_1: The if-else condition compares the testScore with different values and assigns an appopriate letter grade.
         * Since the value of test score is 90, it is assigned
         * to grade A.
         * */
        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
