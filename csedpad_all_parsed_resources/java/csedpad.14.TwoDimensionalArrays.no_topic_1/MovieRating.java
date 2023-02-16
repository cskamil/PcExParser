/**
@goalDescription(This program stores the ratings for 4 different movies and finds the average rating for the third  movie.)
**/
public class MovieRating {
    public static void main(String[] args){
//specify the ratings for 4 different movie.
        int[][] movieRate = {
                {4, 4, 5,3,4},
                {3, 4, 4,2,3},
                {3, 4, 4,3,3},
                {4, 4, 4,4,3}
        };

//Calculate the sum of the movie ratings for third movie .
        int sum=0;
/**@helpDescription(movierate[2] specfies all the movie rating for the third movie. movieRate[2].length specifies the size of ratings stored in 3rd movie. Since there are 5 movies, the for-loop iterates 5 times . question_1: Please explain what does the following for loop does? answer_1:movierate[2] specfies all the movie rating for the third movie. movieRate[2].length specifies the size of ratings stored in 3rd movie. Since there are 5 movies, the for-loop iterates 5 times .)**/
        for(int i=0; i<movieRate[2].length;i++){
            sum=sum+movieRate[2][i];
        }
//Calculate and display the average rating for the  movie.
        float avg =0;
        avg=(float)sum/movieRate[2].length;
        System.out.println("Average rating: " + avg);
    }
}
