package whileloopprograms;

public class palimdromnumber {

	public static void main(String[] args) {


		int num=131,temp=num;      
		
		int rem,rev=0;
		
		while(num>0)
		{
			rem=num%10;//1 3 1
			rev=rev*10+rem;//1 13 131
			num=num/10;
		}
		System.out.println(rev);
		
		if(rev==temp)
		{
			System.out.println("It is a palimdrom number");
		}
		else
		{
			System.out.println("It is a not palimdrom");
		}
	}

}
