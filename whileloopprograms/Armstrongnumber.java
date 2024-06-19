package whileloopprograms;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=153,temp=num;
		int rem,rev=0;
		
		while(num>0)
		{
			rem=num%10;//3 5 1
			rev=rev+rem*rem*rem;//0+3*3*3=>27 || 27+5*5*5=>152 || 152+1*1*1=>153
			num=num/10;
		}
		System.out.println(rev);
		
		if(temp==rev)
		{
			System.out.println("It is Armstrong number");
		}
		else
		{
			System.out.println("It is Not Armstrong number");
		}
	}

}
