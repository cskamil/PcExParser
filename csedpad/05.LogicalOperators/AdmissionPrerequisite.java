/**
 * author: Priti Oli, Rabin Banjade
 * topic: Logical Operators
 * subtopics: Demonstration of different logical operators in java
 * goalDescription: This program checks the eligibility of a student to enroll in a university
 * by checking the prerequisite
 * source: N/A
 * input: N/A
 * output: Your eligibility requirement has been evaluated to : true
 */

public class AdmissionPrerequisite {

    public static void main(String args[]) {

        /*
         * logical_step1: Specify if an applicant has score for SAT, high school transcript and toefl score. Also,
         * specify if the applicant is an international student.
         * logical_step_details: Declare variable hasSATscore to store true or false value on whether a person has
         * SAT score or not, hasHighSchoolTranscript is used to check if an applicant has high school transcript,
         * isInternational is used to check if an applicant is an international student and hasTOEFL is used to check
         * if an applicant has toefl score
         * question_1: What does the following block of code do?
         * answer 1: Specify if an applicant has score for SAT, high school transcript and toefl score. Also,
         * specify if the applicant is an international student.
         * question_2: What is the value of the variable hasHighSchoolTranscript?
         * answer 2: hasHighSchoolTranscript has a value true
         * question_3: What is the data type of the variable isInternational?
         * answer 3: isInternational is a Boolean data type
         */
        boolean hasSATscore = true;
        boolean hasHighSchoolTranscript = true;
        boolean isInternational=false;
        boolean hasTOFELscore=false;

        /*
         * logical_step2: Check if the applicant is eligible to apply to the university
         * logical_step_details: the applicant must have a SAT score, a high school transcript and must have TOEFL score
         * if is an international student.
         * question_1: What does the following block of code do?
         * answer 1:  Check if the applicant is eligible to apply to the university
         * question_2: What is the data type of the variable isElig?
         * answer 2: isElig is a Boolean data type
         * question_3: What is the value of: !isInternational. (value assigned above)
         * answer_3: the value of  !isInternational is true
         * question_4: What is the output the following block of code?
         * answer_4: the code displays the following statement "You eligibility requirement has been evaluated to :true"
         */

        /*
         * stm_comment: isElig contains result of logical operation between the variables. logical and (&&), logical or(||) and not operator is used 
         * question_1: Please explain how the value of isElig evaluated.
         * answer_1: isElig contains result of logical operation between the variables
         * question_2: Please state the operators used in the code block below.
         * answer_2: logical and (&&), logical or(||) and not operator is used .
         *
         */

        boolean isElig = hasSATscore && hasHighSchoolTranscript && (!isInternational || (isInternational && hasTOFELscore));
        System.out.println(" Your eligibility requirement has been evaluated to :" +isElig );


    }

}
