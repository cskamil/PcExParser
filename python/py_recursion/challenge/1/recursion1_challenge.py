'''
@goalDescription(Using a while loop, construct a program that finds and returns the smallest integer from a list of integers.)
@name(Finding Min)
@distractor{code(while index < len(markList):), helpDescription()}
@distractor{code(if index < min:), helpDescription()}
@distractor{code(for index in markList:), helpDescription()}
'''

# Step 1: Define the starting condition
markList = [87, 36, 23, 9, 54]
'''@helpDescription(The first element of the list is assumed to be the smallest. If the following numbers in the list are smaller, the function will replace the "min" with the new number.)'''
min = markList[0]

# Step 2: Using a while loop. iterate through the list of numbers and find the smallest number.
index = 0
'''@blank(Iterate through the list of numbers, to evaluate which one is the smallest.)'''
while index < len(markList):
    '''@blank(Initially, the first number in the list is assumed to be the min. The for loop will iterate through every number of the list, and if a number is smaller than the current "min", it will become the new "min".)'''
    if markList[index] < min:
        min = markList[index]
    index +=1

'''@helpDescription(Once the for loop finishes, "min" should be the smallest number in the list.)'''
print(min)