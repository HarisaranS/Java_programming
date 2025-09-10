// Abstract parent class
abstract class Animal {
    // Abstract methods (no body)
    public abstract void animalSound();
    public abstract void eat();

    // Concrete method
    public void sleep(String animalName) {
        System.out.println(animalName + " Zzzz");
    }
}

// Subclass: Lion
abstract class Lion extends Animal {
    // Implement animalSound()
    public void animalSound() {
        System.out.println("The Lion Roars!");
    }
    // But still abstract because eat() is not implemented yet
}

// Subclass: LionCub
class LionCub extends Lion {
    // Implement eat()
    public void eat() {
        System.out.println("The Lion eats meat");
    }
}

// Main class
public class AbstractClass1 {
    public static void main(String[] args) {
        Animal myLion = new LionCub(); // Create a LionCub object
        myLion.animalSound();          // "The Lion Roars!"
        myLion.eat();                  // "The Lion eats meat"
        myLion.sleep("Lion");          // "Lion Zzzz"
    }
}

