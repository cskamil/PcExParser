/**
@goalDescription(This program calls a static and instance method from Groceries and prints out what is needed for getting groceries in different ways)
**/
public class Groceries {

//Create static method.
	static void onlineGroceries() {
		System.out.println("There are numerous online sites and third parties you can use where you just need to order and pay for the groceries online and will show up at your door step without needing to head out for it.");
//Create instance method.
	public void otherGroceries() {
		System.out.println("The other way around is by your car or a Cab or Uber and oicking up the groceries by yourself or the other easy way is you can schedule a pickup for that. So, the extra thing here is you need to get to the store for the groceries.");
	}
	
	public static void main(String[] args) {
		
/**@helpDescription(Calls the static method question_1: Why it doesnot need an object of the class to access the static method? answer_1: Static method do not depend on the need to create and object of the class.)**/
		onlineGroceries();
//Create an object "alternateGroceries" of the class Groceries.
	    Groceries alternateGroceries = new Groceries(); 
/**@helpDescription(Calls the instance method question_1: Why it needs an object of the class to access the instance method? answer_1: To call the instance method it requires an object of the class to access it.)**/
	    alternateGroceries.otherGroceries(); 
	}
}
