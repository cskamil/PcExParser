'''
@goalDescription(When using a LinkedList, it is possible that you may want to search through the list to see if a specific value is in it. To do so, each node must be checked individually. Construct a search function within the LinkedList class that traverses through all nodes in the list and keeps track of all instances of the target value (if any) are in the LinkedList, returning the final count at the end of the search.)
@name(Search in the linked list)
@distractor{code(while current is None), helpDescription()}
@distractor{code(if current is not None), helpDescription()}
@distractor{code(current = self.head), helpDescription()}
@distractor{code(current = None), helpDescription()}
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
    # Define the search function that count how many times the target appears.
    '''@helpDescription(We want to be able to search for values in the LinkedList, so we define a search method to do so that takes in a specific target value.)'''
    def search(self, target):
        '''@helpDescription(We set the current node equal to the head of the list to begin traversal.)'''
        current = self.head
        '''@helpDescription(We want to count how many instances of the target value are in the list, so we initialize a variable count at 0.)'''
        count = 0
        '''@blank(We go through the whole linked list by using while loop. 'current' is not none unless it has reached the end of the linked list. )'''
        while current is not None:
            '''@helpDescription(We need to check if the current data is the target. If it is, we increase the count by 1.)'''
            if current.data == target:
                count += 1
            '''@blank(Move to the next node.)'''
            current = current.next
        '''@helpDescription(Return the total count.)'''
        return count

linked_list = LinkedList()
linked_list.push(1)
linked_list.push(3)
linked_list.push(3)
linked_list.push(7)
linked_list.push(9)
linked_list.push(11)
linked_list.push(11)

target = 11
print("There are", linked_list.search(target), "instances of", target, "in the list")