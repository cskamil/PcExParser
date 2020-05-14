'''
@goalDescription(Construct a function that uses binary search to find if a specific value is in a list (known as a "key"). Recall: Binary search uses the "Divide and Conquer" strategy. Given a list of ordered integers, the key is searched by dividing the data list in half and only searching in the half that contains the key, and repeating the process until the key is found and the index of the key is returned. If the key is not found, -1 is returned.)
@name(Iterative Binary Search)
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''

# Step 1: Define the binary search function
'''@helpDescription(The binary_search function takes in two arguments: data and key. "data" represents the list to be searched through, and "key" is the value you are looking for.)'''
def binary_search(data, key):
    # Step 1.1: Set default values
    '''@helpDescription("found" is initially set to False because we have not searched through the data yet. If we find the key in the data, "found" is changed to "True".)'''
    found = False
    '''@helpDescription("low" is 0, representing the index of the first item in the data list. "high" is the length of the data list minus 1, representing the index of the last item in the data list. )'''
    low = 0
    high = len(data) - 1
    # Step 1.2: Divide and Conquer
    '''@helpDescription(A while loop is used to continuously divide the ordered data list into 2 portions and only searching for the key in the portion that could contain it.)'''
    '''@helpDescription(The while loop continues until the key has been found, or until the value of "low" equals or surpasses the value of "high". This indicates that the entire data list has been searched.)'''
    while(not found and low <= high):
        '''@helpDescription(Adding high and low then dividing by 2 ensures that each guess is made in the middle of the list.)'''
        guess = (high+low)//2
        '''@helpDescription(If the index of "guess" in the data list matches the key, "found" is set to True because we have found the value we are looking for.)'''
        if key == data[guess]:
            found = True
        else:
            '''@helpDescription(If the key is smaller than the indexed value of guess in the data list, we know that the key is in the first half of the data list. If this is true, we can change "high" to be the index of guess minus 1 and only continue the search in the first half of the list.)'''
            if (key < data[guess]):
                '''@helpDescription("high" is "guess - 1" because in order for the code to reach this line, the key is not equal to the index of "guess" in the data list.)'''
                high = guess - 1
                '''@helpDescription(If the key is greater than the indexed value of guess in the data list, we know that the key is in the second half of the data list. If this is true, we can change "low" to be the index of guess plus 1 and only continue the search in the second half of the list.)'''
            else:
                '''@helpDescription("low" is "guess + 1" because in order for the code to reach this line, the key is not equal to the index of "guess" in the data list.)'''
                low = guess + 1
    '''@helpDescription(If the "key" is not found, "guess" is set to -1 as a convention.)'''
    if not found:
        guess = -1
    '''@helpDescription("guess" either represents the index of the key in the data list, or -1 if the key is not found.)'''
    return guess

# Step 2: Test the function
List = [10, 25, 30, 50, 55, 60, 70, 75, 80, 95]
print(binary_search(List,70))