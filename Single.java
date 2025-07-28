public class Single{
	public static void main (String[] args){
		//declaring and initializing an array
		String strArray[] ={"Python","java","C++","C","PHP"};

		//using a for each loop for printing the array
		for (String i : strArray){
			System.out.println(i + " ");
		}

		//find the length of the array 
		System.out.println("Length of array : "+ strArray.length);
	}
}
