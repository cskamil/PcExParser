/**
* author: Suraj Maharjan
* topics: Classes and Objects
* subtopics: Accessing the static and instance methods of the class Groceries but for acessing instance method we create an object of the class Groceries.
* goalDescription: This program calls Groceries static and instance method by creating new object of Groceries
* output: There are numerous online sites and third parties you can use where you just need to order and pay for the groceries online and will show up at your door step without needing to head out for it.
* The other way around is by your car or a Cab or Uber and oicking up the groceries by yourself or the other easy way is you can schedule a pickup for that. So, the extra thing here is you need to get to the store for the groceries.
*/

class GroceriesDetail {

  	public static void main(String[] args) {

	    /**
	    * logical_step_1: Call a static method from Groceries. This requires a class name in front of the static method name, i.e; here Groceries.onlineGroceries() calls the static method of Groceries.
	    * logical_step_details: Call a static method from Groceries and perform the functions described inside that method. Class name in needed in front of the static method to call the method from the Groceries.
	    * question_1: Why we need the class name in front of the static method?
            * answer_1: Class name in needed in front of the static method to call the method from the Groceries.
	    */

		Groceries.onlineGroceries();

		/**
	  	* logical_step_2: To create an object of Groceries, we need to specify the class name, followed by the object name, and use the keyword new.
		* logical_step_details: Create a object of class i.e., Groceries. In order to create the object of that class we need the class name at front then the object name where we have created one of that class i.e., otherGroceries. And also we need to use the keyword "new". 
		* question_1: What is the purpose of otherGroceries?
		* answer_1: The object otherGroceries of the class Groceries has a state and behavior of the class Groceries.
		*/
	    Groceries otherGroceries = new Groceries();
		
	/**
	* stm_comment: Calls the instance method
	* question_1: Why it needs an object of the class to access the instance method?
	* answer_1: To call the instance method it requires an object of the class in front of the method to access it.
	*/		
	    otherGroceries.otherGroceries(); 
  	}
}
