/**
@goalDescription(this program calculates the total cost of different items by multiplying unit cost of an item with count of items)
**/
public class TotalCostCalculation {
    public static void main(String[] args) {


//Specify the unit cost and number of items
        int r1 = 2, c1 = 2;
        int r2 = 2, c2 = 2;
        int[][] unitCost = { {1,2},{3,4} };
        int[][] itemCount = { {4,5}, {6,7} };
        int[][] totalCost = new int[r1][c2];

//Multiply the unit cost with total item count to find the total cost

        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
/**@helpDescription(In the code below each element of itemCount is multiplied with the corresponding element of totalcost. and the value after multiplication is stored in total cost.the index operator [] is used to access the elements of two dimensional array question_1: Please explain, what the following statement does? answer: In the code below each element of itemCount is multiplied with the corresponding element of totalcost. and the value after multiplication is stored in total cost.the index operator [] is used to access the elements of two dimensional array)**/
                    totalCost[i][j] += unitCost[i][k] * itemCount[k][j];
                }
            }
        }

//Display the value of total cost
        for(int[] row : totalCost) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

}
