/**
@goalDescription(Calculate the area of a circle given its radius.)
**/

    public class CircleArea{
        
//Define a method that will take the radius of a circle as parameter, and calculate its area.
/**@helpDescription(Create a method called circleArea that returns a double and takes an integer r as a parameter.)**/
            public static double circleArea(int r){
            double area = 2 * 3.14 * r; 
            
/**@helpDescription(Return the value held in the variable 'area'.)**/
            return area;  
        }  
    
//Call the method circleArea to calculate the area of a circle from its given radius. Print the result in the console.
            public static void main(String args[]){  
            
/**@helpDescription(Call the method circleArea with the parameter r = 5. Store the returned value in the variable 'result'.)**/
                double result = CircleArea.circleArea(5);  
                System.out.println(result);  
            } 
        }  
