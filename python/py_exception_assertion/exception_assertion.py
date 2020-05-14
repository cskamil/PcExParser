'''
@goalDescription(Construct a program that takes in an integer larger than 10, and prints whether it is even or odd. There should be try-except blocks and assertion statements to handle the situation where the entry is not an integer or not greater than 10.)
@name(Raising Exceptions With Assertions)
@distractor{code(), helpDescription()} 
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''

# Step 1: Define the entry used by the program
entry = input('Please enter an integer larger than 10: ')

# Step 2: Define the program
'''@helpDescription(The try blocks tries to execute the code within it. The statements in the try block may throw several types of exceptions.)'''
try:
    '''@helpDescription("assert" statement assumes that the condition is True. If it is not, an AssertionError is thrown with the customizable error statement that follow the comma. If the AssertionError is not handled, it is automatically raised to the outer loop to be handled.)'''
    '''@helpDescription(In this statement, we assume that a decimal point "." is not in the entry. If it is, An AssertionError is thrown that displays the error "Incorrect entry. Please enter an INTEGER".)'''
    assert '.' not in entry, 'Incorrect entry. Please enter an INTEGER'
    '''@helpDescription(We assume the entry is an integer that is greater than 10. If it is not greater than 10, an AssertionError with the line "Incorrect entry. Number is not larger than 10" is thrown.)'''
    assert int(entry) > 10, 'Incorrect entry. Number is not larger than 10'
    '''@helpDescription(If the entry is not an integer resulting in a ValueError being thrown, this "except" block will catch it.)'''
except ValueError:
    '''@helpDescription(If a ValueError is thrown, this line is printed.)'''
    print('Incorrect entry. Please enter a valid number')
    '''@helpDescription(If an AssertionError is thrown by an assertion statement in the "try" block, it will be intercepted here. The custom AssertionError will be saved as the user-defined variable "e".)'''
except AssertionError as e:
    '''@helpDescription(The AssertionError saved as variable "e" will be printed here.)'''
    print(e)
    '''@helpDescription("Else" block executes if there are no errors. In this case, the entry must be an integer greater than 10.)'''
else:
    '''@helpDescription(If the entry is valid, the if-else block checks if the entry is odd or even. If entry modulo 2 equals to 0, the number is even.)'''
    if int(entry) % 2 == 0:
        print('Correct entry. The number is even')
        '''@helpDescription(If the entry is valid and the result of entry modulo 2 is not 0, then the number must be odd.)'''
    else:
        print('Correct entry. The number is odd')