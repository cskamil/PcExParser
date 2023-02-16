'''
@goalDescription(Construct two classes: one represents a Person and another one represents an Employee that should be defined as Person's child class. The classes should define functions to display the employee's information)
@name(Person and Employee Inheritance Information)
@distractor{code(Person.self.name), helpDescription()}
@distractor{code(Person()), helpDescription()}
'''
# Step1: Define the class
'''@helpDescription(We define the class named Person to represent a person.)'''
class Person():
    #Step 1.1: Initialize the attributes of the Person class.
    '''@helpDescription(We want to initialize the attributes of the Person when we create an instance of the Person class. We do this by defining an __init__ method, which is run automatically by Python each time an instance is created. This method passes the name and idnumber of a person that are specified as the method's parameter. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def __init__(self, name, idnumber):
        '''@helpDescription(This statement sets the person's name to the passed parameter. self is the instance of the class and self.name shows the person's name.)'''
        self.name = name
        '''@helpDescription(This statement sets the person's idnumber to the passed parameter. self is the instance of the class and self.idnumber shows the person's idnumber.)'''
        self.idnumber = idnumber
    # Step 1.2: Define the method to print the person's name and id
    '''@helpDescription(This method displays the person's name and idnumber. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def display(self):
        '''@helpDescription(This statement prints the name of the person. self is the instance of the class and self.name is the name of the instance.)'''
        print(self.name)
        '''@helpDescription(This statement prints the idnumber of the person. self is the instance of the class and self.idnumber is the idnumber of the instance.)'''
        print(self.idnumber)

# Step2: Define a class that is Person's child class or subclass
'''@helpDescription(We define the subclass of Person named Employee to display the person's other information.)'''
class Employee(Person):
    # Step 2.1: Initialize the attributes of the Employee class.
    '''@helpDescription(We want to initialize the attributes of the Employee when we create an instance of the Employee class. We do this by defining an __init__ method, which is run automatically by Python each time an instance is created. This method passes the name, idnumber, salary and post of a person that are specified as the method's parameter. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def __init__(self, name, idnumber, salary, post):
        '''@helpDescription(This statement sets the person's salary to the passed parameter. self is the instance of the class and self.salary shows the person's salary.)'''
        self.salary = salary
        '''@helpDescription(This statement sets the person's post to the passed parameter. self is the instance of the class and self.post shows the person's post.)'''
        self.post = post
        '''@blank(This statement invokes the __init__ of the parent class)'''
        Person.__init__(self, name, idnumber)
    # Step 1.2: Define the method to print the person's salary and post
    '''@helpDescription(This method displays the person's salary and post. The argument (named self) is passed in automatically by the interpreter when the method is invoked on an instance of the class.)'''
    '''@helpDescription(Note that Python automatically fills the first argument in with the instance object that is the implied subject of the method call. Therefore, when this method is invoked on an instance of the class, no parameter must be passed to the method.)'''
    def info(self):
        '''@helpDescription(This statement prints the salary of the person. self is the instance of the class and self.salary is the salary of the instance.)'''
        print(self.salary)
        '''@helpDescription(This statement prints the post of the person. self is the instance of the class and self.post is the post of the instance.)'''
        print(self.post)

'''@helpDescription(We created an instance of the child class Employee to demonstrate the creation and use of both Person and Employee's instances.)'''
'''@helpDescription(This statement creates an Employee instance. The variable a holds a reference to an Employee instance and its parent class Person's instance.)'''
a = Employee('Rahul', 886012, 200000, 'Intern')
'''@helpDescription(This statement invokes display method of class Person.)'''
a.display()
'''@helpDescription(This statement invokes info method of class Person.)'''
a.info()