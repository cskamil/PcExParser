'''
@goalDescription(Construct a program that finds the largest divisor of a number, excluding the number itself.)
@correctOutput(The output is:\nThe largest divisor of 15 is 5)
'''
#Step 1: Define the variables that we need for this program
'''@helpDescription(We define variable num to store the number that we want to find its largest divisor.)'''
num = 15
'''@helpDescription(We define variable divisor to store the largest divisor of the number. We initialize variable divisor by num-1 because we are looking for the largest divisor of the number that excludes the number itself. This means that the maximum possible value that the divisor could take is the immediate preceding number for variable num, that is num-1.)'''
divisor = num-1

#Step 2: Find the largest divisor of the number
'''@helpDescription(We need to decrement the divisor repeatedly in a while loop until the divisor is a factor of the number. We can test whether the divisor is a factor the number by computing the remainder of the division of the number by the divisor using the modulus (%) operator. The while loop stops executing when the divisor is a factor of the number (i.e., num % divisor == 0). In this program, the while loop executes 9 times and updates the value of divisor to 5. After that, the loop stops executing because 5 is a factor of 15 and the loop test will be evaluated as false.)'''
while num % divisor != 0:
    '''@helpDescription(If the divisor is not a factor of the number, we decrement the variable divisor by 1 and evaluate the loop test again. The -= operator subtract 1 from the value of variable divisor and the result is stored back into the variable divisor. Therefore, it is functionally equivalent to the statement divisor = divisor - 1.)'''
    divisor -= 1
print("The largest divisor of", num,"is",divisor)


