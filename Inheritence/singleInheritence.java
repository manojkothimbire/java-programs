package Inheritence;


class Animal
{
	public void run()
	{
		System.out.println("Animal is running");
	}
	public void walk()
	{
		System.out.println("Animal can walk");
	}
	
}
class Dog extends Animal
{
	public void bark()
	{
		run();
		System.out.println("dog is barking");
	}
	public void bite()
	{
		System.out.println("dog can bite");
	}
}



public class singleInheritence {

	public static void main(String[] args) {

		Dog d=new Dog();
		d.bark();
		d.walk();
		d.run();
		d.bite();
		
	}

}
