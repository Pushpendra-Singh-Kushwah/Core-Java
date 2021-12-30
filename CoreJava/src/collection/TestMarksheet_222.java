package collection;

import java.util.ArrayList;
import java.util.List;

public class TestMarksheet_222 {
	
	public static void main(String[] args) {
		
		List i = new ArrayList();
		Marksheet_222 m1 = new Marksheet_222();
		m1.setRollNo("rn 101");
		m1.setChemistry(95);
		m1.setMaths(80);
		m1.setPhysics(90);
		
		i.add(m1);
		
		Marksheet_222 m2 = new Marksheet_222();
		m2.setRollNo("rn 102");
		m2.setChemistry(55);
		m2.setMaths(45);
		m2.setPhysics(35);
		
		i.add(m2);
		
		
		
	}

}
