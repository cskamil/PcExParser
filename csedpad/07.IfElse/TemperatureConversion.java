/**
 * author: Priti Oli
 * topic: If-else condition
 * subTopic: getting familiar with if-else condition
 * goalDescription: Conversion of temperature from one scale to the other.
 * source: N/A
 * output: temperature : temperature : 100.00  deg  C
 * temperature : 212.00  deg  F
 */
public class TemperatureConversion
{
    public static void main( String[] args )
    {
        /**
         * logical_step_1: Specify the current temperature scale, current temperature and initialise a variable to store the value
         * of converted temperature
         * logical_step_details: Specify the current temperautre scale as variable scale, current temperature as variable temp
         * and varible tempConverted to store the value of converted temperaute
         * question_1: What does the following block of code do?
         * answer_1: The code specifies the current temperature scale, current temerature and convertedtemperature value.
         * question_2: what is value of the variable scale?
         * answer_2: the value of the variable scale is 'C'
         * question_3: what is the data type of the variable scale?
         * answer_3: the variable scale is a character
         * question_4: what is the value of the variable temp?
         * answer_4: the value of the variable temp is 100
         * question_5: what is the data type of the variable temp?
         * answer_5: variable temp is a double

         */

        char scale='C';
        double temp=100;
        double tempConverted=0.0;

        /**
         * logical_step_2: Convert the temperature from one scale to another
         * logical_step_details: Check the current scale(celcius or fahrenheight) and convert from current scale to the other scale
         * question_1: What does the following code block do?
         * answer_1: Convert the temperature from one scale to another
         * question_2: What does the if statement do with respect to the scale?
         * answer_2: It checks if the value of the scale is  equal to 'C' or not.
         * question_3: When does the else-if branch execute?
         * answer_3: If the value of  scale is equal to 'F' then the else-if branch is executed
         * question_4: What is the output of the following block of code. (hint: 100 deg Celsius = 212 deg Fahrenheit'?
         * answer_4: temperature : 100.00  deg  C
         * question_5: What will be the output if scale='X'?
         * answer_5: Not a valid temperature scale
         */


        System.out.printf("temperature : %.2f %s %c", temp," deg ",scale);

        /**
         * stm_comment: The temperature is converted from one scale to scale. Because the current scale is in celcius,
         * the temperature(100) in degree celcius is converted to degree fahreheit.
         *question_1:Please eplain what does the following if-else statemnte does?
         *answer_1:  The temperature is converted from one scale to scale. Because the current scale is in celcius,
         * the temperature(100) in degree celcius is converted to degree fahreheit.
         */

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
