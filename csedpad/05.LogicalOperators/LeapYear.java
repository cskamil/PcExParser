/**
 * author: Priti Oli 
 * topics: Logical Operator 
 * subtopics: using logical operator with conditional/ternary operator 
 * goalDescription: this program checks whether a year is a leap year or not 
 * source: N/A
 * output: It's a leap Year
 */
public class LeapYear {
	public static void main(String[] args) {

		/**
		 * logical_step_1: Specify the year
		 * logical_step_details: initialize the value of the variable year which is to be evaluated as a leap year
		 * question_1: what is the value of the variable year?
		 * answer_1: the value of the variable year is 2020
		 * question_2: What is the datatype of the variable year
		 * answer_2: the datatype of the variable year is integer.
		 * question_3: what does the following block of code do?
		 * answer_3: specifies the value of the variable year
		 */

		int year = 2020;
		String leapYear;

		/**
		 * logical_step_2:  check whether a year is a leap year or not.
		 * logical_step_details: using modulus operator check if the variable year is divisible by 4 or 400
		 * and not divisible by 100,
		 * question_1:What does the following block of code do?
		 * answer_1: The code below checks if a year is leap year or not.
		 * question_2: What is the value of the variable leapYear?
		 * answer_2: the value of the variable leapYear is 'It's a leap Year'
		 * question_3: What will be the value of the variable leapYear if year=2021
		 * answer_3: The value of the variable leapyear will be 'Not a Leap year!'
		 * question_4: What is the output of following block of code ?
		 * answer_4:it displays "It's a leap Year"
		 */

		/**
		 * stm_comment: the ternary operator '?:' is used to check the whether the year is leap year of not.
		 * Because the condition for a year to be leap year is satified. the leapYear variable has a value "It's a leap Year"
		 * question_1: Please expaling what the ternary operator does
		 * answer_1: Because the condition for a year to be leap year is satified. the leapYear variable has a value "It's a leap Year"
		 */
		leapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? "It's a leap Year": "Not a Leap year!";
		System.out.println(leapYear);

	}

}
