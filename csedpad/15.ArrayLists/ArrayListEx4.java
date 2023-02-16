/**
 * author: Lasang Tamang 
 * topics: ArrayList 
 * subtopics: Create and Initialize arrayList, add element to arrayList, Iterate Through an ArrayList
 * goalDescription: For the online order list, this program determines if Seller adds gifts or alcohol risk notes. If the ordered list contains alcohol, the seller adds alcohol risk notes. Otherwise, every order is shipped with gifts of chocolate and peanuts. 
 * source: N/A 
 * output: [Thank you note, Go Pro, Umbrella, Alcohol, Alcohol risk note]
 */
import java.util.*;
import java.util.ArrayList;

public class ArrayListEx4 {

    public static void main(String[] args) {
        /**
         * logical_step_1: Create and initialize three arrayLists for containing orderList, gifts, and item to ship. 
         * logical_step_details: Create and initializes three arrayLists orderList, gifts, and itemToShip with element type String. orderList is initialized with values "Go Pro", "Umbrella", "Alcohol". The value of gifts is initialized to" chocolates" and "Peanuts". 
         * question_1: What does the following code block do? 
         * answer_1: Create and initializes three arrayLists for containing orderList, gifts, and itemToShip. 
         * question_2: What is the type of element for the arrylists we created? 
         * answer_2: String.
         * question_3: What are the elements of arrayList OrderList? 
         * answer_3: "Go Pro", "Umbrella", and "Alcohol".
         * question_4: What are the elements of arrayList gifts? 
         * answer_4: "chocolates" and "Peanuts".
         */
        /**
         * stm_comment: Initializes values of arrayList orderList for list of
         * order by customer
         */
        ArrayList<String> orderList = new ArrayList<String>(Arrays.asList("Go Pro", "Umbrella", "Alcohol"));
        /**
         * stm_comment: Initializes values of arrayList gifts for list of gifts
         * to send
         */
        ArrayList<String> gifts = new ArrayList<String>() {
            {
                add("Chocolates");
                add("Peanuts");
            }
        };
        ArrayList<String> itemToShip = new ArrayList<String>();

        /*
         * logical_step_2: Add items in arrayList orderList to arrayList itemToship and also add "Thank you note" at the top.
         * logical_step_details: Iterate over each item in orderlist and add it to arrayList itemToShip. Then, add "Thank you note" at first postion of arrayList itemToShip.
         * question_1: What does the following code block do?
         * answer_1:  Adds items in arrayList orderList to arrayList itemToship. It also adds "Thank you note" at the top.
         * question_2: What does the for loop do?
         * answer_2: Iterate over each item in orderlist and add it to arrayList itemToShip.
         * question_3: Does thank you note get added at last or first position in arrayList itemToShip?
         * answer_3: It gets added to the first position.
         */
        /**
         * stm_comment: iterates over each element of arrayList
        */
        for (String item : orderList) {
            itemToShip.add(item);
        }
        /**
         * stm_comment: Adds items at index postion 0 of arrayList itemToShip
        */
        itemToShip.add(0, "Thank you note");

        /**
         * logical_step_3: Check itemToShip, add gift, and print the final values. 
         * logical_step_details: Check if one of values of the arrayList shippingBox is "Alcohol". If true, the "Alcohol risk note" is added and the gifts removed. Then, it prints [Thank you note, Go Pro, Umbrella, Alcohol, Alcohol risk note].
         * question_1: What does the following code block do? 
         * answer_1: Checks itemToShip, adds gift, and prints final values.
         * question_2: What is done if arrayList contains Alcohol? 
         * answer_2: Gifts are cleared and replaced with alcohol risk note. 
         * question_2: What is printed? 
         * answer_2: [Thank you note, Go Pro, Umbrella, Alcohol, Alcohol risk note]
         */
        /**
         * stm_comment: Checks if arrayList itemToShip contains element with value Alcohol
         */
        if (itemToShip.contains("Alcohol")) {
            /**
             * stm_comment: Clear all element of arrayList gifts
             */
            gifts.clear();
            gifts.add("Alcohol risk note");
        }
        /**
         * stm_comment: Add all element of gifts to arrayList itemToShip
         */
        itemToShip.addAll(gifts);
        System.out.print(itemToShip);

    }
}
