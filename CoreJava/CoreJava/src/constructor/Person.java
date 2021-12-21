package constructor;

public class Person {

	public String firstname;
	public String lastname;
	public String address;

	public Person() {
		System.out.println("this is defualt constructor for person");
	}

	public Person(String fn, String Ln) {

		firstname = fn;
		lastname = Ln;

		System.out.println("2 parameter constructor for person");
	}

	public Person(String fn, String Ln, String address) {

		this(fn, Ln);
		this.address = address;

		System.out.println(" 3 parameter constructor");

	}

	public static void main(String[] args) {

		Person abc = new Person("Pushpendra", "Kushwah");
		Person xyz = new Person("Pushpendra", "Kushwah", "Gwalior");
		
		System.out.println(abc.firstname);
		System.out.println(abc.lastname);
		System.out.println(xyz.address);
	}

}
