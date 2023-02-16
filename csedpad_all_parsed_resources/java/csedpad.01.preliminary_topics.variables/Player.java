@goalDescription(Construct a program that stores the player's information and displays it.)
**/
public class Player { 
    
    
//Declare the variables needed to store player's id, name, and country.
/**@helpDescription(Declare an instance variable id of type integer)**/
    int id ;
/**@helpDescription(Declare a instance variable name of type String)**/
    String name;
/**@helpDescription(Declare a static variable country of type String and intialize it value to Nepal)**/
    static String country = "Nepal";
    public static void main(String args[]) { 
//Declare a variable count to track the number of players created.
        int count = 0;
//Create 2 player objects to store player information. Assign an id and name for each player object.
         * Create the first player object 
        Player player1 = new Player();
        player1.id = ++count; 
        player1.name = "Lasang"; 
         * Create the second player object 
        Player player2 = new Player();
        player2.id = ++count; 
        player2.name = "Jeevan"; 
//Display the information we stored for both players.
        System.out.println(player1.id); 
        System.out.println(player1.name); 
        System.out.println(player1.country);
        System.out.println(player2.id); 
        System.out.println(player2.name); 
        System.out.println(player2.country); 
    } 
} 

