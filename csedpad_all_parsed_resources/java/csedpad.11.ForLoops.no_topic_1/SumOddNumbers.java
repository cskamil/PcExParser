/**
@goalDescription(50 chickens are separated in odd-numbered and even-numbered cages with the first chicken being in cage 1 and the last chicken in cage 50. Each cage's number indicates the number of eggs that the chicken lays such that chicken in cage n lays n eggs. How many eggs can be collected from all the chickens in the odd-numbered cages? This program computes that)
**/
public class eggsCollectedOddNumbers {
    public static void main(String args[]){
//specify a variable to store the count of all the eggs collected .
        int eggsCollected=0;
//find the eggs collected from odd-numberered cages(1-50)
/**@helpDescription(the for loop starts from 1 and iterates over the odd numbers less than 50. The eggsCollected in the body of the for loop sums up all the value of the eggs collected for odd-numbered vages question_1: Please explain what the following for loop does? answer_1:the for loop starts from 1 and iterates over the odd numbers less than 50. The eggsCollected in the body of the for loop sums up all the value of the eggs collected for odd-numbered vages)**/
        for(int i=1; i<=50; i+=2){
            eggsCollected = eggsCollected + i;
        }
        System.out.println("There are " + eggsCollected+" eggs collected");
    }
}
