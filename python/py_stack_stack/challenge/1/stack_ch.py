'''
@goalDescription( Implementing Stack. Using Class to construct a Stack. Implement a function to determine if all the given brackets are paired.\nFor example:\n       paired brackets list:['[','{','(','{','}',')','}',']’] ; unpaired brackets list:['{',']','(','{','}',')','}',']'])
@name(Stack)
@distractor{code(s.pop(brackets)), helpDescription()}
@distractor{code(s.push()), helpDescription()}
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
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, only the last parameter (item) must be passed to the method.)'''
    def push(self, item):
        '''@helpDescription(This statement uses the built-in function append() to add the last parameter (item) to the initialized list.)'''
        self.items.append(item)
    # Removing the elements from the stack
    '''@helpDescription( This method pops the last element out of the list. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def pop(self):
        '''@helpDescription(This statement return the popped-out element by using the built-in function pop(). By default, pop() function pops the last element in the list.)'''
        return self.items.pop()
    # Checking the element in the stack
    '''@helpDescription(This method checks the last element in the list. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def peek(self):
        '''@helpDescription(This statement returns the last elements of the list.)'''
        return self.items[- 1]
# Checking the if the brackets are matched
'''@helpDescription(We need to first declare the function so that we can call it later. The following lines declare the function match that uses Stack to check if the given bracket lists are paired. The method pushes left bracket in the stack, then compare if the right bracket matches the left one. If they are matched, the method pops out the left bracket. At the end, if the stack is empty, then every bracket has a proper match and the function returns true; if the stack is not empty, then there are brackets that do not have a pair and the function returns false.)'''
'''@helpDescription(Note that all statements following the header line are indented.)'''
def match(bracket):
    '''@helpDescription(This statement initiates a list with three kinds of left brackets.)'''
    left =['(','[','{']
    '''@helpDescription(This statement initiates a list with three kinds of right brackets.)'''
    right={')',']','}'}
    '''@helpDescription(We create an instance of the class Stack to demonstrate the creation and use of Stack instances.)'''
    '''@helpDescription(This statement creates a Stack instance. The variable s holds a reference to a Stack instance.)'''
    s=Stack()
    '''@helpDescription(We need to repeat the same process of push the left bracket into the stack and compare the right bracket with the left one.)'''
    for brackets in bracket:
        '''@helpDescription(This statement first checks if the current bracket is a left one. If it is, we store it in the stack.)'''
        '''@helpDescription(The if statement tests whether the current bracket is a left one. If the bracket is in the left list, then the body of this if statement gets executed. Otherwise, the body of this if statement is skipped and elif statement is invoked.)'''
        if brackets in left:
            # We try to store the current bracket in the stack if it is the left one
            '''@blank(This statement invokes the method push() of s to pass the current bracket and add it to the list. Note that s is the implied subject (instance) passed to self.)'''
            s.push(brackets)
        '''@helpDescription(When the current bracket is not a left one, this elif statement is invoked to check if the current bracket is in the right list.)'''
        elif brackets in right:
            '''@helpDescription(This statement is to check when the stack is empty.)'''
            '''@helpDescription(The if statement tests whether the current stack is empty. If the stack is empty, then the body of this if statement gets executed. Otherwise, the body of this if statement is skipped and the next if statement is invoked.)'''
            if s.is_empty():
                '''@helpDescription(If the current bracket is a right bracket and the stack is empty, then return false.)'''
                return False
            '''@helpDescription(This statement is to compare if the current right bracket pairs with the left bracket (the last element) in the stack. To get the last element in the stack, we invoke the method peek() of s. Here we use the built-in function ord() to compare the two brackets. The ord() function converts a character into its Unicode code value. If the current right bracket matches the last left bracket in the stack, we pop out the matched left bracket out of the stack.)'''
            '''@helpDescription(The if statement tests whether the current right bracket matches the left bracket. If they match, then the body of this if statement gets executed. Otherwise, the body of this if statement is skipped.)'''
            if 1 <= ord(brackets) - ord(s.peek()) <= 2:
                # We try to empty the stack if any right bracket matches a left bracket in the stack.
                '''@blank(We invoke the method pop() of s to pop out the last elements in the stack.)'''
                s.pop()
    '''@helpDescription(Last, we need to check if the stack is empty. If the stack is empty, all brackets are matched, and it returns True. If the stack is not empty, there are some brackets that do not have pair, and it returns False.)'''
    return s.is_empty()
'''@helpDescription(  This statement initiates a list (expr1) containing different brackets.)'''
expr1=['[','{','(','{','}',')','}',']']
'''@helpDescription(This statement initiates a list (expr2) containing different brackets.)'''
expr2=['{','[','}','(',')']
'''@helpDescription(This statement prints the match result of expr1. To get the result, we invoke the method match(). Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(match(expr1))
'''@helpDescription( This statement prints the match result of expr2. To get the result, we invoke the method match(). Note that we do not necessarily have to store the returned value of this method in a variable. We could use the returned value directly in the print statement.)'''
print(match(expr2))