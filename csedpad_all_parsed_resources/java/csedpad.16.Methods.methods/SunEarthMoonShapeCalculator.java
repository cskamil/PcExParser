/**
@goalDescription(Calculate and display different measurements regarding the shape of the sun, the earth, and the moon, including the circumference, the surface area, and the volume of each.)
**/
public class SunEarthMoonShapeCalculator {

//Define a three methods that calculate the circumference of a sphere, the surface area of a sphere, and the volume of a sphere, respectively, based on the radius of the sphere.
    public static double circumference(double radius) {
        return 2.0 * Math.PI * radius;
    }
    public static double surfaceArea(double radius) {
        return 4.0 * Math.PI * Math.pow(radius, 2.0);
    }

    public static double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
    }

//Define a method that prints the shape info for a sphere.
    public static void printShapeInfo(String name, double radius) {
//Compute the circumference, surface area, and volume of the sphere, and store each value in a variable.
        double sphereCircumference = circumference(radius);
        double sphereSurfaceArea = surfaceArea(radius);
        double sphereVolume = volume(radius);
//Print the shape information to the console.
        System.out.println("=== " + name + " ===");
        System.out.format("Radius: %.0f miles\n", radius);
        System.out.format("Circumference: %.0f miles\n", sphereCircumference);
        System.out.format("Surface Area: %.0f square miles\n", sphereSurfaceArea);
        System.out.format("Volume: %.0f cubic miles\n\n", sphereVolume);
    }
//Define a `main` method that uses the above methods to perform the program's goal of printing shape information for the sun, earth, and moon.
    public static void main(String[] args) {
//Declare variables to hold the names and radii of the sun, earth, and moon.
        String sunName = "Sun";
        double sunRadius = 432690.0;
        String earthName = "Earth";
        double earthRadius = 3958.8;
        String moonName = "Moon";
        double moonRadius = 1079.4;
//Print the shape info for each sphere (sun, earth, and moon).
        printShapeInfo(sunName, sunRadius);
        printShapeInfo(earthName, earthRadius);
        printShapeInfo(moonName, moonRadius);
    }
}
