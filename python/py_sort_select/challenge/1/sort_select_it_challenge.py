'''
@goalDescription(Construct a function that uses selection sort to sort a scrambled list from smallest to biggest. Please consult class notes if you are unfamiliar with selection sort.)
@name(Iterative Selection Sort)
@distractor{code(data[index] = temp), helpDescription()}
@distractor{code(for i in range(index,len(data) - 1):), helpDescription()}
'''

# Step 1: Define the function
'''@helpDescription(Selection sort works by looking for the smallest item in the list and exchanges it with the item whose index is 0. It then looks for the smallest item in the list with an index of 1 or greater, and exchanges it with the item whose index is 1. This process repeats until the list is sorted.)'''
'''@helpDescription("data", or the list to be sorted, is passed in as an argument if the function selectionSort.)'''
def selectionSort(data):
    # Step 1.1: Iterate through every item in the list
    '''@helpDescription(for loop iterates through every item in the data list. "index" represents the first unsorted item in the list.)'''
    for index in range(len(data)):
        '''@helpDescription("smallIndex" represents the index of the smallest item in the list. The smallest item in the list will be swapped with the first unsorted item in the list.)'''
        smallIndex = index
        # Step 1.2: Find the smallest item in unsorted portion of list`
        '''@helpDescription(For every item in the list, the unsorted portion of the list is iterated through once more to find the smallest value.)'''
        for i in range(index,len(data)):
            '''@helpDescription(If any item in the unsorted portion of the list is smaller than the first unsorted item in the list, "smallIndex" will be updated with that index. This line is repeated until the list has been searched, and "smallIndex" contains the index of the smallest item in the entire list.)'''
            if data[i] < data[smallIndex]:
                smallIndex = i

        # Step 1.3: Swap the smallest item in the list with the first unsorted item
        '''@helpDescription("temp" is a temporary variable, storing the value of the current first unsorted item in the list.)'''
        temp = data[index]
        '''@blank(The first item of the list is set to the smallest item in list.)'''
        data[index] = data[smallIndex]
        '''@helpDescription(What used to be the first item of the list is inserted into where the smallest value in the list was.)'''
        '''@helpDescription(Position of the first unsorted item in list and the smallest number in list is switched.)'''
        data[smallIndex] = temp
    return data

# Step 2: Test the function
numList = [9, 7, 1, 6, 3, 2]
print(selectionSort(numList))