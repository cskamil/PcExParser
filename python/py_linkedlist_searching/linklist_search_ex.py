'''
@goalDescription(When using a LinkedList, it is possible that you may want to search through the list to see if a specific value is in it. To do so, each node must be checked individually. Construct a search function within the LinkedList class that traverses through all nodes in the list and returns True if a given target value is within the list.)
@name(Search in the linked list)
'''
# Define a Node class
'''@helpDescription(In order to make a LinkedList, we need to define a Node class first.)'''
class Node:
    def __init__(self, data):
        '''@helpDescription(We set the data of the Node equal to the data we passed in.)'''
        self.data = data
        '''@helpDescription(We set the reference to the node adjacent to the current one to None (since it doesn’t exist yet))'''
        self.next = None
# Define a LinkedList class
'''@helpDescription(We now define the linkind list class.)'''
class LinkedList:
    def __init__(self):
        '''@helpDescription(We initialize the head of the list to be None, since it doesn’t exist yet.)'''
        self.head = None
    '''@helpDescription(We want to be able to add things to the list, so we define a push method to do so.)'''
    def push(self, new):
        '''@helpDescription(To add data to the list, we create a new Node object and pass it the data we want to add to the list.)'''
        new_node = Node(new)
        '''@helpDescription(Since the new node is added at the beginning, its 'next node' is set to the current head.)'''
        new_node.next = self.head
        '''@helpDescription(New node to be inserted becomes the new head, because it is at the beginning of the linked list.)'''
        self.head = new_node
    # Define the search function
    '''@helpDescription(We want to be able to search for values in the LinkedList, so we define a search method to do so that takes in a specific target value.)'''
    def search(self, target):
        '''@helpDescription(We set the current node equal to the head of the list to begin traversal.)'''
        current = self.head
        '''@helpDescription(We go through the whole linked list by using while loop. 'current' is not none unless it has reached the end of the linked list. )'''
        while current is not None:
            '''@helpDescription(We check if the current data is the target. If it is, return true, if not, we set the current to the next one until the current is none.)'''
            if current.data == target:
                return True
            current = current.next
        return False

linked_list = LinkedList()
linked_list.push(1)
linked_list.push(3)
linked_list.push(3)
linked_list.push(7)
linked_list.push(9)
linked_list.push(11)
linked_list.push(11)

target = 11
# Calling the search function
if (linked_list.search(target)):
    print("Found", target, "in list")
else:
    print("Did not find", target, "in list")