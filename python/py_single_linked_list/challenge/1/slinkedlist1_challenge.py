'''
@goalDescription(Create the necessary classes for a Singly Linked List, containing the method add(item) to add a new item to the beginning of the linked list. Test the singly linked list after the classes are created.)
@name(Singly Linked List)
@distractor{code(temp.setNext(self.head.getNext())), helpDescription()}
@distractor{code(self.head = self.head.getNext()), helpDescription()}
'''

# Step 1: Define Node class
'''@helpDescription(Linked lists are defined by nodes in a list, instead of object literals in a normal list. This node class defines the contents in a list by setting the data, and the "next" node in the list.)'''
'''@helpDescription(Singly linked lists are only linked in one direction, to the next object in the list. A node is not linked to the previous object in the list.)'''
class SLinkedListNode:
    '''@helpDescription(Constructs a new node and initializes it to contain the govern object (initData), and link to the given next node (initNext).)'''
    def __init__(self, initData, initNext):
        self.data = initData
        self.next = initNext

    '''@helpDescription(Method to return the data contained inside a node.)'''
    def getData(self):
        return self.data

    '''@helpDescription(Method to return the data contained in the next node.)'''
    def getNext(self):
        return self.next

    '''@helpDescription(Method to set or update the data contained inside a node.)'''
    def setData(self, newData):
        self.data = newData

    '''@helpDescription(Method to set or update the data contained in the next node.)'''
    def setNext(self, newNext):
        self.next = newNext

# Step 2: Define the Singly Linked List class
'''@helpDescription(Linked lists can store data like a normal list, but it is more efficient because it can dynamically change size without shifting all other objects in the list. However, random access of a linked list is not allowed. To access a particular element in a linked list, the list has to be sequentially traversed from the first node (the head). )'''
class SLinkedList:
    '''@helpDescription(The linked list is initialized with a head (currently none), and size (currently 0).)'''
    def __init__(self):
        self.head = None
        self.size = 0

    '''@helpDescription(__str__ method is automatically called when the print() function is invoked. This method prints the contents of the linked list in a readable format instead of the SLinkedList object.)'''
    def __str__(self):
        s = '['
        i = 0
        '''@helpDescription("current" represents the current node, and is incremented to access each element in the linked list.)'''
        current = self.head
        '''@helpDescription("current" is not none unless it has reached the end of the linked list. Until then, the content from "current" will be appended to a string, and printed.)'''
        while current != None:
            '''@helpDescription("i" is only greater than 0 when "current" is not the first object in the linked list. If it is not the first item, there is a comma between every element of the linked list until the last item.)'''
            if i > 0:
                s = s + ','
            '''@helpDescription(dataObject represents the content inside the "current" node.)'''
            dataObject = current.getData()
            '''@helpDescription(Assuming the current item in the linked list is not empty, the content of the linked list is concatenated to the dataObject from that node. This is repreated until the linked list ends.)'''
            if dataObject != None:
                s = s + '%s' % dataObject
                i = i + 1
            '''@helpDescription("current" is incremented to the next item in the list, and the while loop continues.)'''
            current = current.getNext()
        s = s + ']'
        '''@helpDescription(Ultimately, a comma-separated string containing all items of the linked list is returned.)'''
        return s

    '''@helpDescription(The append method adds an item to the beginning of the linked list.)'''
    def add(self, item):
        '''@helpDescription(A new node called "temp" is created for the item to be added.)'''
        temp = SLinkedListNode(item, None)
        '''@blank(Since the new node is added at the beginning, its "next node" is set to the current head.)'''
        temp.setNext(self.head)
        '''@blank(New node to be inserted becomes the new head, because it is at the beginning of the linked list.)'''
        self.head = temp
        '''@helpDescription(Size of the new linked list is increased by 1.)'''
        self.size += 1

# Step 3: Test the Linked List
linked_list = SLinkedList()
linked_list.add('Position 1')
linked_list.add('Position 0')
print(linked_list)