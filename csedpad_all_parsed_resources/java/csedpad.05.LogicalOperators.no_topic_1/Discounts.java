/**
@goalDescription(Given the price of item this program says if item is qualified for discount or not. An item is qualified for discount if the price of item is greater than 200 but less than 500.)
**/
public class Discounts {

    public static void main(String args[]) {

//Specify the price of an item
        double price = 256.50;

//Check if the price of item is greater than 200 and less than 500.
/**@helpDescription(Greater than(>) operator checks if value in left is greater than value in right. Less than(<) checks is the value in left is less than the value in right. Logial AND ('&&') operator checks if the value on both sides are true. question_1: Please explain what does the following Logical operator ('&&') do? answer: Logical('&&') opearator returns 'true' if both conditions on left and right are true.)**/
        boolean discount = (price>200) && (price<500);;
        System.out.println("The item is qualified for discount: "+discount);



    }

}
