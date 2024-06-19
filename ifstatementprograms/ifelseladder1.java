package ifstatementprograms;

import java.util.Scanner;

public class ifelseladder1 {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		
		if(num>0)
		{
			System.out.println("the number is positive");
		}
		else if(num<0)
		{
			System.out.println("The number is negative");
		}
		else
		{
			System.out.println("the number is Zero");
		}
		
	}

}
