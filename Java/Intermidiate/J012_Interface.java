
interface Animal {

    abstract public void play(); 
    abstract public void makeSound();
}

class Dog implements Animal {

    // implement play()
    public void play() {
        System.out.println("I play ball fetch");
    }

    // implement makeSound()
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class J012_Interface {
    public static void main(String[] args) {
        
        // object of Dog
        Dog dog = new Dog();
        
        // access abstract methods
        dog.play();
        dog.makeSound();
    }
}