/**
@goalDescription(this program checks whether a year is leap year or not source:)
**/
public class LeapYear {
	public static void main(String[] args) {
//initialise a variable to store the value of the year which is to be evaluated as a leap year or not a leap year
		int year = 2020;
		String leapYear;

//use logical and conditional operators to check whether a year is leap year or not.
/**@helpDescription(the ternary operator '?:' is used to check the whether the year is leap year of not. in a ternary operator all the statement until ? represents a condition . for example '(year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))' represents a condition under evaluation if the condition evaluates true then value between '?' and ':' will be assigned to the variable leapYear else the value between ':' and ';' will e assigned to the variable leapYear)**/
		leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "It's a leap Year": "Not a Leap year!";
		System.out.println(leapYear);
	}

}
