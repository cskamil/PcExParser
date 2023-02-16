/**
* author: Suraj Maharjan
* topics: Classes and Objects
* subtopics: Initializing objects and getting the functionalities of the class
* goalDescription: This program creates two objects of BagDetail which will get the total number of balls from the bags.
* input: [5]
* output: 5
* 5
*/

public class BagDetail {

	/**
     	* logical_step_1: Store the total number of balls in the bag.
	* logical_step_details: Declare an integer variable "totalBalls". The value of the variable totalBalls is 5.
     	* question_1: What is the value of the variable totalBalls?
     	* answer_1: The value of the variable totalBalls is 5.
     	*/

	int totalBalls = 5;

  	public static void main(String[] args) {
  		
	 /**
	 * logical_step_2: Creating objects of the class BagDetail to get the state and behavior of it. 
    	 * logical_step_details: Create countOne and countTwo as the objects of the class BagDetail. countOne has a state and behavior of BagDetail. countTwo has a state and behavior of BagDetail.
    	 * question_1: What is the purpose of countOne?
    	 * answer_1: countOne has a state and behavior of BagDetail.
    	 * question_2: What is the purpose of countTwo?
    	 * answer_2: countTwo has a state and behavior of BagDetail.
    	 */
	    BagDetail countOne = new BagDetail();
	    BagDetail countTwo = new BagDetail();

	    /**
	     * stm_comment: Calls the variable of the class BagDetail and prints the total number of balls in the bag.
	     * question_1: What variable countOne calls?
	     * answer_1: countOne calls variable totalBalls and prints 5.
	     * question_2: What variable countTwo calls?
	     * answer_2: countTwo calls variable totalBalls and prints 5.
	     */

	    System.out.println(countOne.totalBalls);
	    System.out.println(countTwo.totalBalls);
  	}
}
