package Basicprograms;

public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {1,2,3,5,7};
		int target=12;
	
		
		for(int i=0;i<=array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==target)
				{
						System.out.println(i+" "+j);
				}
			}
		}
		
	}

}
