/**
 * @goalDescription(Construct a program that finds the largest divisor of a number other than the number itself.)
 * @correctOutput(The largest divisor of 15 is 5.)
 * @distractor {code(while (number / divisor != 0) {), helpDescription(We can test whether the divisor is a factor of the number by dividing the number by the divisor using the modulus (/) operator and comparing the division result with 0.)}
 * @distractor {code(while (number % divisor == 0) {), helpDescription(We can test whether the divisor is a factor of the number by computing the remainder of the division of the number by the divisor using the modulus (%) operator. The while loop executes until the divisor is not a factor of the number (i.e., number % divisor == 0).)}
 */
public class JLargestDivisor {
	public static void main(String[] args) {
		//Step 1: Define the variables that we need for this program
		/**
		 * @helpDescription(We define variable "number" to store the number that we want to find its largest divisor.)
	     */
		int number = 15;
		/**
		 * @helpDescription(We define variable "divisor" to store the largest divisor of the number. We initialize "divisor" by "number -1" because we are looking for the largest divisor smaller than the number.)
	     */
		int divisor = number-1;
		//Step 2: Find the largest divisor of the number
		/** 
		 * @blank(We need to decrement the divisor repeatedly in a while loop until the divisor is a factor of the number. We can test whether the divisor is a factor the number by computing the remainder of the division of the number by the divisor using the modulus (%) operator. The while loop stops executing until the divisor is a factor of the number (i.e., number % divisor == 0). In this program, the while loop executes 9 times and updates the value of divisor to 5. After that, the loop stops executing because 5 is a factor of 15 and the loop test will be evaluated as false.)
	     */
		while (number % divisor != 0) {
			/** @blank(If the divisor is not a factor of the number, we decrement the divisor by 1 and evaluate the loop test again. The increment operator (--) subtract 1 from the value of variable "divisor" and the result is stored back into the variable "divisor". Therefore, it is functionally equivalent to the statement "divisor = divisor - 1;". Note that the two minus signs that make up the operator cannot be separated by white space.)
		     */
			divisor--;
		}
		System.out.println("The largest divisor of "+ number+" is "+divisor+".");
	}
}
