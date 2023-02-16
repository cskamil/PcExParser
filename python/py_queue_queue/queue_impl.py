'''
@goalDescription(Implementing Queue. Using Class to construct a Queue structure.)
@name(Queue Implementation)
'''
# Define a Queue Class
'''@helpDescription(We define the class named Queue to represent a Queue structure.)'''
class Queue:
    # Initializing the queue
    '''@helpDescription(We want to initialize the Queue. We do this by defining an __init__ method, which is run automatically by Python each time an instance is created. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def __init__(self):
        '''@helpDescription(This statement initiates an empty list. self is the instance of the class and self.items created an empty list.)'''
        self.items =[]
    # Adding elements to the queue
    '''@helpDescription(This method adds a new element to the list (item) that is specified as the method's parameter. The first argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, only the last parameter (item) must be passed to the method.)'''
    def enqueue(self, item):
        '''@helpDescription( This statement uses the built-in function insert() to add the last parameter (item) to the initialized list.)'''
        self.items.insert(0,item)
    # Removing elements to the queue
    '''@helpDescription(This method dequeues the last element out of the list. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def dequeue(self):
        '''@helpDescription( This statement return the dequeued element by using the built-in function pop(). By default, pop() function pops the last element in the list)'''
        return self.items.pop(0)
    # Returning the queue as a string
    '''@helpDescription(The __str__ method in Python represents the class objects as a string, which is called when the built-in functions print() and str() are invoked on the object and return a string.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def __str__(self):
        '''@helpDescription(This statement returns a string. We use the built-in function str() to convert all the elements in the list to string.)'''
        return str(self.items)
'''@helpDescription(We create an instance of the class Queue to demonstrate the creation and use of Queue instances.)'''
'''@helpDescription(This statement creates a Queue instance. The variable q holds a reference to a Queue instance.)'''
q=Queue()
'''@helpDescription(This statement invokes the method enqueue() of q to pass the parameter ‘cat’ and add it to the list. Note that q is the implied subject (instance) passed to self.)'''
q.enqueue('cat')
'''@helpDescription(This statement invokes the method enqueue() of q to pass the parameter 3 and add it to the list. Note that q is the implied subject (instance) passed to self.)'''
q.enqueue(3)
'''@helpDescription(This statement prints the dequeued element of the list. To get the dequeued element, we invoke the method dequeue() of q. Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(q.dequeue())
'''@helpDescription(This statement invoke the _str_ method and return the current list as a string.)'''
print(q)
