
'''
@goalDescription(Suppose that the user provides two input values for a right-angle triangle. The first input is for the length of an adjacent side in the triangle and the second input is for the hypotenuse of that triangle. The program calculates the second adjacent side of the triangle using these two input values. Use the Pythagorean theorem (c^2 = a^2 + b^2) to find the length of the second adjacent side.)
@name(Pythagorean Theorem (Case 2))
@input(3)
@input(5)
@distractor{code(side_B = ( square_hypotenuse + square_side_A ) ** 0.5), helpDescription()}
@distractor{code(side_B = square_hypotenuse ** 0.5 + square_side_A ** 0.5), helpDescription()}
@distractor{code(side_B = ( square_side_A ** 2 - square_hypotenuse ** 2 ) ** 0.5 ), helpDescription()}
@distractor{code(side_B = ( square_side_A - square_hypotenuse ) ** 0.5 ), helpDescription()}
 '''

#Step 1: Receive the values for the first side of a right-angle triangle and the hypotenuse
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the length of side A, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the length of side A:")
'''@helpDescription(We need to convert the input text to its float representation because side A could have a decimal point. For this purpose, we use the conversion function float().)'''
'''@helpDescription(Note that this can only be done if user input could be translated into a valid floating-point value.)'''    
side_A = float(text)
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the length of the hypotenuse, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the length of the hypotenuse:")
'''@helpDescription(We need to convert the input text to its float representation because the hypotenuse could have a decimal point. For this purpose, we use the conversion function float().)'''
'''@helpDescription(Note that this can only be done if user input could be translated into a valid floating-point value.)'''    
hypotenuse = float(text)

#Step 2: Calculate square of side A
'''@helpDescription(To compute the length of the triangle's hypotenuse, we need to first compute the square of side A. We square side A by using the exponent operator **. )'''
'''@helpDescription(Note that side_A ** 2 raises the value of side_A to the power of 2.)'''
square_side_A = side_A ** 2

#Step 3: Calculate square of hypotenuse
'''@helpDescription(To find the length of side B, we need to compute the square of hypotenuse too. We square the hypotenuse by using the exponent operator **.)''' 
'''@helpDescription(Note that hypotenuse ** 2 raises the value of hypotenuse to the power of 2.)'''
square_hypotenuse = hypotenuse ** 2

#Step 4: Use Pythagorean theorem to calculate the length of the triangle's other adjacent side
'''@blank(We use Pythagorean theorem to calculate the length of the triangle's other adjacent side. We know that hypotenuse ** 2 = side_A ** 2 + side_B ** 2. Therefore, side_B ** 2 = hypotenuse ** 2 - side_A ** 2. We could take a square root of both sides of this equation to get the length of the other adjacent side in the triangle, that is:<br>side_B = ( hypotenuse ** 2 - side_A ** 2 ) ** 0.5.)'''
'''@blank(Note that we could take a square root of a number by raising that number to the power of 0.5.)'''
side_B = (square_hypotenuse - square_side_A) ** 0.5

#Step 4: Print the result
'''@helpDescription(This statement prints to the default standard output stream the length of the second adjacent side in the triangle.<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)''' 
print("Given that side A is", side_A, "and the hypotenuse is", hypotenuse, ", side B is", side_B)
