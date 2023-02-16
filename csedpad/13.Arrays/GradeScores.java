/**
 * author: Nisrine Ait Khayi
 * topics: Arrays
 * subtopics: declaring array variables, processing array
 * goalDescription: This program calculates the highest and lowest grade scores among 10 student grade scores. Once found, it displays the highest and lowest grade scores.
 * source: Here we keep the URL if there exist any source 
 * output: 
 * Highest score is 90
 * The lowest score is:4
*/
public class GradeScores {
    public static void main(String[] args) {
    
        /**
        * logical_step_1: Declare the variables needed to store 10 grades corresponding to 10 students.
        * logical_step_details: Declare an integer array variable and initialized with 10 interger values corresponding to 10 grades of 10 sudents. Declare an integer variable named max to store the highest score and initialize it with the first element of the array scores. 
        Then, declare an integer variable named min to store the lowest score and initialize it with the first element of the array scores. 
        * question_1: What does the following code block do?
        * answer_1: The code declares variables needed to store 10 grades corresponding to 10 students. Then it declaires two variables min and max to store the lowest grade and highest grade respectively.
        * question_2: What variables are declared?
        * answer_2: scores, max, and min.
        * question_3:  what is the size of array scores?
        * answer_3: The size of the array scores is 10.	
        */
    
        int[] scores= {10,19,12,14,90,4,5,20,14,15};
       
        int max=scores[0];       
       
        int min=scores[0];
    
        /**
         * logical_step_2: Compute the highest value in the scores array and store it in the variable max.
         * logical_step_details: The algorithm iterates over the scores array and compares each element with the value of max variable. If the scores' element value is higher than max's value it is stored in the max variable.
         * question_1: What does the following code block do?
         * answer_1: Computes the highest value of the array scores and store it in the variable max.
         * question_2: What is the start and stopping codition for loop?
         * answer_2: For loop starts at i = 0 and stops when i<scores.length.
         * question_3: What does the code inside the for loop do?
         * answer_3: The code compares each value of scores at position i with max's value. Then it stores the higher value in max variable.
         */
    
        /** 
         * stm_comment: the following loop calculates the highest score.
         * question_1:When the for loop ends?
         * answer_1: The for loop ends when there is no score to include in the calculations.
         */
         for (int i = 0; i < scores.length; i++) {
            if (scores[i]> max) {
               max=scores[i];
            }
        }
     
        /**
         * logical_step_3: Compute the lowest value in the scores array and store it in the variable min.
         * logical_step_details: The algorithm iterates over the scores array and compares each element with the value of min variable. If the scores' element value is lower than min's value it is stored in min variable.
         * question_1: What does the following code block do?
         * answer_1: It computes the lowest value of the array scores and stores it in the variable min.
         * question_2: What is the start and stopping codition for loop?
         * answer_2: For loop starts at i = 0 and stops when i<scores.length.
         * question_3: What does the code inside for loop do?
         * answer_3: The code compares each value of scores at position i with min's value. Then it store the lower value in min variable.
         */
    
       
        /** 
         * stm_comment: the following loop calculates the lowest score.
         * question_1:When the for loop ends?
         * answer_1: The for loop ends when there is no score to include in the calculations.
         */
        for (int i = 0; i < scores.length; i++) {
            if (scores[i]< min)  {
                  min=scores[i];
            }
        }
    
        /**
         * logical_step_4: Display the highest and lowest grades in scores array.
         * logical_step_details: The algorithm displays the values of max and min variables by printing the max and min variable.
         * question_1: What does the following code block do?
         * answer_1: Displays max and min values.
         */
        
        System.out.println("Highest score is " + max+ "\nThe lowest score is:"+min);
    }

}
