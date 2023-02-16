/**
 * author: Nisrine Ait Khayi
 * topics: Recursion
 * subtopics: recursion,string processing.
 * goalDescription: This program recursively generates the length of a given student first name.
 * source: https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
 * output:7
*/
import java.util.*; 
  
public class StringLength{ 
  
  
    private static int recLen(String str)  
    { 
        /**
         * logical_step_1: When the first name is empty the result is 0 without calling the recursion. When the name is not empty the lengh is computed recursively.
         * question_1: When is the fist block of code executed?
         * answer_1:  When the value of the str variable is empty. 
         * question_1: When is the second block of code executed?
         * answer_1:  When the value of the str variable is not empty.
        */      
         /**
           stm_comment: The length of the given name defines which block is executed
           question_1: why the length of the name is important?
           answer_1: the length of the name triggers which block will be executed.
           */
        if (str.equals("")) 
           
          return 0;
         
        else
         
            return recLen(str.substring(1)) + 1; 
    } 
  
    public static void main(String[] args)  
    { 
       
        String str ="NISRINE";    
       
        System.out.println(recLen(str)); 
    } 
} 
  
 
