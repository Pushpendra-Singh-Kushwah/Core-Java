package collection;

import java.util.ArrayList;
import java.util.List;

public class Marksheet_222 implements Comparable<Marksheet_222>{
	
	private String rollNo;
	private String name;
	private int physics;
	private int chemistry;
	private int maths;
	
	public Marksheet_222() {}
	public Marksheet_222(String rollNo, String name, int physics, int chemistry, int maths){
		this.rollNo = rollNo;
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}
	
	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Marksheet_222 o ) {
		return this.rollNo.compareTo(o.rollNo);  // method call and return 
	}												// this is option here
}
