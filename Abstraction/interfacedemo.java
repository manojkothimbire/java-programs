package Abstraction;

interface phonepay
{
	abstract void mobilerecharge();
	abstract void fliteticket();
	abstract void billpay();
	
	
}
 class Elite implements phonepay
{
	public void mobilerecharge()
	{
		System.out.println("user can mobile recharge using phonepay");
	}
	public void fliteticket()
	{
		System.out.println("user can book flitetickect using phonepay");
	}
	public void billpay()
	{
		System.out.println("user can bill pay using phonepay");
	}
}

public class interfacedemo {

	public static void main(String[] args) {
phonepay p=new Elite();
p.mobilerecharge();
p.fliteticket();
p.billpay();

	}

}
