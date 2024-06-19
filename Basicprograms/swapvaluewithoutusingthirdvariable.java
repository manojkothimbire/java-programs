package Basicprograms;

public class swapvaluewithoutusingthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; 
		int b=20;
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("value of after swap a="+a);
		System.out.println("value of after swap b="+b);


	}

}
