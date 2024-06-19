import java.util.Scanner;

public class nestedif3 {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	if(num>50)
	{
		if(num<100)
		{
			System.out.println("number is grater than 50 and less than 100");
		}
		else
		{
			System.out.println("number is greater than 100");
		}
	}
	else
	{
		System.out.println("number is less than 50");
	}
}
}

