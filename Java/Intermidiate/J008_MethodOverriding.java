

class Polygon {
    void displayInfo() {
        System.out.println("A polygon is a two dimensional shape with straight lines.");
    }

    int getPerimeter(int[] sides) {
        int perimeter = 0;
        // find sum of all sides
        for (int side : sides) {
            perimeter = perimeter + side;
        }

        return perimeter;
    }
}

class Triangle extends Polygon {
    void displayInfo() {
        System.out.println("A triangle is a polygon with 3 sides.");
    }
}

public class J008_MethodOverriding {
    public static void main(String[] args) {
        
        // create an object of Triangle
        Triangle t1 = new Triangle();

        // sides of triangle
        int[] triangleSides = {8, 5, 11};

        // call displayInfo() method
        t1.displayInfo();

        // call getPerimeter using t1
        int perimeter = t1.getPerimeter(triangleSides);
        System.out.println("Triangle Perimeter: " + perimeter);

    }
}
