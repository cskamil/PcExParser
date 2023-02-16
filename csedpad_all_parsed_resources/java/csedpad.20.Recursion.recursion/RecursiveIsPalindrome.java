/**
@goalDescription(This program checks whether a string is palindrome or not (meaning the second half of the string is the reverse of the first half).)
**/
public class RecursiveIsPalindrome{

    public static void main(String args[]){ 
        String str = "geeg"; 
  
        if (isPalindrome(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
     
      * stmt_comment: Definition of the recursive method, which receives a word (String variable) as an input
     public boolean isPalindrome(String str) {
//The base case returns true when there are one or no characters left.
             if (str.length() <= 1) {
/**@helpDescription(Base case when this method knows to return true (either it is an empty String or only one character).)**/
                 return true;
             }
             else{
//The recursion base case that returns false when the first and last characters do not match.
                 if (str.charAt(0) != str.charAt(str.length() - 1)){
                     * stm_code: Base case when this method knows to return false because the first and last characters do not match.
                     return false;
                 }
//The recursive call case that calls the isPalindrome function, with a shorter version of the string.
                 else{
/**@helpDescription(The first and last characters are equal so check if the shorter string--a simpler version of this problem--is a palindrome.)**/
                     return isPalindrome(str.substring(1, str.length() - 1));
                }
            }
        }
    }
}
