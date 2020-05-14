'''
@goalDescription(Construct a program that takes in an integer smaller than 8, printing a success statement if the entry is valid. If the value entered is not an integer or is greater than or equal to 8, an exception is raised for each case.)
@name(Raising Exceptions)
@distractor{code(raise ValueError('Entry unsuccessful. Number is equal to 8.')), helpDescription()}
@distractor{code(except Exception:), helpDescription()}
@distractor{code(catch Error as (e):), helpDescription()}
'''

# Step 1: Define the entry used by the function
value = input('Enter an integer less than 8: ')

# Step 2: Define the function
'''@helpDescription(The try blocks tries to execute the code within it. The statements in the try block may throw several types of exceptions.)'''
try:
    '''@helpDescription(If the value entered is more than 8, an error is thrown.)'''
    if int(value) > 8:
        '''@helpDescription(The 'raise' command is able to raise a custom exception anytime a condition is fulfilled. In this case, a string is returned if the integer entered is greater than 8.)'''
        '''@helpDescription(If the error raised is not handled immediately, it is again raised to the next-most outer loop of the program to be handled. In this case, this exception is raised to the out loop.)'''
        raise Exception('Entry unsuccessful. Number is larger than 8.')
    elif int(value) == 8:
        '''@blank()'''
        raise Exception('Entry unsuccessful. Number is equal to 8.')
    '''@blank(If the value entered is not an integer, a ValueError will be thrown. This line handles the ValueError, and prints a response.)'''
except ValueError:
    print('Entry unsuccessful. The value entered is not an integer')
    '''@blank(If any exceptions other than ValueError occur, they will be intercepted and handled here. The exception is saved in the user-defined variable "e". If the exception is one of the custom exceptions raised in the "try" block, the custom exception will be saved in the variable "e".)'''
except Exception as e:
    '''@helpDescription(Any exception other than ValueError will be printed here. If the exception is a custom exception raised in the "try" block, the custom line will be printed here.)'''
    print(e)
    '''@helpDescription(If there are no exceptions or errors (program runs as it is supposed to), the "else:" block will execute.)'''
else:
    print('Entry is successful.')