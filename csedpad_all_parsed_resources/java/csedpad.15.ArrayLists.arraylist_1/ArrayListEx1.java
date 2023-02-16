/**
@goalDescription(This program shows a person's orginal travel list and creates a new travel list from the original. Then it makes some changes on the new travel list.)
**/
import java.util.ArrayList;
public class ArrayListEx1 {
    public static void main(String[] args) {
//Create an arrayList travelList for holding the travel list. Add destinations(countries) to the travel list.
/**@helpDescription(Creates an arrayList named travelList)**/
        ArrayList < String > travelList = new ArrayList < String > ();
/**@helpDescription(Adds Swizerland to arrayList travelList)**/
        travelList.add("Switzerland");
        travelList.add("Denmark");
        travelList.add("India");
        travelList.add("China");
        travelList.add("Thailand");
        travelList.add("Bhutan");
//Create a list newTravelList from the original travel list travelList.
        ArrayList < String > newTravelList = new ArrayList <  > ();
        for (int i = 0; i < 5; i++) {
/**@helpDescription(Gets element of arrayList travelList at position i and add the element to arrayList newTravelList at index position i)**/
            newTravelList.add(i, travelList.get(i));
        }
//Remove an element from newTravelList and print the values of newTravelList.
/**@helpDescription(Removes China from arrayList newTravelList)**/
        newTravelList.remove("China");
/**@helpDescription(Removes element of arrayList newTravelList at index position 0)**/
        newTravelList.remove(0);
        System.out.print(newTravelList);
    }
}

