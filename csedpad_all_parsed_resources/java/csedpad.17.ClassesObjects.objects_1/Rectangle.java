/**
@goalDescription(This program creates a rectangle object and calculates its area.)
**/
public class Rectangle {
//Declare the variables needed to store the height and width of a Rectangle.
    private float height;
    private float width;
//Defines a constructor method
    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

//Define getter methods for height and width.
    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

//Difines method to caculate area of rectangle.
    public float calculateArea() {
        float area = this.height * this.width;
        return area;
    }

    public static void main(String[] args) {
//Create a Rectangle object.
/**@helpDescription(declares object myBox and invokes constructors with values of 2 and 5. question_1: What is declared by the following statement? answer_1: The statement declares object myBox. question_2: What value are passed to constructor? answer_2: 2,5)**/
        Rectangle myBox = new Rectangle(2, 5);
//Calculate the area of current rectangle object and print the value of area.
/**@helpDescription(Call method calculateArea question_1: What does the following statment do? answer_1:  Call method calculateArea)**/
        float area = myBox.calculateArea();
        System.out.println("Area : " + area);
    }
}
