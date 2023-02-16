'''
@goalDescription(Construct a program that takes a user's inputs and multiplies the inputs.Then print the type of the result, convert the result to float and print its float absolute value. )
@name(Input Manipulation)
@input(17)
@input(5)
'''
# Step 1: Import math library
'''@helpDescription(We need to first import the math library since we are going to use built-in functions in the math library later.)'''
import math
# Step 2: Take the first input from the user
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input() function. This statement prompts the user to enter the first value, then reads the text entered by the user and places it in the variable input_a. The value that will be stored in variable input_a is a string.)'''
input_a = input("Enter the first integer:")
'''@helpDescription(We need to convert the input input_a to its integer representation. For this purpose, we use the conversion function int())'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents a number. If the input number is a float, the int() function cuts off the fractional part of the floating-point number to create an integer.)'''
a = int(input_a)
# Step 3: Take the second input from the user
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input() function. This statement prompts the user to enter the first value, then reads the text entered by the user and places it in the variable input_b. The value that will be stored in variable input_b is a string.)'''
input_b = input("Enter the second integer:")
'''@helpDescription(We need to convert the input input_b to its integer representation. For this purpose, we use the conversion function int())'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents a number. If the input number is a float, the int() function cuts off the fractional part of the floating-point number to create an integer.)'''
b = int(input_b)
# Step 3: Multiply the two variables
'''@helpDescription(We multiply the two input values by using the mathematical expression *)'''
c = a*b
'''@helpDescription(We want to print and check the type of the variable c.  We use the built-in function type().)'''
print(type(c))
'''@helpDescription(We want to print and convert the variable c to float. We use the built-in function float().)'''
print(float(c))
'''@helpDescription(We want to print the float absolute value of the variable c. We use the built-in function fabs() from math library.)'''
print(math.fabs(c))
