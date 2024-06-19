package Inheritence;

interface phonepay
{
	abstract void recharge();
	
	
}
interface googlepay
{
	abstract void recharge();
	
}
class A implements phonepay,googlepay
{
	public void recharge()
	{
		System.out.println("user can recharge using phonepay or googlepay");
	}
}

public class multipleinheritenceusinginterface {

	public static void main(String[] args) {

phonepay a=new A();
a.recharge();

googlepay b=new A();
b.recharge();
	}

}
