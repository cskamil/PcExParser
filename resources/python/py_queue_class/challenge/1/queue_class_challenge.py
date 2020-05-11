'''
@goalDescription(Construct a class BoundedQueue so the user can implement queues. The class is bounded, meaning the capacity of the BoundedQueue is limited to the value passed in in the class definition. The class should contain the methods __init__(capacity), enqueue(item), dequeue(), and __str__(). Then, test the class by implementing a queue.)
@name(BoundedQueue)
@distractor{code(if capacity == 0:), helpDescription()}
@distractor{code(if capacity not 0:), helpDescription()}
@distractor{code(if len(self.__items) > self.__capacity:), helpDescription()}
@distractor{code(if self.items > self.__capacity:), helpDescription()}
@distractor{code(return self.__items.pop()), helpDescription()}
@distractor{code(str_exp += (str(self.__items[i]) + ' ')), helpDescription()}
'''

# Step 1: Define the Queue class
class BoundedQueue:
    '''@helpDescription(The capacity, or the maximum length allowed in the queue, is passed in as an integer when the BoundedQueue class is initialized.)'''
    def __init__(self, capacity):
        '''@helpDescription(The value passed in for capacity of a queue must be a positive integer. If the value is not, an exception indicating the TypeError is raised.)'''
        if type(capacity) != int:
            raise Exception('Error: Type error: %s' % (type(capacity)))
        '''@blank(If the value passed in for capacity is less than or equal to 0, an exception indicating the illegal capacity is raised.)'''
        if capacity <= 0:
            raise Exception('Error: illegal capacity: %d' %(capacity))

        '''@helpDescription(When the BoundedQueue class is initialized, a list is initalized which acts as the queue. The capacity and count (number of items in the queue) is also initialized.)'''
        '''@helpDescription(The double underscore __ indicates a private variable, meaning it can only be accessed or changed within this class. If we want to access the variable outside of the class, we must implement setter and getter methods which set or return the values sotred in the variables.)'''
        '''@helpDescription(Setter method: a method in a class that sets the value of a private variable. Getter: A method in a class that obtains and returns the value of a private variable.)'''
        self.__items = []
        self.__capacity = capacity

    '''@helpDescription(Adds an item to the end of the queue)'''
    def enqueue(self,item):
        '''@blank(In order the to enqueue another item, the queue cannot already be full. The if/else statement ensures that the number of items currently in the queue (length of the list) is less than the capacity.)'''
        if len(self.__items) >= self.__capacity:
            '''@helpDescription(If the queue is full, an exception with the line "Error: Queue is full" is raised.)'''
            raise Exception('Error: Queue is full')
        self.__items.append(item)

    '''@helpDescription(Removes and returns the first item to be queued. Queues work on a first-come-first-serve basis.)'''
    def dequeue(self):
        '''@helpDescription(If the user attempts to dequeue an empty queue, an exception with the line "Error: Queue is empty" is raised.)'''
        if len(self.__items)<=0:
            raise Exception('Error: Queue is empty')
        '''@blank(If the queue is not empty, the first item in the queue is removed and returned.)'''
        return self.__items.pop(0)

    '''@helpDescription(__str__ method is implicity called when print() is called. This __str__ method prints the queue out in a readable format, instead of as a Queue class object.)'''
    def __str__(self):
        '''@helpDescription(Opening bracket of queue)'''
        str_exp = ']'
        '''@helpDescription(Every item in the queue list is appended, in sequence, to the variable str_exp as a string object.)'''
        for item in self.__items:
            '''@blank()'''
            str_exp += (str(item) + ' ')
        '''@helpDescription(Closing bracket of queue)'''
        return str_exp + ']'

# Step 2: Test the Queue class
q = BoundedQueue(3)
'''@helpDescription(Items are enqueued into the queue one by one.)'''
q.enqueue('item1')
q.enqueue('item2')
q.enqueue('item3')
'''@helpDescription(The first item in the queue is dequeued.)'''
q.dequeue()
'''@helpDescription(__str__ method is implicity called, and the queue is printed in the format dictated by the __str__ method.)'''
print(q)