/**
 * author: Lasang Tamang
 * topics: Objects
 * subtopics: Initializing an object, accessing methods
 * goalDescription: This program creates a rectangle object and calculates its area.
 * source: N/A
 * output: Area : 10.0
*/
public class Rectangle {
    /**
     * logical_step_1: Declare the variables needed to store the height and width of a Rectangle.
     * logical_step_details: Declare the variables heihg and width needed to store the height and width of a Rectangle. The type of both variables are private. 
     * question_1: What does the following code block do?
     * answer_1: Declares variables needed to store height and width of Rectangle.
     * question_2: What variables are declared?
     * answer_2: The private variable float height and width are declared.
     */
    private float height;
    private float width;
    /**
     * logical_step_2: Defines a constructor method 
     * logical_step_details: Defines a constructor method . The constructor method intialize the value of height and width for object of Rectangle.
     * question_1: What does the following code block do?
     * answer_1:  Defines a constructor method 
     * question_2: What does the constructor do?
     * answer_2: intialize the value of height and width for object of Rectangle.
     */

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    /**
     * logical_step_3: Define getter methods for height and width.
      * logical_step_details: Define getter methods for height and width. These method access height and width.
     * question_1: What does the following code block do?
     * answer_1: Defines getter methods.
     * question_2: What variables can be accessed?
     * answer_2: height and width.
     */

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    /**
     * logical_step_4: Difines method to caculate area of rectangle.
     * logical_step_details: Difines method to caculate area of rectangle. 
     * question_1: What does the following code block do?
     * answer_1: Difines method to caculate are of rectangle.
    */
    public float calculateArea() {
        float area = this.height * this.width;
        return area;
    }


    public static void main(String[] args) {
        /**
         * logical_step_5: Create a Rectangle object.
         * logical_step_details: Create a Rectangle object. The value of height is intialized to 2 and the value of width is intialized to 5.
         * question_1: What does the following code block do?
         * answer_1:  Creates a Rectangle object.
         * question_2: What is value of height?
         * answer_2: 2
         * question_3: What is value of width?
         * answer_3: 5
        */
        /**
         * stm_comment: declares object myBox and invokes constructors with values of 2 and 5.
         * question_1: What is declared by the following statement?
         * answer_1: The statement declares object myBox.
         * question_2: What value are passed to constructor?
         * answer_2: 2,5
         */
        Rectangle myBox = new Rectangle(2, 5);

        /*
         * logical_step_5: Calculate the area of current rectangle object and print the value of area.
         * logical_step_details:  Calculate the area of current rectangle object and print the value of area. The value of area is 10.
         * question_1: What does the following code block do?
         * answer_1: Calculate the area of current rectangle object and print the value of area. 
         * question_2: What is the value of area printed?
         * answer_2: 10
        */
        /**
         * stm_comment: Call method calculateArea 
         * question_1: What does the following statment do?
         * answer_1:  Call method calculateArea
        */
        float area = myBox.calculateArea();
        System.out.println("Area : " + area);
    }

}
