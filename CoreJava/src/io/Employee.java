package io;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String fName;
	private String lName;
	private transient String psw= null;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	
	public Employee() {}
	public Employee(int id, String fName, String lName) {
		this.id=id;
		this.fName=fName;
		this.lName= lName;
	}
}
