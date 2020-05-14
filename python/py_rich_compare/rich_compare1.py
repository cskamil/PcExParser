'''
@goalDescription(Construct a program with two classes, where each class has a comparison method. Test whether instances of each class is equal to each other using the comparison method.)
@name(Equality Comparison Method)
@distractor{code(), helpDescription()} 
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''
# Step 1: Define the first class containing the comparison method
class A:
    '''@helpDescription(A value is passed in, and assigned to the class.)'''
    def __init__(self, value):
        self.value = value

    '''@helpDescription(The __eq__ method is implicity called whenever the "==" operator is used. The left side of the comparison operator is passed in as "self", and the right side is passed in as "other".)'''
    '''@helpDescription(The __eq__ method overrides the original function of "==", in this case it also prints "A __eq__ is called")'''
    def __eq__(self, other):
        print ("A __eq__ called")
        '''@blank(Returns the original function of the "==" operator, a bool representing whether the values on either side of the comparison operator are equal.)'''
        return self.value == other

# Step 2: Define the second class containing the comparison method
class B:
    '''@helpDescription(A value is passed in, and assigned to the class.)'''
    def __init__(self, value):
        self.value = value

    '''@helpDescription(The __eq__ method is implicity called whenever the "==" operator is used. The left side of the comparison operator is passed in as "self", and the right side is passed in as "other".)'''
    '''@helpDescription(The __eq__ method overrides the original function of "==", in this case it also prints "B __eq__ is called")'''
    def __eq__(self, other):
        print ("B __eq__ called")
        '''@blank(Returns the original function of the "==" operator, a bool representing whether the values on either side of the comparison operator are equal.)'''
        return self.value == other

# Step 3: Test the comparison function
'''@helpDescription(Initializes an instance of each class, with a value passed in.)'''
valueA = A(3)
valueB = B(3)
'''@blank(The __eq__ method of each class is called when the == operator is used on an instance of each class. In this example, whether the value of a equals the value of b is checked. When the __eq__ method is called, it prints a statement as well as returns a bool representing the equality of the two instances.)'''
'''@blank(The __eq__ method in class A is called first and the __eq__ method in class B is called second, because the instance of class A (valueA) appears first (on the left side of the == operator).)'''
print(valueA==valueB)