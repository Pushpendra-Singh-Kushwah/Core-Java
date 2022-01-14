package collection;

import java.util.Comparator;

public class Test_Comparator implements Comparator<Marksheet_222>{

	@Override
	public int compare(Marksheet_222 o1, Marksheet_222 o2) {
		if (o1.getName()!=o2.getName()) {
			return o1.getName().compareTo(o2.getName());
		} else {
				return o1.getRollNo().compareTo(o2.getRollNo());
		} 
	}
}
