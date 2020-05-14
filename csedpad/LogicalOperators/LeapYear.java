/**
 * author: Priti Oli 
 * topics: Logical Operator 
 * subtopics: using logical operator with conditional/ternary operator 
 * goalDescription: this program checks whether a year is leap year or not
 * source:
 * output: It's a leap Year
 */
public class LeapYear {
	public static void main(String[] args) {

		/**
		 * logical_step_1: initialise a variable to store the value of the year which is to be evaluated as a leap year or not a leap year 
		 * logical_step_details: initialise the value of the variable year to 2020 
		 * question_1: what is the value of the variable year? 
		 * answer_1: the value of the variable year is 2020
		 */

		int year = 2020;
		String leapYear;

		/**
		 * logical_step_2: use logical and conditional operators to check whether a year is leap year or not. 
		 * logical_step_details: using modulus operator check if the variable year is divisble by 4 or 400 and not divisible by 100, using logical operator 'and' and 'or' , check if the conditions are satisfied using ternary operator and store the result in variable leapYear. 
		 * question_1: What is the value of the variable leapYear? 
		 * answer_1: the value of the variable leapYear is 'It's a leap Year' 
		 * question_2: What will be the value of the variable leapYear if year=2021 
		 * answer_2: The value of the variable leapyear will be 'Not a Leap year!'
		 */

		/**
		 * stm_comment: the ternary operator '?:' is used to check the whether the year is leap year of not. in a ternary operator all the statement until ?
		 * represents a condition . for example '(year % 400 == 0) || ((year % 4 == 0)
		 * && (year % 100 != 0))' represents a condition under evaluation if the
		 * condition evaluates true then value between '?' and ':' will be assigned to
		 * the variable leapYear else the value between ':' and ';' will e assigned to
		 * the variable leapYear
		 */
		leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "It's a leap Year": "Not a Leap year!";
		System.out.println(leapYear);

	}

}
