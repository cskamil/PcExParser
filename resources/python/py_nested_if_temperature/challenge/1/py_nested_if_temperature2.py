
'''
@goalDescription(Construct a program that receives the temperature and humidity for today and yesterday and warns the user when it is getting colder or warmer or neither. When it is getting warmer, the program should also warn the user about the changes in humidity. In particular, it should warn the user when today's humidity is more, less, or has not changed compared to yesterday's humidity. Note that the temperature and humidity values could have a decimal point.)
@input(60.2)
@input(65.0)
@input(74)
@input(70)
@name(Warning the User about the Changes in the Temperature and Humidity)
@distractor{code(if humidityToday > humidityYesterday :), helpDescription()}
@distractor{code(if humidityToday >= humidityYesterday :), helpDescription()}
@distractor{code(if humidityToday < yesterday :), helpDescription()}
@distractor{code(if humidityToday <= yesterday :), helpDescription()}
 '''

#Step 1: Read the temperature for today and yesterday
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input() function. This statement prompts the user to enter the yesterday's temperature, then reads the text entered by the user and places it in the variable text. The value that will be stored in variable text is a string.)'''
text = input("Enter the yesterday's temperature: ")
'''@helpDescription(We need to convert the input text to its float representation because temperature could have a decimal point. For this purpose, we use the conversion function float().)'''
'''@helpDescription(Note that this can only be done if user input could be translated into a valid floating-point value.)'''    
yesterday = float(text)
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input() function. This statement prompts the user to enter the today's temperature, then reads the text entered by the user and places it in the variable text. The value that will be stored in variable text is a string.)'''
text = input("Enter the today's temperature: ")
'''@helpDescription(We need to convert the input text to its float representation because temperature could have a decimal point. For this purpose, we use the conversion function float().)'''
'''@helpDescription(Note that this can only be done if user input could be translated into a valid floating-point value.)'''    
today = float(text)  

#Step 2: Read the humidity for today and yesterday
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input() function. This statement prompts the user to enter the yesterday's humidity, then reads the text entered by the user and places it in the variable text. The value that will be stored in variable text is a string.)'''
text = input("Enter yesterday's humidity: ")
'''@helpDescription(We need to convert the input text to its float representation because humidity could have a decimal point. For this purpose, we use the conversion function float().)'''
'''@helpDescription(Note that this can only be done if user input could be translated into a valid floating-point value.)'''    
humidityYesterday = float(text)
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input() function. This statement prompts the user to enter the today's humidity, then reads the text entered by the user and places it in the variable text. The value that will be stored in variable text is a string.)'''
text = input("Enter today's humidity: ")
'''@helpDescription(We need to convert the input text to its float representation because humidity could have a decimal point. For this purpose, we use the conversion function float().)'''
'''@helpDescription(Note that this can only be done if user input could be translated into a valid floating-point value.)''' 
humidityToday = float(text)


#Step 3: Warn the user about the changes in the temperature
'''@helpDescription(There are three possible ways the temperature could change: it could get colder, warmer, or it could stay the same. We could determine how the temperature is changing by comparing the today's temperature with yesterday's temperature.<br>One way that we could compare these two temperatures is to first check if today's temperature is less than yesterday's temperature. If it is, then it's getting colder. If it is not, we could perform another test to check if today's temperature is greater than yesterday's temperature. If it, then it's getting warmer. If it is not, then we could conclude that today's temperature is the same as yesterday's temperature.<br><br>The conditions that we want to use to compare the temperatures are mutually exclusive (i.e., one and only one of the conditions can be True) therefore, their order does not matter. Also, it is better to use if-else statements instead of sequential if statements because the temperature could change in only one way and once one of the tests evaluates to True, we don't need to perform more tests.)'''
'''@helpDescription(We start by checking whether the today's temperature is less than yesterday's temperature. If it is, then the body of this if statement gets executed. Otherwise, the body of this if statement is skipped.)'''
if today < yesterday :
    '''@helpDescription(This statement prints that it's getting colder. The printed text is followed by the end-of-line character at the end.)'''
    print("It is getting colder!")
    '''@helpDescription(The statement inside the body of the else statement gets executed when the if condition evaluates to False, i.e., when today's temperature is not less than yesterday's temperature. Otherwise, the body of the else statement is skipped.)'''
else :
    '''@helpDescription(If the first test fails (i.e., when today's temperature is not less than yesterday's temperature), we need to test if today's temperature is greater than yesterday's temperature.)'''
    '''@helpDescription(If the first test fails (i.e., when today's temperature is not less than yesterday's temperature), the body of the previous if statement will not be executed, instead the program reaches this if statement, where we test whether the today's temperature is greater than yesterday's temperature.)'''
    '''@helpDescription(If today's temperature is greater than yesterday's temperature, then the body of this if statement gets executed. Otherwise, the body of this if statement is skipped.)'''
    if today > yesterday :
        #Step 3.1: Determine and warn the user about the changes in humidity when it is getting warmer
        '''@blank(When it is getting warmer, we need to determine how humidity is changing. There are three possible ways that today's humidity could change compared to yesterday's humidity, it could get more humid, less humid, or the humidity could stay the same.<br>One way that we could compare the humidity values is to first check if today's humidity is less than yesterday's humidity. If it is, then it's getting less humid. If it is not, we could perform another test to check if today's humidity is greater than yesterday's humidity. If it is, then it's getting more humid. If it is not, then we could conclude that today's humidity is the same as yesterday's humidity.<br><br>The conditions that we want to use to compare the humidity values are mutually exclusive (i.e., one and only one of the conditions can be True) therefore, their order does not matter. Also, it is better to use if-else statements instead of sequential if statements because the humidity could change in only one way and once one of the tests evaluates to True, we don't need to perform more tests.)'''
        '''@blank(We start by checking whether the today's humidity is less than yesterday's humidity. If it is, then the body of this if statement gets executed. Otherwise, the body of this if statement is skipped.)'''
        if humidityToday < humidityYesterday :
            '''@helpDescription(This statement prints that it's getting warmer but less humid. The printed text is followed by the end-of-line character at the end.)'''
            print("It is getting warmer but less humid!")
            '''@helpDescription(If the first if test fails (i.e., when today's humidity is not less than yesterday's humidity), we need to test if today's humidity is greater than yesterday's humidity.)'''
            '''@helpDescription(If the first test fails (i.e., when today's humidity is not less than yesterday's humidity), the body of the previous if statement will not be executed, instead the program reaches this else if statement, where we test whether the today's humidity is greater than from yesterday's humidity.<br><br>If today's humidity is greater than yesterday's humidity, then the body of this if statement gets executed. Otherwise, the body of this if statement is skipped.)'''
        elif humidityToday > humidityYesterday :
            '''@helpDescription(This statement prints that it's getting warmer and more humid. The printed text is followed by the end-of-line character at the end.)'''
            print("It is getting warmer and more humid!")
            '''@helpDescription(The statement inside the body of the else statement gets executed only if none of the above two tests for humidity evaluates to True, i.e., when today's humidity is the same as yesterday's humidity. Otherwise, the body of this else statement is skipped.)'''
            '''@helpDescription(Note than when we end series of if-else if statements with an else statement, we make sure to execute the body of exactly one of those statements.)'''
        else :
            '''@helpDescription(This statement prints that it's getting warmer but the humidity has not changed. The printed text is followed by the end-of-line character at the end.)'''
            print("It is getting warmer but humidity has not changed!")
        '''@helpDescription(The statement inside the body of the else statement gets executed when all of the previous if conditions evaluates to False, i.e., when today's temperature is the same as yesterday's temperature. Otherwise, the body of this else statement is skipped.)'''
    else :
        '''@helpDescription(This statement prints that the today's temperature is the same as yesterday's temperature. The printed text is followed by the end-of-line character at the end.)'''
        print("Temperature is the same as yesterday!")
