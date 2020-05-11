'''
@goalDescription(Construct a function that uses sequential search to find if a specific value is in a list (known as a "key"). Recall: Sequential search compares the key to each value in the list in sequence until it finds a matching value. The function then returns the index of the matching value in the list. If no matching value is found, -1 is returned.)
@name(Iterative Sequential Search)
@distractor{code(if (key == data):), helpDescription()}
@distractor{code(while(not found and index <= len(data)):), helpDescription()}
@distractor{code(return index+1), helpDescription()}
'''

# Step 1: Define the sequential search function
'''@helpDescription(sequential_search function is defined, and two objects are passed in. "data" is the list of data to be searched, and "key" is the value you want to find the index of in "data".)'''
def sequential_search(data, key):
    # Step 1.1: Set default values
    '''@helpDescription("found" is initially set to False because we have not searched through the data yet. If we find the key in the data, "found" is changed to "True".)'''
    '''@helpDescription("index" is set to 0 because we start searching the data from the beginning.)'''
    found = False
    index = 0
    # Step 1.2: Iterate through data until key is found
    '''@blank(A while loop is used to iterate through the data until a value in "data" matches the value of "key", or until the end of the list "data" is reached.)'''
    '''@blank(Index is incremented by 1 for each iteration of the while loop while the key is not found. When the key is found, the index is is that of the key in the data list.)'''
    while(not found and index < len(data)):
        '''@blank(Every value in "data" is compared to "key". At any point the value in "data" matches "key", "found" is changed to "True".)'''
        if (key == data[index]):
            found = True
            '''@helpDescription(If the value in "data" does not match "key", index is incremented by 1.)'''
        else:
            index = index + 1

    # Step 1.3: Consider other possibilities
    '''@helpDescription(If the key is not found in "data", -1 is returned as a convention.)'''
    '''@helpDescription("index" will equal the length of the data list if the key is not found in "data", so the while loop stops. -1 is returned as a convention when a value is not found.)'''
    if not found:
        index = -1

    '''@blank("index" represents the index of the "key" in the list "data". If "key" is not found in "data", -1 is returned.)'''
    return index

# Step 2: Test the function
stations = ['WEM','Southgate','Clareview','Stadium','Millwoods','Strathcona']
print(sequential_search(stations,'Westmount'))