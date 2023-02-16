
/**
 * author: Scott Fleming
 * topics: methods
 * subtopics: declaring a static method, calling a static method, passing arguments to a method invocation, getting the value returned by a method invocation
 * goalDescription: Calculate and display different measurements regarding the shape of the sun, the earth, and the moon, including the circumference, the surface area, and the volume of each.
 * source: N/A
 * input: N/A
 * output: === Sun ===
 * Radius: 432690 miles
 * Circumference: 2718671 miles
 * Surface Area: 2352683899889 square miles
 * Volume: 339327598880943100 cubic miles
 * 
 * === Earth ===
 * Radius: 3959 miles
 * Circumference: 24874 miles
 * Surface Area: 196941385 square miles
 * Volume: 259883851297 cubic miles
 * 
 * === Moon ===
 * Radius: 1079 miles
 * Circumference: 6782 miles
 * Surface Area: 14641133 square miles
 * Volume: 5267879723 cubic miles
 */

public class SunEarthMoonShapeCalculator {

    /**
     * logical_step_1: Define a three methods that calculate the circumference of a sphere, the surface area of a sphere, and the volume of a sphere, respectively, based on the radius of the sphere.
     * logical_step_details: Three methods are defined for calculating different measurements of a sphere. We define these calculations as methods, because we will be performing each of these calculations multiple times for different spheres (the sun, earth, and moon). Thus, we prefer to define each calculation only once rather than writing each calculation multiple times. The methods are declared as `public`, so they can be called from both inside and outside the class definition (although in this example, they will be called only from within the class definition). A `circumference` method is defined that can compute the circumference of a sphere; a `surfaceArea` method is defined that can compute the surface area of a sphere; and a `volume` method is defined that can compute the volume of a sphere. Each of the methods accepts a `radius` argument that is the value of the radius of the sphere. Each of the methods has a return type of `double` because each will return a calculated decimal value. Each of the methods is declared `static`, because none of the methods are meant to have a corresponding class object. Each of the methods performs its calculation inline with a `return` statement.
     */
    public static double circumference(double radius) {
        return 2.0 * Math.PI * radius;
    }

    public static double surfaceArea(double radius) {
        return 4.0 * Math.PI * Math.pow(radius, 2.0);
    }

    public static double volume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
    }

    /**
     * logical_step_2: Define a method that prints the shape info for a sphere.
     * logical_step_details: A `printShapeInfo` method is defined to display the shape information (radius, circumference, surface area, and volume) for a shape. The accepts two arguments: a `name` string that will be used as a label and a `radius` decimal number that is the radius of the sphere (units are miles). The return type of the method is `void`, because it only prints information to the console, but does not return any values. The method is declared as `public`, so it can be called from both inside and outside the class definition (although in this example, it will be called only from within the class definition).
     */
    public static void printShapeInfo(String name, double radius) {
        /**
         * logical_step_3: Compute the circumference, surface area, and volume of the sphere, and store each value in a variable.
         * logical_step_details: Three local variables (`sphereCircumference`, `sphereSurfaceArea`, and `sphereVolume` are declared and initialized. The methods defined above to calculate the circumference, surface-area, and volume measurements of a sphere are used to calculate the value to be assigned to each variable.
         */
        double sphereCircumference = circumference(radius);
        double sphereSurfaceArea = surfaceArea(radius);
        double sphereVolume = volume(radius);

        /**
         * logical_step_4: Print the shape information to the console.
         * logical_step_details: A series of print statements display the sphere name and shape data to the console (stdout). When the decimal values are printed, they are rounded to the nearest whole number (using the `System.out.format` method).
         */
        System.out.println("=== " + name + " ===");
        System.out.format("Radius: %.0f miles\n", radius);
        System.out.format("Circumference: %.0f miles\n", sphereCircumference);
        System.out.format("Surface Area: %.0f square miles\n", sphereSurfaceArea);
        System.out.format("Volume: %.0f cubic miles\n\n", sphereVolume);
    }

    /**
     * logical_step_5: Define a `main` method that uses the above methods to perform the program's goal of printing shape information for the sun, earth, and moon.
     * logical_step_details: A `main` method is defined that declares the radii for the sun, earth, and moon, and uses the above `printShapeInfo` method to display the shape data for each.
     */
    public static void main(String[] args) {
        /**
         * logical_step_6: Declare variables to hold the names and radii of the sun, earth, and moon.
         * logical_step_details: For each of the sun, earth, and moon, declare a `-Name` variable (e.g., `sunName`) that is initialized with the name of the sphere, and declare a `-Radius` variable (e.g., `sunRadius`) that is initialized with the radius (in miles) of the sphere.
         */
        String sunName = "Sun";
        double sunRadius = 432690.0;
        String earthName = "Earth";
        double earthRadius = 3958.8;
        String moonName = "Moon";
        double moonRadius = 1079.4;

        /**
         * logical_step_7: Print the shape info for each sphere (sun, earth, and moon).
         * logical_step_details: For each of the sun, earth, and moon, call the `printShapeInfo` method that displays the shape information for the sphere. Each call to `printShapeInfo` is passed an argument that holds the name of the sphere (e.g., `sunName`) and an argument that holds the radius of the sphere (e.g., `sunRadius`).
         */
        printShapeInfo(sunName, sunRadius);
        printShapeInfo(earthName, earthRadius);
        printShapeInfo(moonName, moonRadius);
    }

}
