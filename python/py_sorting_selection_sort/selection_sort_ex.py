'''
@goalDescription(Ascending-order Selection sort operates by finding the minimum element of an array and moving it to the “beginning” of the array, with the “beginning” of the array incrementing forward after each element is placed in its proper position. Construct a function that performs selection sort on the given list, in ascending order. )
@name(Selection sort)
'''
# Define a function that achieves ascending-order selection sort.
'''@helpDescription( We want to define a function to take in a single value: the array to be sorted)'''
def sel_sort(data):
    # Reorder the list in an ascending order.
    '''@helpDescription(We want to look over every element in the list, so we use a for-loop that will iterate len(data) times.)'''
    for i in range(len(data)):
        '''@helpDescription( Selection sort operates on the basic principle of finding the minimum or maximum item of the array (depending on desired sort order) and placing it at the beginning. To extend this concept to sorting an entire array, the “beginning” changes with each iteration of the outer for-loop. During the first iteration of the outer for-loop, the “beginning” of the array is set to i=0, which happens to be the actual beginning of the array. The inner for-loop then searches through all remaining array elements starting at i=1 (since we don’t need to search the element at i=0) and going until the end of the list. Once the smallest or largest value of all those searched has been found, it is placed at the “beginning” -- index i. During subsequent loop iterations, the “beginning” will be index 1 and the inner for-loop will start the search at index 2, and so forth and so on until i is equal to the final index of the array.)'''
        min_index = i
        '''@helpDescription( Because we want to search through a subsection of the array (all elements at indices greater than i), we start the loop at i+1 and continue until the end of the array.)'''
        for j in range(i+1, len(data)):
            '''@helpDescription( We want to sort in ascending order, so we check to see if we’ve found an element smaller than the current element at minIndex.)'''
            if data[min_index] > data[j]:
                    '''@helpDescription(If we’ve found an element smaller than the element at minIndex, we set minIndex equal to the index of the newly-discovered smaller element. )'''
                    min_index = j
        '''@helpDescription( When the inner for-loop finishes, minIndex will be the index of the smallest element. By swapping the element at index i and minIndex, we move the smallest element into its proper place. Note that the element at minIndex at this step will not necessarily be the smallest element in the entire array, but it will always be the smallest element between index i and the end of the array)'''
        data[i], data[min_index] = data[min_index], data[i]
    '''@helpDescription( Once both for-loops have finished, we return the now-sorted array to the caller.)'''
    return data
'''@helpDescription(We initialize a list)'''
num_list = [20, -3, 0, 25, 300, 10]
'''@helpDescription( To sort the array of numbers initialized, we pass it into sel_sort() as the sole parameter. Because we want to print the sorted array once selSort() has finished, we enclose the function call within a print statement.)'''
print(sel_sort(num_list))
