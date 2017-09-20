'''
@goalDescription(BMI is a measure of body fat based on height and weight that applies to adult men and women. BMI Categories are as follows: \nUnderweight = <18.5\nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater.\nEnglish BMI Formula (Imperial) is: BMI = (Weight in Pounds / (Height in inches x Height in inches)) x 703.\n BMI results are usually displayed as integers (values without decimal points). Construct a program to round the BMI result to the nearest integer.)
@name(Calculating and Rounding Up Body Mass Index (BMI) To the Nearest Integer)
@input(163)
@input(63)
@distractor{code(bmi = int(bmi)), helpDescription()}
@distractor{code(result_bmi = bmi), helpDescription()}
@distractor{code(result_bmi = float(bmi)), helpDescription()}
@distractor{code(result_bmi = round(bmi)), helpDescription()}
 '''
#Step 1: Receive the weight and height from the user
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the weight in pounds, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the weight in pounds:")
'''@helpDescription(We need to convert the input text to its float representation because weight could have a decimal point. For this purpose, we use the conversion function float().)'''
'''@helpDescription(Note that this can only be done if user input could be translated into a valid floating-point value.)'''    
weight = float(text)
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter height in inches, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the height in inches:")
'''@helpDescription(We need to convert the input text to its float representation because height could have a decimal point. For this purpose, we use the conversion function float().)'''
'''@helpDescription(Note that this can only be done if user input could be translated into a valid floating-point value.)'''  
height = float(text)

#Step 2: Calculate BMI
'''@blank(We calculate the BMI using the mathematical expression in this statement.)'''
'''@blank(height**2 returns the value of height raised to the power of the 2.)'''
'''@blank(Note that the exponent operator (**) has the highest precedence level so it's the first operation that is performed. Also, multiplication (*) and division operator (/) are in the same precedence level, and thus, are evaluated from left to right in this expression. Therefore, we don't need to include parantheses around the division.)'''
bmi = weight / height ** 2 * 703    

#Step 3: Round up BMI
'''@blank(We round up the BMI to the nearest integer. After rounding up, the fractional part of the bmi will be 0.)'''
bmi = round(bmi)

#Step 4: Discard the fractional part of BMI
'''@blank(When program reaches here, bmi is rounded to the nearest integer but the fractional part still exists and is 0. Therefore, we need to convert bmi to integer to discard its fractional part.)'''
'''@blank(The conversion function int() converts the floating-point value bmi to an integer by discarding the fractional part.)'''
result_bmi = int(bmi)

#Step 5: Print results
'''@helpDescription(This statement prints to the default standard output stream the text "The BMI rounded to the nearest integer is:" and the value of variable result_bmi.<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)''' 
print("The BMI rounded to the nearest integer is:", result_bmi)
