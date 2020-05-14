'''
@goalDescription(Construct a program that recursively finds and returns the great common factor between of two integers. This is a simple implementation--fill in the missing lines.)
@name(Greatest Common Factor)
@distractor{code(return b), helpDescription()}
@distractor{code(return a%b), helpDescription()}
@distractor{code(return gcd2(b%a, b)), helpDescription()}
@distractor{code(return gcd2(a%b, b)), helpDescription()}
'''

# Step 1: Define the terminating condition
def gcd2(a, b):
    '''@helpDescription(If b is 0, then the great common factor is a because 0 is divisble by anything.)'''
    if b == 0:
        '''@blank(When called recursively, b is 0 when a divided by b has a remainder of 0. This means that a and b are multiples of each other, and that the great common factor must be a.)'''
        return a
        # Step 3: Recursion
    else:
        '''@blank(If a and b are not multiples of each other to start, we recursively call the gcd() method again, but passing in b and the remainder of a%b as the values of a and b respectively. The greatest common factor must be between these two numbers because the greatest common factor must be between the smaller number, and the remainder between the bigger number divided by the smaller number.)'''
        return gcd2(b, a%b)
'''@helpDescription(Pass in two numbers you are looking for the greatest common factor of.)'''
print(gcd2(12,14))