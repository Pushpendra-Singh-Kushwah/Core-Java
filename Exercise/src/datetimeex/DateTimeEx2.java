package datetimeex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeEx2 {
	public static void main(String[] args) throws Exception {
		
		String str = "17/10/2019";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		Date d = (Date) sdf.parse(str);
		String s = (String) sdf.format(d);
		System.out.println(d); // print date in Date format
		System.out.println(s); // print date in strings format
		
		for (int i = 1; i <= 12; i++) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(d);
			cal.add(Calendar.DATE, 30);
			System.out.println(i +"  Service:  " + cal.getTime());
			d=cal.getTime();
		}
	}
}
