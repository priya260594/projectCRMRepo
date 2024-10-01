package Exceptionhandling;

public class StringOutOfBoundsException {
	public static void main(String[] args) {
		String s="java";
		try {
			System.out.println(s.charAt(99));
		}
		catch(StringIndexOutOfBoundsException e) {
			
		System.out.println("exception handled");
		
		}
		
	}

}
