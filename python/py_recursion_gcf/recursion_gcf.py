'''
@goalDescription(Construct a program that recursively finds and returns the great common factor between of two integers.)
@name(Greatest Common Factor)
@distractor{code(), helpDescription()} 
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''

# Step 1: Define the starting condition
'''@helpDescription(Define a function that passes in two integers, a and b, that you are trying to find the greatest common factor (GCF) for.)'''
'''@helpDescription(Recall: the Great Common Factor is the largest number by which two numbers is divisible by. For example, the greatest common factor of 16 and 20 is 4, because 4 is the largest number 16 and 20 are both divisible by.)'''
def Recurgcf(a, b):
    '''@helpDescription(The min function returns the smallest of a tuple of a numbers)'''
    low = min(a, b)
    '''@helpDescription(The max function returns the largest of a tuple of a numbers)'''
    high = max(a, b)

# Step 2: Define the terminating condition
    '''@helpDescription(If the smaller of the two numbers is 0, then the great common factor is the larger number because 0 is divisble by every number except itself, and the largest value any other number is divisible by is itself.)'''
    if low == 0:
        '''@blank()'''
        return high
        '''@helpDescription(If the smaller of the two numbers is 1, then the great common factor is 1 because 1 is not divisible by any other number.)'''
    elif low == 1:
        return 1
    # Step 3: Recursion
        '''@helpDescription(The GCF cannot be greater than the smaller of the two numbers, and cannot be smaller than the remainder of the bigger number divded by the smaller number. Therefore, we recursively call the function again but passing in low, and the modulo of high%low as the possible range of the GCF. The function is called recursively until low = 0 or low = 1, meaning the high%low reached 1 or 0, and cannot be divided anymore. GCF is found as the larger of the two numbers, as the smaller number is 0 or 1.)'''
        '''@helpDescription(Recall: The modulo operator (%) returns the remainder when two numbers are divided.)'''
    else:
        '''@blank()'''
        return Recurgcf(low, high%low)
'''@blank(Pass in two numbers you are looking for the greatest common factor of.)'''
print(Recurgcf(12,14))