'''
@goalDescription(Construct a program that computes the Celsius equivalent of an input Fahrenheit value using the formula C = (F - 32) (5/9). The input Fahrenheit value is an integer.)
@name(Fahrenheit to Celsius Conversion)
@input(59)
@distractor{code(conversion_factor = 5 / 9), helpDescription()}
@distractor{code(conversion_factor = base * 5 / 9), helpDescription()}
@distractor{code(celsius_temp = fahrenheit_temp - base * conversion_factor ), helpDescription()}
@distractor{code(celsius_temp = (base - fahrenheit_temp) * conversion_factor ), helpDescription()}
 '''
#Step 1: Assign initial values to the variables which we need for this program
'''@helpDescription(We need variable base to store the constant in the conversion formula. We set it to 32.)'''
base = 32
'''@blank(We need variable conversion_factor to store the conversion factor in the formula. We set it to 5/9.)'''
conversion_factor = 5 / 9

#Step 2: Read the input Fahrenheit value
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the Fahrenheit value, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the Fahrenheit value: ")
'''@helpDescription(We need to convert the input text to its integer representation. For this purpose, we use the conversion function int().)'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents a number. If the input number is a float, the int() function cuts off the fractional part of the floating-point number to create an integer.)'''
fahrenheit_temp = int(text)

#Step 3: Compute the Celsius equivalent of the Fahrenheit value
'''@blank(To get a Celsius equivalent of a Fahrenheit value, we subtract 32 from the Celsius value and multiply that by 5/9. Note that the precedence rules dictate that the multiplication happens before the subtraction in the final conversion computation. Therefore, to enforce the subtraction to be performed before multiplication, we must use parantheses in the formula.)'''
celsius_temp = (fahrenheit_temp - base) * conversion_factor 
'''@helpDescription(This statement prints to the default standard output stream the text "Fahrenheit Temperature:" and the value of variable fahrenheit_temp.<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)'''
print("Fahrenheit Temperature:" , fahrenheit_temp)
'''@helpDescription(This statement prints to the default standard output stream the text "Celsius Equivalent:" and the value of variable celsius_temp.<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)'''
print("Celsius Equivalent:" , celsius_temp)
