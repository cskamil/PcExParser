/**
@goalDescription(For the online order list, this program determines if Seller adds gifts or alcohol risk notes. If the ordered list contains alcohol, the seller adds alcohol risk notes. Otherwise, every order is shipped with gifts of chocolate and peanuts.)
**/
import java.util.*;
import java.util.ArrayList;
public class ArrayListEx4 {

    public static void main(String[] args) {
//Create and initialize three arrayLists for containing orderList, gifts, and item to ship.
/**@helpDescription(Initializes values of arrayList orderList for list of order by customer)**/
        ArrayList<String> orderList = new ArrayList<String>(Arrays.asList("Go Pro", "Umbrella", "Alcohol"));
/**@helpDescription(Initializes values of arrayList gifts for list of gifts to send)**/
        ArrayList<String> gifts = new ArrayList<String>() {
            {
                add("Chocolates");
                add("Peanuts");
            }
        };
        ArrayList<String> itemToShip = new ArrayList<String>();
//Add items in arrayList orderList to arrayList itemToship and also add "Thank you note" at the top.
/**@helpDescription(iterates over each element of arrayList)**/
        for (String item : orderList) {
            itemToShip.add(item);
        }
/**@helpDescription(Adds items at index postion 0 of arrayList itemToShip)**/
        itemToShip.add(0, "Thank you note");
//Check itemToShip, add gift, and print the final values.
/**@helpDescription(Checks if arrayList itemToShip contains element with value Alcohol)**/
        if (itemToShip.contains("Alcohol")) {
/**@helpDescription(Clear all element of arrayList gifts)**/
            gifts.clear();
            gifts.add("Alcohol risk note");
        }
/**@helpDescription(Add all element of gifts to arrayList itemToShip)**/
        itemToShip.addAll(gifts);
        System.out.print(itemToShip);
    }
}
