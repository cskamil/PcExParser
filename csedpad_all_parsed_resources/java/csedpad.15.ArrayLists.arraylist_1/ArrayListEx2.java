/**
@goalDescription(This program creates a wish list and edits it.)
**/
import java.util.ArrayList;
public class ArrayListEx2 {

    public static void main(String[] args) {
//Initialize an arraylist wishList with 3 items.
/**@helpDescription(Creates an arraylist wishList and add elements)**/
        ArrayList< String> wishList = new ArrayList< String>() {
            {
                add("iPhone 10");
                add("Apple Watch");
                add("GoPro");
            }
        };
//Modify the wish list.
/**@helpDescription(Modify value of element of arraylist wishList at index position 0 as iphone 11)**/
        wishList.set(0, "iPhone 11");
/**@helpDescription(Remove value go pro from arraylist wishList)**/
        wishList.remove("GoPro");
        wishList.add("umbrella");
//Display the contents of the wishlist.
/**@helpDescription(Loop over each element of arraylist and prints the value)**/
        for (String item : wishList) {
            System.out.println(item);
        }
    }
}
