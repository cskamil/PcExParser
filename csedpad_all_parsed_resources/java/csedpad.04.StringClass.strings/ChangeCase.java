/**
@goalDescription(Given a person name, this program converts the name into uppercase and lowercase.)
**/
public class ChangeCase {
  public static void main(String[] args) {

//Declare a variable called fullName to hold the name of a person.

/**@helpDescription(String variable is declared using the keyword String. question_1: How is string variable declared? answer_1: String variable is declared using the keyword String.)**/
    String fullName = "Cristiano Ronaldo";
//Convert the name of the person into uppercase and lowercase and print the name in respective cases.
/**@helpDescription(Variable fullName is converted to uppercase and the result is printed. question_1: Please explain what the following code block does? answer_2: Variable fullName is converted to uppercase and the result is printed.)**/
    System.out.println(fullName.toUpperCase());
/**@helpDescription(Variable fullName is converted to lowercase and the result is printed. question_1: Please explain what the following code block does? answer_2: Variable fullName is converted to lowercase and the result is printed.)**/
    System.out.println(fullName.toLowerCase());
  }
}
