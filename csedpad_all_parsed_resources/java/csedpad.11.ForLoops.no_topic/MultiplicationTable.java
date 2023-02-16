/**
@goalDescription(This program displays the multiplication table of 6.)
**/
public class MultiplicationTable {
	public static void main(String args[]){
//Specify a number whose multiplication table is to be displayed
		int var=6;
//Display the multiplication table of the number var
/**@helpDescription(the for loop has the initial value of iterator i as 1, the increment operator increase the value of i by 1 in each iteration. In the body of the for loop we display the multiplication of 6 with varying value of i each iteration. the loop continues till loop termination criteria is set to true i.e the value of is greater than or equal to 10. question_1: Please explain what the following for loop does? answer_1: the for loop has the initial value of iterator i as 1, the increment operator increase the value of i by 1 in each iteration. In the body of the for loop we display the multiplication of 6 with varying value of i each iteration. the loop continues till loop termination criteria is set to true i.e the value of is greater than or equal to 10.)**/
		for(int i=1;i<=10;i++){
			System.out.println(" " + var + " * " + i + " = " + var * i + " ");
		}
	}

}
