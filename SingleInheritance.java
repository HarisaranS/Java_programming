class Person {
	String name = "Sakthi";
	public void show(){
		System.out.println("Student inheriting properties from Person");
	}

	//child class
	class Student extends Person {
		//defining additional properties to child class
		String course = "OOP with Java";
		
