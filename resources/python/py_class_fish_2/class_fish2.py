'''
@goalDescription(Construct a class Fish which describes the name and appearance of most fish. Create another class Trout, which inherits all the properties of the class Fish.)
@name(Inheritance of Fish)
@distractor{code(), helpDescription()} 
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''
# Step 1: Define the Parent class
'''@helpDescription(The parent class defines properties, methods, and patterns which the child classes can inherit. Inheritance allows children classes to use the properties of parent class as if it were its own.)'''
class Fish:
    # Step 1.1: Initialize the Fish class
    '''@blank(The __init__ method allows us to initalize instance attributes of the Fish class. self represents the instance of the class, and we can access instance attributes, in this case first name, last name, skeleton, and eyelids witht the self keyword.)'''
    '''@blank(The arguments in the __init__ method, which represent values within the class, must be passed in when the class is defined. The argument self is is automatically invoked when the class is defined, and does not need to be passed in. The __init__ method also run automatically when the class is initalized, and does not need to be called on specifically.)'''
    '''@blank(last_name="Fish" represents an optional argument. If the last name of the Fish is not passed in, the default value "Fish" Will be assigned to last_name. Otherwise, last_name will the passed in.)'''
    def __init__(self, first_name, last_name="Fish", fins=True):
        '''@helpDescription(The instance methods of a class can be called anywhere within the class. Here, the first_name, last_name, skeleton, and eyelids of the Fish class is assigned to values passed in when the Fish class is invoked.)'''
        self.first_name = first_name
        self.last_name = last_name
        self.skeleton = 'skeleton'
        self.eyelids = 'eyelids'

    # Step 1.2: Define additional methods of the Fish class
    '''@helpDescription(This method defines whether the fish can swim backwards. The argument self is automatically passed in when the method is called, so no arguments need to be passed in.)'''
    def swim_backwards(self):
        print("The fish can swim backwards.")

# Step 2: Define a child class
'''@blank(A Child class is defined by passing the parent class as an argument in the child class. Child classes inherit properties and methods from the parent class, which the child class is able to use without declaring in its own class.)'''
class Shark(Fish):
    '''@blank(Writing a method in the child class which has the same name as one in the parent class will override the method in the parent class. When an instance of class Shark is created, it will use only the child class' __init__ method. In this case, this __init__ method overrides the inherited __init__ method class Fish.)'''
    '''@blank(last_name, skeleton, and eyelids are optional parameters. If not passed in, they will have the default values of "Shark", "cartilge", and "True" respectively.)'''
    def __init__(self, first_name, last_name="Shark", skeleton="cartilage", eyelids=True):
        self.first_name = first_name
        self.last_name = last_name
        self.skeleton = skeleton
        self.eyelids = eyelids

    '''@helpDescription(Method swim_backwards will also override the swim_backwards method in the parent class.)'''
    def swim_backwards(self):
        print("The shark cannot swim backwards, but can sink backwards.")

# Step 3: Test the classes
'''@helpDescription(An instance of the class Trout is created, with the first_name sammy. The last_name is not passed in, so the default values of "Shark" from the Shark class is assigned.)'''
sammy = Shark("Sammy")
'''@helpDescription(The first_name and last_name of the class instance sammy is defined by the Shark class)'''
print(sammy.first_name + " " + sammy.last_name)
'''@helpDescription(Sammy's eyelids and skeleton is defined by the Shark class)'''
print(sammy.eyelids)
print(sammy.skeleton)
'''@helpDescription(The method swim_backwards is called from the Shark class.)'''
'''@helpDescription(Any method in the child class overrides the method with the same name in the parent class.)'''
sammy.swim_backwards()

# Step 3: Test the classes
'''@helpDescription(An instance of the class Trout is created, with the first_name Terry. The last_name is not passed in, so the default values of "Fish" is assigned.)'''
terry = Trout("Terry")
'''@helpDescription(The first_name and last_name of the class instance terry is defined, and printed through the methods it inherited from the parent class Fish.)'''
print(terry.first_name + " " + terry.last_name)
'''@helpDescription(The class instances skeleton and eyelids are called, as it is defined through the properties it inherits from the Fish class.)'''
print(terry.skeleton)
print(terry.eyelids)
'''@helpDescription(The method swim_backwards is called, as it is inherited from the Fish class.)'''
terry.swim_backwards()