package Inheritence;

class samsung
{
	public void camera()
	{
		System.out.println("samsung mobile camera is best");
	}
}
class oppo extends samsung
{
	public void battery()
	{
		camera();
		System.out.println("oppo mobile battery is 5000mz");
	}
}
class motorola extends samsung
{
	public void waterregistence()
	{
		camera();
		System.out.println("motorola mobile is water registance");
	}
}


public class hierarchicalInheritence {

	public static void main(String[] args) {

		motorola m=new motorola();
		m.waterregistence();
		
	oppo o=new oppo();
	o.battery();
	}

}
