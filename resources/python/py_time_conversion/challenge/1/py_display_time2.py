'''
@goalDescription(Construct a program that obtains hours, minutes, and seconds from an amount of time in milliseconds.)
@name(Converting milliseconds to Hours, Minutes, and Seconds)
@input(16803000)
@distractor{code(hours = total_secs / 60), helpDescription()}
@distractor{code(hours = ( total_secs // 60 ) % 60), helpDescription()}
@distractor{code(mins = ( hours // 60 )), helpDescription()}
@distractor{code(mins = ( total_secs % 60 )), helpDescription()}
 '''
#Step 1: Read the milliseconds
'''@helpDescription(We need to read and process the input value that the user enters. To read the input value from the user, we need to use the input function. This input statement prompts the user to enter the milliseconds, then reads the text entered by the user and places it in the variable text of type string.)'''
text = input("Enter the milliseconds: ")
'''@helpDescription(We need to convert the input text to its integer representation. For this purpose, we use the conversion function int().)'''
'''@helpDescription(Note that the conversion to integer can only be done if the string actually presents a number. If the input number is a float, the int() function cuts off the fractional part of the floating-point number to create an integer.)'''
milliseconds = int(text)

#Step 2: Obtain hours, minutes and seconds from the milliseconds
'''@helpDescription(To obtain the total seconds in milliseconds, we divide the milliseconds by 1000 because there are 1000 milliseconds in a second. Note that we want to trucate the fractional part of the result, if there is any. Therefore, we need to use the floor division by using // operator.)'''
total_secs = milliseconds // 1000
'''@blank(To obtain the hours, we divide the seconds by 3600 because there are 3600 seconds in an hour. Note that we want to trucate the fractional part of the result, if there is any. Therefore, we need to use the floor division by using // operator.)'''
hours = total_secs // 3600
'''@blank(To obtain the remaining minutes after taking away the hours, we have to take the remainder of the total minutes divided by 60. We get the total minutes by dividing the seconds by 60. The % operator returns the remainder of the division.)'''
'''@blank(Note that we want to trucate the fractional part of the result, if there is any. Therefore, we need to use the floor division by using // operator.)'''
mins = (total_secs // 60) % 60
'''@helpDescription(To obtain the remaining seconds after taking away the minutes, we have to take the remainder of the total seconds divided by 60. Note that the % operator returns the remainder of the division.)'''
secs = total_secs % 60

#Step 3: Display the result
'''@helpDescription(This statement prints to the default standard output stream the hours, minutes, and seconds from the input amount of time in milliseconds.<br>The printed text shows the arguments of the print function separated by the default delimiter (i.e., single space character) and followed by the end-of-line character at the end.)'''
print(milliseconds, "milliseconds is", hours, "hours and" , mins , "minutes and" , secs , "seconds.")

