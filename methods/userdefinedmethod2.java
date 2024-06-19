package methods;

public class userdefinedmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		withdraw(10000, 2000);
     	deposite(10000, 5000);
	}
	
	public static void withdraw(int bal,int value)
	{
		bal=bal-value;
		System.out.println(bal);
	}
	public static void deposite(int bal,int value)
	{
		int dep=bal+value;
		System.out.println(dep);
	}
	

}
