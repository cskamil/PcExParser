/**
@goalDescription(This program uses the binary search algorithm to search the index, where "index will be the rank of prizes you get if the users lottery number is present in the array". If the index is "0", then the rank is "0 + 1 = 1", so being 1st ont the rank you get the highest prize.)
**/
import java.util.Scanner;

public class BinarySearch {
   
   public static int binarySearch(int arr[], int first, int last, int lotNumber){

//Declare a while-loop.
      int mid = (first + last)/2;

      while( first <= last ){

         if ( arr[mid] < lotNumber ){
            first = mid + 1;
         }

         else if ( arr[mid] == lotNumber ){  
            return mid;
         }

         else{
            last = mid - 1;
         }
         mid = (first + last)/2;
      }
      return -1;                    
   }
                      
   public static void main(String a[]) {

//Create an array of lottery numbers.
      Scanner luckyNumber = new Scanner(System.in);

      int[] array = { 10, 20, 30, 40, 50, 60 };

      System.out.println("Enter your two digit lottery number: ");

      int lotNumber = luckyNumber.nextInt();

      int last=array.length-1;

//Call the method binarySearch.
/**@helpDescription(Integer variable index is declared and that variable is assigned with the index value that is returned from the function binarySearch(). question_1: What and how many types of parameters are accepted by the binarySearch function? answer_2: The binarySearch function accepts 4 parameters, the first one should be array of integers and the remaining 3 are integer variables.)**/
      int index = binarySearch(array,0,last,lotNumber);
      if (index != -1) {
         index = index + 1;
         System.out.println(lotNumber + " is present at rank: " + index + " and the highest prize pull starts from '1' and then 2, 3 and so on.");
      } else {
         System.out.println("Sorry, Please Try Again!!!");
      }
   }
}
