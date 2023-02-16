/**
 * author: Lasang Tamang 
 * topics: ArrayList 
 * subtopics: Create and Initialize arraylist, add element to arraylist, Loop through an ArrayList
 * goalDescription: For the online sports store, this program determines if seller adds gifts to the shipping box or not. The seller is a cricket player. He has gift bags containing a cricket ball and gloves for any qualified buyer. If the shipping box has Cricket Bat, then all gift box items are added to the shipping box. 
 * source: N/A 
 * output: Jersy Cricket Bat Cricket Ball Gloves
 */
import java.util.*;
import java.util.ArrayList;

public class ArrayListEx3 {

    public static void main(String[] args) {
        /**
         * logical_step_1: Initialize two arrayLists for holding items in the shipping box and the gift bag. 
         * logical_step_details: Create and initialize two arrayLists shippingBox and giftBag. The arraylist shippingBox has String type elements and is initialized with values "Jersy" and "Cricket Bat". The arraylist giftBag has String type elements and is initialized with values "cricket ball" and "Gloves". 
         * question_1: What does the following code block do? 
         * answer_1: Initializes arrayLists for holding items in the shipping box and the gift bag.
         * question_2: What is the type of element of shippingBox? 
         * answer_2: String 
         * question_3: What are the elements of shippingBox? 
         * answer_3: Jersy and Cricket Bat 
         * question_4: What is the type of element of giftBag? 
         * answer_4: String 
         * question_5: What values are added to arrayList giftBag ? 
         * answer_5: Cricket Ball and Gloves
         */
        /**
         * stm_comment: Initializes values of arraylist shippingBox
         */
        ArrayList<String> shippingBox = new ArrayList<String>(Arrays.asList("Jersy", "Cricket Bat"));
        ArrayList<String> giftBag = new ArrayList<String>();
        /*stm_comment: Add element to arraylist giftBag*/
        giftBag.add("Cricket Ball");
        giftBag.add("Gloves");

        /**
         * logical_step_2: Check the shipping box and decide whether gift box items are to be added or not. 
         * logical_step_details: Check if one of values of the arraylist shippingBox is "Cricket Bat". If true, the values of arraylist giftBag is added to arraylist shippingBox.
         * question_1: What does the following code block do? 
         * answer_1: Checks shipping box and decides whether gift box items are to be added or not. 
         * question_2: When is the element of arrayList added to arraylist shippingBox? 
         * answer_2: When Cricket Bat is one of the values of arrayList shippingBox. 
         * question_3: What is done if shippingBox contains value Cricket Bat? 
         * answer_3: Values of arraylist giftBag is added to arraylist shippingBox.
         */
        /**
         * stm_comment: Checks if arraylist shippingBox contains element with value Cricket bat
         */
        if (shippingBox.contains("Cricket Bat")) {
            /**
             * stm_comment: Add all element of giftBag to arraylist shippingBox 
            */
            shippingBox.addAll(giftBag);
        }

        /**
         * logical_step_3: Iterate over all values of arrayList shippingBox and print the value. 
         * logical_step_details: Iterate over all values of arrayList shippingBox and print the values using for-loop condtion. The size of arraylist shippingBox is 4.  The for-loop starts at i=0 and iterates until  i<shippingBox.size() which is 3 . For each value of i, the value of arraylist shippingBox at index position i is printed. 
         * question_1: What does the following code block do? 
         * answer_1: Iterates over each values of arrayList shippingBox and prints the value. 
         * question_2: What is the size of arrayList shippingBox? 
         * answer_2: 4 
         * question_3: What is the starting and stopping value of i in for loop? 
         * answer_3: 0, 3
         */
        /**
         * stm_comment: Finds the size of arrayList shippingBox and the loop iterates over each element of shippingBox
         */
        for (int i = 0; i < shippingBox.size(); i++) {
            /**
             * stm_comment: Get element of shippingBox at given index position i and prints the value
             */
            System.out.print(shippingBox.get(i) + " ");
        }

    }
}
