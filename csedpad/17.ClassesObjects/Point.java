/**
 * author: Lasang Tamang
 * topics: Objects
 * subtopics: Initalizing an object, accessing getter ans setter method, accessing methods
 * goalDescription: This program shifts the x and y coordiantes by a given amount.
 * source: http://pawscomp2.sis.pitt.edu/pcex/pcex_v2/index.html?lang=JAVA&set=objects.classes.point&v=201803162257
 * output: The new coordinates: (18, 8)
 */

public class Point {
    /**
     * logical_step_1: Declare variables needed to store X and Y coordinates of point.
     * logical_step_details: Declare variable x and variable y of integer type for holding x and y coordinates of point.
     * question_1: What does the following code block do?
     * answer_1: Declare variables needed to store X and Y coordinates of point.
     * question_2: What is data type for field X and Y?
     * answer_2: Integer.
     */
    private int x;
    private int y;

    /**
     * logical_step_2: Define getter and setter methods point x and y.
     * logical_step_details: setX and setY methods set the value of the x and y coordinates. getX and getY gets the value of the x and y coordinates.
     * question_1: What does the following code block do?
     * answer_1: Define getter and setter methods point x and y.
     * question_2: What does setX and setY method do?
     * answer_2: sets x and y values.
     * question_3: What does getX and getY method do?
     * answer_3: Accesses values of x and y.
     */
    public void setX(int newX) {
        this.x = newX;
    }
    public int getX() {
        return x;
    }

    public void setY(int newY) {
        this.y = newY;
    }
    public int getY() {
        return y;
    }

    /**
     * logical_step_3: Declare the method called 'translate' to shift this point's location by the given amount.
     * logical_step_details: Declares method for shifting x and y value by given amount. X is shifted by dx amount. y is shifted by dy amount.
     * question_1: What does the following code block do?
     * answer_1:  Declares the method 'translate' to shift this point's location by the given amount.
     * question_2: By what amount x and y are shifted?
     * answer_2: x is shifted by dx and y is shifted by dy.
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

	public static void main(String[] args) {
        /**
         * logical_step_4: Createe an Object point by instantiating class Point and sets x and y values.
         * logical_step_details:  Create an Object point by instantiating class Point and sets x and y values. 
         * The value of variables x is set to 7. The value of variable y is set to 2.
         * question_1: What does the following code block do?
         * answer_1: It creates an Object point by instantiating class Point and sets x and y values.
         * question_2: What value are the value of  x and y?
         * answer_2: 7, 2
         */
        Point point = new Point();
        /*stm_comment: This statement invokes the method setX of the point to set its x-coordinate to 7.*/
        point.setX(7);
        point.setY(2);

        /*
         * logical_step_5: Tanslate the value of x and y by given amount and prints new coordinates.
         * logical_step_details:  Call the method translate which shifts x by 11 and y by 6. The final x and y coordinates printed after calling translate method is 18, 8.
         * question_1: What does the following code block do?
         * answer_1: Tanslates the value of x and y by given amount and prints new coordinates.
         * question_2: What is the value of x and y coordinates after calling translate method?
         * answer_2: 18,8
         */
        /**
         * stm_comment: class the method translate of the point object.
         */
        point.translate(11, 6);
        System.out.println("The new coordinates: (" + point.getX() + ", " + point.getY() + ")");

	}
}

