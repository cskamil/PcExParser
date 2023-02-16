'''
@goalDescription(Descending-order Selection sort operates by finding the maximum element of an array and moving it to the “beginning” of the array, with the “beginning” of the array incrementing forward after each element is placed in its proper position. Construct a function that performs selection sort on the given list, in descending order.)
@name(Selection sort)
@distractor{code(if max_index < j), helpDescription()}
@distractor{code(if data[max_index] < data[j]), helpDescription()}
'''
# Define a function that achieves descending-order selection sort.
'''@helpDescription(We want to define our function to take in a single value: the array to be sorted.)'''
def sel_sort(data):
    '''@helpDescription(We want to look over every element in the list, so we use a for-loop that will iterate len(data) times.)'''
    for i in range(len(data)):
            '''@helpDescription(Selection sort operates on the basic principle of finding the minimum or maximum item of the array (depending on desired sort order) of the array and placing it at the beginning. To extend this concept to sorting an entire array, the “beginning” changes with each iteration of the outer for-loop. During the first iteration of the outer for-loop, the “beginning” of the array is set to i=0, which happens to be the actual beginning of the array. The inner for-loop then searches through all remaining array elements starting at i=1 (since we don’t need to search the element at i=0) and going until the end of the list. Once the smallest or largest value of all those searched has been found, it is placed at the “beginning” -- index i. During subsequent loop iterations, the “beginning” will be index 1 and the inner for-loop will start the search at index 2, and so forth and so on until i is equal to the final index of the array.)'''
            max_index = i
            '''@helpDescription(Because we want to search through a subsection of the array (all elements at indices greater than i), we start the loop at i+1 and continue until the end of the array. )'''
            for j in range(i+1, len(data)):
            # Check if the current element at maxindex is smaller than the next element
                '''@blank(We want to sort in descending order, so we check to see if we’ve found an element greater than the current element at maxIndex.)'''
                if data[max_index] < data[j]:
                    '''@helpDescription(If we’ve found an element greater than the element at maxIndex, we set maxIndex equal to the index of the newly-discovered larger element.)'''
                    max_index = j
            '''@helpDescription(When the inner for-loop finishes, maxIndex will be the index of the largest element. By swapping the element at index i and maxIndex, we move the largest element into its proper place. Note that the element at maxIndex at this step will not necessarily be the largest element in the entire array, but it will always be the largest element between index i and the end of the array.)'''
            data[i], data[max_index] = data[max_index], data[i]
    '''@helpDescription(Once both for-loops have finished, we return the now-sorted array to the caller.)'''
    return data
'''@helpDescription(We initialized the num_list)'''
num_list = [20, -3, 0, 25, 300, 10]
'''@helpDescription(To sort the array of numbers initialized, we pass it into sel_sort() as the sole parameter. Because we want to print the sorted array once selSort() has finished, we enclose the function call within a print statement.)'''
print(sel_sort(num_list))
