/**
@goalDescription(You have an empty string. You are trying to find out whether you can find)
**/
public class NullExpect {
  public static void main(String[] args) {

//Declare a variable called empty to hold a string.
    String empty = null;

//Within a try block, find the character present at 0th index position.
/**@helpDescription(Tries executing code, providing opportunity to catch and handle errors question_1: Please explain what the following block of code does? answer_1: Tries executing code, providing opportunity to catch and handle errors)**/
    try {

/**@helpDescription(printing out the character present at index position 0 in the variable empty. question_1: Please explain what the following block of code does? answer_1: printing out the character present at index position 0 in the variable empty.)**/
      System.out.println(empty.charAt(0));
    }
//Catch exceptions thrown by the previous try block. Then print out the name of the exception.
/**@helpDescription(NullPointer Exception is thrown when we try to access the index of a string which is null. question_1: Please explain what the following block of code does? answer_1: NullPointer Exception is thrown when we try to access the index of a string which is null.)**/
    catch (NullPointerException e) {

      System.out.println("NullPointerException");
    }
  }

}
