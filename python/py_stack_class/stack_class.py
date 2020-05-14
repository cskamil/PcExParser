'''
@goalDescription(Construct a class Stack so the user can implement stacks. The class should contain the methods __init__(), push(item), pop(), show(), and __str__())
@name(Stacks)
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
    def push(self,item):
        self.items.insert(0,item)

    '''@helpDescription(pop removes and returns the first from the list, which is the first item on top of the stack.)'''
    def pop(self):
        return self.items.pop(0)

    '''@helpDescription(peek returns the first item from the list, which is the first item on top of the stack, but does not remove it from the stack.)'''
    def peek(self):
        return self.items[0]

    '''@helpDescription(show prints the entire stack, but does not return anything.)'''
    def show(self):
        print(self.items)

    '''@helpDescription(The __str__ method is called automatically when the print() function is used, and it returns the full stack.)'''
    '''@helpDescription(The difference between the show and __str__ method is that the show method is not called automatically when the print() function is used. The __str__ function does not have to contain a print statement, but needs to return the statement to be printed when the print() function is called.)'''
    def __str__(self):
        return str(self.items)

# Step 2: Test the Stack class
'''@helpDescription(An instance of the class Stack is initalized)'''
stack = Stack()
'''@helpDescription(String items are pushed onto the stack. Each new item that is pushed is on top of the stack.)'''
stack.push('Hello')
stack.push('World')
'''@helpDescription(The item at the top of the stack is printed, in this case the last item that was pushed.)'''
print(stack.peek())
stack.push(175)
'''@helpDescription(The entire current stack is printed)'''
stack.show()
'''@helpDescription(The item at the top of the stack is removed and returned. We did not print the returned item, so nothing is printed in this line.)'''
stack.pop()
'''@helpDescription(The __str__ method is implicity called, and the entire stack is returned and printed.)'''
print(stack)