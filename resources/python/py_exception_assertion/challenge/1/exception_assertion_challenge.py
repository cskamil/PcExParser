'''
@goalDescription(Construct a program that takes in a decimal larger than 1.0, and prints whether it is divisible by 0.5. There should be try-except blocks and assertion statements to handle the situation where the entry is not a valid decimal, or it is not greater than 1.0.)
@name(Raising Exceptions With Assertions)
@distractor{code(assert int(entry) > 1, 'Incorrect entry. Entry is not greater than 1.0.'), helpDescription()}
@distractor{code(assert int(entry) >= 1, 'Incorrect entry. Entry is not greater than 1.0.'), helpDescription()}
'''

# Step 1: Define the entry used by the program
entry = input('Please enter a decimal larger than 1.0: ')

# Step 2: Define the program
'''@helpDescription(The try blocks tries to execute the code within it. The statements in the try block may throw several types of exceptions.)'''
try:
    '''@helpDescription("assert" statement assumes that the condition is True. If it is not, an AssertionError is thrown with the customizable error statement that follow the comma. If the AssertionError is not handled, it is automatically raised to the outer loop to be handled.)'''
    '''@helpDescription(In this statement, we assume that a decimal point "." is in the entry. If it is, An AssertionError is thrown that displays the error "Incorrect entry. Please enter a decimal.")'''
    assert '.' in entry, 'Incorrect entry. Please enter a decimal.'
    '''@blank(We assume the entry is a float that is greater than 1.0. If it is not, an AssertionError with the line "Incorrect entry. Number is not larger than 1.0" is thrown.)'''
    assert float(entry) > 1, 'Incorrect entry. Entry is not greater than 1.0.'
    '''@helpDescription(If the entry is not a valid number resulting in a ValueError being thrown, this "except" block will catch it.)'''
except ValueError:
    '''@helpDescription(If a ValueError is thrown, this line is printed.)'''
    print('Incorrect entry. Please enter a valid decimal number.')
    '''@helpDescription(If an AssertionError is thrown by an assertion statement in the "try" block, it will be intercepted here. The custom AssertionError will be saved as the user-defined variable "e".)'''
except AssertionError as error:
    '''@helpDescription(The AssertionError saved as variable "error" will be printed here.)'''
    print(error)
    '''@helpDescription("Else" block executes if there are no errors. In this case, the entry must be a decimal greater than 1.0.)'''
else:
    '''@helpDescription(If the entry is valid, the if-else block checks if the entry is divisible by 0.5. If entry modulo 0.5 equals to 0, the number is divisible by 0.5.)'''
    if float(entry) % 0.5 == 0:
        print('Correct entry. The number is divisible by 0.5.')
        '''@helpDescription(If the entry is valid and the entry modulo 0.5 is not 0, then the number is not divisible by 0.5.)'''
    else:
        print('Correct entry. The number is not divisible by 0.5.')