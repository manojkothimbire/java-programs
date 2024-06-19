package polymorphism;

public class methodoverloading {
	
	
	public  void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	public void add(int a,float b)
	{
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {

		methodoverloading m=new methodoverloading();
	
		m.add(10, 20);
		m.add(10, 20.5f);
	
	}

}
