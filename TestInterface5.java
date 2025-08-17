interface Printable{
	void print();
}

interface Showable{
	void show();
}

class TestInterface5 implements Printable,Showable{
	public void print(){
		System.out.println("Hello");
	}

	public void show(){
		System.out.println("Welcome");
	}

	public static void main (String args[]){
		TestInterface5 obj = new TestInterface5();
		obj.print();
		obj.show();
	}
}


