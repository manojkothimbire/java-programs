package statickeyword;

public class studentinfo {
	
	int roll_no;
	String name;
	String address;
static String college_name="fmi";

studentinfo(int r,String n,String a)
{
	roll_no=r;
	name=n;
	address=a;
}
public void display()
{
	System.out.println(roll_no+" "+name+" "+address+" "+college_name);
}

	public static void main(String[] args) {

		studentinfo s=new studentinfo(1,"karan","pune");
		s.display();
		studentinfo s1=new studentinfo(2,"aran","nagpur");
		s1.display();
		studentinfo s2=new studentinfo(3,"ram","nagpur");
		s2.display();
	}

}
