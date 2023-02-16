'''
@goalDescription(Construct a program that takes an input as the size of a square and print the outline of the square.\nFor example, if a user’s input is 4, the printed square should look like:\n****\n*  *\n*  *\n****)
@name(Printing the outline of a square star pattern)
@distractor{code(if i == 0), helpDescription()}
@distractor{code(if i == 0 and i == size), helpDescription()}
@distractor{code(for j in range(size)),helpDescription()}
@distractor{code(for j in range(size - 1)),helpDescription()}
@input(6)
@input(4)
'''
# Step 1: Read the number of rows in the right square star pattern
'''@helpDescription(We need to read and process the size of the square that the user enters. To read the user input from command line, we use the input () function. This statement prints a text on the screen Enter size of side of square: ', then reads the text entered by the user.The value that will be read is a string and we need to convert it to an integer. We convert the input string to its integer representation by using the int() function.)'''
'''@helpDescription(Input: The conversion of the value from string to int can only be done if the string actually presents an integer. Also note that we do not necessarily have to store the returned value from the input function in a variable. We could use the input function call directly as the int function parameter.)'''
size = int(input("Enter size of side of square :"))
# Step 2: Print the rows in the star pattern, one by one
'''@helpDescription(Since we want to print an empty square, the first and the last row contains size number of asterisks. We can print this star pattern by using three for loops combining with an if-else statement to check if the current row is the first or the last one. The outer for loop will print one row in every iteration whereas the inner for loops will print the certain number of asterisks for each row.)'''
'''@helpDescription(This statement is the outer for loop. We use the range function because it generates a sequence of numbers for the for loop. Here, we want the loop to iterate through 0 to size; therefore, we can simply use the default range function. We get this sequence by calling the function range(size).)'''
'''@helpDescription(Note that all statements inside the loop need to be indented with respect to the loop header.)'''
for i in range(size):
    # Step 2.1: Check if the current row is the first or the last one
    '''@blank(We use if-else statement to check if the current row is the first or the last one. if the current row i is the first or the last row, we print the number of size asterisks.)'''
    '''@blank(We start by checking whether the current row i == 0(the first row) or i==size-1(the last row). If it is, then the body of this if statement gets executed. Otherwise, the body of this if statement is skipped.)'''
    if i == 0 or i == size - 1:
        '''@helpDescription(This statement is the first inner for loop. Each iteration of inner loop will print the given size of the asterisks. For each row, the inner loop will iterate size times; thus, creating a row with size asterisks.)'''
        '''@helpDescription(For the inner loop, we use the range function because it generates a sequence of numbers for the for loop. Here, we want to repeat the loop size times; therefore, we need a sequence that starts at 0 with every integer number up to size but not include size. We get this sequence by calling the default function range(size).)'''
        for k in range(size):
            '''@helpDescription(This statement prints each asterisk in each row.)'''
            print("*", end = "")
    '''@helpDescription(If the current row is not the first or the last one, the else statement gets executed. In other rows of the square, only the beginning and the end of the row have stars, so we need to print the beginning and the end stars, and also we need to print the space.)'''
    else:
        '''@helpDescription(This statement first print the beginning asterisk.)'''
        print("*", end = "")
        # Step 2.2: Print other rows pattern.
        '''@blank(This statement is the second inner for loop. Each iteration of the inner loop will print spaces. For each row, the inner loop will iterate size-2 times; thus, creating a row with size-2 spaces.)'''
        '''@blank(For the inner loop, we use the range function because it generates a sequence of numbers for the for loop. Here, we want to repeat the loop size-2 times; therefore, we need a sequence that starts at 0 with every integer number up to size-2 but not include size. We get this sequence by calling the default function range(size-2).)'''
        for j in range(size - 2):
            '''@helpDescription(This statement prints the spaces in between the beginning and the end asterisks.)'''
            print(" ", end = "")
        '''@helpDescription(This statement prints the end asterisk after the printing space for loop finishes iterating.)'''
        print("*", end="")
    # Step 3: Print the next line
    '''@helpDescription(This statement prints a new row. The printed text is followed by the end-of-line character at the end.)'''
    print()