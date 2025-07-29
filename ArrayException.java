public class ArrayException{
	public  static void main (String[] args){
		//declaring and initializing an array 
		int myArray[] =new int[5];
		
		myArray[0] = 3;
		myArray[1] = 6;
		myArray[2] = 9;
		myArray[4] = 12; 

		for (int i : myArray)
			System.out.println(i);
	}
}
