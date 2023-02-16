/**
  * author: Nisrine Ait Khayi
  * topics: Arrays
  * subtopics: declaring array variables, processing arrays
  * goalDescription: This program will pick four cards at random from a deck of 52 cards. 
  * source: The Intro-to-Java textbook (10th Edition, by Liang).
  * output : The output is not static. Here is an output  example:
   Card number 35: 10 of Diamonds
   Card number 33: 8 of Diamonds
   Card number 6: 7 of Spades
   Card number 18: 6 of Hearts
*/
public class DeckCards {

    public static void main(String[] args) {
        /**
        * logical_step_1: Declare the variables needed to represent cards, the suit of the card, and the rank of the card.
        * logical_step_details: Declare arrays to represent cards' numbers from 0 to 51, the possible suits' values of the card, and the ranks' of the card.
        * question_1: What does the following code block do?
        * answer_1: Declares variables needed to represent cards, their suits, and their ranks.
        * question_2: What variables are declared?
        * answer_2: The deck array to represend cards with a size of 52, the suits array to represent suits initilaized with
        * 4 values, and the ranks array to represent the ranks initialized with 13 values.
        * question_3 : what are the initial values of the array suits?
        * answer_3:the initial values of the array suits are : Spades, Hearts, Diamonds and Clubs.
        * question_4 : what are the initial values of the array ranks?
        * answer_4:the initial values of the array ranks are :Ace, 2,3,4,5,6,7,8,9,10,Jack,Queen and King.
        
        */
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};

        /**
        * logical_step_2: Store the cards numbers from 0 to 51 in the deck array.
        * logical_step_details: Each card is stored in one element of the array deck. The algorithm is to iterate over each value from 0 to 51 and store the corresponding value in the corresponding element of the array.
        * question_1: What does the following code block do?
        * answer_1: Assigns the values from 0 to 51 to the elements of array deck.
        * question_2: What is the start and stopping codition of the for loop?
        * answer_2: For loop starts at i = 0 and stops when i<=51.
        * question_3: What does the code inside the for loop do?
        * answer_3: The code assigns each value of i during iteration to array deck at index position i.
        */

        /**
        *stm_comment: the following loop assign numbers from 0 to 52 to the array deck.
        * question_1: When the for loop ends?
        * answer_1:  the following loop end when we reach the size of the array deck.
        */
        for (int i = 0; i < deck.length; i++){
        
            deck[i] = i;
        }

        /**
        * logical_step_3: Shuffle the numbers stored in the deck array.
        * logical_step_details: The algorithm shuffles the elements of the array deck. This results in a new array with the same elements with different positions in the array deck.
        * question_1: What does the following code block do?
        * answer_1: It shuffles the positions of the elements of array deck.
        * question_2: What is the start and stopping codition of the for loop?
        * answer_2: For loop starts at i = 0 and stops when i<=51.
        * question_3: What does the code inside the for loop do?
        * answer_3: The code shuffles randomly the positions of the elements in the array.
        */

        /**
         * stm_comment: the following loop updates the values of the deck array
         * question_1: when the loop ends?
         * answer_1: when the index of the iteration is equal to the length of the array deck
         * question_2: How the index is used to change the deck values?
         * answer_2: each value in the deck array is replaced with the deck value at the index index.             
         */
        for (int i = 0; i < deck.length; i++) {

            int index = (int)(Math.random() * deck.length);          
            int temp = deck[i];

            deck[i] = deck[index];
        }

        /**
         * logical_step_4: Display the 4 cards numbers of the array deck and their suits and ranks.
         * logical_step_details: The algorithm iterates using loop variable i over all values from 0 to 3 and it displays the card number stored in the i-th element of the array deck. It displays als the card's suit and rank.
         * question_1: What does the following code block do?
         * answer_1: Display the first four values of the array deck, their suits, and their ranks.
         * question_2: Does the for loop iterate over each value of array?
         * answer_2: Yes.
         * question_3: Once they iterate over each value of array deck, what does the it do inside for loop?
         * answer_3: For each value of i, it prints the value of deck at index position i. It also prints its suit and rank.
         */

        /**
         * stm_comment: The following loop defines the rank and the suits of 4 picked cards.
         * question_1: How the suit of the card is determined?
         * answer_1:cardNumber / 13 determines the suit of the card
         * question_2: How the rank of the card is determined?
         * answer_2: cardNumber % 13 determines the rank of the card
         */
        for (int k = 0; k < 4; k++) {

            String suit = suits[deck[k] / 13];
            String rank = ranks[deck[k] % 13];
            
            System.out.println("Card number " + deck[k] + ": " + rank + " of " + suit);
        }

    }

}
