/**
@goalDescription(Count the total number of vegetables in a shopping bag. The shopping cart bag contains different quantities of various vegetables which are specified.)
**/
public class BasketCount
{     
   
    public static void main(String args[])  
    { 
//Declare an array variable arr with type integer and assign to it 5 values representing 5 types of vegetables.
      
         int arr[] = {3, 1, 2, 5, 4};         
      
         int sum=0;
        
//count the  vegetables in the basket.
/**@helpDescription(the following loop counts the vegetables in the basket question_1: What is the number of iterations of the loop for? answer_1: the number of iterations of the loop for is the length of the array arr: arr.length)**/
        for (int i = 0; i < arr.length; i++) 
        {
/**@helpDescription(at each iteration, the value of the sum variable is changed. question_1: what is the value of sum at the second iteration (i=1) answer_1: the value is : 3+1=4)**/
           sum+=arr[i]; 
        }
//Display the sum of the values stored in array arr.
        System.out.println("sum of array values : " + sum); 
      
    } 
    
  } 
    
