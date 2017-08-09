'''
@goalDescription(Construct a program to read twelve temperature values for each month in the year and display the month with the highest temperature.)
@input(36,39,49,62,71,79,80,81,74,63,51,83)
@name(Displaying The Month with the Highest Temperature)
@distractor{code(for current_month in range(2, 12):), helpDescription()}
@distractor{code(for current_month in range(1, 11):), helpDescription()}
@distractor{code(if next_value < highest_value :), helpDescription()}
@distractor{code(if highest_value >= next_value :), helpDescription()}
@distractor{code(if current_month > highest_value :), helpDescription()}
'''
#Step 1: Read the first value and set it to be the highest temperature so far
'''@helpDescription(We need to be careful how we set up the highest temperature value. We can’t simply set it to 0 because our program needs to work with temperature values from some places in the world that may be all negative. A good option is to set the highest temperature value to the first input value. We read the first input value using the input function.)'''
'''@helpDescription(This statement prints a text on the screen "Enter the temperature:", then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the temperature:")
'''@helpDescription(We need variable highest_value to store the highest value read so far. To initialize this variable, we need to convert the first value read (stored in the variable text) to its integer representation. For this purpose, we use int(text) function.)'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents an integer.)'''
highest_value = int(text)
'''@helpDescription(We need variable highest_month to store the month with the highest temperature. We need to initialize the highest month with 1 because we initially assume that the first month has the highest value.)'''
highest_month = 1

#Step 2: Read the remaining values and decide which one is the highest temperature 
'''@blank(We need to read the remaining 11 temperature values and decide which month has the highest temperature. To do this, we need to use a for loop. To iterate over the remaining 11 months, we call the function range(2,13).)'''
'''@blank(We use for loops instead of a while loop because for loops are best-suited in cases like this when we know ahead of time the number of times that we need to repeat the loop.)'''
'''@blank(The for statement iterates over the numbers in the sequence in order, executing the statements inside the loop body for each number in the sequence. The function range(2,13) passes the for loop a sequence that starts at 2 with every integer number up to but not including 13. Note that all statements inside the loop need to be indented with respect to the loop header.)'''
for current_month in range(2, 13):
    '''@helpDescription(We read the remaining input values using the input function. This statement reads the text entered by the user and places it in the variable text of type string.)'''
    text = input()
    '''@helpDescription(We need to store the value that we just read into variable next_value because we will need to compare it with the highest value so far. To initialize this variable, we need to convert the value read (stored in the variable text) to its integer representation. For this purpose, we use int(text) function.)'''
    '''@helpDescription(Note that the conversion to integer can only be done if the string actually presents an integer.)'''
    next_value = int(text)
    '''@blank(We need to compare the value read with the highest value stored in variable highest_value. If the value read is higher than the highest value, then we need to set the highest value to the value read and set the highest month to current month.)'''
    if next_value > highest_value :
        '''@helpDescription(This statement sets the highest value to the value read that is stored in variable next_value.)'''
        highest_value = next_value
        '''@helpDescription(This statement sets the highest month to the current month that is stored in variable current_month.)'''
        highest_month = current_month
'''@helpDescription(This statement prints to the default standard output stream the text "The month with the highest temperature is: Month" and the month with the highest temperature stored in variable highest_month. These arguments are separated by the default separator (i.e., single space character) and followed by the end-of-line character at the end.)'''
'''@helpDescription(Note that highest_month is not enclosed in quotation marks because the program does not want to print the text highest_month, but the value of variable highest_month.)'''
print("The month with the highest temperature is: Month", highest_month)
