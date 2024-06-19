package Exceptionhandling;

class finallyprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test 1");
		System.out.println("test 2");
		try
		{
			int a=10/0;
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("test 3");
		System.out.println("test 4");
	}

}
