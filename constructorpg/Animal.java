package constructorpg;

public class Animal {
	
	
	Animal()
	{
		System.out.println("lion is animal");//100
	}
	Animal(String name)
	{
		this();
		System.out.println("pet animal"+name);//100
	}
	Animal(String name,int speed)
	{
		this(name);
		System.out.println("Amimal="+name+"speed="+speed);
	}
	
	
	

	public static void main(String[] args) {

Animal a=new Animal("dog",100);
		
	}

}
