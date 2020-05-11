'''
@goalDescription(Construct a class Fish which describes the name and appearance of most fish. Create another class Shark, which inherits the properties of the class Fish but has some unique ones. Finally, print the characteristics of an instance of a Shark class.)
@name(Inheritance of Fish)
@distractor{code(def __init__(self, first_name, last_name):), helpDescription()}
@distractor{code(def __init__(self, first_name, last_name, skeleton):), helpDescription()}
@distractor{code(Fish.characteristics()), helpDescription()}
@distractor{code(return Fish.characteristics()), helpDescription()}
'''
# Step 1: Define the Parent class
'''@helpDescription(The parent class defines properties, methods, and patterns which the child classes can inherit. Inheritance allows children classes to use the properties of parent class as if it were its own.)'''
class Fish:
    # Step 1.1: Initialize the Fish class with first_name and last_name. Default last_name is set to "Fish".
    '''@blank(The __init__ method allows us to initalize instance attributes of the Fish class. self represents the instance of the class, and we can access instance attributes, in this case first name, last name, skeleton, and eyelids witht the self keyword.)'''
    '''@blank(The arguments in the __init__ method, which represent values within the class, must be passed in when the class is defined. The argument self is is automatically invoked when the class is defined, and does not need to be passed in. The __init__ method also run automatically when the class is initalized, and does not need to be called on specifically.)'''
    '''@blank(last_name="Fish" represents an optional argument. If the last name of the Fish is not passed in, the default value "Fish" Will be assigned to last_name. Otherwise, last_name will the passed in.)'''
    def __init__(self, first_name, last_name="Fish"):
        '''@helpDescription(The instance methods of a class can be called anywhere within the class. Here, the first_name, last_name, skeleton, and eyelids of the Fish class is assigned to values passed in when the Fish class is invoked.)'''
        self.first_name = first_name
        self.last_name = last_name
        self.fins = fins

    # Step 1.2: Define additional methods of the Fish class
    '''@helpDescription(This method defines whether the fish can swim backwards. The argument self is automatically passed in when the method is called, so no arguments need to be passed in.)'''
    def characteristics(self):
        print("The fish do not like to be touched")

# Step 2: Define a child class
'''@helpDescription(A Child class is defined by passing the parent class as an argument in the child class. Child classes inherit properties and methods from the parent class, which the child class is able to use without declaring in its own class.)'''
class Shark(Fish):
    # Step 2.1: Write the __init__() method which will override the __init__ method of the parent class, listing the Shark's default last_name as "Shark" and the default skeleton is made from cartilage.
    '''@blank(Writing a method in the child class which has the same name as one in the parent class will override the method in the parent class. When an instance of class Shark is created, it will use only the child class' __init__ method. In this case, this __init__ method overrides the inherited __init__ method class Fish.)'''
    '''@blank(last_name, skeleton, and eyelids are optional parameters. If not passed in, they will have the default values of "Shark", "cartilge", and "True" respectively.)'''
    def __init__(self, first_name, last_name="Shark", skeleton="cartilage"):
        self.first_name = first_name
        self.last_name = last_name
        self.skeleton = skeleton

    # Step 2.2: Write the characteristics() method which will override the method with the same name in the parent class, but import the characteristics() method from the parent class.
    def characteristics(self):
        print("Sharks have sharp teeth")
        '''@blank(Method swim_backwards will also override the swim_backwards method in the parent class. Find a way to import the characteristics() method from the parent class after it has been overriden.)'''
        Fish.characteristics(self)

# Step 3: Test the classes
'''@helpDescription(An instance of the class Trout is created, with the first_name sammy. The last_name is not passed in, so the default values of "Shark" from the Shark class is assigned.)'''
sammy = Shark("Sammy")
'''@helpDescription(The first_name and last_name of the class instance sammy is defined by the Shark class)'''
print(sammy.first_name + " " + sammy.last_name)
'''@helpDescription(Sammy's eyelids and skeleton is defined by the Shark class)'''
print(sammy.skeleton)
'''@helpDescription(The method characteristics() is called from the Shark class, but is inherited from the Fish class. It overrides the method with the same name in the parent class.)'''
sammy.characteristics()