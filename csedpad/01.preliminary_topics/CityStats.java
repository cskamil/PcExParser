/**
 * author: Nisrine Ait Khayi
 * topics: variables, expressions, primitive data types
 * subtopics: declaring variables
 * goalDescription: This program displays Casablanca's statistics.
 * output:
    Morocco
    Casblanca-Settat
    3,359,818
    20000
    Omari
    false
*/
       public class CityStats {
	     public static void main(String[] args) {    
        
	   	 /**
	    	  * logical_step_1: Declare the variables needed to store the city's statistics.
		  * logical_step_details: Declare six variables of appropriate type to store the city's information : country, region, population, postal code, mayor, and capital status.
		  * question_1: What does the following code block do?
		  * answer_1: Declare the initial statistic variable of Casablanca.
                  * question_2: What is the type and initial value of the variable country?
                  * answer_2: Variable country is of type string and it is initialized to value Morocco.
                  * question_3: What is the type and initial value of the variable population?
                  * answer_3: Variable age  is of type integer and it is initialized to value 3359818.
                  * question_4: What is the type and initial value of the variable postalCode?
                  * answer_4: Variable postalCode  is of type double and it is initialized to value 20000.
                  * question_5: What is the type and initial value of the variable isCapitalOfMorocco?
                  * answer_5: Variable isCapitalOfMorocco  is of type boolean and it is initialized to value false.
		*/
    
		String country = "Morocco";        
		String region = "Casablanca-Settat";       
		int population = 3359818;        
		double postalCode = 20000;        
		String mayor = "Omari";       
		boolean isCapitalOfMorocco = false;
		 /*
		     * stm_comment: The following block displays some statistics  of Casablanca city
		     * question_1: what is the displayed value of country variable?
		     * answer_1: Morocco
		     * question_2: what is the displayed value of region variable?
		     * answer2: Casablaca-Settat
		     * question_3: what is the displayed value of age population?
		     * answer2: 3359818
		     * question_4: what is the displayed  value of postalCode  variable?
		     * answer4: 20000
		     * question_5: what is the displayed  value of mayor variable?
		     * answer5: Omari
		     * question_6: what is the displayed value of  isCapitalOfMorocco  variable?
		     * answer6: false
		     */
       
        
		System.out.println("Country is:" + country);
		System.out.println("Regision " + region);
		System.out.println("Population is :" + population);
		System.out.println("PostalCode is : " + postalCode);
		System.out.println("Mayor of the city is : " + mayor);
		System.out.println("Is Casablanca the capital of Morocco?" + isCapitalOfMorocco);
	 }
}
