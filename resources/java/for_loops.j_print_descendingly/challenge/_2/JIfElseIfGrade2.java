import java.util.Scanner;
public class JIfElseIfGrade2 {
    public static void main(String[] args) {
        //Step 1: Read the letter grade
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a grade letter in uppercase: ");
        String grade = scan.next();
        scan.close();
        //Step 2: Determine and print the numeric range for the input letter grade
        if (grade.equals("A")) {
            System.out.println("Score is greater than or equal 90.");
        } else if (grade.equals("B")) {
            System.out.println("Score is in range [80-90).");
        } else if (grade.equals("C")) {
            System.out.println("Score is in range [70-80).");
        } else if (grade.equals("D")) {
            System.out.println("Score is in range [60-70).");
        } else {
            System.out.println("Score is below 60.");
        }
    }
}