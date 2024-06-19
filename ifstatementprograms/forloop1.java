package ifstatementprograms;

public class forloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=1;j<i;j++)
			{
				
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}

}
