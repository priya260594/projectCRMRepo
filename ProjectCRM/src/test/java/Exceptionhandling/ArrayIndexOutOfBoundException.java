package Exceptionhandling;

public class ArrayIndexOutOfBoundException {
public static void main(String[] args) {
	String[]a= {"apple","mango","banana","pineapple"};
	try {
	System.out.println(a[4]);
	}
	catch(ArrayIndexOutOfBoundsException e) 
	{
		System.out.println("exception handled");
	}
}
}
