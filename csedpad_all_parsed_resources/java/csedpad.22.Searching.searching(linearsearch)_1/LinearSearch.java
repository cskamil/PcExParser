/**
@goalDescription(This program linearly searches the array for the index or rank of the rollNumber entered by the user or student and prints out their rank, where "index will be the rank if the number is present in the array". If the index is "0", then the rank is "0 + 1 = 1", so being 1st.)
**/
import java.util.Scanner;

public class LinearSearch {

   public static void main(String args[]){

//Create an array of elements
      int rollNumber = 21;
      int array[] = {10, 20, 25, 21, 16, 17, 22};
      int size = array.length;

//Use a for-loop to compare each element of array with the variable rollNumber.
      for (int i=0 ;i< size; i++){

/**@helpDescription(if statement to check if the value of variable rollNumber is equal to the element present in the array question_1: Why if statement is used here? answer_1: Here if statement is used to compare array variable is equal to the rollNumber, so if it the condition is true then it goes inside if statement. question_2: Why the value of variable 'i' is increased by 1? answer_2: The value of variable 'i' is increased by 1 because the index of array starts from 0 and here we are considering the rank is 1 for the array element present in the 0 index, so instead of creating another integer variable we can increase the value of variable 'i' and use it as for displaying rank of the student according to their rollNumber placement in the array.)**/
         if(array[i]==rollNumber){
            i = i + 1;
            System.out.println("Your rank is: "+ i);
         }
      }
   }
}
