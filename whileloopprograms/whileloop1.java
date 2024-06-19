package whileloopprograms;

import java.util.Scanner;

public class whileloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1234,rem;
		int rev=0;
		
		while(num>0)
		{
			rem=num%10;//rem=4 ,3,2,1
			rev=rev*10+rem;//rev=4,43,432,4321
			num=num/10;//12,1,0
		}
	System.out.println(rev);
	}

}
