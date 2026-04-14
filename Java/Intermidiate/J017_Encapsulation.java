
class Rectangle3 {

    // fields to calculate area
    int length;
    int breadth;

    // constructor to initialize length/breadth
    Rectangle3(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class J017_Encapsulation {
    public static void main(String[] args) {
        
        // initialize value of length and breadth
        Rectangle3 obj = new Rectangle3(12, 9);

        // calculate the area
        obj.calculateArea(); 
    }
}

// Output:
// Area: 108