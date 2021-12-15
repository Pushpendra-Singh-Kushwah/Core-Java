package constructor;

public class Employee extends Person {

	private String designation;

	public Employee() {
		System.out.println("this is default constructor for the Employee");
	}

	public Employee(String fn, String Ln, String designation) {

		super(fn, Ln);
		this.designation = designation;
		System.out.println("this is default constructor for the Employee");
	}

	public static void main(String[] args) {

		Employee check = new Employee("Pushpendra", "Kushwah", "Trainee");

		System.out.println(check.firstname);
		System.out.println(check.lastname);
		System.out.println(check.designation);
		
	

	}
}
