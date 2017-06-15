/**
 * @goalDescription(Construct a program that finds the smallest divisor of a number other than 1.)
 * @correctOutput(The output is: The smallest divisor of 15 is 3.)
 * @distractor {code(while (number / divisor != 0) {), helpDescription(We can test whether the divisor is a factor of the number by dividing the number by the divisor using the modulus (/) operator and comparing the division result with 0.)}
 * @distractor {code(while (number % divisor == 0) {), helpDescription(We can test whether the divisor is a factor of the number by computing the remainder of the division of the number by the divisor using the modulus (%) operator. The while loop executes until the divisor is not a factor of the number (i.e., number % divisor == 0).)}
 */
public class JSmallestDivisor {
	public static void main(String[] args) {
		//Step 1: Define the variables that we need for this program
		/**
		 * @helpDescription(We define variable "number" to store the number that we want to find its smallest divisor.)
	     */
		int number = 15;
		/**
		 * @helpDescription(We define variable "divisor" to store the smallest divisor of the number. We initialize "divisor" by 2 because we are looking for the first divisor greater than 1.)
	     */
		int divisor = 2;
		//Step 2: Find the smallest divisor of the number
		/**
		 * @blank(We need to increment the divisor repeatedly in a while loop until the divisor is a factor of the number. We can test whether the divisor is a factor the number by computing the remainder of the division of the number by the divisor using the modulus (%) operator. The while loop stops executing until the divisor is a factor of the number (i.e., number % divisor == 0). In this program, the while loop executes once and updates the value of divisor to 3. After that, the loop stops executing because 3 is a factor of 15 and the loop test will be evaluated as false.)
	     */
		while (number % divisor != 0) {
			/**
			 * @blank(If the divisor is not a factor of the number, we increment the divisor by 1 and evaluate the loop test again. The increment operator (++) adds 1 to the value of variable "divisor" and the result is stored back into the variable "divisor". Therefore, it is functionally equivalent to the statement "divisor = divisor + 1;". Note that the two plus signs that make up the operator cannot be separated by white space.)
		     */
			divisor++;
		}
		System.out.println("The smallest divisor of "+ number+" is "+divisor+".");
	}
}
