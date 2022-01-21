package datetimeex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeEx1 {
	
	private Date dob;
	
	public void getDob() {
			System.out.println(dob);
		}
		public void setDob(Date dob) {
			
			this.dob = dob;
		}
		
	public static void main(String[] args) throws Exception {
		
		String year = "2019";
		int year1 = Integer.parseInt(year);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date d = new Date();
		String str = sdf.format(d);
		System.out.println(str);
		int a = Integer.parseInt(str);
		int count = 0;
		while (year1!=a) {
			year1++;
			count++;
		}
		System.out.println(count);
		
		/*DateTimeEx1 age = new DateTimeEx1();
		
		SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
		age.setDob((Date) format.parse("17/10/2019"));
		age.getDob();*/
	}
}
