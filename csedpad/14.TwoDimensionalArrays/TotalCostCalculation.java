/**
 * author: Priti Oli
 * topic: Two Dimensional Arrays
 * subTopic: initialization of a  two-dimensional array, accessing elements of a two-dimensional array, processing two-dimensional arrays
 * goalDescription: this program calculates the total cost of different items by multiplying unit cost of an item with count of items
 * source: N/A
 * output: 16    19
 36    43
 */

public class TotalCostCalculation {
    public static void main(String[] args) {


        /**
         * logical_step_1: Specify the unit cost and number of items
         * logical_step_details: Specify the unit cost as the two dimensional array unitcost and count of items as
         * itemCount. Each row of unit cost specifies different items . Each element within each row of unitcost represents the cost of
         * the unit cost of same item for different brands.
         * question_1: what does the following block of code do?
         * answer_1: Specify the unit cost and itemcount
         * question_2: How is the unitCost specified?
         * answer_2: variable unitCost is used to specify the unit cost of items
         * question_3: How is the item count specified?
         * answer_3: variable itemCount is used to store the count of items.
         * question_4: what is the data type of itemCount?
         * answer_4: itemCount is a two dimensional integer array
         * question_5: how many items are there ?
         * answer_5: there are 4 items
         */

        int r1 = 2, c1 = 2;
        int r2 = 2, c2 = 2;
        int[][] unitCost = { {1,2},{3,4} };
        int[][] itemCount = { {4,5}, {6,7} };
        int[][] totalCost = new int[r1][c2];

        /**
         * logical_step_2: Multiply the unit cost with total item count to find the total cost 
         * logical_step_details: multiply the unit cost with total number of items to find the total cost. Each element in the
         * same index position's of the variable unitCost and itemCount needs to be multiplied to get the cost of an item.
         * question_1: What does the following block of code do?
         * answer_1: multiply the unit cost with total number of items to find the total cost
         * question_1: how many times will the outer loop execute?
         * answer_1: 2 times
         * question_3: What is the value of totalCost when i=1 and j=0?
         * answer_3: 12
         */


        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    /**
                     *  stm_comment: In the code below each element of itemCount is multiplied with the corresponding element of totalcost.
                     *  and the value after multiplication is stored in total cost.the index operator [] is used to access the
                     *  elements of two dimensional array
                     *  question_1: Please explain, what the following statement does?
                     *  answer: In the code below each element of itemCount is multiplied with the corresponding element of totalcost.
                     *  and the value after multiplication is stored in total cost.the index operator [] is used to access the
                     *  elements of two dimensional array
                     *  */
                    totalCost[i][j] += unitCost[i][k] * itemCount[k][j];
                }
            }
        }


        /**
         * logical_step_3: Display the value of total cost
         * logical_step_details: Display the final cost obtained after multiplying unit cost with cost per item
         * question_2: What does the following block of code do?
         * answer_2: Display the value of total cost
         * question_1: What is the output displayed in first iteration of outer loop 'for(int[] row : result) { ..... }'?
         * answer_1: 16    19
         */

        for(int[] row : totalCost) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

}
