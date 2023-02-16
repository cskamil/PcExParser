/**
@goalDescription(For the online sports store, this program determines if seller adds gifts to the shipping box or not. The seller is a cricket player. He has gift bags containing a cricket ball and gloves for any qualified buyer. If the shipping box has Cricket Bat, then all gift box items are added to the shipping box.)
**/
import java.util.*;
import java.util.ArrayList;
public class ArrayListEx3 {

    public static void main(String[] args) {
//Initialize two arrayLists for holding items in the shipping box and the gift bag.
/**@helpDescription(Initializes values of arraylist shippingBox)**/
        ArrayList<String> shippingBox = new ArrayList<String>(Arrays.asList("Jersy", "Cricket Bat"));
        ArrayList<String> giftBag = new ArrayList<String>();
        giftBag.add("Cricket Ball");
        giftBag.add("Gloves");
//Check the shipping box and decide whether gift box items are to be added or not.
/**@helpDescription(Checks if arraylist shippingBox contains element with value Cricket bat)**/
        if (shippingBox.contains("Cricket Bat")) {
/**@helpDescription(Add all element of giftBag to arraylist shippingBox)**/
            shippingBox.addAll(giftBag);
        }
//Iterate over all values of arrayList shippingBox and print the value.
/**@helpDescription(Finds the size of arrayList shippingBox and the loop iterates over each element of shippingBox)**/
        for (int i = 0; i < shippingBox.size(); i++) {
/**@helpDescription(Get element of shippingBox at given index position i and prints the value)**/
            System.out.print(shippingBox.get(i) + " ");
        }
    }
}
