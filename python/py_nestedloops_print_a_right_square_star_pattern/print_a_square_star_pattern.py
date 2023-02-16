'''
@goalDescription(Construct a program that takes an input as the size of a solid square  and print the square.\nFor example, if a user’s input is 4, the printed solid square should look like:\n****\n****\n****\n****)
@name(Printing a square star pattern)
@input(6)
'''
# Step 1: Read the number of rows in the right square star pattern
'''@helpDescription(We need to read and process the size of the square that the user enters. To read the user input from command line, we use the input () function. This statement prints a text on the screen Enter size of side of square: ', then reads the text entered by the user.The value that will be read is a string and we need to convert it to an integer. We convert the input string to its integer representation by using the int() function.)'''
'''@helpDescription(Input: The conversion of the value from string to int can only be done if the string actually presents an integer. Also note that we do not necessarily have to store the returned value from the input function in a variable. We could use the input function call directly as the int function parameter.)'''
size = int(input("Enter size of side of square :"))
# Step 2: Print the rows in the star pattern, one by one
'''@helpDescription( Since we want to print a solid square, each row contains the same number of asterisks as the given size of the square. We can print this star pattern by using two for loops. The outer for loop will print one row in every iteration whereas the inner for loop will print the given size of asterisks for each row.)'''
'''@helpDescription(This statement is the outer for loop. We use the range function because it generates a sequence of numbers for the for loop. Here, we want the loop to iterate through 0 to size; therefore, we can simply use the default range function. We get this sequence by calling the function range(size).)'''
'''@helpDescription(Note that all statements inside the loop need to be indented with respect to the loop header.)'''
for i in range(size):
    # Step 2.1: Generate the asterisks in the corresponding row
    '''@helpDescription(This statement is the inner for loop. Each iteration of inner loop will print the given size of the asterisks. For each row of the solid square star pattern, the inner loop will iterate size times; thus, creating a row with size asterisks.)'''
    '''@helpDescription(For the inner loop, we use the range function because it generates a sequence of numbers for the for loop. Here, we want to repeat the loop size times; therefore, we need a sequence that starts at 0 with every integer number up to size but not include size. We get this sequence by calling the default function range(size).)'''
    '''@helpDescription(Note that the name that we choose for the loop variable in the inner loop should be different from the outer for loop. Here, i is the loop variable in the outer loop and j is the loop variable in the inner loop. Also, note that the inner for loop need to be indented with respect to the outer for loop.)'''
    for j in range(size):
        # Step 2.2: Print the asterisks in each row
        '''@helpDescription(The print function prints each asterisk in a row.)'''
        print("*", end = "")
    # Step 3: Print the next line
    '''@helpDescription(This statement prints a new row. The printed text is followed by the end-of-line character at the end.)'''
    print()
