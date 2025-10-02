import java.util.regex.*;

public class FindGroupEg{
	public static void main(String[] args){
		String text = "My numbers are 123 and 4567";

		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(text);

		while(m.find()){
			System.out.println("Found:" + m.group());
		}
	}
}
