/**
 * author: Priti Oli
 * topic: Two Dimensional Arrays
 * subTopic:  intialization of two dimensional array, accessing elements of two dimensional arrays
 * goalDescription: This program generates a tictac toe board by using a two dimensional array.
 * source: N/A
 * output:
 ------------
 O | X | O |
 ------------
 X | X | O |
 ------------
 O | O | X |
 ------------
 */

public class TicTacToe {
    public static void main(String[] args) {
        /**
         * logical_step_1: Create a variable to store the Noughts 'O' and  Crosses 'X' in various positions of a tic tac toe board.
         * logical_step_details: Create a 3x3 board for a tic tac toe board and store 'O' or 'X' in each position of the board. The 3X3 board is created using
         * three dimensional array
         * question_1: What does the following block of code do?
         * answer_1: The code below declares and stores the character 'X' and 'O' in a two-dimensional character array.
         * question_2: What is the data type for each element of a?
         * answer_2: Each element of a is a character.
         * question3: what is the data type of a?
         * answer_3: a is a two-dimensional character array.
         */

        char[][] a = {
                {'O','X','O'},
                {'X','X','O'},
                {'O','O','X'}
        };

        /**
         * logical_step_2: Display the board.
         * logical_step_details: Display the elements of the array a to create the tic tac toe board.
         * question_1: what does the following block of code do?
         * answer_1: The code below displays the tic tac toe board
         * question_2: How many times is the line ' System.out.print(data+" | ")' executed?
         * answer_2:  9 times.
         * question_3: what is the data type of the variable innerArray in the code block below?
         * answer_3: innerArray is a character array
         */


        /**
         *  stm_comment: each element of the array is accessed by using a nested for loop. the first loop
         *  gets the character arrays of a, the nested loop iterates through each character, one array at a time .
         *  question_1: Please explain what does the following for loop does ?
         *  answer_1: ach element of the array is accessed by using a nested for loop. the first loop
         *  gets the character arrays of a, the nested loop iterates through each character, one array at a time .
         */
        System.out.println("------------");
        for (char[] innerArray: a) {
            for(char data: innerArray) {
                System.out.print(data+" | ");
            }
            System.out.println();
            System.out.println("------------");
        }
    }
}