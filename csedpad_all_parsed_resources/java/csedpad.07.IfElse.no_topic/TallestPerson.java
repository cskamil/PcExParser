/**
@goalDescription(Find the tallest among three individuals whose heights are given.)
**/
public class TallestPerson{

	public static void main(String[] args) {

//Specify the height of the three individual.
		int Mary = 140, Lisa = 150, Rose = 140;

//Find out the tallest among the three numbers by comparing the height against each other.

/**@helpDescription(the if-else check for each condition to be true or false and executes the block which evaluates to true Because Lisa's height is greater than Rose and Mary's. Lisa is the tallest will be displayed. question_1: Please explain what does the else if block do answer_1: the if-else check for each condition to be true or false and executes the block which evaluates to true Because Lisa's height is greater than Rose and Mary's. Lisa is the tallest will be displayed.)**/
		if( Mary >= Lisa && Mary >= Rose)
			System.out.println(" Mary is the tallest");

		else if (Lisa >= Mary && Lisa >= Rose)
			System.out.println("Lisa is the tallest");
		else
			System.out.println("Rose is the tallest");
	}
}
