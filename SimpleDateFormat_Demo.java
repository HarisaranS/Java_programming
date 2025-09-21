import java.text.*;
import java.util.Calendar;

public class SimplerDateFormat_Demo{
	public static void main(String[] args) throws InterruptedException{ 

		SimpleDateFormat SDFormat = new SimpleDateFormat("MM/ dd/ yy");

		try{
			Calendar cal = Calendar.getInstance();

			//USe of .parse() method to parse
			//Date rom String 
			String dt = "01/ 29/ 19";
			System.out.println("The unparsed" + " string is: " + dt);
			cal.setTime(SDFormat.parse(dt));
			System.out.println("Time parsed: " + cal.getTime());

		}
		catch (ParseException except){
			except.printStackTrace();
		}
	}
}
