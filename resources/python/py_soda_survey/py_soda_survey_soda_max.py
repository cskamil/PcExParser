'''
@goalDescription(Construct a program that determines the maximum rating that each of the four new flavors of soda received. In total, 10 respondents tried each new flavor and gave it a score from 1 to 5, where 1 equals poor and 5 equals excellent.)
@name(Determining the Maximum Rating for Each Soda in The Survey)
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''
#Step 1: Define a 4x10 two-dimensional list
'''@helpDescription(We need to use two-dimensional list (a list of lists) to create a matrix of the ratings. This statement creates a 4x10 two-dimensional list called ratings_data of ratings given to 4 new flavors of soda by 10 respondents.)'''
'''@helpDescription(Note that each matrix row corresponds to a sublist in the two-dimensional list. Also, note that lists can naturally span multiple lines if we want them to because they are contained by a pair of brackets.)''' 
ratings_data = [[3, 4, 5, 2, 1, 4, 3, 2, 4, 4],
                [2, 4, 3, 4, 3, 3, 2, 1, 2, 2],
                [3, 5, 4, 5, 5, 3, 2, 5, 5, 5],
                [1, 1, 1, 3, 1, 2, 1, 3, 2, 4]]

#Step 2: Compute the maximum rating for each soda
'''@helpDescription(We store the number of rows in the two-dimensional list ratings_data in variable num_sodas because we'll use it in different steps of the program. Note that the function len(ratings_data) returns the number of rows in the two-dimensional list ratings_data)'''
num_sodas = len(ratings_data)
'''@helpDescription(We store the number of columns in the two-dimensional list ratings_data in variable num_respondents because we'll use it in different steps of the program. Note that the function len(ratings_data[0]) returns the number of columns in the two-dimensional list ratings_data)'''
num_respondents = len(ratings_data[0])
'''@blank(We need four variables to find the maximum rating that each of the four new flavors of soda received, which means that a list is a great way to store this data. In general, whenever we find ourselves thinking that we need n of some kind of data, we should think about using a list of length n. Here, we need four variables for storing the maximum rating for each soda; so, we create a list of length 4.)'''
'''@blank(The first, second, third, and fourth element in the list will be used for storing the maximum rating that the first, second, third, and fourth soda received. In this statement, we create the list and fill it with 0s. The zeros will be later replaced by the ratings from respondents.)'''
'''@blank(We use the repetition operator * to create the list soda_max. The repetition operator makes N copies of this list and joins them all together into a single list, where N is the number of sodas stored in variable num_sodas, here, 4. Note that when the operand on the left side of the * is a list, it becomes the repetition operator and not the multiplication.)'''
soda_max = [0] * num_sodas
'''@blank(We need to process the rating data and find the maximum rating that each soda received. Our data, that is stored in ratings_data, is a two-dimensional list; therefore, we need to use nested for loops to process all of its elements. This statement is the outer for loop in the nested loop and it processes the data stored in ratings_data row by row.)'''
'''@blank(To iterate over the rows in the two-dimensional list ratings_data, we need the indexes to start at 0 with every integer number up to but not including the number of rows. We get this sequence by calling the range(num_sodas) function. Note that variable num_sodas stores the number of rows in the two-dimensional list ratings_data.)'''    
for i in range(num_sodas):
    
    #Step 3: Find the maximum of the ratings for the i-th soda
    '''@blank(This statement is the inner loop of the nested loop. It processes the elements within the row i where i is the row index in the two-dimensional list ratings_data that changes after each iteration of the outer loop. To iterate over the individual elements in each row (i.e., iterating over the columns within a row) in the two-dimensional list ratings_data, we need the indexes to start at 0 with every integer number up to but not including the number of columns. We get this sequence by calling the range(num_respondents) function.)'''
    '''@blank(Note that variable num_respondents stores the number of columns in the two-dimensional list ratings_data. Also, note that the name that we choose for the index in the inner loop should be different from the index name in the outer for loop. Here, we choose i for the row index and j for the column index.)'''    
    for j in range(num_respondents):
        '''@blank(This statement checks whether the value of the current element in row i and column j is greater than the maximum rating that we've observed so far for the i-th soda. If the current element is greater than the maximum rating we've found so far, it sets the current element as the maximum rating for the i-th soda.)'''
        '''@blank(More specifically, if i is 0, it updates the maximum rating for Soda #1 that is stored in soda_max[0]; if i is 1, it updates the maximum rating for Soda #2 that is stored in soda_max[1]; and so on.)'''
        if ratings_data[i][j] > soda_max[i] :
            '''@blank(This statement sets the value stored in the i-th element of the list soda_max to the element stored in row i and column j of the two-dimensional list ratings_data.)'''
            soda_max[i] = ratings_data[i][j]
   
#Step 4: Print the maximum rating for each soda
'''@helpDescription(This statement prints to the default standard output stream the text "Maximums:" followed by the end-of-line character at the end. Note that the argument of print is enclosed in quotation marks because it is to be printed as it is.)'''
print("Maximums:")   
'''@helpDescription(We want to print the maximum rating given to the sodas. To do this, we need to iterate over the maximum ratings for the sodas stored the list soda_max, we need the indexes to start at 0 with every integer number up to but not including the number of sodas. We get this sequence by calling the range(num_sodas) function. Remember the number of sodas is stored in variable num_sodas.)'''    
for i in range(num_sodas):
    '''@helpDescription(We get the maximum rating that the i-th soda received by accessing the i-th element in the list soda_max. We call template.format function to format how the message should be printed.)'''
    '''@helpDescription(The format function returns the result of replacing each {…} placeholder in the template string with its corresponding argument passed to the format function. Anything else, which is not contained in curly braces will be literally printed, i.e. without any changes.)'''
    '''@helpDescription(Here, we use {:d} to print the first and second decimal argument of the format function. That is, the soda number which we get by calling i+1 and the maximum rating that the i-th soda received. Notice that the format specification inside a pair of curly braces starts with a : and followed by the text that specifies how the value should be presented by stating its data type. The data type d requires a decimal argument. An error will occur if the argument is not the expected data type. The formatted string will be printed followed by the end-of-line character at the end. )'''
    print('Soda # {:d} : {:d}'.format((i+1), soda_max[i]))
