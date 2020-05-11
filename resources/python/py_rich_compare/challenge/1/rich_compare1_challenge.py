'''
@goalDescription(Construct a program with two classes, where each class has a comparison method. Test whether the value of the first class is greater than the value of the second class using the comparison method.)
@name(Greater Than Comparison Method)
@distractor{code(return self.value > other), helpDescription()}
@distractor{code(return self.value > other), helpDescription()}
@distractor{code(return self.value < other.value), helpDescription()}
@distractor{code(return self.value < other.value), helpDescription()}
@distractor{code(print(b >= a)), helpDescription()}
@distractor{code(print(a >= b)), helpDescription()}
'''
# Step 1: Define the first class containing the comparison method
'''@helpDescription(object passed in as the default value for the class)'''
class A:
    '''@helpDescription(A value is passed in, and assigned to the class.)'''
    def __init__(self, value):
        self.value = value

    '''@helpDescription(The __gt__ method is implicity called whenever the ">" operator is used. The left side of the comparison operator is passed in as "self", and the right side is passed in as "other".)'''
    '''@helpDescription(The __gt__ method overrides the original function of ">", in this case it also prints "A __gt__ is called")'''
    def __gt__(self, other):
        print ("A __gt__ called")
        '''@blank(Returns the original function of the ">" operator, a bool representing whether the value on left side of the comparison operator is greater than the value on the right side.)'''
        return self.value > other.value

# Step 2: Define the second class containing the comparison method
class B:
    '''@helpDescription(A value is passed in, and assigned to the class.)'''
    def __init__(self, value):
        self.value = value

    '''@helpDescription(The __gt__ method is implicity called whenever the ">" operator is used. The left side of the comparison operator is passed in as "self", and the right side is passed in as "other".)'''
    '''@helpDescription(The __gt__ method overrides the original function of ">", in this case it also prints "A __gt__ is called")'''
    def __gt__(self, other):
        print ("B __gt__ called")
        '''@blank(Returns the original function of the ">" operator, a bool representing whether the value on left side of the comparison operator is greater than the value on the right side.)'''
        return self.value > other.value

# Step 3: Test the comparison function
'''@helpDescription(Initializes an instance of each class, with a value passed in.)'''
a = A(4)
b = B(8)
'''@blank(The __gt__ method of each A is called when the > operator is used. In this example, whether the value of a is greater than the value of b is checked, a statement is printed, and a bool is returned.)'''
print(a > b)
print(b > a)