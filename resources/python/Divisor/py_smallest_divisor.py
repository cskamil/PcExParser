'''
@goalDescription(Construct a program that finds the smallest divisor of a number other than 1.)
@correctOutput(The output is:\nThe smallest divisor of 15 is 3)
'''
#Step 1: Define the variables that we need for this program
'''@helpDescription(We define variable num to store the number that we want to find its smallest divisor.)'''
num = 15
'''@helpDescription(We define variable divisor to store the smallest divisor of the number. We initialize variable divisor by 2 because we are looking for the first divisor greater than 1.)'''
divisor = 2

#Step 2: Find the smallest divisor of the number
'''@helpDescription(We need to increment the divisor repeatedly in a while loop until the divisor is a factor of the number. We can test whether the divisor is a factor the number by computing the remainder of the division of the number by the divisor using the modulus (%) operator. The while loop stops executing when the divisor is a factor of the number (i.e., num % divisor == 0). In this program, the while loop executes once and updates the value of divisor to 3. After that, the loop stops executing because 3 is a factor of 15 and the loop test will be evaluated as false.)'''
while num % divisor != 0:
    '''@helpDescription(If the divisor is not a factor of the number, we increment the variable divisor by 1 and evaluate the loop test again. The += operator adds 1 to the value of variable divisor and the result is stored back into the variable divisor. Therefore, it is functionally equivalent to the statement divisor = divisor + 1.)'''
    divisor += 1
print("The smallest divisor of", num,"is",divisor)


