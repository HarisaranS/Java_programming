public class ManualConversion
{
	public static void main(String[] args)
	{
		double d = 100.04;
		long l = (long)d;
		int i = (int)l;
		char c = (char)i;
		System.out.println("Double :"+d);
		System.out.println("Long :"+l);
		System.out.println("Int :"+i);
		System.out.println("Char :"+c);
	}
}

