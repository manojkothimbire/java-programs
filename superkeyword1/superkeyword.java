package superkeyword1;

class notebook
{
	int prize=50;
	String name="software testing";
}
class book extends notebook
{
	int prize=40;
	
	public void sell()
	{
		System.out.println(prize);
		System.out.println(super.prize);
		System.out.println(name);
	}
}

public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b=new book();
		b.sell();
	}

}
