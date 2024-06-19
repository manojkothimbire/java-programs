package Inheritence;

class maruticar
{
	public void AutomaticStart() {
		System.out.println("this car have a automatic start functions");
		
	}
}
class honda extends maruticar
{
	public void navigation()
	{
		AutomaticStart();
		System.out.println("this car have a navigation function");
		
	}
}
class thar extends honda
{
	public void speed()
	{
		navigation();
		System.out.println("this car is highest speed");
	}
}


public class multilevelinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 thar t=new thar();
 t.speed();
 
	}

}
