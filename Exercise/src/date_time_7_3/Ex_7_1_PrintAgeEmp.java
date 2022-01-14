package date_time_7_3;

import java.util.Calendar;
import java.util.Date;

public class Ex_7_1_PrintAgeEmp {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
	}
}
