public class UnboxingExample {
	public static void main(String args[]){
		Character ch ='s';

		//Unboxing - Character object to primitive conversion 
		char s = ch;

		Integer a = 5;
		
		//Converting Integer to int explicitly 
		int first = a.intValue();
		
		//Unboxing now compiler will write a.intValue() internally
		int second =first ;
		
		System.out.println(a);
		System.out.println(first);
		System.out.println(second);
	}
}

