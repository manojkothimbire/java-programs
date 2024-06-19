package ifstatementprograms;

public class nestedifelse {

	public static void main(String[] args) {


		int age=20;
		int weight=60;
		
		
		if(age>18)
		{
			if(weight>50)
			{
				System.out.println("you are eligible to blood donation");
			}
			else
			{
				System.out.println("you are not eligible to blood donation");
			}
		}
		else
		{
			System.out.println("your age is not valid");
		}
	}

}
