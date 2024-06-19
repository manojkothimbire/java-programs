package Basicprograms;

import java.util.Scanner;

public class swapNumberUsingScanner {

	public static void main(String[] args) {

		int a;
		int b;
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first nuber");
		a=s.nextInt();
		System.out.println("Enter the second number");
		b=s.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("swap after value a="+a);
		System.out.println("swap after value b="+b);
		
	}

}
