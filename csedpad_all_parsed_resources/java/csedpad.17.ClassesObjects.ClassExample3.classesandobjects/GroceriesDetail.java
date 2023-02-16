/**
@goalDescription(This program calls Groceries static and instance method by creating new object of Groceries)
**/
class GroceriesDetail {

  	public static void main(String[] args) {

//Call a static method from Groceries. This requires a class name in front of the static method name, i.e; here Groceries.onlineGroceries() calls the static method of Groceries.
		Groceries.onlineGroceries();

//To create an object of Groceries, we need to specify the class name, followed by the object name, and use the keyword new.
	    Groceries otherGroceries = new Groceries();
/**@helpDescription(Calls the instance method question_1: Why it needs an object of the class to access the instance method? answer_1: To call the instance method it requires an object of the class in front of the method to access it.)**/
	    otherGroceries.otherGroceries(); 
  	}
}
