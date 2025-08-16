//Interface declaration : by first user 
interface Drawable{
	void draw();
}

//Implemention : by second user
class Rectangle implements Drawable{
	public void draw(){
		System.out.println("Drawing rectangle");
	}
}

//Implemention : by third user
class Circle implements Drawable{	
	public void draw(){
		System.out.println("Drawing circle");
	}
}

public class TestInterFace1{
	public static void main(String[] args){
		Drawable c = new Circle();
		Drawable r = new Rectangle();
		r.draw();
		c.draw();
	}
}
