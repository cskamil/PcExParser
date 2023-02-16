/**
* author: Suraj Maharjan
* topics: Searching (Linear Search)
* subtopics: given an array having elements, where the number is searched in the array using the Linear Search Algorithm, here sorted array is not required
* goalDescription: This program linearly searches the array for the index or rank of the rollNumber entered by the user or student and prints out their rank, where "index will be the rank if the number is present in the array". If the index is "0", then the rank is "0 + 1 = 1", so being 1st.
* input: N/A
* output: 4
*/

import java.util.Scanner;

public class LinearSearch {

   public static void main(String args[]){

      /**
      * logical_step_1: Create an array of elements
      * logical_step_details: Creating an array that will store elements. An array is a data structure consisting of a collection of elements. Integer variable rollNumber is set as 21 so that the number can be searched in our array for its presence to get the rank from the roll number of the students. Length is a final variable applicable for arrays. With the help of the length variable, we can obtain the size of the array.
      * question_1: What is an array?
      * answer_1: An array is a data structure consisting of a collection of elements.
      * question_2: Why are we initializng a integer variable rollNumber that equals to 21?
      * answer_2: Integer variable rollNumber is set as 21 so that the number can be searched in our array for its presence to get the rank from the roll number of the students.
      * question_3: Why do we need the length of an array?
      * answers_3: Length is a final variable applicable for arrays. With the help of the length variable, we can obtain the size of the array.
      */
      
      int rollNumber = 21;
      int array[] = {10, 20, 25, 21, 16, 17, 22};
      int size = array.length;

      /**
      * logical_step_2: Use a for-loop to compare each element of array with the variable rollNumber.
      * logical_step_details: A for-loop is used here to iterate over all the elements present in the array. The purpose is to get the index of the element that we are searching for in the array.
      * question_4: What is the purpose of comparing each and every element of array with the variable rollNumber? 
      * answer_4: The purpose is to get the index of the element that we are searching for in the array.
      */

      for (int i=0 ;i< size; i++){

         /** 
         * stm_comment: if statement to check if the value of variable rollNumber is equal to the element present in the array
         * question_1: Why if statement is used here?
         * answer_1: Here if statement is used to compare array variable is equal to the rollNumber, so if it the condition is true then it goes inside if statement.
         * question_2: Why the value of variable 'i' is increased by 1?
         * answer_2: The value of variable 'i' is increased by 1 because the index of array starts from 0 and here we are considering the rank is 1 for the array element present in the 0 index, so instead of creating another integer variable we can increase the value of variable 'i' and use it as for displaying rank of the student according to their rollNumber placement in the array.
         */
         if(array[i]==rollNumber){
            i = i + 1;
            System.out.println("Your rank is: "+ i);
         }
      }
   }
}
