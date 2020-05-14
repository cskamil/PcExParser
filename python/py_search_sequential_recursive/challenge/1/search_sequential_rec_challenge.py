'''
@goalDescription(Construct a function that uses recursive sequential search to find if a specific value is in a list (known as a "key"). Recall: Sequential search compares the key to each value in the list, in sequence, until a matching value is found. The function then returns the index of the matching value in the original list. If no matching value is found, -1 is returned.)
@name(Recursive Sequential Search)
@distractor{code(return(sequential_search(data, key))), helpDescription()}
@distractor{code(sequential_search(data[1:], key, index), helpDescription()}
@distractor{code(elif key == data[0:]), helpDescription()}
'''

# Step 1: Define the function
'''@helpDescription("sequential_search" function is defined, taking in 3 arguments. "data" is the list of data to be searched, "key" is the value you want to find the index of, and "index" the the index of the "key" in "data" you are looking for.)'''
def sequential_search(data, key, index=0):
    # Step 1.1: Set terminating conditions
    '''@helpDescription(If the length of the data list is 0, it means it is empty and that the key is not in the list.)'''
    if len(data) == 0:
        '''@helpDescription(If the key is not found in the the list, -1 is returned as a convention.)'''
        index = -1
        return index
        '''@blank(If the key matches the first element of the data list, the key has been found and its index is returned.)'''
    elif key == data[0]:
        return index
    # Step 1.2: Set recursion conditions
        '''@helpDescription(If the key does not match the first element of the data list, we continue searching by calling the sequential_search function again, but passing in the data list without the first element as the list to be searched.)'''
    else:
        '''@helpDescription(Every time the first element of the data list does not match the key, the index is incremented by 1. This corresponds to the index of the key in the data list, when it is found.)'''
        index += 1
        '''@blank(sequential_search funtion is recursively called, but the list is shortened to exclude the part we know does not match the key. The index is also passed in, because it represents the number of places in the data list that does not contain the key.)'''
        return(sequential_search(data[1:], key, index))

# Step 2: Test the function
numbers = [1, 5, 6, 9, 12, 14, 19, 23, 25, 33]
print(sequential_search(numbers,25))