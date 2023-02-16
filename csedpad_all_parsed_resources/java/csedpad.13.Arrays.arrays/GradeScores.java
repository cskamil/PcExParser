/**
@goalDescription(This program calculates the highest and lowest grade scores among 10 student grade scores. Once found, it displays the highest and lowest grade scores.)
**/
public class GradeScores {
    public static void main(String[] args) {
//Declare the variables needed to store 10 grades corresponding to 10 students.
        int[] scores= {10,19,12,14,90,4,5,20,14,15};
       
        int max=scores[0];       
       
        int min=scores[0];
    
//Compute the highest value in the scores array and store it in the variable max.
/**@helpDescription(the following loop calculates the highest score. question_1:When the for loop ends? answer_1: The for loop ends when there is no score to include in the calculations.)**/
         for (int i = 0; i < scores.length; i++) {
            if (scores[i]> max) {
               max=scores[i];
            }
        }
//Compute the lowest value in the scores array and store it in the variable min.
       
/**@helpDescription(the following loop calculates the lowest score. question_1:When the for loop ends? answer_1: The for loop ends when there is no score to include in the calculations.)**/
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]< min)  {
                  min=scores[i];
            }
        }
//Display the highest and lowest grades in scores array.
        System.out.println("Highest score is " + max+ "\nThe lowest score is:"+min);
    }

}
