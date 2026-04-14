
class Addition {
    
    // method with two parameters
    void add(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("Sum of 2 digits: " + sum);
    }
    
    // method with 3 parameters
    void add(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        System.out.println("Sum of 3 digits: " + sum);
    }
}

class J015_MethodOverloading {
    public static void main(String[] args) {
        
        Addition obj = new Addition();
        
        // call method with 2 arguments
        obj.add(5, 1);
        
        // call method with 3 arguments
        obj.add(9, 11, 6);
    }
}