'''
@goalDescription(Create the necessary classes for a Doubly Linked List, containing the method insert_at_start(data) to add a new item to the beginning of the linked list, insert_at_end(data) to add a new item to the end of the linked list, delete_at_start() to delete the first item from the link, and an __str__ method to print out the doubly linked list. Test the doubly linked list after all classes and methods are created.)
@name(Doubly Linked List)
@distractor{code(n = None), helpDescription()}
@distractor{code(self.start_node.nref = None), helpDescription()}
'''

# Step 1: Define Node class
'''@helpDescription(Linked lists are defined by nodes in a list, instead of object literals in a normal list. This node class defines the contents in a list, the next, and the previous nodes.)'''
'''@helpDescription(Doubly linked lists are linked in two directions. A node is linked to the previous node (pref) and the next node (nref).)'''
class DoublyLinkedListNode:
    '''@helpDescription(Constructs a new node and initializes it to contain the govern object (initData).)'''
    def __init__(self, initData):
        self.item = initData
        self.nref = None
        self.pref = None

# Step 2: Define the Doubly Linked List class
'''@helpDescription(Linked lists can store data like a normal list, but it is more efficient because it can dynamically change size without shifting all other objects in the list. However, random access of a linked list is not allowed. To access a particular element in a linked list, the list has to be sequentially traversed from the first node (the head). )'''
class DoublyLinkedList:
    '''@helpDescription(The linked list is initialized with a start node (currently None).)'''
    def __init__(self):
        self.start_node = None

    '''@helpDescription(__str__ method is automatically called when the print() function is invoked. This method prints the contents of the linked list in a readable format instead of the SLinkedList object.)'''
    def __str__(self):
        s = '['
        i = 0
        '''@helpDescription("current" represents the current node. Starting from the first node, it is incremented to access each element in the linked list.)'''
        current = self.start_node
        '''@helpDescription("current" is not None unless it has reached the end of the linked list, where it is None. The content from "current" will be appended to a string, and printed.)'''
        while current != None:
            '''@helpDescription("i" is only greater than 0 when "current" is not the first object in the linked list. If it is not the first item, a comma is added between every element of the linked list until the last item.)'''
            if i != 0:
                '''helpDescription(The content from "current" will be appended to a string. All items in the linked list will be printed in sequential order, separated by commas.)'''
                s = s + ', ' + current.item
                '''@helpDescription(The "else" block executes when "i" is 0, or when "current" referes to the first item of the list.)'''
            else:
                s = s + current.item
            '''@helpDescription("current" is incremented to the next node in the list, and the while loop continues.)'''
            current = current.nref
            i += 1
        '''@helpDescription(Ultimately, a comma-separated string containing all items of the linked list is returned.)'''
        return s + ']'

    '''@helpDescription(The insert_at_start(data) method adds an item to the beginning of the linked list.)'''
    def insert_at_start(self, data):
        '''@helpDescription(Creates new node)'''
        new_node = DoublyLinkedListNode(data)
        '''@helpDescription(If the start node is None, it means the linked list is empty, and the new node is inserted as the start node.)'''
        if self.start_node is None:
            '''@helpDescription(Inserts new node as the start node if the linked list is empty.)'''
            self.start_node = new_node
            return
        '''@helpDescription(What was the start node becomes the new "next" node, because we want to insert another new as the start node.)'''
        new_node.nref = self.start_node
        '''@helpDescription(Currently "start_node" is still the first item in the linked list (not the new node to be added). This node's "previous" is set to the new node, because it's going to become the second item in the list.)'''
        self.start_node.pref = new_node
        '''@helpDescription(The new "start_node" is assigned to the new node that is added.)'''
        self.start_node = new_node

    '''@helpDescription(The delete_at_end() method deletes the last item in the linked list.)'''
    def delete_at_end(self):
        '''@helpDescription(If the start_node is None, it means the list is empty. Therefore, there are no nodes to delete.)'''
        if self.start_node is None:
            print("The list has no element to delete")
            return
        '''@helpDescription(If the start_node is not None but the start_node's "next node" reference is None, it means there is only one node in the linked list.)'''
        if self.start_node.nref is None:
            '''@blank(The only item in the linked list is deleted by setting the start_node to None.)'''
            self.start_node = None
            return
        n = self.start_node
        '''@helpDescription(Use while loop to traverse the linked list to reach the last node. When the loop finishes, "n" is the last node of the linked list.)'''
        while n.nref is not None:
            n = n.nref
        '''@blank(The last item of the linked list is deleted by setting itself to None. This is done by setting the "n"'s previous node's next node (current node) to be None.)'''
        n.pref.nref = None

# Step 3: Test the Linked List
dlist = DoublyLinkedList()
dlist.insert_at_start('Hugo')
dlist.insert_at_start('Mike')
dlist.insert_at_start('Riley')
dlist.insert_at_start('Greyson')
dlist.delete_at_end()
print(dlist)