'''
@goalDescription(Construct a program that accepts two input values from the user, one for each side of a right-angle triangle. The program uses the Pythagorean theorem (c^2 = a^2 + b^2) to calculate the length of the triangle's hypotenuse.)
@name(Pythagorean Theorem (Case 1))
@input(3)
@input(4)
@distractor{code(hypotenuse = squareside_A ** 0.5 + squareside_B ** 0.5), helpDescription()}
@distractor{code(hypotenuse = ( squareside_A + squareside_B ) ** 0.5), helpDescription()}
@distractor{code(hypotenuse = squareside_A ** squareside_B), helpDescription()}
@distractor{code(hypotenuse = ( squareside_A ** 2 + squareside_B ** 2 ) ** 0.5), helpDescription()}
 '''

#Step 1: Receive the values for each side of a right-angle triangle
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the length of side A, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the length of side A:")
'''@helpDescription(We need to convert the input text to its float representation because side A could have a decimal point. For this purpose, we use the conversion function float().)'''
'''@helpDescription(Note that this can only be done if user input could be translated into a valid floating-point value.)'''    
side_A = float(text)
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the length of side B, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the length of side B:")
'''@helpDescription(We need to convert the input text to its float representation because side B could have a decimal point. For this purpose, we use the conversion function float().)'''
'''@helpDescription(Note that this can only be done if user input could be translated into a valid floating-point value.)'''    
side_B = float(text)


#Step 2: Calculate square of side A
'''@helpDescription(To compute the length of the triangle's hypotenuse, we need to first compute the square of side A. We square side A by using the exponent operator **. )'''
'''@helpDescription(Note that side_A ** 2 raises the value of side_A to the power of 2.)'''
squareside_A = side_A ** 2

#Step 3: Calculate square of side B
'''@helpDescription(To compute the length of the triangle's hypotenuse, we need to compute the square of side B too. We square side B by using the exponent operator **. )'''
'''@helpDescription(Note that side_A ** 2 raises the value of side_A to the power of 2.)'''
squareside_B = side_B ** 2

#Step 4: Use Pythagorean theorem to calculate the length of the triangle's hypotenuse
'''@blank(We use the Pythagorean theorem to obtain the length of the triangle's hypotenuse. To get the triangle's hypotenuse, we take the square root from the sum of square of side A and square of side B.)'''
'''@blank(Note that we could take square root of a number by raising that number to the power of 0.5.)'''
hypotenuse = ( squareside_A + squareside_B ) ** 0.5

#Step 5: Print the result
'''@helpDescription(This statement prints to the default standard output stream the the length of the triangle's hypotenuse.<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)''' 
print("Given that side A is", side_A, "and side B is", side_B, ", the hypotenuse is", hypotenuse)
