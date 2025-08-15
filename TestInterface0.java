interface printable{
	void print();
}

public class TestInterface0 implements printable{
	public void print(){
		System.out.println("Hello");
	}

	public static void main(String args[]){
		TestInterface0 obj = new TestInterface0();
		obj.print();
	}
}
