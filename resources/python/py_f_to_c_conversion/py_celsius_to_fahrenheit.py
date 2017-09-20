'''
@goalDescription(Construct a program that computes the Fahrenheit equivalent of an input Celsius value using the formula F = (9/5)C + 32. The input Celsius value is an integer.)
@name(Celsius To Fahrenheit Conversion)
@input(34)
@distractor{code(conversion_factor = 9 // 5), helpDescription()}
@distractor{code( 9 / 5 = conversion_factor), helpDescription()}
@distractor{code(fahrenheit_temp = celsius_temp * conversion_factor - base), helpDescription()}
@distractor{code(fahrenheit_temp = celsius_temp + conversion_factor * base), helpDescription()}
 '''
#Step 1: Assign initial values to the variables which we need for this program
'''@helpDescription(We need variable base to store the constant in the conversion formula. We set it to 32.)'''
base = 32
'''@blank(We need variable conversion_factor to store the conversion factor in the formula. We set it to 9/5.)'''
conversion_factor = 9 / 5

#Step 2: Read the input Celsius value
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the Celsius value, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the Celsius value: ")
'''@helpDescription(We need to convert the input text to its integer representation. For this purpose, we use the conversion function int().)'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents a number. If the input number is a float, the int() function cuts off the fractional part of the floating-point number to create an integer.)'''
celsius_temp = int(text)

#Step 3: Compute the  Fahrenheit equivalent of the Celsius value
'''@blank(To get a Fahrenheit equivalent of a Celsius value, we multiply the Celsius value by 9/5 and add 32 to that. Note that the precedence rules dictate that the multiplication happens before the addition in the final conversion computation.)'''
fahrenheit_temp = celsius_temp * conversion_factor + base
'''@helpDescription(This statement prints to the default standard output stream the text "Celsius Temperature:" and the value of variable celsius_temp.<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)'''
print("Celsius Temperature:" , celsius_temp)
'''@helpDescription(This statement prints to the default standard output stream the text "Fahrenheit Equivalent:" and the value of variable fahrenheit_temp.<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)'''
print("Fahrenheit Equivalent:" , fahrenheit_temp)
