package ifstatementprograms;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item number");
		int num=sc.nextInt();
		
		System.out.println("Enter the product name");
		String name=sc.next();
		
		System.out.println("Enter the rate and quantity");
		int rate=sc.nextInt();
		int quantity=sc.nextInt();
		
		double price=rate*quantity;
		double discount=0.0d;
		
		if(price>1000 && price<=2000)
		{
			discount=0.10*price;
		}
		else if(price >2000 && price <=3000)
		{
			discount=0.15*price;
		}
		else if(price >3000 && price<5000)
		{
			discount=0.25*price;
		}
		else if(price >5000)
		{
			discount=0.30*price;
		}
		else
		{
			discount =0.0*price;
		}
		double netprice=price-discount;
		
		System.out.println("Item id="+num);
		System.out.println("Item name="+name);
		System.out.println("price="+price);
		System.out.println("discount="+discount);
		System.out.println("netprice="+netprice);
		

	}

}
