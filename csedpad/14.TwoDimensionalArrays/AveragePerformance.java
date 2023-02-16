/**
* author: Priti Oli
* topic: Two Dimensional Arrays
* subTopic: initialization of two-dimensional array, accessing and processing elements of a two-dimensional array
* goalDescription: This program calculates the average performance of 2 students by combining their performance in quiz,
 * homework and discussion.
* source: N/A
* input: N/A
* output: 36.0
* 63.0    56.0
* 33.0    43.0
 */

public class AveragePerformance {
    public static void main(String[] args) {

        /**
         * logical_step_1: Specify the scores obtained by 2 students in homework, quiz and discussion.
         * logical_step_details: Specify the scores obtained by 2 student in 3 assignments, 3 quizzes and 3 discussion.  
         * The score in homework is specified in the variable homework and each set represent score for different homework.
         * The quiz score is specified using the variable quiz and each set represent score for different quizzes.
         * The elements of quiz are integers. The variable homework is a two dimensional array of integers.
         * question_1: What does the following block of code do?
         * answer_1: Specify the scores obtained by 2 students obtained in homework, quiz and discussion.
         * question_2: How is the score in homework specified?
         * answer_2: the score in homework is specified in the variable homework. Each set represent score for different homework.
         * question_3: How is the quiz score specified?
         * answer_3: the quiz score is specified using the variable quiz. Each set represent score for different quizzes.
         * question_4: What is the data type of the elements of quiz?
         * answer_4: The elements of quiz are integers.
         * question_5: What is the datatype of homework variable?
         * answer_5: homework is a two dimensional array of integers.
         */


        int r1 = 3, c1 = 2;
        int r2 = 3, c2 = 2;
        /**
         * stm_comment: A two dimensional array is an array of array. Here, in homework the array of arrays of integer is defined
         * specifying the value the score obtained by 2 different student for each of 3 homeworks.
         * question_1: What does the following statement do?
         * answer_1: A two dimensional array is an array of array. Here, in homework the array of arrays of integer is defined
         * specifying the value the score obtained by 2 different student for each of 3 homeworks.
         */
        int[][] homework = { {10,20},{30,40},{40,50} };
        int[][] quiz = { {60,70} ,{80,90} ,{10,20} };
        int[][] discussion = { {40,70} ,{80,40} ,{50,60} };

        /**
         * stm_comment: Declare a two dimensional array variable called result of type float
         * and size: 3 row and 2 column and allocate memory for it.
         * question_1: What does the following statement do?
         * answer_1: Declare a two dimensional array variable called result of type float and size 6(3 row, 2 column)
         * and allocates memory for it.
         * question_2: What data type does flota[][] refer to?
         * answer_2: An array of arrays of float.
         */
        float[][] result = new float[r1][c2];

        /**
         * logical_step_2: compute the average obtained by the two student in homework, quiz and discussion
         * logical_step_details: calculate the average score obtained by each student in 3 homework , 3 quiz and discussion and display the average score
         * question_1: what does the following block of code do?
         * answer 1: compute the average obtained by the two student in homework, quiz and discussion
         * question_2: What is the value of homework[1][1]?
         * answer_2: 30
         * question_3: What is the value of discussion[0][1]?
         * answer_3: 70
         * question_4: What is the value of result(result[i][j]) when i=1 and j=0?
         * answer_4: 190
         *
         */


        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
        /**
         *  stm_comment: each of i-th row and j-th column element of two dimensional array is access using index operator[].
         *  The first index represents the row and the second index represents the column
         *  question_1: Please explain what does the following line of code does?
         *  answer_1: Access the element of homework, discussion and quiz at position ith column and jth row ,
         *  calculate their average and assign it to the variable result
         *  */
                result[i][j] = (homework[i][j] + quiz[i][j]+discussion[i][j])/3;

            }
        }


        /**
         * logical_step_3: Dislay the result of the average performance
         * logical_step_details:  Dislay the result of the average performance obtained after taking the average of
         * homework, quiz and discussion
         * question_1: What does the following block of code do?
         * answer_1: Dislay the result of the average performance
         */

        /**
         *  stm_comment: This is another way to access elements of two dimensional array, using nested for loop. Here, The outer loop of the
         *  nested for loop accesses the float array which represents each row(arrays) of two dimensional array, result.
         *  question_1: Please explain what does the following statement does?
         *  answer_1: Here, The outer loop of the nested for loop accesses the float array which represents each row(arrays) of two dimensional array, result.
         *  */
        for(float[] row : result) {
            /**
             *  stm_comment: The inner loop of the nested for loop represents each element within the array of arrays of the two dimensional array.Here the loop iterates over each element of the array row
             *  question_1: Please explain what does the following statement does?
             *  answer_1:The inner loop of the nested for loop represents each element within the array of arrays of the two dimensional array.Here the loop iterates over each element of the array row.
             *  */
            for (float column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

}
