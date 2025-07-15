import java.util.Scanner;
public class largest_num
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 number :");
		int one  = input.nextInt();
		int two  = input.nextInt();
		int three = input.nextInt();
		if (one > two && one > three)
			System.out.println(one +" is the greatest number");
		else if (two > one && two >three)
			System.out.println(two +" is the greatest number");
		else
			System.out.println(three +" is the greater number");
	}
}
			
