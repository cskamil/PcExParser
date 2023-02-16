/**
* author : Jordan Barria-Pineda
* topics : Recursion
* subtopics: recursive method calling, recursion base case
* goalDescription: This program checks whether a string is palindrome or not (meaning the second half of the string is the reverse of the first half). 
* source: Arizona State University online book https://www2.cs.arizona.edu/~mercer/Book/PrinterFriendly/19Tall.pdf
* output: Yes
*/

public class RecursiveIsPalindrome{

    public static void main(String args[]){ 
        String str = "geeg"; 
  
        if (isPalindrome(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
     
     /**
      * stmt_comment: Definition of the recursive method, which receives a word (String variable) as an input
      */ 
     public boolean isPalindrome(String str) {
            /**
            * logical_step_1: The base case returns true when there are one or no characters left.
            * logical_step_details: In this function we have two base cases, this is one of them. When reaching this base case, the recursive function stops making subsequent calls, and instead it returns always true. This happens whenever the word substring that is passed as parameter to isPalindrome function has length less or equal than one (either one character or an empty String).
            * question_1: What type of case for the recursive algorithm is this if-statement representing?
            * answer_1: One of the base cases.
            * question 2: When is this base case triggered?
            * question 2: Whenever the lengt of str is 0 or 1 (less than or equal to 1).
            */
             if (str.length() <= 1) {
                 /*
                  * stm_comment: Base case when this method knows to return true (either it is an empty String or only one character).
                  */
                 return true;
             }
             else{
                /**
                 * logical_step_2: The recursion base case that returns false when the first and last characters do not match.
                 * logical_step_details: In this function we have two base cases, this is one of them. When reaching this base case, the recursive function stops making subsequent calls. This base case happens whenever the first character (charAt(0)) of the word substring "str" that is passed as parameter to isPalindrome function (which has 2 or more characters in length) is different from its last character (charAt(str.length() - 1)). It always return false, as this means that the word is not palindrome.
                 * question_1: What type of case for the recursive algorithms is this if-statement representing?
                 * answer_1: One of base cases.
                 * question 2: When is this base case triggered?
                 * answer 2: Whenever the string length is greater than 1 and the first character of string is different from its last character.
                 */
                 if (str.charAt(0) != str.charAt(str.length() - 1)){
                     /**
                     * stm_code: Base case when this method knows to return false because the first and last characters do not match.
                     */
                     return false;
                 }
                /**
                 * logical_step_3: The recursive call case that calls the isPalindrome function, with a shorter version of the string.
                 * logical_step_details: The recursive case is presented here. Whenever the word substring being analyzed has two or more characters and its first and last characters are equal, it calls the isPalindrome function again, but by passing as parameter the word "str" without the first and its last character (str.substring(1, str.length() - 1)), as those were already analyzed in the current call
                 * question_1: What type of case for the recursive algorithms is this if statement representing?
                 * answer_1: The recursive call case.
                 * question_2: When is the recursive call triggered?
                 * answer_2: Whenever the length of the string is greater than one and the first and the last character are the same.
                 */
                 else{
                     /**
                      * stm_comment: The first and last characters are equal so check if the shorter string--a simpler version of this problem--is a palindrome.
                      */
                     return isPalindrome(str.substring(1, str.length() - 1));
                }
            }
        }
    }
}
