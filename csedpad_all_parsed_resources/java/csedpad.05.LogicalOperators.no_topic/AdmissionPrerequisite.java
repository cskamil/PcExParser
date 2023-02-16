/**
@goalDescription(This program checks the eligibility of a student to enroll in a university by checking the prerequisite)
**/
public class AdmissionPrerequisite {

    public static void main(String args[]) {

//Specify if an applicant has score for SAT, high school transcript and toefl score. Also,
        boolean hasSATscore = true;
        boolean hasHighSchoolTranscript = true;
        boolean isInternational=false;
        boolean hasTOFELscore=false;
//Check if the applicant is eligible to apply to the university
/**@helpDescription(isElig contains result of logical operation between the variables. logical and (&&), logical or(||) and not operator is used question_1: Please explain how the value of isElig evaluated. answer_1: isElig contains result of logical operation between the variables question_2: Please state the operators used in the code block below. answer_2: logical and (&&), logical or(||) and not operator is used . )**/
        boolean isElig = hasSATscore && hasHighSchoolTranscript && (!isInternational || (isInternational && hasTOFELscore));
        System.out.println(" Your eligibility requirement has been evaluated to :" +isElig );


    }

}
