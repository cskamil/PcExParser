/**
@goalDescription(This program generates a tictac toe board by using a two dimensional array.)
**/
public class TicTacToe {
    public static void main(String[] args) {
//Create a variable to store the Noughts 'O' and  Crosses 'X' in various positions of a tic tac toe board.
        char[][] a = {
                {'O','X','O'},
                {'X','X','O'},
                {'O','O','X'}
        };

//Display the board.

/**@helpDescription(each element of the array is accessed by using a nested for loop. the first loop gets the character arrays of a, the nested loop iterates through each character, one array at a time . question_1: Please explain what does the following for loop does ? answer_1: ach element of the array is accessed by using a nested for loop. the first loop gets the character arrays of a, the nested loop iterates through each character, one array at a time .)**/
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
