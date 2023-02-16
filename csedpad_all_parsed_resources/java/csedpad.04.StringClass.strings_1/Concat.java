/**
@goalDescription(Given a first name and last name of a person, the program concatenates them to form a full name.)
**/
public class Concat {

  public static void main(String[] args) {
//Declare variables called firstName and lastName to hold the first name and last name of a person.

/**@helpDescription(String variable is declared using the keyword String. question_1: How is string variable declared? answer_1: String variable is declared using the keyword String.)**/
    String firstName = "David";
    


    String lastName = "Beckham";

//Concatenate firstName and lastName to form a full name and prints the full name of a person.

/**@helpDescription(Concatenates  the variable lastName with  variable firstName. question_1: Please explain what the following code block does?. answer_1:  Concatenates  the variable lastName with  variable firstName.)**/
    String fullName = firstName.concat(lastName);

/**@helpDescription(Prints the result of the concatenation. question_1: Please explain what the following code block does?. answer_1: Prints the result of the concatenation.)**/
    System.out.println(fullName);

  }
}
