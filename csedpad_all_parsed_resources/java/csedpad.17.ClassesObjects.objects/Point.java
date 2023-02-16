/**
@goalDescription(This program shifts the x and y coordiantes by a given amount.)
**/
public class Point {
//Declare variables needed to store X and Y coordinates of point.
    private int x;
    private int y;
//Define getter and setter methods point x and y.
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

//Declare the method called 'translate' to shift this point's location by the given amount.
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
	public static void main(String[] args) {
//Createe an Object point by instantiating class Point and sets x and y values.
        Point point = new Point();
        point.setX(7);
        point.setY(2);
//Tanslate the value of x and y by given amount and prints new coordinates.
/**@helpDescription(class the method translate of the point object.)**/
        point.translate(11, 6);
        System.out.println("The new coordinates: (" + point.getX() + ", " + point.getY() + ")");
	}
}

