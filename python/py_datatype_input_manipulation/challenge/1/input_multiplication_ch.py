'''
@goalDescription(Construct a program that takes a user's inputs and calculate the division of the inputs.Then convert the division result into an integer, check the current division result's type and print the original division result, converted result and the original division result's float absolute value.)
@name(Input Manipulation)
@distractor{code(f = d), helpDescription()}
@distractor{code(f = d is int), helpDescription()}
@distractor{code(f = type(d)), helpDescription()}
@input(15)
@input(4)
'''
# Step 1: Import math library
'''@helpDescription(We need to first import the math library since we are going to use built-in functions in the math library later.)'''
import math
# Step 2: Take the first input from the user
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input() function. This statement prompts the user to enter the first value, then reads the text entered by the user and places it in the variable inputA. The value that will be stored in variable inputA is a string.)'''
input_a = input("Enter the first integer:")
'''@helpDescription(We need to convert the input inputA to its integer representation. For this purpose, we use the conversion function int())'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents a number. If the input number is a float, the int() function cuts off the fractional part of the floating-point number to create an integer.)'''
a = int(input_a)
# Step 3: Take the second input from the user
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input() function. This statement prompts the user to enter the first value, then reads the text entered by the user and places it in the variable inputB. The value that will be stored in variable inputB is a string.)'''
input_b = input("Enter the second integer:")
'''@helpDescription(We need to convert the input inputB to its integer representation. For this purpose, we use the conversion function int())'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents a number. If the input number is a float, the int() function cuts off the fractional part of the floating-point number to create an integer.)'''
b = int(input_b)
# Step 3: Division
'''@helpDescription(We divide a by b by using the mathematical expression /)'''
c = a/b
'''@helpDescription(We want to convert c to int type. We use the built-in function int() and store it into variable d.)'''
d = int(c)
# Check if d's type is integer and store the boolean result into the variable f
'''@blank(We want to check if the division result d is an integer type. We use the built-in function isinstance(), and store the Boolean result into the variable f.)'''
f = isinstance(d,int)
'''@helpDescription(We use the built-in function print to print the variable d.)'''
print(d)
'''@helpDescription(We use the built-in function print to print the Boolean variable f.)'''
print(f)
'''@helpDescription(We use the built-in function print to print the float absolute value of c. We use the built-in function fabs() from math library. )'''
print(math.fabs(c))

