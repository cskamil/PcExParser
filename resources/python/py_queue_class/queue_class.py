'''
@goalDescription(Construct a class CircularQueue so the user can implement queues. The class is circular, meaning within the indicated capacity, the head and the tail of the class is shifted in a circle-like fashion indefinitely. The capacity of the CircularQueue should be passed in as an argument in the class definition. The class should contain the methods __init__(capacity), enqueue(item), dequeue(), peek(), and __str__(). Then, test the class by implementing a queue.)
@name(Queue)
@distractor{code(), helpDescription()} 
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''

# Step 1: Define the Queue class
class CircularQueue:
    '''@helpDescription(The capacity, or the maximum length allowed in the queue, is passed in as an integer when the CircularQueue class is initialized.)'''
    def __init__(self, capacity):
        '''@helpDescription(The value passed in for capacity of a queue must be a positive integer. If the value is not, an exception with the line 'Capacity Error' is rasied.)'''
        if type(capacity) != int or capacity <=0:
            raise Exception('Capacity Error')

        '''@helpDescription(When the CircularQueue class is initialized, a list is initalized which acts as the queue. The capacity, count (number of items in the queue), head (index of the first item in the queue) and tail (index of the last item in the queue) are also initialized.)'''
        '''@helpDescription(The double underscore __ indicates a private variable, meaning it can only be accessed or changed within this class. If we want to access the variable outside of the class, we must implement setter and getter methods which set or return the values sotred in the variables.)'''
        '''@helpDescription(Setter method: a method in a class that sets the value of a private variable. Getter: A method in a class that obtains and returns the value of a private variable.)'''
        self.__items = []
        self.__capacity = capacity
        self.__count = 0
        self.__head = 0
        self.__tail = 0

    '''@helpDescription(Adds an item to the end of the queue)'''
    def enqueue(self,item):
        '''@helpDescription(If the queue is full, an exception with the line "Error: Queue is full" is raised.)'''
        if self.__count == self.__capacity:
            raise Exception('Error: Queue is full')
        '''@helpDescription(In order the to enqueue another item, the queue cannot already be full. The if/else statement ensures that the number of items currently in the queue (length of the list) is less than the capacity.)'''
        if len(self.__items) < self.__capacity:
            '''@helpDescription(If queue is not full, another item is added to the queue by appending it to the end of the list.)'''
            self.__items.append(item)
        '''@helpDescription(Count, or the number of items in the queue, is increased by one.)'''
        self.__count += 1
        '''@helpDescription(The queue is circular, meaning the head and the tail of the queue will rotate in a circle-like fashion as items are being enqueued and dequeued. The position of the tail initially starts at 0, and is increased by 1 every time an item is added to the end of the queue. This value is moduloed with capacity so that the current position of the tail will always be a value between 0 and the capacity of the queue.)'''
        self.__tail = (self.__tail +1)%self.__capacity

    '''@helpDescription(Removes and returns the first item to be queued. Queues work on a first-come-first-serve basis.)'''
    def dequeue(self):
        '''@helpDescription(If the user attempts to dequeue an empty queue, an exception with the line "Error: Queue is empty" is raised.)'''
        if self.__count == 0:
            raise Exception('Error: Queue is empty')
        '''@helpDescription('item' is the item to be removed, which is head of the queue because it is the first item in the queue.)'''
        item = self.__items[self.__head]
        '''@helpDescription(Since the head of the queue is being removed, it is set to none.)'''
        self.__items[self.__head]=None
        '''@helpDescription(Count of total items in the queue is decreased by 1.)'''
        self.__count -=1
        '''@helpDescription(The queue is circular, meaning the head and the tail of the queue will rotate in a circle-like fashion as items are being enqueued and dequeued. The position of the head intially starts at 0, and is increased by 1 every time an item is dequeued from the head (head is shifted by 1 position). This value is moduloed with capacity so that the current position of the head will always be a value between 0, and the capacity of the queue.)'''
        self.__head = (self.__head+1)%self.__capacity
        '''@helpDescription(The item that was dequeued is returned.)'''
        return item

    '''@helpDescription(The head of the queue is returned)'''
    def peek(self):
        '''@helpDescription(If the user attempts to peak into an empty queue, an exception with the line "Error! Queue is empty" is raised.)'''
        if self.__count == 0:
            raise Exception ('Error: Queue is empty')
        '''@helpDescription(The head, or first item of the queue, is returned.)'''
        return self.__items[self.__head]

    '''@helpDescription(__str__ method is implicity called when print() is called. This __str__ method prints the queue out in a readable format, instead of as a Queue class object.)'''
    def __str__(self):
        '''@helpDescription(Opening bracket of queue)'''
        str_exp = ']'
        '''@helpDescription('i' represents the position of the head in the queue)'''
        i = self.__head
        '''@helpDescription(Every item in the queue list is appended, in sequence, to the variable str_exp as a string object.)'''
        for j in range(self.__count):
            str_exp += str(self.__items[i]) + ' '
            '''@helpDescription(The first item to be appended to str_exp is the head of the queue, then it is incremented one by one for the position of each object in the queue. Each following item is then also appended to variable str_exp.)'''
            i = (i+1)%self.__capacity
        '''@helpDescription(Closing bracket of queue)'''
        return str_exp + ']'

# Step 2: Test the Queue class
q = CircularQueue(3)
'''@helpDescription(Items are enqueued into the queue one by one.)'''
q.enqueue('item1')
q.enqueue('item2')
q.enqueue('item3')
'''@helpDescription(The first item in the queue is dequeued.)'''
q.dequeue()
'''@helpDescription(__str__ method is implicity called, and the queue is printed in the format dictated by the __str__ method.)'''
print(q)