package oop;

public class CustomerShallowClone implements Cloneable {
	
	private int id;
	private String name;
	private AccountShallowClone acc;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountShallowClone getAcc() {
		return acc;
	}

	public void setAcc(AccountShallowClone acc) {
		this.acc = acc;
	}
	
	
}
