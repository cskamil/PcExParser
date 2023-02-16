/**
@goalDescription(This program will pick four cards at random from a deck of 52 cards.)
**/
public class DeckCards {
    public static void main(String[] args) {
//Declare the variables needed to represent cards, the suit of the card, and the rank of the card.
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};
//Store the cards numbers from 0 to 51 in the deck array.
/**@helpDescription(the following loop assign numbers from 0 to 52 to the array deck. question_1: When the for loop ends? answer_1:  the following loop end when we reach the size of the array deck.)**/
        for (int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

//Shuffle the numbers stored in the deck array.
/**@helpDescription(the following loop updates the values of the deck array question_1: when the loop ends? answer_1: when the index of the iteration is equal to the length of the array deck question_2: How the index is used to change the deck values? answer_2: each value in the deck array is replaced with the deck value at the index index.)**/
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);          
            int temp = deck[i];

            deck[i] = deck[index];
        }

//Display the 4 cards numbers of the array deck and their suits and ranks.
/**@helpDescription(The following loop defines the rank and the suits of 4 picked cards. question_1: How the suit of the card is determined? answer_1:cardNumber / 13 determines the suit of the card question_2: How the rank of the card is determined? answer_2: cardNumber % 13 determines the rank of the card)**/
        for (int k = 0; k < 4; k++) {
            String suit = suits[deck[k] / 13];
            String rank = ranks[deck[k] % 13];
            
            System.out.println("Card number " + deck[k] + ": " + rank + " of " + suit);
        }

    }

}
