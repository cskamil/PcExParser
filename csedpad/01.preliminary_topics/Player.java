/*
 * author: Lasang Tamang
 * topics: Variables
 * subtopics: local variables, instance, static variables
 * goalDescription: Construct a program that stores the player's information and displays it.
 * source: Memphis team created on own
 * output: 
    1
    Lasang
    Nepal
    2
    Jeevan
    Nepal
 */

public class Player { 
    
    
    /*
     * logical_step_1: Declare the variables needed to store player's id, name, and country. 
     * logical_step_details: Declare a variable id, a variable name, and a variable country which correspond to the id, name, and country of a player. The variable country is initialized to Nepal.
     * question_1: What does the following code block do?
     * answer_1: Declare variables needed to store player's id, name, and country.
     * question_2: What variables are declared?
     * answer_2: The variables id, name, and country are declared.
     * question_3: What value is the variable country intialzed to?
     * answer_3: Nepal.
    */
    /**
     * stm_comment: Declare an instance variable id of type integer
     */
    int id ;
    /**
     * stm_comment: Declare a instance variable name of type String
    */	
    String name;
    /**
     * stm_comment: Declare a static variable country of type String and intialize it value to Nepal
     */	
    static String country = "Nepal";
     
    public static void main(String args[]) { 
        /**
         * logical_step_2: Declare a variable count to track the number of players created. 
         * logical_step_details: The program keeps track of the number of players created with this count variable. The intial count value is 0 since now players have been created.
         * question_1: What does the following code block do?
         * answer_1: Declares a variable needed to track the number of players created.
         * question_2: What is the starting count value?
         * answer_2: 0 because no players have been created.
         */
        /*stm_comment: declare a loval variable called count of type int and intialize it value to 0*/	
        int count = 0;
        
        /** 
         * logical_step_step_3: Create 2 player objects to store player information. Assign an id and name for each player object. 
         * logical_step_details: Two players, player1 and player2, are created. Then an id and name are assigned to each of them.
         * question_1: What does the following code block do?
         * answer_1: It creates two player objects to store player information. Then it assigns an id and name to each object.
         * question_2: What is the id and name of first player?
         * answer_2: 1, Lasang
         * question_3: What is the id and name of second player?
         * answer_3: 2, Jeevan
         */
        /**
         * Create the first player object 
         */
        Player player1 = new Player();
        player1.id = ++count; 
        player1.name = "Lasang"; 
        /**
         * Create the second player object 
         */
        Player player2 = new Player();
        player2.id = ++count; 
        player2.name = "Jeevan"; 
        
        /**
         * logical_step_step_4: Display the information we stored for both players.
         * logical_step_details: The program displays the value for each player that has been stored by printing to the console.
         * question_1: What does the following code block do?
         * answer_1: Displays the information of both players we stored.
         */
        System.out.println(player1.id); 
        System.out.println(player1.name); 
        System.out.println(player1.country);
        System.out.println(player2.id); 
        System.out.println(player2.name); 
        System.out.println(player2.country); 
  
    } 
} 

