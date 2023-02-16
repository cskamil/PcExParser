'''
@goalDescription( Implementing Queue. Using Class to construct a Queue structure to solve a Josephus problem. Josephus problem is a counting-out game. N people are in a circle, labeled as 1, 2, 3, … ,n. Given a skip number k, counting from the person labeled as 1, in every round, after k number of people are skipped, the next person will be counted out of the circle. Repeat the process with the remaining people until only one person remains. Then free the last one person. The program should return the last freed  person.)
@name(Solving Josephus Problem)
@distractor{code(q.dequeue(name_list[i])), helpDescription()}
@distractor{code(temp=q.enqueue()), helpDescription()}
@distractor{code(q.dequeue(temp)), helpDescription()}
'''
# Define a Queue Class
'''@helpDescription(We define the class named Queue to represent a Queue structure.)'''
class Queue:
    # Initializing the queue
    '''@helpDescription(We want to initialize the Queue. We do this by defining an __init__ method, which is run automatically by Python each time an instance is created. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def __init__(self):
        '''@helpDescription( This statement initiates an empty list. self is the instance of the class and self.items created an empty list.)'''
        self.items = []
    # Adding elements to the queue
    '''@helpDescription(This method adds a new element to the list (item) that is specified as the method's parameter. The first argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription( Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, only the last parameter (item) must be passed to the method.)'''
    def enqueue(self,item):
        '''@helpDescription(This statement uses the built-in function insert() to add the last parameter (item) to the initialized list.)'''
        self.items.insert(0,item)
    # Removing elements from the queue
    '''@helpDescription(This method dequeues the last element out of the list. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription( Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def dequeue(self):
        '''@helpDescription(This statement return the dequeued element by using the built-in function pop(). By default, pop() function pops the last element in the list.)'''
        return self.items.pop()
    # Checking the size of the queue
    '''@helpDescription(This statement checks the size of the list. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def size(self):
        '''@helpDescription(It uses the built-in function len() to evaluate and return the number of elements in the list.)'''
        '''@helpDescription(Note that the function len(lst) returns the number of the values in the list.)'''
        return  len(self.items)
# Define a function to solve Josephus problem
'''@helpDescription(We need to first declare the function so that we can call it later. The following lines declare the function circle that uses Queue to solve Josephus problem. The function first stores the given name list into the queue. After skipping k number of elements, dequeue the next element. Repeat the process until there is only one element left. Then free the last one element and return the element.)'''
'''@helpDescription(Note that all statements following the header line are indented.)'''
def circle(k,name_list):
    '''@helpDescription(We create an instance of the class Queue to demonstrate the creation and use of Queue instances.)'''
    '''@helpDescription(This statement creates a Queue instance. The variable q holds a reference to a Queue instance.)'''
    q = Queue()
    '''@helpDescription(We need to store the list parameter into the queue. To do this, we need to use a loop structure. We use for loop to iterate the list parameter. We use the range function because it generates a sequence of numbers for the for loop. Here, we want a sequence that starts at 0 with every integer number up to but not including the total number of the elements in list. We get the number of the elements by using the built-in function len().)'''
    for i in range(len(name_list)):
    # We are trying to store the elements from the name_list into the queue structure
        '''@blank(This statement invokes the method enqueue() of q to pass the each element from the list parameter and add it to the queue. Note that q is the implied subject (instance) passed to self.)'''
        q.enqueue(name_list[i])
    '''@helpDescription(This statement initiates variable i for the following while loop.)'''
    i = 0
    '''@helpDescription(We need to repeat the process of skipping k number of elements in the list and removing the next element until there is only one element left. We use while loop to repeat the process and using Boolean operator != to check if there are only one element left in the queue. We invokes the method size() of q to check the size of the current queue. Note that q is the implied subject (instance) passed to self.)'''
    while q.size() != 1:
    # We are trying to count each element till the kth element
        '''@blank(We create a variable temp to store the dequeued elements. We invokes the method dequeue() of q to remove the elements from the queue. Note that q is the implied subject (instance) passed to self.)'''
        temp = q.dequeue()
        '''@helpDescription(We need to check if the previous dequeued element is within the k number of the elements. If it is within the k number of the elements, we skip the element and put it back to the queue; if it is k+1th element, we remove it out of the queue and recounting the element from the beginning. To achieve this, we use if – else statement.)'''
        '''@helpDescription(The if statement tests whether the current element is the k+1th element. If it is not, then the body of this if statement gets executed. Otherwise, the body of this if statement is skipped and else statement is invoked.)'''
        if i != k:
        # We need to restore the non-kth elements so the Kth element is out of the queue.
            '''@blank(This statement invokes the method enqueue() of q to pass the previous dequeued element back to the queue. Note that q is the implied subject (instance) passed to self.)'''
            q.enqueue(temp)
        '''@helpDescription(Else statement. When previous if statement is skipped, else statement is invoked.)'''
        else:
            '''@helpDescription(This statement resets variable i.)'''
            i = 0
        '''@helpDescription( We need to count the number of elements that are skipped. Therefore, each time that an element is skipped, we need to increment the number of the skipped elements by 1.)'''
        i += 1
    '''@helpDescription(This statement returns the last skipped element from the queue. We invokes the method dequeue() of q to remove the last element from the queue. Note that q is the implied subject (instance) passed to self.)'''
    return q.dequeue()
'''@helpDescription(An initiated name list.)'''
name_list = ["Lily","David","Susan","Julia","David","Brad"]
'''@helpDescription(This statement prints the circle result of name_list. To get the result, we invoke the method circle(). Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(circle(7,name_list))