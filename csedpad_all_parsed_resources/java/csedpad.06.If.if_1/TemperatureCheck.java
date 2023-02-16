/**
@goalDescription(You are give temperature of today and your goal is to find out whether it is hot today.)
**/
public class TemperatureCheck{
	public static void main(String[] args){

//Declare a variable temperature to specify the temperature of today.
		int temperature = 110;

//Check if the temperature is hot or not, if so print a message stating the temperature is hot today.

/**@helpDescription(The condition of the if-statement checks whether the value of the temperature is greater than or equal to 90. question_1: Please explain what the following if statement does? answer_1: The condition of the if-statement checks whether the value of the temperature is greater than or equal to 90.)**/
		if ( temperature >= 90){

/**@helpDescription(The  value of the variable temperature is 1110 which is greater than 90, the message "The temperature is hot today" is printed. question_1: Please explain when and how the following statement runs? answer_1:  The  value of the variable temperature is 1110 which is greater than 90, the message "The temperature is hot today" is printed.)**/
			System.out.println("The temperature is hot today");
		}

	}
}
