/**
@name(How tall are you in meters?)
@goalDescription(Construct a program that converts the height in feet stored in variable heightInFeet to meters using the constant feet to meter conversion rate 0.30479 and print the height in meters with 3 digits after the decimal point to the console.)
**/
public class HowTallAreYou {
    public static void main(String[] args) {
//Declare the conversion rate as a constant variable and declares a variable to hold hieght in feet value.
/**@helpDescription(The variable FEET_TO_METERS is declared as double type and initialized to 0.30479. final modifier is used to make FEET_TO_METERS a constant variable, immutable. Constant variables are assigned to a value exactly once and this value cannot be changed after the initialization. The constant variables have to be initialized to a value when they declared. By Java naming conventions for constants, upper case letters are used and words are separated with '_'.)**/
        final double FEET_TO_METERS = 0.30479;
        double heightInFeet = 6.16;


//Calculate height in meters by using a constant variable.
/**@helpDescription(The value of FEET_TO_METERS constant is accessed and multiplied by the heightInFeet variable. The usage of a constant variable is the same with other variables.)**/
        double heightInMeters = heightInFeet * FEET_TO_METERS;
//Print the value of heigthInMeters to console using printf method.
/**@helpDescription(The System.out.printf method is used to print formatted output to the console. Format specifiers are defined using %. Here, %.3f means that %.3f should be replaced with the heightInMeters value and exactly 3 digits should be printed after the decimal(.). The number comes after the '.' defines the number of digits printed after the decimal and f defines that the heightInMeters is a double or a float number.)**/
        System.out.printf("The height in meters is: %.3f", heightInMeters );
    }
}
