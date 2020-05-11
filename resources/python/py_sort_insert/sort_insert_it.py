'''
@goalDescription(Construct a function that uses insertion sort to sort a scrambled list from smallest to biggest. Please consult class notes if you are unfamiliar with insertion sort.)
@name(Iterative Selection Sort)
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''

# Step 1: Define the function
'''@helpDescription(Insertion sort iterates through every item of a list, keeping sorted items to its left and unsorted items to its right. Insertion sort takes each unsorted item, and "inserts" it into the correct position in the sorted portion of the list.)'''
def insertionSort(data):
    '''@helpDescription(For loop traverses through every item in the list starting the second item, because the first item is already sorted. )'''
    for index in range(1,len(data)):
        '''@helpDescription(The item to be moved is saved as the temporary variable "temp".)'''
        temp = data[index]
        '''@helpDescription(The position of the item to be moved is saved as the temporary variable "position".)'''
        position = index
        '''@helpDescription(The variable to be moved is shifted leftwards until it is greater than the value before it (inserted in the correct position). "position > 0" ensures that the value being moved to does not exceed the list.)'''
        while position > 0 and data[position-1] > temp:
            '''@blank(All the values larger than "temp" are incrementally moved to the right.)'''
            data[position] = data[position-1]
            position = position-1
        '''@helpDescription(The item to be moved is moved into the correct position)'''
        data[position] = temp
    return data

# Step 2: Test the function
data = [50, 37, 71, 99, 63]
print(insertionSort(data))