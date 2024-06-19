package Exceptionhandling;

public class throwExceptiondemo {

	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("You are age is not valid");
		}
		else
		{
			System.out.println("yes ! your age  is valid ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(17);
	}
	


}
