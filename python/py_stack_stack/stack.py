'''
@goalDescription(Implementing Stack. Using Class to construct a Stack structure.)
@name(Stack)
'''
# Define a Stack Class
'''@helpDescription(We define the class named Stack to represent a Stack structure.)'''
class Stack:
    # Initializing the stack
    '''@helpDescription(We want to initialize the Stack. We do this by defining an __init__ method, which is run automatically by Python each time an instance is created. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def __init__(self):
        '''@helpDescription(This statement initiates an empty list. self is the instance of the class and self.items created an empty list.)'''
        self.items = []
    # Checking if the stack is empty
    '''@helpDescription(This method checks If the list is empty. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def is_empty(self):
        '''@helpDescription(This statement checks if the list is empty. It uses the built-in function len() to evaluate if there are any elements in the list and will return a Boolean value. If there are elements in the list, it will return False. If the list is empty, it will return True.)'''
        '''@helpDescription(Note that the function len(lst) returns the number of the values in the list.)'''
        return len(self.items) == 0
    # Adding elements to the stack
    '''@helpDescription(This method adds a new element to the list (item) that is specified as the method's parameter. The first argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription( Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, only the last parameter (item) must be passed to the method.)'''
    def push(self, item):
        '''@helpDescription( This statement uses the built-in function append() to add the last parameter (item) to the initialized list.)'''
        self.items.append(item)
    # Removing the elements from the stack
    '''@helpDescription(This method pops the last element out of the list. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def pop(self):
        '''@helpDescription( This statement returns the popped-out element by using the built-in function pop(). By default, pop() function pops the last element in the list.)'''
        return self.items.pop()
    # Checking the element in the stack
    '''@helpDescription(This method checks the last element in the list. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def peek(self):
        '''@helpDescription(We need to perform a test to check whether the list is empty, before accessing the last element in the list.)'''
        '''@helpDescription(The if not statement tests whether the list is empty by calling is_empty() function that returns a Boolean value. If not false yields a True, then the body of this if statement gets executed. Otherwise, if not true, the body of this if not statement is skipped.)'''
        if not self.is_empty():
            '''@helpDescription(This statement returns the last elements of the list by using the built-in function len().)'''
            '''@helpDescription(Note that the function len(lst) returns the number of the values in the list.)'''
            return self.items[len(self.items) - 1]
    # Checking the size of the stack
    '''@helpDescription(This method checks the size of the list. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def size(self):
        '''@helpDescription(This statement returns the size of the list by using the built-in function len().)'''
        '''@helpDescription(Note that the function len(lst) returns the number of the values in the list.)'''
        return len(self.items)
'''@helpDescription(We create an instance of the class Stack to demonstrate the creation and use of Stack instances.)'''
'''@helpDescription(This statement creates a Stack instance. The variable s holds a reference to a Stack instance.)'''
s=Stack()
'''@helpDescription(This statement checks if the current list is empty. To test if the current list is empty, we invoke the method is_empty() of s. Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(s.is_empty())
'''@helpDescription(This statement invokes the method push() of s to pass the parameter 4 and add it to the list. Note that s is the implied subject (instance) passed to self.)'''
s.push(4)
'''@helpDescription(This statement invokes the method push() of s to pass the parameter ‘dog’ and add it to the list. Note that s is the implied subject (instance) passed to self.)'''
s.push('dog')
'''@helpDescription(This statement prints the current last element of the list. To get the last element, we invoke the method peek() of s. Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(s.peek())
'''@helpDescription(This statement invokes the method push() of s to pass the parameter True and add it to the list. Note that s is the implied subject (instance) passed to self.)'''
s.push(True)
'''@helpDescription(This statement prints the current size of the list. To get the current list size, we invoke the method size() of s. Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(s.size())
'''@helpDescription(This statement checks if the current list is empty. To test if the current list is empty, we invoke the method is_empty() of s. Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(s.is_empty())
'''@helpDescription(This statement invokes the method push() of s to pass the parameter 8.4 and add it to the list. Note that s is the implied subject (instance) passed to self.)'''
s.push(8.4)
'''@helpDescription(This statement checks the first popped element of the list. To get the popped element in the list, we invoke the method pop() of s. Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(s.pop())
'''@helpDescription(This statement checks the second popped element of the list. To get the popped element in the list, we invoke the method pop() of s. Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(s.pop())
'''@helpDescription( This statement prints the current size of the list. To get the current list size, we invoke the method size() of s. Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(s.size())