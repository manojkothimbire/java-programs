package Encapsulation;


class admin
{
	private int id;
	private String name;
	
	public void set(int d)
	{
		id=d;
	}
	public int get()
	{
       return id;
		}
	public void set1(String n)
	{
		name=n;
	}
	public String get1()
	{
		return name;
	}
}
public class Encapsulationdemo {

	public static void main(String[] args) {
admin a=new admin();
a.set(101);
a.set1("xyz");
System.out.println(a.get());
System.out.println(a.get1());

	}

}
