package superkeyword1;


class hp
{
	hp()
	{
		System.out.println("hp laptop is best for battery storage");
	}
}
class lenovo extends hp
{
	lenovo()
	{
		super();

		System.out.println("lenovo laptop is best for memory speed");
		
	}
}


public class superconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lenovo l=new lenovo();
		
	}

}
