'''
@goalDescription(The tree can be traversed by deciding on a sequence to visit each node. There are three traversal algorithms: in-order traversal, pre-order traversal and post-order traversal.\n<b>In-order traversal</b> visits the nodes from the left, the root node and the right\n<b>Pre-order traversal</b> visits the nodes from the root node, the left and the right\n<b>Post-order traversal</b> visits the nodes from the left, the right and the root node.\nIn this challenge, we construct an post-order traversal algorithm. )
@name(Tree traversal.)
@distractor{code(res = root.left), helpDescription()}
@distractor{code(res = res + self.right), helpDescription()}
@distractor{code(res.append(postorder_traversal(root.key))), helpDescription()}
'''

# Define a binary tree class
class BinaryTree:
    '''@helpDescription(We want to define the __init__ method for the BinaryTree class to take in a root node, so we specify the two parameters to be self and root. Recall that self is a required parameter.)'''
    def __init__(self, root):
        '''@helpDescription(We set the node to the left of root equal to None (since it doesn’t exist yet)'''
        self.left = None
        '''@helpDescription(We set the node to the left of root equal to None (since it doesn’t exist yet)'''
        self.right = None
        '''@helpDescription(We set the key value of the BinaryTree equal to root)'''
        self.key = root
    # Define the Insert Node function
    '''@helpDescription(We define the insert function here. The insert function compares the value of the node to the parent node and decides to add it as a left node or a right node.)'''
    def insert(self, data):
        '''@helpDescription(We first need to check if there is an existing root node)'''
        if self.key:
            '''@helpDescription(If the new node smaller than the previous node, we insert it to the left.)'''
            if data < self.key:
                '''@helpDescription(If the previous node left is empty, we insert it at the  position)'''
                if self.left is None:
                    self.left = BinaryTree(data)
                '''@helpDescription(If the left is not empty, we recurse the insert function and compare the new node to the current left node, in order to decide where to insert the new node.)'''
                else:
                    self.left.insert(data)
            '''@helpDescription(If the new node smaller than the previous node, we insert it to the left.)'''
            elif data > self.key:
                '''@helpDescription(If the previous node left is empty, we insert it at the  position.)'''
                if self.right is None:
                    self.right = BinaryTree(data)
                '''@helpDescription(If the left is not empty, we recurse the insert function and compare the new node to the current right node, in order to decide where to insert the new node.)'''
                else:
                    self.right.insert(data)
        '''@helpDescription(If there is no root node exist, the new data will be assigned as the root node.)'''
        else:
            self.key = data

    # Define Post order traversal function
    '''@helpDescription(We define the post-order traversal algorithm here. Post-order traversal algorithm travers the tree from the left, the right and the root node.)'''
    '''@helpDescription(Note that this process is repeated for each sub-tree until all the nodes are traversed.)'''
    def postorder_traversal(self, root):
        '''@helpDescription(We initiate a list to store the traversed tree node values.)'''
        res = []
        '''@helpDescription(The function runs only when the root exists.)'''
        if root:
            '''@blank(We recursively visit the left nodes first)'''
            res = self.postorder_traversal(root.left)
            '''@blank(We recursively visit the right nodes the next)'''
            res = res + self.postorder_traversal(root.right)
            '''@blank(We last visit the root node of the tree and the subtree)'''
            res.append(root.key)
        '''@helpDescription(We return the final list that stored the tree values.)'''
        return res

root = BinaryTree(5)
root.insert(14)
root.insert(16)
root.insert(3)
root.insert(4)
root.insert(10)
print(root.postorder_traversal(root))