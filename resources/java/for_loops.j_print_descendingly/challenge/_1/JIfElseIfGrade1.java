import java.util.Scanner;
/**
@goalDescription(Construct a program that receives an integer from the user, outputs that integer, and exits when the user enters an integer that is not in the range of 30 to 90 both inclusive.)
@name(Receiving Input Integers Until a Certain Condition is Met (Case 2))
@distractor{code( while ( num >= 30 || num <= 90 ) {), helpDescription()}
@distractor{code( while ( num > 30 && num < 90 ) {), helpDescription()}
@distractor{code( while ( num <= 30 || num >= 90 ) {), helpDescription()}
@distractor{code( while ( num <= 30 && num >= 90 ) {), helpDescription()}
**/
public class JIfElseIfGrade1 {
	public static void main(String[] args) {
		//Step 1: Read the score
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a score: ");
		int score = scan.nextInt();
		scan.close();
		//Step 2: Determine the grade for the score
		String grade;
		/**@blank(We need to repeat receiving the integers from the user as long as the user enters an integer that is in the range of 30 to 90 both inclusive. Therefore, we need to use a loop structure. Since we don't know ahead of time how many times the loop will be repeated, we need to use a while loop. The condition in the while loop tests whether the body of the loop should be repeated, so it should test whether the input integer is in the range of 30 to 90 both inclusive.<br><br>We could check whether the input integer is in the range of 30 to 90 (both inclusive) by checking whether the input integer is greater than or equal to 30 and less than or equal to 90.)**/
		if (score >= 90) {
			grade = "A";
		/**@blank(We need to repeat receiving the integers from the user as long as the user enters an integer that is in the range of 30 to 90 both inclusive. Therefore, we need to use a loop structure. Since we don't know ahead of time how many times the loop will be repeated, we need to use a while loop. The condition in the while loop tests whether the body of the loop should be repeated, so it should test whether the input integer is in the range of 30 to 90 both inclusive.<br><br>We could check whether the input integer is in the range of 30 to 90 (both inclusive) by checking whether the input integer is greater than or equal to 30 and less than or equal to 90.)**/
		} else if (score >= 80) {
			grade = "B";
		/**@blank(We need to repeat receiving the integers from the user as long as the user enters an integer that is in the range of 30 to 90 both inclusive. Therefore, we need to use a loop structure. Since we don't know ahead of time how many times the loop will be repeated, we need to use a while loop. The condition in the while loop tests whether the body of the loop should be repeated, so it should test whether the input integer is in the range of 30 to 90 both inclusive.<br><br>We could check whether the input integer is in the range of 30 to 90 (both inclusive) by checking whether the input integer is greater than or equal to 30 and less than or equal to 90.)**/
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		//Step 3: Print the grade
		System.out.println("Grade = " + grade);
	}
}