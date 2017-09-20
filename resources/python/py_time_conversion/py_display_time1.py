'''
@goalDescription(Construct a program that obtains minutes and remaining seconds from the input amount of time in seconds. For example, 500 seconds contains 8 minutes and 20 seconds.)
@name(Seconds to Minutes Conversion)
@input(450)
@distractor{code(minutes = seconds - 60), helpDescription()}
@distractor{code(minutes = seconds / 100), helpDescription()}
@distractor{code(remaining_seconds = seconds / 60), helpDescription()}
@distractor{code(remaining_seconds = minutes / 60), helpDescription()}
@distractor{code(remaining_seconds = minutes % 60), helpDescription()}
 '''

#Step 1: Read the seconds
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the seconds, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter an integer for seconds: ")
'''@helpDescription(We need to convert the input text to its integer representation. For this purpose, we use the conversion function int().)'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents a number. If the input number is a float, the int() function cuts off the fractional part of the floating-point number to create an integer.)'''
seconds = int(text)

#Step 2: Obtain minutes and remaining seconds from the input seconds
'''@blank(To obtain the minutes in seconds, we divide the seconds by 60 because there are 60 seconds in a minute. Note that we want to trucate the fractional part of the result, if there is any. Therefore, we need to use the floor division by using // operator.)'''
minutes = seconds // 60 
'''@blank(To obtain the remaining seconds after taking away the minutes, we have to take the remainder of the seconds divided by 60. This is because there are 60 seconds in a minute. Note that the % operator returns the remainder of the division.)'''
remaining_seconds = seconds % 60

#Step 3: Display the result
'''@helpDescription(This statement prints to the default standard output stream the minutes and remaining seconds from the input amount of time in seconds.<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)'''
print(seconds , "seconds is" , minutes , "minutes and" , remaining_seconds , "seconds.")  
