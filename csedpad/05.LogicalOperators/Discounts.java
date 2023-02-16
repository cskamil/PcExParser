/**
 * author: Priti Oli,Rabin Banjade
 * topic: Logical Operator
 * subTopic:demonstration of application of logical operators in java
 * goalDescription: Given the price of item this program says if item is qualified for discount or not. An item is
 * qualified for discount if the price of item is greater than 200 but less than 500.
 * source: N/A
 * input: N/A
 * output: The item is qualified for discount: true
 */

public class Discounts {

    public static void main(String args[]) {

        /**
         * logical_step_1: Specify the price of an item
         * logical_step_details: Declare the value of the variable price, which represents the price of an item
         * question_1: How is the value of price specified?
         * answer_1: Declare a variable price which represents the price of an item
         * question_2: What does the following block of code do?
         * answer_2: Specifies the price of an item.
         * question_3: What is the data type of the variable price?
         * answer_3: The data type of variable price is double.
         * question_4: What is the value of the variable price?
         * answer_4: The value of the variable price is 256
         */

        double price = 256.50;

        /**
         * logical_step_2: Check if the price of item is greater than 200 and less than 500.
         * logical_step_details: Check if price of the item is greater than 200 but less than 500
         * question_1: What does the following block of code do?
         * answer_1: The code below checks if the price of item is greater than 200 and less than 500.
         * question_2: What will be the output of the following block?
         * answer_2: The item is qualified for discount: true
         * question_3: What is the operator '&&' that is used below?
         * answer_3: '&&' is logical and operator.
         * question_4: What is the data type of variable discount?
         * answer_4: The data type of variable discount is 'boolean'
         */

        /**stm_comment: Greater than(>) operator checks if value in left is greater than value in right. Less than(<)
         * checks is the value in left is less than the value in right. Logial AND ('&&') operator checks if the value on both sides
         * are true.
         * question_1: Please explain what does the following Logical operator ('&&') do?
         * answer: Logical('&&') opearator returns 'true' if both conditions on left and right are true.
         */
        boolean discount = (price>200) && (price<500);;
        System.out.println("The item is qualified for discount: "+discount);




    }

}