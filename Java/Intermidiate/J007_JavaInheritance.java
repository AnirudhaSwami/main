
    
// Replace ___ with your code
class Vehicle {
    void getFeature() {
        System.out.println("Initializing vehicle features");
    }
}

// derive Car from Vehicle
class Car extends Vehicle{

}

// Main class
public class J007_JavaInheritance {
    public static void main(String[] args) {
        
        // create an object of Car
        Car cr = new Car();

        // access the getFeature method
        cr.getFeature();
    }
}