class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running safely");
    }
}

public class overriding {
    public static void main(String[] args) {
        Vehicle obj1 = new Car(); 
        obj1.run();  
        Vehicle obj2 = new Vehicle(); 
        obj2.run();
   }
}
