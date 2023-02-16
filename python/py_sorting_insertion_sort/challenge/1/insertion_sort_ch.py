'''
@goalDescription(Insertion sort works similarly to how one would sort a hand of cards: by choosing an element and searching through the rest of the array to determine its proper place. Construct a function that performs insertion sort in descending order on the given list.)
@name(Insertion Sort)
@distractor{code(while j>0 and current > data[j]:), helpDescription()}
@distractor{code(while j>=0 and current < data[j]:), helpDescription()}
@distractor{code(data[j] = data[j+1]), helpDescription()}
@distractor{code(data[i+1] = data[i]), helpDescription()}
@distractor{code(while j>=0 and current < data[j]:), helpDescription()}
'''
# Define the insertion sorting function that sorts the given list in a descending order
'''@helpDescription(We want to define our function to take in a single parameter -- the list we’d like to sort.)'''
def insertion_sort(data):
    '''@helpDescription(The outer loop of insertion sort traverses through the entire list, starting at index 1 (the second element). This is because we want to later create a variable (j) that is always equal to i-1, so we start the outer loop at i=1 to keep j greater than or equal to zero.)'''
    for i in range(1, len(data)):
        '''@helpDescription(We initialize the variable current equal to the value at index i of the array.)'''
        current = data[i]
        '''@helpDescription(Insertion sort works by comparing the current value to its predecessor, and then (if the current value is greater than its predecessor) comparing the current element to the elements before the predecessor. Therefore, we want a variable to start at i-1 -- the predecessor to the current element.)'''
        j = i-1
        '''@blank(The outer loop iterates through the list sequentially, whereas the inner while loop will iterate through the list backwards if the current element is greater than its predecessor. We want the algorithm to keep comparing current to larger and larger elements of the list until it finds the index it should be at, so we initialize the while loop condition to run until either there are no more elements to traverse backwards through, or we find the right place for current to reside in the array.)'''
        while j>=0 and current > data[j]:
            '''@blank(If current is smaller than its predecessor, we want to swap their positions. However, we don’t want to swap current just yet, because we might end up needing to make more swaps afterwards if current still isn’t in the right place. It’s easier to keep track of current’s initial position by instead swapping array elements directly, keeping current in reserve assigned to the current element of the list (that is, the current element before any swaps happened).)'''
            data[j+1] = data[j]
            '''@helpDescription(Since we’re traversing backwards, we need to decrement j.)'''
            j -=1
        '''@helpDescription(When the while loop has finished, we know the proper position of current: index j+1 (and not j, since j decrements after each iteration of the while loop -- if we were to specify that current should go at index j after the loop finishes, current would be one index too far to the left in the array).)'''
        data[j+1] = current
    '''@helpDescription(Once the outer loop has finished, the array is sorted and we can return it to the caller. )'''
    return data
'''@helpDescription(We initialized the list)'''
num_list = [30, -20, 25, 0, 2, 5]
'''@helpDescription(We call InsSort() on the list we initialized. Because we want to print the list after it’s been sorted, we enclose the function call in a print statement. )'''
print(insertion_sort(num_list))