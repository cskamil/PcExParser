'''
@goalDescription(Construct a function that uses recursive binary search to find if a specific value is in a list (known as a "key"). Recall: Binary search uses the "Divide and Conquer" strategy. Given a list of ordered integers, the key is searched by dividing the data list in half and only searching in the half that contains the key, and repeating the process until the key is found and the index of the key is returned. If the key is not found, -1 is returned.)
@name(Recursive Binary Search)
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''

# Step 1: Define the function
'''@helpDescription(The binary_search function takes in several arguments. "data" represents the list to be searched through, "key" is the value you are looking for, and "low" and "high" are boundaries within the list where you know the key is.)'''
def binary_search(data, key, low, high):
    # Step 1.1: Set default values
    '''@helpDescription("guess" represents the index within the data list where you make your first guess at where the key may be located. We know the key has to be either within the first half of "data", or the second half. If the guess is higher than the key, we will only continue the search in the first half of the list. If the guess is lower than the key, we will only continue the search in the latter half)'''
    guess = (high + low) // 2
    # Step 1.2: Set terminating condition(s)
    '''@helpDescription(Terminating condition 1: If the lower boundary is greater than or equal to the high boundary, it means the entire list has been searched and that the key is not in the list.)'''
    if low >= high:
        '''@helpDescription(-1 is returned as a convention, when the key is not found.)'''
        return -1
        '''@helpDescription(Terminating condition 2: If the key value matches the value in "guess"' position in "data", we have found the key.)'''
    elif key == data[guess]:
        '''@helpDescription(The index of the key in "data" is returned.)'''
        return data.index(key)
        '''@helpDescription(Executes if the key has not yet been found, and "data" has not been completely searched through.)'''
    # Step 1.3: Set recursion condition
    else:
        '''@helpDescription(If the key is less than the value guessed, "high" is set to "guess" because the key can only be in the first half of the list.)'''
        if (key < data[guess]):
            high = guess
            '''@helpDescription(If the key is greater than the value guessed, "low" is set to "guess + 1" because the key can only be in the latter half of the list. +1 is added to "low" so that the "low" and "high" will equal if the list has been completely searched.)'''
        else:
            low = guess + 1
        '''@helpDescription(The binary_search function is recursively called, but passing in a more restricted range for "low" and "high".)'''
        return binary_search(data, key, low, high)

#Step 2: Test the function
List = [1,2,3,4,5,6,7,8,9,10]
key = 8
idx = binary_search(List, key, 0, len(List))
print(idx)