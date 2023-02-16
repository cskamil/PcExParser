/**
@goalDescription(Conversion of temperature from one scale to the other.)
**/
public class TemperatureConversion
{
    public static void main( String[] args )
    {
//Specify the current temperature scale, current temperature and initialise a variable to store the value
        char scale='C';
        double temp=100;
        double tempConverted=0.0;

//Convert the temperature from one scale to another

        System.out.printf("temperature : %.2f %s %c", temp," deg ",scale);

/**@helpDescription(The temperature is converted from one scale to scale. Because the current scale is in celcius, the temperature(100) in degree celcius is converted to degree fahreheit. question_1:Please eplain what does the following if-else statemnte does? answer_1:  The temperature is converted from one scale to scale. Because the current scale is in celcius, the temperature(100) in degree celcius is converted to degree fahreheit.)**/
        if(scale=='C'){
            tempConverted = ( temp + 40.0 ) * ( 9.0/5.0 ) - 40.0;
            scale='F';
        }else if(scale=='F'){
            tempConverted = ( temp + 40.0 ) * ( 5.0/9.0 ) - 40.0;
            scale='C';

        }else{
            System.out.println("Not a valid temperature scale");
        }

        System.out.println();
        System.out.printf("temperature : %.2f %s %c", tempConverted," deg ",scale);
    }
}
