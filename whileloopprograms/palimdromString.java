package whileloopprograms;

public class palimdromString {

	public static void main(String[] args) {

		String str="nitin";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}

		System.out.println(rev);
	if(rev.equals(str))
	{
		System.out.println("palimdrom String");
	}
	else
	{
		System.out.println("Not palimdrom string");
	}
	}

}
