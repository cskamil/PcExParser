'''
@goalDescription(Construct a function that increases the original integer's value by 1 and return the increased value's memory address.)
@name(Passing Values)
'''
# Step 1: Define the function
'''@helpDescription(We need to first declare the function so that we can call it later. The following lines declare the function increment that takes an integer and prints its original memory address and increases the original integer by 1 and then prints its current memory address.)'''
'''@helpDescription(Note that all statements following the header line are indented.)'''
def increment(x):
    # Step 1.1: Print x’s original memory address
    '''@helpDescription(This statement prints the original memory address of x. We use a built in function id( ) to get the value’s memory address.)'''
    print(f"Initial address of x: {id(x)}")
    # Step 1.2: Increase x by 1
    '''@helpDescription(This statement increases x’s value by 1.)'''
    x += 1
    # Step 1.3: Print x’s current memory address
    '''@helpDescription(This statement prints the increased value’s memory address. We use a built in function id( ) to get the value’s memory address.)'''
    print(f"Final address of x: {id(x)}")
#Step2: Initiate n
'''@helpDescription(The statement initiates the integer n’s value.)'''
n = 9001
'''@helpDescription( This statement prints the original memory address of n. We use a built in function id( ) to get the value’s memory address.)'''
print(f"Initial address of n: {id(n)}")
#Step2: Call the funtion
'''@helpDescription(This statement calls the increment function and passes the value n as its argument.)'''
'''@helpDescription(Note that the function call must be done after the function is declared.)'''
increment(n)
'''@helpDescription( This statement prints the original memory address of n. We use a built-in function id( ) to get the value’s memory address.)'''
'''@helpDescription(Note that the address of x initially matches the address of n but changes after reassignment. However, the address of n never changes.)'''
print(f"Final address of n: {id(n)}")