abstract class Polygon1 {

    // abstract method 
    abstract void getArea();

    // non-abstract method
    public void printSides() {
        System.out.println("Print sides of Polygon.");
    }
}

class Rectangle extends Polygon1 {
    
    // implementation of abstract method
    void getArea() {
        System.out.println("Print the area of Rectangle.");
    }
}

class J011_AbstractClassMethod {
    public static void main(String[] args) {
        
        // create object of the child class
        Rectangle rectangle1 = new Rectangle();
        
        // access the non-abstract method
        rectangle1.printSides();
        
        // access the implemented abstract method
        rectangle1.getArea();
    }
}