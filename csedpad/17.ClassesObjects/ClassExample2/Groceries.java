/**
* author: Suraj Maharjan
* topics: Classes and Objects
* subtopics: Calls static method of class and for instance method initializing an object to call the instance method
* goalDescription: This program calls a static and instance method from Groceries and prints out what is needed for getting groceries in different ways
* input: N/A
* output: There are numerous online sites and third parties you can use where you just need to order and pay for the groceries online and will show up at your door step without needing to head out for it.
* The other way around is by your car or a Cab or Uber and oicking up the groceries by yourself or the other easy way is you can schedule a pickup for that. So, the extra thing here is you need to get to the store for the groceries.
*/

public class Groceries {

	/**
        * logical_step_1: Create static method.
    	* logical_step_details: Static method can be accessed without creating an object of the class.
    	* question_1: What is static method?
    	* answer_1: Static method can be accessed without creating an object of the class.
    	*/
	
	static void onlineGroceries() {
		System.out.println("There are numerous online sites and third parties you can use where you just need to order and pay for the groceries online and will show up at your door step without needing to head out for it.");
	/**
	* logical_step_2: Create instance method.
	* logical_step_details: Instance method can only be accessed with the help of objects of the class.
	* question_2: What is instance method?
    	* answer_2: Instance method can only be accessed with the help of objects of the class.
	*/
		
	public void otherGroceries() {
		System.out.println("The other way around is by your car or a Cab or Uber and oicking up the groceries by yourself or the other easy way is you can schedule a pickup for that. So, the extra thing here is you need to get to the store for the groceries.");
	}
	
	public static void main(String[] args) {
		
		/** 
		* stm_comment: Calls the static method
		* question_1: Why it doesnot need an object of the class to access the static method?
		* answer_1: Static method do not depend on the need to create and object of the class.
		*/
		onlineGroceries();

	/**
	* logical_step_3: Create an object "alternateGroceries" of the class Groceries.
    	* logical_step_details: The purpose of the alternateGroceries is it helps to call the instance method of the class Groceries.
    	* question_3: What is the purpose of alternateGroceries?
    	* answer_3: The purpose of the alternateGroceries is it helps to call the instance method of the class Groceries.
	*/
	    Groceries alternateGroceries = new Groceries(); 

	    /** 
	    * stm_comment: Calls the instance method
	    * question_1: Why it needs an object of the class to access the instance method?
	    * answer_1: To call the instance method it requires an object of the class to access it.
	    */
	    alternateGroceries.otherGroceries(); 
	}
}
