'''
@goalDescription(Construct a program that convert Celsius to Fahrenheit.)
@name(Passing Values)
@distractor{code(print("The Fahrenheit is:", c)), helpDescription()}
@distractor{code(print("The Fahrenheit is:", F)), helpDescription()}
@distractor{code(print("The Celsius is:",convert(c))), helpDescription()}
@distractor{code(print("The Celsius is:",F) ), helpDescription()}
'''
#Step 1: Define the function
'''@helpDescription(We need to first declare the function so that we can call it later. The following lines declare the function convert that takes a Celsius temperature and convert it to Fahrenheit)'''
'''@helpDescription(Note that all statements following the header line are indented.)'''
def convert(x):
    '''@helpDescription(This statement converts Celsius to Fahrenheit.)'''
    '''@helpDescription(Note that F = C * 1.8 + 32)'''
    F = (x * 1.8) + 32
    '''@helpDescription(This statement returns the converted Fahrenheit temperature value.)'''
    return F
# Step 2: Initiate the value
'''@helpDescription(The statement initiates the Celsius temperature value)'''
c = 32
# Step 3: Print the converted temperature
'''@blank(This statement prints converted Fahrenheit value. In order to get c’s Fahrenheit value, we call the function convert and pass the value c as its argument.)'''
print("The Fahrenheit is:", convert(c))
# Step 4: Print the original Celsius.
'''@blank(This statement prints the original Celsius value)'''
print("The Celsius is:",c)