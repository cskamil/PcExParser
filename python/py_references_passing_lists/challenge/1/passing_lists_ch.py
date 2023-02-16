'''
@goalDescription(Construct a program that convert Celsius temperature values in a list to Fahrenheit temperature values)
@name(Passing Lists)
@distractor{code(for i in c_list:), helpDescription()}
@distractor{code(i=(i*1.8)+32), helpDescription()}
'''
# Step 1: Define the function
'''@helpDescription(We need to first declare the function so that we can call it later. The following lines declare the function Fahrenheit that takes a list and convert each element from Celsius to Fahrenheit.)'''
'''@helpDescription(Note that all statements following the header line are indented.)'''
def Fahrenheit(c_list):
#Step 1.1 :Iterate through the list and compute each value’s Fahrenheit value
    '''@blank(We want to iterate over the list and access each element by using index.)'''
    for i in range(len(c_list)):
        '''@blank(This statement converts each element to its Fahrenheit value.)'''
        c_list[i] = (c_list[i]*1.8)+32
# Step 2: Initiate the list
'''@helpDescription(This statement initiates the original list.)'''
celsius_list = [25, 3, 40, -5]
# Step 3: Call the function
'''@helpDescription(This statement calls the Fahrenheit function and pass the celsius_list as its argument.)'''
'''@helpDescription(Note that the function call must be done after the function is declared.)'''
Fahrenheit(celsius_list)
# Step4: Print the Fahrenheit values
'''@helpDescription(This statement prints the current list celsius_list whose values have been converted to Fahrenheit.)'''
'''@helpDescription(The list has two characteristics: subscriptability and mutability. Subscriptability indicates that a list can be accessed by index positions; mutability indicates that a list structure can be changed in place rather than requiring reassignment. When passing a list and access it by its index, we are also changing its original values.)'''
print('The converted Fahrenheit temperature is:',celsius_list)