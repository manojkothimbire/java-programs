package superkeyword1;

class samsung
{
	public void waterregistence()
	{
		System.out.println("samsung is waterRegistence mobile phone");
	}
}
class Appo extends samsung
{
	public void waterregistence()
	{
		super.waterregistence();
		System.out.println("Appo is waterRegistence mobile phone");
	}
}

public class supermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Appo a=new Appo();
		a.waterregistence();
	}

}
