

import java.util.Scanner;

// create a class named Greeting
class Greeting {

    void greet(String name){
        System.out.println("Hello "+name);
    }
}

//create a LocalGreeting class that inherits Greeting
class LocalGreeting extends Greeting {

    // override the greet() method
    public void greet(String name) {
        System.out.println("Namaste "+name);
    }
}

class J014_Polymorphism {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // take input for name
        String name = input.nextLine();

        // create object of Greeting class
        Greeting gr = new Greeting();
        // create object to LocalGreeting class
        LocalGreeting Lgr = new LocalGreeting();

        // call greet() method
        gr.greet(name);

       
        // call the overridden method
        Lgr.greet(name);

        input.close();
    }
}