/**
@author(Kamil Akhuseyinoglu)
@topic(inputs)
@title(JPhone1)
@goalDescription(Construct a program that determines whether it is time to buy a new phone based on the inputs that it receives from the user. A new phone should be bought if the phone breaks or the phone is at least 3 years old.)
@source(http://pawscomp2.sis.pitt.edu/pcex/pcex_v2/index.html?lang=JAVA&set=booleans.phone_age&svc=masterygrids&grp=CS0401Fall20191&usr=akhuseyinoglu&sid=TEST&cid=351&v=201803162257)
*/
import java.util.Scanner;
public class JPhoneAge1 {
  public static void main(String[] args){
    //Step 1: Read the user inputs
    /**
    @comment(We need to read and process the values that the user enters. To read the input values from the user, we need to define a Scanner object.)
    @comment(We can create a Scanner object using the operator new, as shown in this statement. The System.in object represents the standard input stream, which by default is the keyboard. It tells the java compiler that the input will be provided through keyboard.)
     */
    Scanner scan = new Scanner(System.in);
    /**
    @comment(We prompt the user to enter the phone age in years.)
    */
    System.out.println("Enter the phone age in years:");
    /**
    @comment(We need to read the phone age that the user enters and store it in a variable. We read the phone age by calling the nextInt() method because this input is an integer.)
    @comment(Note that if the user provides a non-integer number, an exception will be thrown because the input type is inconsistent with the expected data type, i.e., int.)
     */
    int phoneAge = scan.nextInt();
    /**
    @comment(We prompt the user to enter whether the phone is broken.)
     */
    System.out.println("Enter whether the phone is broken (true or false):");
    /**
    @comment(We need to read whether the phone is broken and store it in a variable. We read whether the phone is broken by calling the nextBoolean() method because this input is a boolean. The variable isBroken is true when the phone is broken, and false otherwise.)
    @comment(Note that if the user provides a non-boolean value, an exception will be thrown because the input type is inconsistent with the expected data type, i.e., boolean.)
     */
    boolean isBroken = scan.nextBoolean();    
    /**
    @comment(We close the scanner as we do not want to process any input from the user in the rest of the program.)
     */
    scan.close();
    //Step 2: Write the boolean expression to determine whether it is time to buy a new phone
    /**
    @comment(We need two conditions to determine if it is the time for a new phone. We use the || operator (called or) to combine the two conditions. The first condition is to test if the phone is broken and the second condition is to test if the phone age is at least 3 years old.)
    @comment(Note that the || operator yields the result true if at least one of the conditions is true.)
     */
    boolean needPhone = isBroken || phoneAge >= 3;
    /**
    @comment(This statement prints true/false depending on whether it is time to buy a new phone. The printed value is followed by an end-of-line character in the end.)
     */
    System.out.println(needPhone);
  }
}
