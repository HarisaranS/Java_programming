import java.util.Scanner;
public class grade_System{
	public static void main (String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = s.nextLine();
		System.out.print("Enter your dept :");
		String dept = s.nextLine();
		System.out.print("Enter your id :");
		int id = s.nextInt();
		System.out.print("Enter your Gender(M/F):");
		char gen = s.next().charAt(0);
		System.out.println("Enter your Exam Details below ..\n");
		System.out.print("Enter your Java marks :");
		int java =s.nextInt();
		System.out.print("Enter your DBMS marks :");
                int DBMS =s.nextInt();
		System.out.print("Enter your DSA marks :");
                int DSA =s.nextInt();
		System.out.print("Enter your Python  marks :");
                int py =s.nextInt();
		System.out.print("Enter your C++  marks :");
                int C =s.nextInt();
		int Total = java+DBMS+DSA+py+C;
		double score  =Total/5.0;

		System.out.println("## ====== Grade System ====== ##\n");
		System.out.println("Java : "+java);
		System.out.println("DBMS : "+DBMS);
		System.out.println("DSA  : "+DSA);
		System.out.println("Python : "+py);
		System.out.println("CPP  : "+C+"\n");
		System.out.println("Total : "+Total);
		System.out.println("Average : "+score);
		System.out.print("Grade : ");	
		if (score >= 90.0)
			System.out.println('A');
		else if (score >= 80.0)
			System.out.println('B');
		else if (score >= 70.0)
			System.out.println('C');
		else if (score >= 60.0)
			System.out.println('D');
		else 
			System.out.println('F');
	}
}
			
