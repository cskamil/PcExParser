/**
@goalDescription(You wrote a setence about a  fruit that you love. You are trying to find out whether you can find)
**/
public class IndexOut {
  public static void main(String args[]) {

//Declare a variable called fruit.



    String fruit = "I love apple ";

//Within a try block, find the character present at 13th index position.
/**@helpDescription(Tries executing code, providing opportunity to catch and handle errors question_1: Please explain what the following block of code does? answer_1: Tries executing code, providing opportunity to catch and handle errors)**/

    try {



      System.out.println(fruit.charAt(13));
    }

//Catch any exceptions thrown by the previous try block. Then print out the name of the exception.
/**@helpDescription(StringIndexOutofBounds Exception is thrown when we try to access the index of a string beyond its length. question_1: Please explain what the following code block does?. answer_1: StringIndexOutofBounds Exception is thrown when we try to access the index of a string beyond its length.)**/

    catch (StringIndexOutOfBoundsException e) {


      System.out.println("StringIndexOutOfBoundsException");
    }
  }
}
