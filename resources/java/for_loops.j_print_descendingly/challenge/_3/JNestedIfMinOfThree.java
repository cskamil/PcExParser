import java.util.Scanner;
public class JNestedIfMinOfThree
{
    public static void main (String[] args)
    {
        //Step 1: Read the three integers
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter three integers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.close();
        //Step 2: Determine the minimum integer
        int min;
        if (num1 < num2) {
            if (num1 < num3) {
                min = num1;
            } else {
                min = num3;
            }
        } else {
            if (num2 < num3) {
                min = num2;
            } else {
                min = num3;
            }
        }
        //Step 3: Print the minimum integer
        System.out.println ("Minimum value: " + min);
    }
}