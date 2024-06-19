package polymorphism;


class car
{
	public void speed(int a)
	{
		System.out.println("car speed must be ="+a);
	}
}

class hondacar extends car
{
	public void speed(int a)
	{
		super.speed(a);
		System.out.println("hondacar speed will be "+a);
	}
}
public class methodoverriding {

	public static void main(String[] args) {

		hondacar c=new hondacar();
		c.speed(100);
	}

}
