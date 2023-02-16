/**
@goalDescription(This program calculates the average performance of 2 students by combining their performance in quiz, homework and discussion.)
**/
public class AveragePerformance {
    public static void main(String[] args) {

//Specify the scores obtained by 2 students in homework, quiz and discussion.

        int r1 = 3, c1 = 2;
        int r2 = 3, c2 = 2;
/**@helpDescription(A two dimensional array is an array of array. Here, in homework the array of arrays of integer is defined specifying the value the score obtained by 2 different student for each of 3 homeworks. question_1: What does the following statement do? answer_1: A two dimensional array is an array of array. Here, in homework the array of arrays of integer is defined specifying the value the score obtained by 2 different student for each of 3 homeworks.)**/
        int[][] homework = { {10,20},{30,40},{40,50} };
        int[][] quiz = { {60,70} ,{80,90} ,{10,20} };
        int[][] discussion = { {40,70} ,{80,40} ,{50,60} };
/**@helpDescription(Declare a two dimensional array variable called result of type float and size: 3 row and 2 column and allocate memory for it. question_1: What does the following statement do? answer_1: Declare a two dimensional array variable called result of type float and size 6(3 row, 2 column) and allocates memory for it. question_2: What data type does flota[][] refer to? answer_2: An array of arrays of float.)**/
        float[][] result = new float[r1][c2];
//compute the average obtained by the two student in homework, quiz and discussion

        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
/**@helpDescription(each of i-th row and j-th column element of two dimensional array is access using index operator[]. The first index represents the row and the second index represents the column question_1: Please explain what does the following line of code does? answer_1: Access the element of homework, discussion and quiz at position ith column and jth row , calculate their average and assign it to the variable result)**/
                result[i][j] = (homework[i][j] + quiz[i][j]+discussion[i][j])/3;
            }
        }


//Dislay the result of the average performance
/**@helpDescription(This is another way to access elements of two dimensional array, using nested for loop. Here, The outer loop of the nested for loop accesses the float array which represents each row(arrays) of two dimensional array, result. question_1: Please explain what does the following statement does? answer_1: Here, The outer loop of the nested for loop accesses the float array which represents each row(arrays) of two dimensional array, result.)**/
        for(float[] row : result) {
/**@helpDescription(The inner loop of the nested for loop represents each element within the array of arrays of the two dimensional array.Here the loop iterates over each element of the array row question_1: Please explain what does the following statement does? answer_1:The inner loop of the nested for loop represents each element within the array of arrays of the two dimensional array.Here the loop iterates over each element of the array row.)**/
            for (float column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
