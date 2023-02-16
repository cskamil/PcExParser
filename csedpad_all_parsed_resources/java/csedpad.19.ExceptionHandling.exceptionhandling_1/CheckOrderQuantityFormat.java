@goalDescription(This program checks that an input for an order is in the correct format, demonstrating how a NumberFormatException can occur.)
**/
public class CheckOrderQuantityFormat{
  public static void main(String[] args) {
//Initalize a String variable called quantity and assign the string "five".
    String quantity = "five";
//Within a try block, attempt to parse the String quantity into an integer.
/**@helpDescription(Try executing code, providing opportunity to catch and handle errors)**/
    try {
/**@helpDescription(Method to convert a string into an integer)**/
      int num = Integer.parseInt(quantity); 
      System.out.println(num);
//Catch exceptions thrown by the previous method parseInt and print out the name of the exception.
/**@helpDescription(This exception is thrown when trying to convert a string with an inappropriate format to one of the numeric types)**/
    } catch(NumberFormatException e) { 
        System.out.println("NumberFormatException"); 
    }
  }
}
