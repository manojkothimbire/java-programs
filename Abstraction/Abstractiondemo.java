package Abstraction;

abstract class ATM
{
	abstract void withdraw();
	abstract void deposite();
	
	public void statement()
	{
		System.out.println("user can access the statement from ATm");
	}
	
}
class sbi extends ATM
{
	public void withdraw()
	{
		System.out.println("user can withdraw money from the their account");
		
	}
	public void deposite()
	{
		System.out.println("user can deposite monewy to their account");
	}
}

public class Abstractiondemo {

	public static void main(String[] args) {
//ATM a=new sbi();
//a.withdraw();
//a.deposite();

sbi s=new sbi();
s.withdraw();
s.deposite();
s.statement();
}

}
