'''
@goalDescription(Construct two classes: one represents a Person and another one represents an Employee that should be defined as Person's child class. The classes should define the functions to check if the person is an employee and return the person's name.)
@name(Person and Employee Inheritance)
'''
# Step1: Define the class
'''@helpDescription(We define the class named Person to represent a person.)'''
class Person():
    # Step 1.1: Initialize the attributes of the Person class.
    '''@helpDescription(We want to initialize the attributes of the Person when we create an instance of the Person class. We do this by defining an __init__ method, which is run automatically by Python each time an instance is created. This method passes the name of a person that is specified as the method's parameter. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def __init__(self, name):
        '''@helpDescription(This statement sets the person’s name to the passed parameter. self is the instance of the class and self.name shows the person’s name.)'''
        self.name = name
    # Step 1.2: Define the method to return the person’s name
    '''@helpDescription(This method returns the person’s name. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def get_name(self):
        '''@helpDescription(This statement returns the name of the person. self is the instance of the class and self.name is the name of the instance.)'''
        return self.name
    # Step 1.3: Define the method to return if the person is an employee
    '''@helpDescription(The method is to return if the current person is not an employee. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def is_employee(self):
        '''@helpDescription(The statement returns False to represent this person is not an employee.)'''
        return False
# Step2: Define a class that is Person’s child class or subclass
'''@helpDescription(We define the subclass of Person named Employee to return the person is an employee.)'''
class Employee(Person):
    # Step 2.1: Define the method to return if the person is an employee
    '''@helpDescription(The method is to return the current person is an employ. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def is_employee(self):
        '''@helpDescription(The statement returns True to represent this person is not an employee.)'''
        return True
# Step3: Test the class
'''@helpDescription(We create an instance of the class Person to demonstrate the creation and use of Person instances.)'''
'''@helpDescription(This statement creates a Person instance. The variable person holds a reference to a Person instance.)'''
emp = Person("Melody")
'''@helpDescription(This statement invokes getName and isEmployee methods of class Person and prints the current person’s name and if the person is an employee.)'''
print(emp.get_name(), emp.is_employee())
'''@helpDescription(We created an instance of the child class Employee to demonstrate the creation and use of both Person and Employee’s instances.)'''
'''@helpDescription(This statement creates a Employee instance. The variable emp holds a reference to an Employee instance and its parent class Person’s instance.)'''
emp = Employee("Linda")
'''@helpDescription(This statement invokes getName and isEmployee methods of class Person and the child class Employee respectively and prints the current person’s name and if the person is an employ.)'''
print(emp.get_name(), emp.is_employee())
