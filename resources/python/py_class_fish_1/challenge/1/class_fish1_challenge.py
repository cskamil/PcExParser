'''
@goalDescription(Construct a class Fish which describes the name and appearance of most fish. Create another class Trout, which inherits all the properties of the class Fish.)
@name(Inheritance of Fish)
@distractor{code(def __init__(self, first_name, last_name):), helpDescription()}
@distractor{code(def __init__(first_name, last_name):), helpDescription()}
@distractor{code(self.age = 3), helpDescription()}
@distractor{code(class Goldfish:), helpDescription()}
@distractor{code(print(jeffrey.first_name, jeffrey.age)), helpDescription()}
'''
# Step 1: Define the Parent class
'''@helpDescription(The parent class defines properties, methods, and patterns which the child classes can inherit. Inheritance allows children classes to use the properties of parent class as if it were its own.)'''
class Fish:
    # Step 1.1: Initialize the Fish class
    '''@blank(The __init__ method allows us to initalize instance attributes of the Fish class. self represents the instance of the class, and we can access instance attributes, in this case first name, last name, skeleton, and eyelids witht the self keyword.)'''
    '''@blank(The arguments in the __init__ method, which represent values within the class, must be passed in when the class is defined. The argument self is is automatically invoked when the class is defined, and does not need to be passed in. The __init__ method also run automatically when the class is initalized, and does not need to be called on specifically.)'''
    '''@blank(last_name="Fish" represents an optional argument. If the last name of the Fish is not passed in, the default value "Fish" Will be assigned to last_name. Otherwise, last_name will the passed in.)'''
    def __init__(self, first_name, age, last_name="Fish"):
        self.first_name = first_name
        self.last_name = last_name
        '''@blank(The instance methods of a class can be called anywhere within the class. Here, the first_name, last_name, and age of the Fish class is assigned to values passed in when the Fish class is invoked.)'''
        self.age = age

    # Step 1.2: Define additional methods of the Fish class
    '''@helpDescription(This method defines whether the fish likes to swim in schools. The argument self is automatically passed in when the method is called, so no arguments need to be passed in.)'''
    def schools(self):
        print("The fish likes to swim in schools")

# Step 2: Define the Child class
'''@blank(A Child class is defined by passing the parent class as an argument in the child class. Child classes inherit properties and methods from the parent class, which the child class is able to use without declaring in its own class.)'''
class Goldfish(Fish):
    '''@helpDescription(Without defining any methods, the the properties and methods of the child class is exactly the same as that of the parent class. We can call on the same properties of the parent class to define instances of the child class.)'''
    pass

# Step 3: Test the classes
'''@helpDescription(An instance of the class Trout is created, with the first_name Terry. The last_name is not passed in, so the default values of "Fish" is assigned.)'''
jeffrey = Goldfish("Jeffrey",3)
# Step 3.1: Print the name and age of the goldfish.
'''@blank(call properties of the Goldfish class, as they are inherited from the Fish class.)'''
print(jeffrey.first_name, jeffrey.last_name, jeffrey.age)
# Step 3.2: Print whether the goldfish likes to swim in schools
'''@helpDescription(The method schools is called, as inherited from the Fish class.)'''
jeffrey.schools()