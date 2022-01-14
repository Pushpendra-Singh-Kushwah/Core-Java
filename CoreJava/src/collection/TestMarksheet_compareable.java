package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestMarksheet_compareable {

	public static void main(String[] args) {
		Marksheet_222 a = new Marksheet_222("02", "Pushpendra", 80, 85, 90);
		Marksheet_222 b = new Marksheet_222("01", "Anshu", 81, 82, 83);
		Marksheet_222 c = new Marksheet_222("03", "Gauri", 96, 94, 93);
		Marksheet_222 d = new Marksheet_222("05", "Aaradhya", 96, 93, 90);
		Marksheet_222 e = new Marksheet_222("04", "Shiva", 90, 95, 99);

		ArrayList<Marksheet_222> al = new ArrayList<Marksheet_222>();
		al.add(a);
		al.add(b);
		al.add(c);
		al.add(d);
		al.add(e);

		Collections.sort(al);// it sort on the basis of unique values;

		Iterator it = al.iterator();
		while (it.hasNext()) {
			Marksheet_222 o = (Marksheet_222) it.next();
			System.out.println(o.getRollNo() + " " + o.getName() + " " + o.getPhysics() + " " + o.getChemistry() + " "
					+ o.getMaths());

		}

		Collections.sort(al, new Test_Comparator()); // 

		Iterator cptr = al.iterator();
		while (cptr.hasNext()) {
			Marksheet_222 o = (Marksheet_222) cptr.next();
			System.out.println(o.getRollNo() + " " + o.getName() + " " + o.getPhysics() + " " + o.getChemistry() + " "
					+ o.getMaths());

		}

	}
}
