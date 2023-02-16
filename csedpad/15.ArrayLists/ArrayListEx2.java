/**
 * author: Lasang Tamang 
 * topics: ArrayList 
 * subtopics: Create arraylist, add element to arraylist, modify, remove elements from ArrayList 
 * goalDescription: This program creates a wish list and edits it. 
 * source: N/A
 * output:
 iphone 11 
 apple watch 
 umbrella
 */
import java.util.ArrayList;

public class ArrayListEx2 {

    public static void main(String[] args) {
        /**
         * logical_step_1: Initialize an arraylist wishList with 3 items.
         * logical_step_details: Create and initializes an arraylist wishList whose elements are of type String. Add iPhone 10, Apple Watch, and GoPro. 
         * question_1: What does the following code block do? 
         * answer_1: Initializes an arraylist wishList with first items.
         * question_2: What is the type of element of travelList? 
         * answer_2: String 
         * question_3: What element are added to travelList ? 
         * answer_3: iPhone 10, Apple Watch, and GoPro.
         */
        /**
         * stm_comment: Creates an arraylist wishList and add elements
         */
        ArrayList< String> wishList = new ArrayList< String>() {
            {
                add("iPhone 10");
                add("Apple Watch");
                add("GoPro");
            }
        };

        /**
         * logical_step_2: Modify the wish list. 
         * logical_step_details: Change iPhone 10 to iPhone 11, remove GoPro, and add umbrella. 
         * question_1: What does the following code block do? 
         * answer_1: Modifies the wish list.
         * question_2: What item is modified to what? 
         * answer_2: iPhone 10 is modified to iPhone 11. 
         * question_3: What item is removed? 
         * answer_3: GoPro. 
         * question_3: What item is added? 
         * answer_3: umbrella
         */
        /**
         * stm_comment: Modify value of element of arraylist wishList at index position 0 as iphone 11
         */
        wishList.set(0, "iPhone 11");
        /**
         * stm_comment: Remove value go pro from arraylist wishList
         */
        wishList.remove("GoPro");
        wishList.add("umbrella");

        /**
         * logical_step_3: Display the contents of the wishlist. 
         * logical_step_details: Iterate through each item of wishlist and display the item. 
         * question_1: What does the following code block do? 
         * answer_1: Displays the contents of the wishlist.
         */
        /**
         * stm_comment: Loop over each element of arraylist and prints the value
         */
        for (String item : wishList) {
            System.out.println(item);
        }
    }
}
