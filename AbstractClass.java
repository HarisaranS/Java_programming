abstract class Animal {
    // Abstract method (must be implemented by subclasses)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass that implements the abstract method
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal myObj = new Dog(); // create Dog object using Animal reference
        myObj.animalSound();      // calls Dog's implementation
        myObj.sleep();            // calls Animal's concrete method
    }
}

