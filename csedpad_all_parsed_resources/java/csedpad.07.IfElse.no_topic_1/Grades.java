/**
@goalDescription(Assign letter grades to a given score by comparing the test score with the test score range for a given grade)
**/
public class Grades {
    public static void main(String[] args) {
//Specify the test score

        int testScore = 90;
        char grade;

//assign the grade to a given test score.
/**@helpDescription(The if-else condition compares the testScore with different values and assigns an appopriate letter grade. Since the value of test score is 90, it is assigned. question_1: Please explain what does the follwoing if-else block do? answer_1: The if-else condition compares the testScore with different values and assigns an appopriate letter grade. Since the value of test score is 90, it is assigned to grade A.)**/
        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
