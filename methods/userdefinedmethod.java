package methods;

public class userdefinedmethod {

	public static void main(String[] args) {

		add();
		sub(60,10);
	}
	
	public static void add()
	{
		int a=70,b=10;
		int c=a+b;
		System.out.println(c);
	}
	
	public static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
		add();
	}

}
