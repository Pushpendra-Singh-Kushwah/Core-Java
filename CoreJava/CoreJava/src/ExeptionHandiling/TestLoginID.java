package ExeptionHandiling;

public class TestLoginID {
	public static void main(String[] args) throws LoginExeption {

		String login = "Mark@gmail.com";
		String password = "dukerberg";

		LoginClass loginClass = new LoginClass();
		loginClass.setLoginID("Mark@gmail.com");
		loginClass.setPassword("ZukerBerg");

		if (login.equals(loginClass.getLoginID()) && login.equals(loginClass.getPassword())) {
			System.out.println("login successful");

		} else {
			LoginExeption z = new LoginExeption("error in Login ...plz try again");
			throw z;
		}

	}

}
