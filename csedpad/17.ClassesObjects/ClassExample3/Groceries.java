/**
* author: Suraj Maharjan
* topics: Classes and Objects
* subtopics: Defining static and instance methods of the class.
* goalDescription: This program is about creating a class named Courses with static and instance method that prints out the ways to get the groceries
* input: N/A
* output: N/A
*/

public class Courses {

	/**
	* logical_step_1: Create static method.
    	* logical_step_details: Static method can be accessed without creating an object of the class.
    	* question_1: What is static method?
    	* answer_1: Static method can be accessed without creating an object of the class.
    	*/
	static void onlineGroceries() {
		System.out.println("There are numerous online sites and third parties you can use where you just need to order and pay for the groceries online and will show up at your door step without needing to head out for it.");
	}
	
	/**
	* logical_step_3: Create instance method.
	* logical_step_details: Instance method can only be accessed with the help of objects of the class.
	* question_1: What is instance method?
    	* answer_1: Instance method can only be accessed with the help of objects of the class.
	*/
	public void otherGroceries() {
		System.out.println("The other way around is by your car or a Cab or Uber and oicking up the groceries by yourself or the other easy way is you can schedule a pickup for that. So, the extra thing here is you need to get to the store for the groceries.");
	}
}
