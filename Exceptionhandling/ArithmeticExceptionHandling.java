package Exceptionhandling;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("test case 1");
		System.out.println("test case 2");
		try
		{
		int a=10/0;
		System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("test case 3");
		System.out.println("test case 4");
		System.out.println("test case 5");
	}

}
