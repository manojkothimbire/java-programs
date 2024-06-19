import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
boolean flag=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
num=sc.nextInt();

for(int i=2;i<num-1;i++)
{
	if(num%i==0)
	{
		flag=true;
		break;
	}
}
if(flag==true)
{
	System.out.println("number is not prime");
}
else
{
	System.out.println("number is prime");
}




	}

}
