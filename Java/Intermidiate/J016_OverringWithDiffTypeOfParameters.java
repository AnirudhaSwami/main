
class Addition1 {
    
    // method with integer parameters
    int add(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }
    
    // method with double parameters
    double add(double number1, double number2) {
        double sum = number1 + number2;
        return sum;
    }
}

class J016_OverringWithDiffTypeOfParameters {
    public static void main(String[] args) {
        
        Addition1 obj = new Addition1();
        
        // call method with integer arguments
        int sum1 = obj.add(12, 9);
        System.out.println("Sum of integers: " + sum1);
        
        // call method with double arguments
        double sum2 = obj.add(32.8, 11.6);
        System.out.println("Sum of doubles: " + sum2);
    }
}