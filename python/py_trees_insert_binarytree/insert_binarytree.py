'''
@goalDescription(In a BinaryTree, adding new nodes to the tree is an important capability to have.\nConstruct a simple implementation of a BinaryTree consisting of an __init__ method and an insertLeft method, which adds new nodes to the tree to the left of the root. )
@name(Inserting binary tree)
'''
# Define a binary tree class
class BinaryTree:
    '''@helpDescription( We want to define the __init__ method for the BinaryTree class to take in a root node, so we specify the two parameters to be self and root. Recall that self is a required parameter.)'''
    def __init__(self, root):
        '''@helpDescription(We set the key value of the BinaryTree equal to root)'''
        self.key = root
        '''@helpDescription(We set the node to the left of root equal to None (since it doesn’t exist yet))'''
        self.left = None
        '''@helpDescription(We set the node to the right of root equal to None (since it doesn’t exist yet))'''
        self.right = None
    # Define a function to insert node from the left
    '''@helpDescription( We want to define a function that inserts a new node to the left of an existing node, so we specify the two parameters self and new_node)'''
    def insert_left(self, new_node):
        '''@helpDescription(We need to check if there are any existing node to the left of the root.)'''
        if self.left is None:
            '''@helpDescription( If the node to the left of the root doesn’t exist,then we set it equal to a new instance of BinaryTree with the new node as its root)'''
            self.left = BinaryTree(new_node)
        '''@helpDescription(If the node to the left of the root already exists, then we replace the already existing left node with the new node.)'''
        else:
            node_tree = BinaryTree(new_node)
            '''@helpDescription(Here, we update the references to make sure the nodes reference each other correctly. Here we insert each left node right next to the root node.)'''
            node_tree.left = self.left
            self.left = node_tree
    # Define a function to print the tree
    '''@helpDescription(We need to define a function to print our tree structure.)'''
    def print_tree(self):
        '''@helpDescription(We want to print each node from left to right.)'''
        if self.left:
            self.left.print_tree()
        print(self.key, " ", end="")
        if self.right:
            self.right.print_tree()
# Initializing a tree
root = BinaryTree(10)
root.insert_left(5)
root.insert_left(6)
root.insert_left(14)
root.print_tree()