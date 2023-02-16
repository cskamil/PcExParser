/**
@goalDescription(This program creates two objects of BagDetail which will get the total number of balls from the bags.)
**/
public class BagDetail {

//Store the total number of balls in the bag.
	int totalBalls = 5;

  	public static void main(String[] args) {
  		
//Creating objects of the class BagDetail to get the state and behavior of it.
	    BagDetail countOne = new BagDetail();
	    BagDetail countTwo = new BagDetail();
/**@helpDescription(Calls the variable of the class BagDetail and prints the total number of balls in the bag. question_1: What variable countOne calls? answer_1: countOne calls variable totalBalls and prints 5. question_2: What variable countTwo calls? answer_2: countTwo calls variable totalBalls and prints 5.)**/
	    System.out.println(countOne.totalBalls);
	    System.out.println(countTwo.totalBalls);
  	}
}
