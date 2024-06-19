package ifstatementprograms;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {

		int year;
		System.out.println("Enter the year ");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		
		
		if(((year%4==0)&&(year%100!=0)||(year%400==0)))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}
		
		
		
		
	}

}
