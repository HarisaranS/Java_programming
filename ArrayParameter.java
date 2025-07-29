public class ArrayParameter {
	//defined function to find max number from an array
	public static int findMax(int[] arr){
		int max = arr[0];
		for (int i=1 ;i<arr.length;i++){
			if (max<arr[i]){
				max = arr[i];
			}
		}
		return max;
	}

	public static void main (String[] args){
		//declaring and initialising an array
		int myArray[] = {45,33,98,65,76,43,99,23,68};

		//call function by passsing array in it 
		int maxNumber = findMax(myArray);

		System.out.println("The max number is " +maxNumber);
	}
}
