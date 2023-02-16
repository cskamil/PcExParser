'''
@goalDescription(Binary Search operates by dividing an array in half, and then determining whether or not the target value would be in the larger or smaller half. Then, this process repeats by dividing whichever half must contain the target in half again, over and over until the target is found. Construct a function that performs binary search on a given array and returns the index of the target value if it is found, and -1 if it is not.)
@name(Binary search)
@distractor{code(while not found:), helpDescription()}
@distractor{code(if found:), helpDescription()}
@distractor{code(guess = low), helpDescription()}
'''
# Define a binary search function that also detects if the key in the given list.
'''@helpDescription(We first need to define a function that takes in the sorted array (data) and the target value (key) that we are searching for.)'''
def binary_search(data, key):
    '''@helpDescription(We’ll need to track whether or not we’ve found the key in the data. At the start of the function, we haven’t found it yet, so it must be initialized to False. )'''
    found = False
    '''@helpDescription(Binary search narrows down its search area over time. When the search begins, the entire array is considered, so we initialize the lower bound of the search range to be index 0 (the first element) of the array)'''
    low = 0
    '''@helpDescription(The upper bound of the search range is set to the index of the last element of the array (length-1). )'''
    high = len(data)-1
    # Using while to conduct a search iteration
    '''@blank(We must keep searching until we either find the element, or conclude that the target value is not in the array because the upper and lower bounds of the search area have intersected with no data remaining between them. )'''
    while (not found and low <= high):
        '''@helpDescription(In each iteration, we guess that the target value is in the middle of the search area. )'''
        guess = (high + low) // 2
        '''@helpDescription(We check if the current element at the middle index is our key )'''
        if (key == data[guess]):
            '''@helpDescription(If it is found, we set found = True, which will end the while loop.)'''
            found = True
        '''@helpDescription(Otherwise, if we have not found the value, we will continue the search)'''
        else:
        '''@helpDescription( We will determine where to make our guess based on whether or not the target value is lower or higher than the number at the index of our previous guess (remember: binary search assumes that the array is already sorted!).)'''
            if (key<data[guess]):
                '''@helpDescription(If the target value is less than the value at the guessed index, then we narrow the search range by lowering the upper bound.)'''
                high = guess-1
            '''@helpDescription(Otherwise, we narrow the search by increasing the lower bound)'''
            else:
                '''@helpDescription(We instead raise the lower bound. )'''
                low = guess+1
    # After one of the while conditions is not satisfied anymore, we need to check if the key is found
    '''@blank(If the while loop exits and found = False, then the target value does not exist in the array. )'''
    if not found:
        '''@blank(Because the target value is not in the array, we return -1 to indicate that no valid index exists.)'''
        guess = -1
    '''@helpDescription(This line returns the index of the target within the array or the value -1 to the caller, depending on whether or not the value was found in the array.)'''
    return guess
'''@helpDescription(Initializing the list)'''
data = [1, 5, 7, 9, 11, 13]
'''@helpDescription(We want to call binarySearch on the array. This function call is enclosed within a print statement so that the returned value is then printed.)'''
print(binary_search(data, 14))
