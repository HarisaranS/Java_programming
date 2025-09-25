import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterEg{
	public static void main(String[] args){
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before Formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");

		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);
	}
}

