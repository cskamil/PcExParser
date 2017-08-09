'''
@goalDescription(Construct a program to read twelve temperature values for each month in the year and display the month with the lowest temperature.)
@input(38,39,49,62,39,79,83,81,74,63,51,36)
@name(Displaying The Month with the Lowest Temperature)
@distractor{code(for current_month in range(2, 12):), helpDescription()}
@distractor{code(for current_month in range(1, 11):), helpDescription()}
@distractor{code(if next_value > lowest_value :), helpDescription()}
@distractor{code(if lowest_value <= next_value :), helpDescription()}
@distractor{code(if current_month > lowest_value :), helpDescription()}
'''
#Step 1: Read the first value and set it to be the lowest temperature so far
'''@helpDescription(We need to be careful how we set up the lowest temperature value. We can’t simply set it to 0 because our program needs to work with temperature values from some places in the world that may be all positive. A good option is to set the lowest temperature value to the first input value. We read the first input value using the input function.)'''
'''@helpDescription(This statement prints a text on the screen "Enter the temperature:", then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the temperature:")
'''@helpDescription(We need variable lowest_value to store the lowest value read so far. To initialize this variable, we need to convert the first value read (stored in the variable text) to its integer representation. For this purpose, we use int(text) function.)'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents an integer.)'''
lowest_value = int(text)
'''@helpDescription(We need variable lowest_month to store the month with the lowest temperature. We need to initialize the lowest month with 1 because we initially assume that the first month has the lowest value.)'''
lowest_month = 1

#Step 2: Read the remaining values and decide which one is the lowest temperature 
'''@blank(We need to read the remaining 11 temperature values and decide which month has the lowest temperature. To do this, we need to use a loop structure. To iterate over the remaining 11 months, we call the function range(2,13).)'''
'''@blank(We use for loops instead of a while loop because for loops are best-suited in cases like this when we know ahead of time the number of times that we need to repeat the loop.)'''
'''@blank(The for statement iterates over the numbers in the sequence in order, executing the statements inside the loop body for each number in the sequence. To iterate over the remaining 11 months, we call the function range(2,13). This function passes the for loop a sequence that starts at 2 with every integer number up to but not including 13. Note that all statements inside the loop need to be indented with respect to the loop header.)'''
for current_month in range(2, 13):
    '''@helpDescription(We read the remaining input values using the input function. This statement reads the text entered by the user and places it in the variable text of type string.)'''
    text = input()
    '''@helpDescription(We need to store the value that we just read into variable next_value because we will need to compare it with the lowest value so far. To initialize this variable, we need to convert the value read (stored in the variable text) to its integer representation. For this purpose, we use int(text) function.)'''
    '''@helpDescription(Note that the conversion to integer can only be done if the string actually presents an integer.)'''
    next_value = int(text)
    '''@blank(We need to compare the value read with the lowest value stored in variable lowest_value. If the value read is lower than the lowest value, then we need to set the lowest value to the value read and set lowest month to current month.)'''
    if next_value < lowest_value :
        '''@helpDescription(This statement sets the lowest value to the value read that is stored in variable next_value.)'''
        lowest_value = next_value
        '''@helpDescription(This statement sets the lowest month to the current month that is stored in variable current_month.)'''
        lowest_month = current_month
'''@helpDescription(This statement prints to the default standard output stream the text "The month with the lowest temperature is: Month" and the month with the lowest temperature stored in variable lowest_month. These arguments are separated by the default separator (i.e., single space character) and followed by the end-of-line character at the end.)'''
'''@helpDescription(Note that lowest_month is not enclosed in quotation marks because the program does not want to print the text lowest_month, but the value of variable lowest_month.)'''
print("The month with the lowest temperature is: Month", lowest_month)
