import java.util.Scanner;
public class ScannerDemo
{
	public static void main (String arge[]) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your name :");
		String name = s.nextLine();
		System.out.print("Enter your gender :");
		char gender = s.nextLine().charAt(0);
		System.out.print("Enter your age :");
		int age = s.nextInt();
		System.out.print("Enter your mobile number :");
		long mobileNo = s.nextLong();
		System.out.print("Enter your CGPA :");
		double cgpa = s.nextDouble();
		System.out.println("## === Personal details === ##\n");
		System.out.println("Name :"+name);
		System.out.println("Gender :"+gender);
		System.out.println("Age :"+age);
		System.out.println("Mobile No :"+mobileNo);
		System.out.println("CGPA  :"+cgpa);
	}
}
