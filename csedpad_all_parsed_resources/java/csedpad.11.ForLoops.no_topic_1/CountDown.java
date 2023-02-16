/**
@goalDescription(this is a program for a countdown display for launching a rocket in space which must show numbers in decreasing order from 10 to 1.)
**/
public class CountDown {
	public static void main(String[] args) {
//Display the value of counter in decreasing manner from 10 to 1.
/**@helpDescription(the for loop has initial value of counter as 10, it checks the condition on whether the counter is greater than 0 if true the body of the for loop is executed and the couner value is displayed as it runs from 10 to 1 in decreasing manner. question_1:Please explain what the following for loop does? answer_1: the for loop has initial value of counter as 10, it checks the condition on whether the counter is greater than 0 if true, the body of the for loop is executed and the couner value is displayed as it runs from 10 to 1 in decreasing manner.)**/
		for(int counter=10;counter>0;counter--){
			System.out.println("counter = " + counter);
		}
	}
}
