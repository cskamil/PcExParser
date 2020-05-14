'''
@goalDescription(Construct a program to test whether a set of brackets are matching. The program should return "True" if the set of brackets are matching, and "False" otherwise. Brackets can be any combination of (), [], or {}. Every opening bracket has to correspond to a closing bracket of the same type in the correct position. For example, {[([])]} will return "True" while {{[]}] will return "False".)
@name(Parchecker with Stacks)
@distractor{code(), helpDescription()} 
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''

# Step 1: Define the Stack class
class Stack:
    '''@helpDescription(The Stack class is initalized by creating the list self.items. It is an empty list that will act as the stack, and will be updated accordingly.)'''
    def __init__(self):
        self.items = []

    '''@helpDescription(push inserts the new item at the beginning of the list, which is the top of the stack.)'''
    def push(self, item):
        self.items.append(item)

    '''@helpDescription(pop removes and returns the first from the list, which is the first item on top of the stack.)'''
    def pop(self):
        return self.items.pop()

    '''@helpDescription(Returns True if the stack is empty.)'''
    def isEmpty(self):
        return self.items == []

# Step 2: Define the Parchecker class
def parChecker(symbolString):
    s = Stack()
    '''@helpDescription('balanced' is a variable representing whether the set of brackets matches or not. Initially we assume that symbolString is balanced.)'''
    balanced = True

    # Step 2.1: Iterate through the set of brackets and check if they are matching
    index = 0
    while index < len(symbolString) and balanced:
        '''@helpDescription("symbolString" represents the set of brackets passed in to be checked. The variable "symbol" represents each bracket within in the symbolString.)'''
        symbol = symbolString[index]
        '''@helpDescription(For every symbol in symbolString, if a bracket is an opening bracket, it is pushed into the stack. The stack only contains opening brackets.)'''
        if symbol in '([{':
            s.push(symbol)
            '''@helpDescription(If the symbol is not an opening bracket (it is a closing bracket)...)'''
        else:
            '''@helpDescription(If the stack is empty and this part of the code is reached, it means the first symbol in symbolString is a closing bracket. Since a balanced set of brackets cannot start with a closing bracket, 'balanced' is set to False.)'''
            if s.isEmpty():
                balanced = False
                '''@helpDescription(If we see a closing bracket, the last opening bracket is popped from the stack and checked if it matches with the closing bracket.)'''
            else:
                top = s.pop()
                '''@helpDescription(Helper method matches(top, symbol) is called to verify if the opening and closing brackets are matching. Argument "top" is passed in as the opening bracket popped from the stack, and "symbol" is the current closing bracket.)'''
                '''@helpDescription(If the opening and closing brackets are not matching, then symbolString is not balanced and variable "balanced" is set to False.)'''
                if not matches(top, symbol):
                    balanced = False
        '''@helpDescription(Increment to the next symbol in symbolString)'''
        index = index + 1

    '''@helpDescription(if all opening brackets in the stack are checked (isEmpty == True), and there all opening brackets to match all closing brackets (balanced is still True), then True is returned. Otherwise, False is returned.)'''
    if balanced and s.isEmpty():
        return True
    else:
        return False

# Step 2.2: Define helper method to check for matching brackets
'''@helpDescription(matches method passes in an opening bracket a closing bracket, and checks of they are from the same set.)'''
def matches(open, close):
    '''@helpDescription(Strings "opens" and "closers" containing the set of opening brackets and closing brackets are defined. Notice brackets from the same type(ex. square brackets) have the asme index (ex. 1) in both "opens" and "closers". This allows us to compare if the brackets are from the same set by comparing their index.)'''
    opens = "([{"
    closers = ")]}"
    '''@helpDescription(Returns whether the opening bracket is the same type as the closing bracket by indexing the same position in the strings "opens" and "closers")'''
    return opens.index(open) == closers.index(close)

print(parChecker('({({()})})'))