'''
@goalDescription(Construct a program that finds and returns the biggest integer from a list of integers.)
@name(Finding Max)
@distractor{code(), helpDescription()} 
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''

# Step 1: Define the starting condition
markList = [50, 37, 71, 99, 63]
'''@helpDescription(The first element of the list is assumed to be the largest. If the following numbers in the list are larger, the function will replace the "max" with the new number.)'''
max = markList[0]

# Step 2: Iterate through the list of numbers and find the largest
'''@blank(Iterate through the list of numbers, to evaluate which one is the biggest.)'''
for number in markList:
    '''@blank(Initially, the first number in the list is assumed to be the max. The for loop will iterate through every number of the list, and if a number is bigger than the current "max", it will become the new "max".)'''
    if number > max:
        max = number

'''@helpDescription(Once the for loop finishes, "max" should be the biggest number in the list.)'''
print(max)