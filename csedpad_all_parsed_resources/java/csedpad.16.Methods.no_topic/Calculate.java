/**
@goalDescription(You are given a side of a cube. By using methods in Java, you have to calculate the volume of the cube.)
**/

    public class Calculate{
        
//Call the method cube to calculate the volume of a cube from its given side. Then print the result to the console.
/**@helpDescription(Create a method called Cube that returns an integer and takes an integer x as a parameter.)**/
        public static int cube(int x){
/**@helpDescription(Return the value of x^3.)**/
            return x*x*x;  
        }  
//Call the method cube to calculate the volume of a cube from its given side. Then print the result in the console.
        public static void main(String args[]){  
        
/**@helpDescription(Call the method 'cube' with the parameter x = 5. Store the returned value in a variable called 'result'.)**/
            int result = Calculate.cube(5);  
            System.out.println(result);  
        } 
    }  
