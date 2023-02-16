'''
@goalDescription(Construct a function that calculate square values of the list’s elements.)
@name(Passing Lists)
'''
# Step 1: Define the function
'''@helpDescription(We need to first declare the function so that we can call it later. The following lines declare the function square that takes a list and square each element.)'''
'''@helpDescription(Note that all statements following the header line are indented.)'''
def square(list):
#Step 1.1 :Iterate through the list and compute each value’s square value
    '''@helpDescription( We want to iterate over the list and access each element by using index.)'''
    for i in range(len(list)):
        '''@helpDescription(This statement converts each element to its squared value.)'''
        list[i] *= list[i]
    '''@helpDescription(This statement prints the list after converting all the original values to squared values.)'''
    print(list)
#Step 2: Initiate the list
'''@helpDescription(This statement initiates the original list)'''
num_list = [2,3,4,5]
#Step 3: Call the function
'''@helpDescription(This statement calls the square function and pass the list num_list as its argument. )'''
'''@helpDescription( Note that the function call must be done after the function is declared.)'''
square(num_list)
#Step 4: Print the list
'''@helpDescription(This statement prints the list num_list.)'''
'''@helpDescription(The list has two characteristics: subscriptability and mutability. Subscriptability indicates that a list can be accessed by index positions; mutability indicates that a list structure can be changed in place rather than requiring reassignment. When passing a list and access it by its index, we are also changing its original values)'''
print(num_list)