package Basicprograms;

import java.util.Scanner;

public class Areaofcircleusingscanner {

	public static void main(String[] args) {

		float pi;
		int r;
		
		System.out.println("Enter the pi value ");
		Scanner sc=new Scanner(System.in);
		pi=sc.nextFloat();
		System.out.println("Enter the radius");
		r=sc.nextInt();
		
		float area=pi*r*r;
		
		System.out.println("Area of circle="+area);
	}

}
