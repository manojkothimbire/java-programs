package ifstatementprograms;

import java.util.Scanner;

public class ifladder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		if(age<14)
		{
			System.out.println("child");
		}
		else if(age>=14 && age<55)
		{
			System.out.println("young");
		}
		else
		{
			System.out.println("Adult");
		}
		
		// mark <35  ===>fail
		//mark >=35 and mark<50==>c grade
		//mark >=50 and mark<60==>B grade
		//mark >=60 and mark<75==>A grade
		//mark >=75 and <=100 ==>distinction
		// mark >100   -->number is not valid
		
		
	}

}
