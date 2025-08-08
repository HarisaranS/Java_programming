class Automobile{
	//Constructor 
	Automobile(){
		System.out.println("Parent class constructor");
	}
}
class Bike extends Automobile{
	//Constructor
	Bike(){
		super();
		System.out.println("Child class constructor invoked");
	}
	//Instance Initializer block 
	{
		System.out.println("Instance initializer block is invoked");
	}
}

public class InitializerBlock{
	public static void main(String[] args){
		Bike b1 = new Bike();
	}
}

