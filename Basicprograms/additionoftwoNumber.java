package Basicprograms;

import java.util.Scanner;

public class additionoftwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		int c;
		
		System.out.println("Enter the first value ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Enter the second value");
		b=s.nextInt();
		
		c=a+b;
		
		System.out.println(c);
		
		
	}

}
