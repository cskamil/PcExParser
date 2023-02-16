/**
@goalDescription(The program will create a method that will show some information about a faculty on a campus. The program will declare a method that will print those information when invoked by a class object.The program will create object of the class, use that object to store data in the class variables declared, and call the method to show the faculty information by printing it.)
**/
public class Faculty {

//Declare a method which displays faculty information of a university.
    String name, gender;
    int number;
        
/**@helpDescription(Define a method 'displayInformation' that takes no parameters and returns no value. When it is run, it will print a string that contains the information of the faculty object it was called with.)**/
    void displayInformation() {
        System.out.println("Faculty name: " + name + '\n' + "Gender: " + gender + '\n' + "Phone Number: " + number);
    }

    public static void main(String[] args) {

//Declare an object of class Faculty, store faculty information in the variables using the class object.
        Faculty anis = new Faculty();

        anis.name = "anisur rahman";
        anis.gender = "male";
        anis.number = 901245698;
        
/**@helpDescription(Call the method displayInformation on the Faculty object 'anis'.)**/
        anis.displayInformation();
    }

}
