'''
@goalDescription(Suppose we have a vending machine that gives change. A customer selects an item for purchase and inserts a bill into the vending machine. The vending machine dispenses the purchased item and gives change. We will assume that all item prices are multiples of 25 cents, and the machine gives all change in dollar and quarters. Construct a program that computes how many dollars and quarters to return to the customer.)
@name(Vending Machine With Dollars and Quarters)
@input(5)
@input(225)
@distractor{code(change_due = change_due - pennies_per_dollar), helpDescription()}
@distractor{code(change_due = change_due -  change_due // pennies_per_dollar), helpDescription()}
@distractor{code(quarters = change_due // pennies_per_dollar), helpDescription()}
@distractor{code(quarters = change_due % pennies_per_quarter), helpDescription()}
 '''

#Step 1: Assign initial values to the variables which we need for this program
'''@helpDescription(The pennies_per_dollar, we set it to 100 because there are 100 pennies in a dollar.)'''
pennies_per_dollar = 100
'''@helpDescription(The pennies_per_quarter, we set it to 25 because there are 25 pennies in a quarter.)'''
pennies_per_quarter = 25

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
item_price = int(text)

#Step 3: Compute the change due
'''@helpDescription(To compute the change due, we need to obtain the pennies in the bill value and then subtract the item price from that. Note that the precedence rules dictate that the multiplication happens before the subtraction in this expression.) '''
'''@helpDescription(We obtain pennies in the bill value by multiplying the number of pennies in a dollar (stored in the variable pennies_per_dollar) by the bill value.) '''
change_due = pennies_per_dollar * bill_value - item_price

#Step 4: Compute the number of dollars and update the change due after taking away the dollars
'''@helpDescription(To obtain the dollars, we divide the change due by the number of pennies per dollar. Note that we want to trucate the fractional part of the result, if there is any. Therefore, we need to use the floor division by using // operator.)'''
'''@helpDescription(Note that the number of pennies per dollar is stored in the variable pennies_per_dollar.)'''
dollars = change_due // pennies_per_dollar
'''@blank(To obtain the remaining change due after taking away the dollars, we have to take the remainder of the change due divided by pennies per dollar. The % operator returns the remainder of the division.)'''
'''@blank(Note that the number of pennies per dollar is stored in the variable pennies_per_dollar.)'''
change_due = change_due % pennies_per_dollar

#Step 5: Compute the number of quarters in the remaining change due
'''@blank(To obtain the quarters in the remaining change due, we have to divide the change due by pennies per quarter. Note that we want to trucate the fractional part of the result, if there is any. Therefore, we need to use the floor division by using // operator.)'''
'''@blank(Note that the number of pennies per quarter is stored in the variable pennies_per_quarters.)'''
quarters = change_due // pennies_per_quarter

#Step 6: Display the result
'''@helpDescription(This statement prints to the default standard output stream the text in the double quotes. The printed text is followed by the end-of-line character at the end.)'''
print("Your change consists of:") 
'''@helpDescription(This statement prints to the default standard output stream the value of variable dollars and the text "dollars".<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)'''
print(dollars, "dollars")
'''@helpDescription(This statement prints to the default standard output stream the value of variable quarters and the text "quarters".<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)''' 
print(quarters, "quarters")
