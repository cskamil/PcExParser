/**
 * author: Priti Oli
 * topic: two-dimensional arrays
 * subTopic: initialization of a two-dimensional array
 * goalDescription: This program stores the ratings for 4 different movies and finds the average rating for the third  movie.
 * source: N/A
 * output: Average rating: 3.4
 */

public class MovieRating {
    public static void main(String[] args){
        /**
         * logical_step_1:  specify the ratings for 4 different movie.
         * logical_step_details: Create and initialize a two-dimensional array,movieRate to store moving ratings for different movies.
         * The datatype of elements of the movieRate is integer. Each row has 5 different ratings for a movie.
         * Each row of the variable movieRate represents a movie and each element represents the movie rating.
         * question_1: What does the following block of code do?
         * answer_1: specify the movie ratings for 4 different movie, each row represents a movie and each column represents 
         * each individuals rating for different movie
         * question_2: What is the data type of elements in an array?
         * answer_2: Integer
         * question_3: what is the data type of the variable movieRate
         * answer_3: movieRate is a two dimensoinal integer array.
         */

        int[][] movieRate = {
                {4, 4, 5,3,4},
                {3, 4, 4,2,3},
                {3, 4, 4,3,3},
                {4, 4, 4,4,3}
        };

	/*
	* logical_step_2: Calculate the sum of the movie ratings for third movie .
	* logical_step_details: The sum of the movie ratings for the third movie is calculated by iterating over all the movie rating of the third movie and adding all the movie rating.
	* the sum of the movie ratings is then stored in the variable sum
	* question_1: What does the following block of code do?
	* answer_1: Calculates the sum of the movie ratings for the third movie
	* question_2, How many times does the for loop executes?
	* answer_2: The for loop executes 5 times.
	* question_4: What is the value of sum before the loop starts?
	* answer_3: 0
	* question_3: What is the value of sum when for loop completes execution?
	* answer_3: 17
	*/
        int sum=0;
    /**
     * stm_comment: movierate[2] specfies all the movie rating for the third movie. movieRate[2].length specifies the size of
     * ratings stored in 3rd movie. Since there are 5 movies, the for-loop iterates 5 times .
     * question_1: Please explain what does the following for loop does?
     * answer_1:movierate[2] specfies all the movie rating for the third movie. movieRate[2].length specifies the size of
     * ratings stored in 3rd movie. Since there are 5 movies, the for-loop iterates 5 times .
     */
        for(int i=0; i<movieRate[2].length;i++){
            sum=sum+movieRate[2][i];
        }
	    
	/*
	* logical_step_3: Calculate and display the average rating for the  movie.
	* logical_step_details: Calculate the average rating for the third movie by dividing the sum of ratings by the size of rating
	* here movieRate[2].length gives the size of the movie ratings for the third movie
	* question_1: What does the following block of code do?
	* answer_1: It calculates and displays average rating for the third movie.
	* question_2: What is the value of movieRate[2].length?
	* answer_2: 5
	* question_3: What is the value of variable avg?
	* answer_3: 3.4
	* question_4: What is displayed as output?
	* answer_4: Average rating: 3.4
	*/
        float avg =0;
        avg=(float)sum/movieRate[2].length;
        System.out.println("Average rating: " + avg);
    }
}
