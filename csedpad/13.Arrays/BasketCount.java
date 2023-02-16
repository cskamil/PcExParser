/**
 * author:Nisrine Ait Khayi
 * topics: Arrays
 * subtopics: Access the elements of the array and processing them
 * goalDescription :Count the total number of vegetables in a shopping bag. The shopping cart bag contains different quantities of various vegetables which are specified.
 * source: N/A
 * output: 15
*/
  
class BasketCount
{     
   
    public static void main(String args[])  
    { 
       /**  
         * logical_step_1: Declare an array variable arr with type integer and assign to it 5 values representing 5 types of vegetables.
         * logical_steps_details: Declare an array representing a basket with 5 types of vegetables: 3 tomatos, 2 potatos , 5 onions, and 4 carrots.
         * question_1: What is the name and the type of the declared array?
         * answer_1: arr is the name and it is an array of integer values.
         * question_2: What is the size of the declared array?
         * answer_2: The array arr has a size of 5.
	 * question_3: What are the values of the array arr?
	 * answer_3: the values of the array arr are: 3,1,2,5,4
	 * question_4: what is the initial value of the variable sum?
	 * answer_4: the initial value of the variable sum is 4.
         */
        
      
         int arr[] = {3, 1, 2, 5, 4};         
      
         int sum=0;
        
        /**
          * logical_step_2: count the  vegetables in the basket.
          * logical_step_details: The algorithm is to iterate over each value from 0 to 4 and sum up the elements of the array. Then store the result in the variable sum.
          * question_1: What does the following code block do?
          * answer_1: It iterates over the array arr and sums up its values.
          * question_2: What is the start and stopping codition of the for loop?
          * answer_2: For loop starts at i = 0 and stops when i < 5.
          * question_3: What does the code inside the for loop do?
          * answer_3: The code sum up each value of array arr at index position i.
          */
       
       /**
         * stm_comment: the following loop counts the vegetables in the basket
	 * question_1: What is the number of iterations of the loop for?
	 * answer_1: the number of iterations of the loop for is the length of the array arr: arr.length
         */
        for (int i = 0; i < arr.length; i++) 
        {
           /**
            *stm_comment:at each iteration, the value of the sum variable is changed.
	    *question_1: what is the value of sum at the second iteration (i=1)
	    *answer_1: the value is : 3+1=4
            */
           sum+=arr[i]; 
        }
        /**
          * logical_step_3: Display the sum of the values stored in array arr.
          * logical_step_details: It displays the number of vegetables stored and represented in the array arr.
          * question_1: What does the following code block do?
          * answer_1: Displays the sum of the values of the array arr.    
          */
        
        System.out.println("sum of array values : " + sum); 
      
    } 
    
  } 
    
