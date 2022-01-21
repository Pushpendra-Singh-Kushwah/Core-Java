package oop;

public class TestShallowCloning {
	public static void main(String[] args) throws Exception {
		AccountShallowClone sl1 = new AccountShallowClone();
		sl1.setBal(1000);
		sl1.setType("Current");
		
		CustomerShallowClone sl2 = new CustomerShallowClone();
		sl2.setId(101);
		sl2.setName("Pushpendra Singh Kushwah");
		sl2.setAcc(sl1);
		
		CustomerShallowClone sl3 = (CustomerShallowClone) sl2.clone();
		
		System.out.println(sl2.getId() + sl2.getName() + sl2.getAcc().getBal());
		
		System.out.println(sl3.getId() + sl3.getName() + sl3.getAcc().getBal());
	}
}
