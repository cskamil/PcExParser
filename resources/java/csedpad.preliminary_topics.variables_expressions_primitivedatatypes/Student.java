/**
@goalDescription(This program displays students' profiles within a university.)
**/
public class Student {
  public static void main(String[] args) {
//Declare variables needed to store a student profile.
    String FirstName = "Sarah";
/**@helpDescription(declare a string variable named FirstName, assign a value to it and allocate memory for it)**/
    String LastName = "Lee";
/**@helpDescription(declare a string variable named LastName, assign a value to it and allocate memory for it)**/
    int Age = 24;
/**@helpDescription(declare an integer variable named Age, assign a value to it and allocate memory for it)**/
    double GPA = 3.5;
/**@helpDescription(declare a double variable named GPA, assign a value to it and allocate memory for it)**/
    String Address = "530 S Highland";
/**@helpDescription(declare a string variable named Address, assign a value to it and allocate memory for it)**/
    boolean Isgraduate = true;
/**@helpDescription(declare a boolean variable named Isgraduate, assign a value to it and allocate memory for it)**/
    System.out.println("First name is:" + FirstName);
    System.out.println("Last name is:" + LastName);
    System.out.println("Age is :" + Age);
    System.out.println("GPA is : " + GPA);
    System.out.println("Address: " + Address);
    System.out.println("Is he/she a graduate student?" + Isgraduate);
  }
}
