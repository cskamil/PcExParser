'''
@goalDescription(Construct a program that only prints the diagonal elements of a square matrix, from the top left to the bottom right.)
@name(Diagonal of a Square Matrix)
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
@distractor{code(), helpDescription()}
'''
# Step 1: Define a square matrix using nested lists
'''@helpDescription(We need to create a nested list with 3 lists, and 3 elements within each list.)'''
a = [[1, 2, 3],
     [3, 4, 5],
     [5, 6, 7]]

# Step 2: Iterate through the lists
'''@helpDescription(Iterate index through the first list)'''
for i in range(len(a)):
    '''@blank(Iterate index through each element in the nested list, within the first list)'''
    for j in range(len(a)):

        # Step 3: Print the diagonal elements of the matrix
        '''@blank(Since it is a square matrix, there are the same number of rows as columns. When the column index equals the length of each row minus the row index, we get the diagonal from top right to bottom left. Finally, we print that element of the matrix.)'''
        if i == len(a)-j-1:
            '''@helpDescription(To print the correct element of the matrix, we index the nested list twice. First, we choose the correct nested list with a[i]. Second, we choose the correct element in the nested list with a[i][j].)'''
            print(a[i][j])