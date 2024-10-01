package Exceptionhandling;

public class LoginForm {
	public static void main(String[] args) {
		String user="admin";
		int password=123;
		if(user.equals("admin")) {
			if(password==1234) {
				System.out.println("login successful");
			}
			else {
				InvalidPasswordException e=new InvalidPasswordException();
				try {
				throw e;
				}
				catch(InvalidPasswordException e1) {
					System.out.println("invalid password");
				}
				
			}
		}
	}

}
