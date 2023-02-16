/**
@goalDescription(This program displays Casablanca's statistics.)
**/
       public class CityStats {
	     public static void main(String[] args) {    
//Declare the variables needed to store the city's statistics.
		String country = "Morocco";        
		String region = "Casablanca-Settat";       
		int population = 3359818;        
		double postalCode = 20000;        
		String mayor = "Omari";       
		boolean isCapitalOfMorocco = false;
/**@helpDescription(The following block displays some statistics  of Casablanca city question_1: what is the displayed value of country variable? answer_1: Morocco question_2: what is the displayed value of region variable? answer2: Casablaca-Settat question_3: what is the displayed value of age population? answer2: 3359818 question_4: what is the displayed  value of postalCode  variable? answer4: 20000 question_5: what is the displayed  value of mayor variable? answer5: Omari question_6: what is the displayed value of  isCapitalOfMorocco  variable? answer6: false)**/
        
		System.out.println("Country is:" + country);
		System.out.println("Regision " + region);
		System.out.println("Population is :" + population);
		System.out.println("PostalCode is : " + postalCode);
		System.out.println("Mayor of the city is : " + mayor);
		System.out.println("Is Casablanca the capital of Morocco?" + isCapitalOfMorocco);
	 }
}
