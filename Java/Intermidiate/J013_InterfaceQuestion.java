// Replace ___ with your code
import java.util.Scanner;

interface Polygon2 {
    // abstract method
    abstract public void getArea(double base, double height);
}

// implement Polygon
class Triangle2 implements Polygon2 {
    
    // provide implementation for getArea
    // compute area using the formula on description and print it
    public void getArea(double base, double height){
        System.out.println(0.5 * base * height);
    };
}

class Main {
    public static void main(String[] args) {
        
        // object of Triangle class
        Triangle2 obj = new Triangle2();
        
        System.out.println("Enter base and height of the triangle:\n");
        // take input value for base and height
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        
        // find the area of triangle
        obj.getArea(base, height);
        input.close();
    }
}