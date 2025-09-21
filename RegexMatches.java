public class RegexMatches{
	public static void main(String[] args){
		System.out.println("hello123".matches("\\w+"));
		System.out.println("123".matches("\\d+"));
		System.out.println("abc!".matches("\\w+"));
	}
}
