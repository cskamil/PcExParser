package challenge._1;
/**
@goalDescription(Construct a program that prints a table of medal winner counts with both row and column totals for a given array of countries and their medals won at the skating competitions at the Winter Olympic.)
@name(Printing Table of Medal Winner Counts with Row and Column Totals)
@distractor{code(int[] columnTotals = new int[countries.length];), helpDescription()}
@distractor{code(int[] columnTotals = new int[medalCounts.length];), helpDescription()}
@distractor{code(columnTotals[i] += medalCounts[i][j];), helpDescription()}
@distractor{code(columnTotals[i] = medalCounts[i][j];), helpDescription()}
@distractor{code(columnTotals[j] += medalCounts[j][i];), helpDescription()}
 **/
public class JPrintMedalsRowColumnTotal {
	public static void main(String[] args) {

		//Step 1: Define the data that we need for this program
		/**@helpDescription(We define array countries of type string to hold the names of seven countries. We initialize the array by separating elements with a comma and enclosing the collection in braces { }.)**/
		String[] countries =
			{
					"Canada",
					"China",
					"Germany",
					"Korea",
					"Japan",
					"Russia",
					"United States"
			};
		/**@helpDescription(We need to create the matrix of medal counts. To do this, we use a two-dimensional array (an array of arrays) where each row corresponds to the gold, silver, and bronze medals won by one country. This statement creates a 7x3 two-dimensional array called medalCounts. Each row of the matrix corresponds to the medal counts for the corresponding country in the array of countries. The first, second, and third numbers within a row represent the number of Gold, Silver, and Bronze medals won by the corresponding country in that row.<br><br>Note that arrays can naturally span multiple lines if we want them to because they are contained by braces.)**/             
		int[][] medalCounts =
			{
					{ 1, 0, 1 },
					{ 1, 1, 0 },
					{ 0, 0, 1 },
					{ 1, 0, 0 },
					{ 0, 1, 1 },
					{ 0, 1, 1 },
					{ 1, 1, 0 }
			};

		//Step 2: Print countries, counts, row and column totals
		/**@blank(We want to compute the column total that is the sum of the total gold, silver, and bronze medals won in the competition. We need three variables to do this, which means that an array is a great way to store this data. In general, whenever we find ourselves thinking that we need n of some kind of data, we should think about using an array of length n. Here, we need 3 variables for storing the column totals; so, we create an array of length 3.)**/
		/**@blank(The first, second, and third element in the array will be used for storing the column totals for gold medals, silver medals, and bronze medals won in the competition. This statement declares an array variable, columnTotals, creates an array of size medalCounts[0].length (medalCounts[0].length expression returns the number of columns in the two-dimensional array medalCounts), and assigns its reference to columnTotals. By default, each number in the array is 0.)**/
		int[] columnTotals = new int[medalCounts[0].length];
		/**@helpDescription(We want to print a header for the table of medal winner counts. The columns of the table from left to right represent the country, the number of gold, silver, and bronze medals the country won, and finally, the row total that is the total medals the country won. We want to format the table so that all values are right-aligned with sufficient spacing between columns. For this purpose, we call printf method.)**/
		/**@helpDescription(This method returns the result of replacing each format specifier in the format string with its corresponding argument passed to the printf method. Here, we use %15s to right-justify the first string argument following the format string (i.e., Country) in a field that is 15-characters wide, and %8s to right-justify each remaining string arguments in a field that is 8-characters wide. The new line character at the end of the format string will add an end-of-line character at the end of the formatted text. This is what we need because we finished printing data of the table header and we want to start a new line.)**/
		/**@helpDescription(Notice that the format specifier begins with a % sign, is followed by the field length, and ends with a letter specifying the kind of value (s for strings).)**/
		System.out.printf("%15s%8s%8s%8s%8s\n","Country", "Gold", "Silver", "Bronze", "Total");
		/**@helpDescription(We need to process the medal counts data and print medal winner counts and the total number of medals won for each country (row totals) and the total number of gold, silver, and bronze medals won in the competition (column totals). This data, that is stored in medalCounts, is a two-dimensional array; therefore, we need to use nested for loops to process all of its elements and print the table. This statement is the outer for loop in the nested loop and it processes the data stored in medalCounts row by row.)**/
		/**@helpDescription(To iterate over the rows in the two-dimensional array medalCounts, we need the indexes to start at 0 with every integer number up to but not including the number of rows. In the first part of the loop header, we define a control variable i and initialize it to 0. In the second part of the loop header, we test whether the control variable has reached the termination threshold. The loop is repeated if the control variable is less than the number of elements in the array countries and terminates when the control variable reaches the number of elements in the array countries. In the third part of the loop header, we increment the control variable by 1 after each iteration of the loop.)**/
		/**@helpDescription(Note that the first part is executed once before the loop starts, the second part is executed before each iteration, and the third part is executed after each iteration of the loop. Also, note that the increment operator (++) adds 1 to the value of variable i and the result is stored back into the variable i. Therefore, it is functionally equivalent to the statement i = i + 1.)**/    
		for (int i = 0; i < countries.length; i++) {
			//Step 3: Process the data of the i-th country
			/**@helpDescription(We want to print the name of the i-th country in a new line in the output. We also want to format the table row using the same format that we applied to the table header. So, similar to printing the table header, we call printf method.)**/
			/**@helpDescription(This method returns the result of replacing each format specifier in the format string with its corresponding argument passed to the printf method. Here, we use %15s to right-justify the string argument following the format string (i.e., the name of the i-th country stored in element countries[i]) in a field that is 15-characters wide.)**/
			/**@helpDescription(Notice that the format specifier begins with a % sign, is followed by the field length, and ends with a letter specifying the kind of value (s for strings).)**/
			System.out.printf("%15s", countries[i]);
			/**@helpDescription(We need variable rowTotal to compute the total number of medals won by a particular country. We need to set it to 0 every time that we want to process a row and compute the row total.)**/
			/**@helpDescription(Note that this statement cannot be placed inside the inner loop because in that case in every iteration of the inner loop variable rowTotal is set to 0 and that means that row total is always equal to the number of bronze medals no matter what the remaining medal counts are. We cannot place this statement outside the outer loop either because in that case total will show the sum of the row totals in each row and all its preceding rows. Therefore, the only place that we could place this statement is in the outer loop body before reaching to the inner loop.)**/
			int rowTotal = 0;

			//Step 4: Print medal counts of the i-th country and compute row and column totals
			/**@helpDescription(This statement is the inner loop of the nested loop. It processes the elements within the row i where i is the row index in the two-dimensional array medalCounts that changes after each iteration of the outer loop. To iterate over the individual elements in each row (i.e., iterating over the columns within a row) in the two-dimensional array medalCounts, we need the indexes to start at 0 with every integer number up to but not including the number of columns.)**/
			/**@helpDescription(In the first part of the loop header, we define a control variable j and initialize it to 0. In the second part of the loop header, we test whether the control variable has reached the termination threshold. The loop is repeated if the control variable is less than the number of columns in the two-dimensional array medalCounts and terminates when the control variable reaches the number of columns in the array medalCounts. We get the number of columns in the two-dimensional array medalCounts by calling medalCounts[0].length. In the third part of the loop header, we increment the control variable by 1 after each iteration of the loop.)**/
			/**@helpDescription(Note that the first part is executed once before the loop starts, the second part is executed before each iteration, and the third part is executed after each iteration of the loop. Also, note that the increment operator (++) adds 1 to the value of variable j and the result is stored back into the variable j. Therefore, it is functionally equivalent to the statement j = j + 1. Finally, note that the name that we choose for the index in the inner loop should be different from the index name in the outer for loop. Here, we choose i for the row index and j for the column index.)**/
			for (int j = 0; j < medalCounts[0].length; j++) {
				/**@helpDescription(We want to print the number of the j-th medal that the i-th country won. We also want to format the table row using the same format that we applied to the table header. So, similar to printing the table header, we call printf method.)**/
				/**@helpDescription(This method returns the result of replacing each format specifier in the format string with its corresponding argument passed to the printf method. Here, we use %8d to right-justify the decimal argument of the format method (count of the j-th medal that the i-th country won, in other words, element countries[i][j]) in a field that is 8-characters wide. Notice that the format specifier begins with a % sign, is followed by the field length, and ends with a letter specifying the kind of value (d for decimals).)**/
				System.out.printf("%8d", medalCounts[i][j]);
				/**@helpDescription(We need to accumulate the number of different medals (gold, silver, bronze) won by the i-th country. So, in each iteration of the inner loop, the specified element in row i and column j of the two-dimensional array medalCounts is added to and stored back into the variable rowTotal.)**/ 
				/**@helpDescription(The += operator adds the value of the element in row i and column j of the two-dimensional array medalCounts (i.e., element medalCounts[i][j]) to the value of the variable rowTotal and the result is stored in the variable rowTotal. Thus, this statement is equivalent to the statement rowTotal = rowTotal + medalCounts[i][j].)**/
				rowTotal = rowTotal + medalCounts[i][j];
				/**@blank(This statement adds the value of the current element in row i and column j to the element in the array columnTotals that stores the column total for the column j in the two-dimensional array medalCounts.)**/
				/**@blank(If j is 0, it adds the current element to the columnTotals[0] that stores total gold medals won in the competition; if j is 1, it adds the current element to the columnTotals[1] that stores total silver medals won in the competition; and if j is 2, it adds the current element to the columnTotals[2] that stores total bronze medals won in the competition.)**/
				/**@blank(Note that the += operator adds the value of the element in row i and column j of the two-dimensional array medalCounts (i.e., element medalCounts[i][j]) to the value of the array element columnTotals[j] and the result is stored in the array element columnTotals[j]. Thus, this statement is equivalent to the statement columnTotals[j] = columnTotals[j] + medalCounts[i][j].)**/
				columnTotals[j] += medalCounts[i][j];
			}

			//Step 5: Display the total medals the i-th country won
			/**@helpDescription(We want to print the row total that is the total number of the medals won by the i-th country. We also want to format the table row using the same format that we applied to the table header. So, similar to printing the table header, we call printf method.)**/
			/**@helpDescription(This method returns the result of replacing each format specifier in the format string with its corresponding argument passed to the printf method. Here, we use %8d to right-justify the decimal argument of the format method (i.e., the row total stored in variable rowTotal) in a field that is 8-characters wide. The new line character at the end of the format string will add an end-of-line character at the end of the formatted text. This is what we need because we finished printing data of the i-th country and we want to start a new line.)**/
			/**@helpDescription(Notice that the format specifier begins with a % sign, is followed by the field length, and ends with a letter specifying the kind of value (d for decimals). An error will occur if the argument is not a decimal number, for instance, if the argument is a string.)**/
			System.out.printf("%8d\n", rowTotal);		        
		}

		//Step 6: Display the column totals
		/**@helpDescription(We want to print the column totals and format this last row of the table using the same format that we applied to the table header. So, similar to printing the table header, we call printf method.)**/
		/**@helpDescription(This method returns the result of replacing each format specifier in the format string with its corresponding argument passed to the printf method. Here, we use %15s to right-justify the decimal argument of the format method (i.e., Column Total) in a field that is 15-characters wide.)**/
		/**@helpDescription(Notice that the format specifier begins with a % sign, is followed by the field length, and ends with a letter specifying the kind of value (s for strings).)**/
		System.out.printf("%15s", "Column Total");
		/**@helpDescription(We want to print the column totals stored in the array columnTotals. We traverse the array elements using for–each statement. This for loop assigns the name x to each of the elements in the array in turn, from left to right, and the print statement will be executed for each.)**/      
		for (int x : columnTotals) {
			/**@helpDescription(We want to print the column total for each column in the two-dimensional array medalCounts. We also want to format this last row of the table using the same format that we applied to the table header. So, similar to printing the table header, we call printf method.)**/
			/**@helpDescription(This method returns the result of replacing each format specifier in the format string with its corresponding argument passed to the printf method. Here, we use %8d to right-justify the decimal argument of the format method (i.e., value of variable x) in a field that is 8-characters wide.)**/
			/**@helpDescription(Notice that the format specifier begins with a % sign, is followed by the field length, and ends with a letter specifying the kind of value (d for decimals). An error will occur if the argument is not a decimal number, for instance, if the argument is a string.)**/
			System.out.printf("%8d", x);
		}
	}
}
