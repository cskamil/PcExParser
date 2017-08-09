'''
@goalDescription(Construct a program to read twelve temperature values for each month in the year and display how many months are below 40 degrees.)
@input(36,39,49,62,71,79,83,81,74,63,40,39)
@name(Displaying How Many Months are Below 40 Degrees)
@distractor{code(if next_value <= 40 :), helpDescription()}
@distractor{code(if next_value > 40 :), helpDescription()}
@distractor{code(if current_month < 40 :), helpDescription()}
@distractor{code(for current_month in range(1, 12):), helpDescription()}
@distractor{code(for current_month in range(1, 11):), helpDescription()}
'''
#Step 1: Define the variables that we need for this program
'''@helpDescription(We need variable count to count how many temperature values that the user enters are less than 40 degrees.)''' 
count = 0
#Step 2: Read the temperature values and count the number of months below 40 degrees 
'''@helpDescription(This statement prints to the default standard output stream "Enter the temperature:". Note that print argument is enclosed in quotation marks because it is to be printed as it is. The printed text will be followed by the end-of-line character at the end.)'''
print('Enter the temperature:')
'''@blank(We need to read twelve temperature values and count how many months are below 40 degrees. To do this, we need to use a for loop structure. To iterate over 12 months, we call the function range(1,13).)'''
'''@blank(We use for loops instead of a while loop because for loops are best-suited in cases like this when we know ahead of time the number of times that we need to repeat the loop.)'''
'''@blank(The for statement iterates over the numbers in the sequence in order, executing the statements inside the loop body for each number in the sequence. The function range(1,13) passes the for loop a sequence that starts at 1 with every integer number up to but not including 13. Note that all statements inside the loop need to be indented with respect to the loop header.)'''
for current_month in range(1, 13):
    '''@helpDescription(We read the remaining input values using the input function. This statement reads the text entered by the user and places it in the variable text of type string.)'''
    text = input()
    '''@helpDescription(We need to store the value that we just read into variable next_value because we will need to compare it with the threshold of 40 degrees. To initialize this variable, we need to convert the value read (stored in the variable text) to its integer representation. For this purpose, we use int(text) function.)'''
    '''@helpDescription(Note that the conversion to integer can only be done if the string actually presents an integer.)'''
    next_value = int(text)
    '''@blank(We need to compare the value read with the threshold that is 40 degrees. If the value read is lower than the threshold, then the if test evaluates to True and the statement in the if body will be executed to increment the counter for number of months below 40 by 1.)'''
    if next_value < 40 :
        '''@helpDescription(If the value read is lower than 40 degrees, we increment the variable count by 1.)'''
        '''@helpDescription(The += operator adds 1 to the value of variable count and the result is stored back into the variable count. Therefore, it is functionally equivalent to the statement count = count + 1.)'''
        count += 1
'''@helpDescription(This statement prints to the default standard output stream the text "There are", the number stored in variable count, and the text "months that are below 40 degrees.". These arguments are separated by the default separator (i.e., single space character) and followed by the end-of-line character at the end.)'''
'''@helpDescription(Note that count is not enclosed in quotation marks because the program does not want to print the text count, but the value of variable count.)'''
print("There are", count, "months that are below 40 degrees.")
