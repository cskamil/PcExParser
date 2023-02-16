/**
@goalDescription(This program recursively generates the length of a given student first name.)
**/
import java.util.*; 
public class StringLength{ 
  
  
    private static int recLen(String str)  
    { 
//When the first name is empty the result is 0 without calling the recursion. When the name is not empty the lengh is computed recursively.
/**@helpDescription(The length of the given name defines which block is executed)**/
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
  
 
