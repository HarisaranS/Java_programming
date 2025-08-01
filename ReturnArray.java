public class ReturnArray{
	//defined function to find max number from an array
	public static int[] doMultiplication(int[] arr){
		for (int i=0;i<arr.length ;i++){
			arr[i] = arr[i] * 2 ;
		}
		return arr;
	}

	public static void main (String[] args){
		//declaring and initialisng an array
		int myArray[] = {1,2,3,4,5};
		
		//call function by passing attay in it 
		int[] multiplyArr = doMultiplication(myArray);
		
		//print array
		System.out.println("Array multiply 2 is ");
		
		for (int i : multiplyArr)
			System.out.println(i + " ");
	}
}	
