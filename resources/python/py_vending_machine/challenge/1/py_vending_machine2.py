
'''
@goalDescription(Suppose we have a vending machine that gives change. A customer selects an item for purchase and inserts a bill into the vending machine. The vending machine dispenses the purchased item and gives change. We will assume that all item prices are multiples of 5 cents, and the machine gives all change in quarters, dimes, and nickels. Construct a program that computes how many quarters, dimes, and nickels to return to the customer.)
@name(Vending Machine With Quarters, Dimes, and Nickels)
@input(5)
@input(135)
@distractor{code(dimes = change_due % pennies_per_nickel), helpDescription()}
@distractor{code(dimes = change_due % pennies_per_dime), helpDescription()}
@distractor{code(change_due = change_due // pennies_per_dime), helpDescription()}
@distractor{code(change_due = change_due - change_due // pennies_per_dime), helpDescription()}
 '''

#Step 1: Assign initial values to the variables which we need for this program
'''@helpDescription(The pennies_per_dollar, we set it to 100 because there are 100 pennies in a dollar.)'''
pennies_per_dollar = 100
'''@helpDescription(The pennies_per_quarter, we set it to 25 because there are 25 pennies in a quarter.)'''
pennies_per_quarter = 25
'''@helpDescription(The pennies_per_dime, we set it to 10 because there are 10 pennies in a dime.)'''
pennies_per_dime = 10
'''@helpDescription(The pennies_per_nickel, we set it to 5 because there are 5 pennies in a nickel.)'''
pennies_per_nickel = 5

#Step 2: Read the bill value and item price
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the bill value in dollars, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter bill value in dollars (1 = $1 bill, 5 = $5 bill, etc.): ")
'''@helpDescription(We need to convert the input text to its integer representation. For this purpose, we use the conversion function int().)'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents a number. If the input number is a float, the int() function cuts off the fractional part of the floating-point number to create an integer.)'''
bill_value = int(text)
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the item price in pennies, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter item price in pennies: ")
'''@helpDescription(We need to convert the input text to its integer representation. For this purpose, we use the conversion function int().)'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents a number. If the input number is a float, the int() function cuts off the fractional part of the floating-point number to create an integer.)'''
itemPrice = int(text)

#Step 3: Compute the change due
'''@helpDescription(To compute the change due, we need to obtain the pennies in the bill value and then subtract the item price from that. Note that the precedence rules dictate that the multiplication happens before the subtraction in this expression.) '''
'''@helpDescription(We obtain pennies in the bill value by multiplying the number of pennies in a dollar (stored in the variable pennies_per_dollar) by the bill value.) '''
change_due = pennies_per_dollar * bill_value - itemPrice

#Step 4: Compute the number of quarters in the change due and update the change due after taking away the quarters
'''@helpDescription(To obtain the quarters, we divide the change due by the number of pennies per quarter. Note that we want to trucate the fractional part of the result, if there is any. Therefore, we need to use the floor division by using // operator.)'''
'''@helpDescription(Note that the number of pennies per quarter is stored in the variable pennies_per_quarters.)'''
quarters = change_due // pennies_per_quarter
'''@helpDescription(To obtain the remaining change due after taking away the quarters, we have to take the remainder of the change due divided by pennies per quarter. The % operator returns the remainder of the division.)'''
'''@helpDescription(Note that the number of pennies per quarter is stored in the variable pennies_per_quarter.)'''
change_due = change_due % pennies_per_quarter

#Step 5: Compute the number of dimes in the remaining change due and update the change due after taking away the dimes
'''@blank(To obtain the dimes in the remaining change due, we have to divide the change due by pennies per dime. Note that we want to trucate the fractional part of the result, if there is any. Therefore, we need to use the floor division by using // operator.)'''
'''@blank(Note that the number of pennies per dime is stored in the variable pennies_per_dime.)'''
dimes = change_due // pennies_per_dime
'''@blank(To obtain the remaining change due after taking away the dimes, we have to take the remainder of the change due divided by pennies per dime. The % operator returns the remainder of the division.)'''
'''@blank(Note that the number of pennies per dime is stored in the variable pennies_per_dime.)'''
change_due = change_due % pennies_per_dime

#Step 6: Compute the number of nickels in the remaining change due
'''@helpDescription(To obtain the nickels in the remaining change due, we have to divide the change due by pennies per nickels. Note that we want to trucate the fractional part of the result, if there is any. Therefore, we need to use the floor division by using // operator.)'''
'''@helpDescription(Note that the number of pennies per nickels is stored in the variable pennies_per_nickel.)'''
nickels = change_due // pennies_per_nickel

#Step 7: Display the result
'''@helpDescription(This statement prints to the default standard output stream the text in the double quotes. The printed text is followed by the end-of-line character at the end.)'''
print("Your change consists of:") 
'''@helpDescription(This statement prints to the default standard output stream the value of variable quarters and the text "quarters".<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)''' 
print(quarters, "quarters")
'''@helpDescription(This statement prints to the default standard output stream the value of variable dimes and the text "dimes".<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)''' 
print(dimes, "dimes") 
'''@helpDescription(This statement prints to the default standard output stream the value of variable nickels and the text "nickels".<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)''' 
print(nickels, "nickels")
