/**
 * author: Lasang Tamang
 * topics: ArrayList
 * subtopics:  Create an arrayList, add elements to the arrayList, access elements of arrayList, remove elements from ArrayList
 * goalDescription: This program shows a person's orginal travel list and creates a new travel list from the original. Then it makes some changes on the new travel list.
 * source: https://beginnersbook.com/2013/12/java-arrayList/
 * output: [Denmark, India, Thailand]
*/
import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        /**
        * logical_step_1: Create an arrayList travelList for holding the travel list. Add destinations(countries) to the travel list.
        * logical_step_details: Declare an arrayList travelList whose elements are of type String and add Switzerland, Denmark, India, China, Thailand, and Bhutan.
        * question_1: What does the following code block do?
        * answer_1: The code creates a travelList for holding travel list and adds countries to travel.
        * question_2: What is the type of element of travelList?
        * answer_2: String.
        * question_3: What elements are added to travelList?
        * answer_3: Switzerland, Denmark, India, China, Thailand, and Bhutan.	
        */
        /**
         * stm_comment: Creates an arrayList named travelList 
         */
        ArrayList < String > travelList = new ArrayList < String > ();
        /*
        * stm_comment: Adds Swizerland to arrayList travelList 
        */
        travelList.add("Switzerland");
        travelList.add("Denmark");
        travelList.add("India");
        travelList.add("China");
        travelList.add("Thailand");
        travelList.add("Bhutan");

        /**
        * logical_step_2: Create a list newTravelList from the original travel list travelList.
        * logical_step_details: Create an arrayList newTravelList for holding new travel destinations. The element of the arrayList are of type string. 
        * The element Switzerland, Denmark, India, China, and Thailand are added to arrayList.
        * question_1: What does the following code block do?
        * answer_1: Creates a list newTravelList from original travel list travelList.
        * question_2: What is the type of element of newTravelList?
        * answer_2: String
        * question_3: What element are added to arrayList ?
        * answer_3: Switzerland, Denmark, India, China, and Thailand.	
        */
        ArrayList < String > newTravelList = new ArrayList <  > ();
        for (int i = 0; i < 5; i++) {
            /**
            * stm_comment: Gets element of arrayList travelList at position i and add the element to arrayList newTravelList at index position i
            */
            newTravelList.add(i, travelList.get(i));
        }

        /**
        * logical_step_3: Remove an element from newTravelList and print the values of newTravelList. 
        * logical_step_details: Remove China from from newTravelList and remove element at index 0. The value printed is [Denmark, India, Thailand].
        * question_1: What does the following code block do?
        * answer_1:  Removes elements from newTravelList and print value of newTravelList .
        * question_2: What countries are removed?
        * answer_2: China and Switzerland.
        * question_3: What value are printed?
        * answer_3: [Denmark, India, Thailand].	
        */
        /**
        * stm_comment: Removes China from arrayList newTravelList
        */
        newTravelList.remove("China");
        /**
        * stm_comment: Removes element of arrayList newTravelList at index position 0
        */
        newTravelList.remove(0);
        System.out.print(newTravelList);

    }
}

