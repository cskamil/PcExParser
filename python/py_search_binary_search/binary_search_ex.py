'''
@goalDescription(Binary Search operates by dividing an array in half, and then determining whether or not the target value would be in the larger or smaller half. Then, this process repeats by dividing whichever half must contain the target in half again, over and over until the target is found. Construct a function that performs binary search on a given array and returns the index of the target value if it is found in the array. Assume that the target will be in the array (in other words, do not handle the case where the target does not exist in the array).)
@name(Binary search)
'''
# Define a binary search function
'''@helpDescription(We first need to define a function that takes in the sorted array (data) and the target value (key) that we are searching for.)'''
def binary_search(data, key):
    '''@helpDescription(We’ll need to track whether or not we’ve found the key in the data. At the start of the function, we haven’t found it yet, so it must be initialized to False.)'''
    found = False
    '''@helpDescription(Binary search narrows down its search area over time. When the search begins, the entire array is considered, so we initialize the lower bound of the search range to be index 0 (the first element) of the array)'''
    low = 0
    '''@helpDescription(The upper bound of the search range is set to the index of the last element of the array (length-1).)'''
    high = len(data)-1
    '''@helpDescription(We must keep searching until we find the element, so we will use a while loop that will run until found = True.)'''
    while not found:
        '''@helpDescription(In each iteration, we guess that the target value is in the middle of the search area.)'''
        guess = (high+low)//2
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
    '''@helpDescription( This line returns the index of the target within the array to the caller.)'''
    return guess
'''@helpDescription(We initialize the list)'''
data = [1, 5, 7, 9, 11, 13]
'''@helpDescription(We want to call binarySearch on the array. This particular implementation of binarySearch assumes that the target value exists within the array, so we must specify a key that we know to be in the array. This function call is enclosed within a print statement so that the returned value is then printed.)'''
print(binary_search(data, 13))