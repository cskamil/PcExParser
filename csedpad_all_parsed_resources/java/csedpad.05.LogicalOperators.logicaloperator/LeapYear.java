/**
@goalDescription(this program checks whether a year is a leap year or not)
**/
public class LeapYear {
	public static void main(String[] args) {
//Specify the year
		int year = 2020;
		String leapYear;

//check whether a year is a leap year or not.
/**@helpDescription(the ternary operator '?:' is used to check the whether the year is leap year of not. Because the condition for a year to be leap year is satified. the leapYear variable has a value "It's a leap Year" question_1: Please expaling what the ternary operator does answer_1: Because the condition for a year to be leap year is satified. the leapYear variable has a value "It's a leap Year")**/
		leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "It's a leap Year": "Not a Leap year!";
		System.out.println(leapYear);
	}

}
