/**
@name(What is the average speed?)
@goalDescription(Construct a program that calculates the average speed in miles per hour using the values stored in the given variables. Then print (to the console) the height in meters with 2 digits after the decimal point.)
@distractor{code( int totalSecs = runtimeHrs*SEC_PER_HR + runtimeMins*SEC_PER_MIN + runtimeSecs;), helpDescription()}
@distractor{code( double totalSecs = runtimeHrs*SEC_PER_MIN + runtimeMins*SEC_PER_HR + runtimeSecs;), helpDescription()}
@distractor{code( System.out.println("Average MPH was: %.2f mph\n", aveMPH);), helpDescription()}
@distractor{code( System.out.format("Average MPH was: %.2d mph\n", aveMPH);), helpDescription()}
 **/
public class AverageSpeedInMarathon {
    public static void main(String[] args) {
//Declare multiple constant variables
        // i.e 26 miles 285 yards
/**@helpDescription(The variable MILES_PER_MARATHON is declared as double type and initialized to 26.21875. The final modifier is used to make MILES_PER_MARATHON a constant variable, which means it is immutable. Constant variables are assigned to a value exactly once and this value cannot be changed after their initialization. The constant variables have to be initialized to a value when they are declared. By Java naming conventions for constants, upper case letters are used and words are separated with '_'.)**/
        final double MILES_PER_MARATHON = 26.21875;
/**@helpDescription(The variable SEC_PER_HR is declared as int type and initialized to 3600. The final modifier is used to make SEC_PER_HR a constant variable, which means it is immutable. Constant variables are assigned to a value exactly once and this value cannot be changed after the initialization. The constant variables have to be initialized to a value when they declared. By Java naming conventions for constants, upper case letters are used and words are separated with '_'.)**/
        final int SEC_PER_HR = 3600;
/**@helpDescription(The variable SEC_PER_MIN is declared as int type and initialized to 60. The final modifier is used to make SEC_PER_MIN a constant variable, which means it is immutable. Constant variables are assigned to a value exactly once and this value cannot be changed after the initialization. The constant variables have to be initialized to a value when they declared. By Java naming conventions for constants, upper case letters are used and words are separated with '_'.)**/
		final int SEC_PER_MIN = 60;

//Declare multiple variables to keep track of marathon run time.
        double runtimeHrs = 2.0;
        double runtimeMins = 8.0;
        double runtimeSecs = 44.0;

//Calculate the average miles per hour speed using the constant variables.
/**@blank(The values of MILES_PER_MARATHON,SEC_PER_MIN,SEC_PER_HR constants are accessed and used in multiplication, division and addition arithmetic operations.)**/
        double totalSecs = runtimeHrs*SEC_PER_HR + runtimeMins*SEC_PER_MIN + runtimeSecs;
        double aveMPH = MILES_PER_MARATHON/(totalSecs/SEC_PER_HR);
//Print the value of aveMPH to console using the format method.
/**@blank(The System.out.format method is used to print formatted output to the console. Format specifiers are defined using %. Here, %.2f means that %.2f should be replaced with the aveMPH value and exactly 2 digits should be printed after the decimal(.). The number comes after the '.' defines the number of digits printed after the decimal and f defines that the heightInMeters is a double or a float number.)**/
        System.out.format("Average MPH was: %.2f mph\n", aveMPH);
    }
}
