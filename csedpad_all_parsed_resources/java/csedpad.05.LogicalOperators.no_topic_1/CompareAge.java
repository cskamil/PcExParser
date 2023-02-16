/**
@goalDescription(Given the age of 3 individuals, this program compares their ages in order to check whether any two individuals are of the same age.)
**/
public class CompareAge {
    public static void main (String[] args){
//Specify the age of 3 people
        int Tom = 40, Nick=50, Harry=40;

//compare the age of Tom Nick and Harry to see if any of them are of same age.
/**@helpDescription(The '==' operator is used to compare the value of two variables. if the value of the two variables are equal, the expression evaluates to True else False question1: Please explain what does the '==' operator do. answer_1: The '==' operator in the code block below compares the two values on two sides of the operand)**/
        System.out.println("Tom is tha same age as  Nick:"+(Tom==Nick ));
        System.out.println("Nick is tha same age as  Harry:"+(Nick==Harry ));
        System.out.println("Tom is tha same age as  Harry:"+(Tom==Nick ));


    }

}
