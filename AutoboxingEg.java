public class AutoboxingEg {
	public static void main (String args[]){
		char ch ='s';

		//Autoboxing - primitive to Character object conversion 
		Character s =ch;

		int a = 50;

		//Converting int into integer explicity 
		Integer first  = Integer.valueOf(a);

		//Autoboxing, now compiler will write Integer.valueOf(a) internally and hence 
		//doesn't generate an error
		Integer second = a ;

		System.out.println(a);
		System.out.println(first);
		System.out.println(second);
	}
}

