package classandobject;

public class studentdemo {
	int roll_no;
	String firstname;
	String lastname;
	int age;
	String dob;
	String joinindate;
	int section;
	public void insertrecord(int r,String f,String l,int a,String d,String j,int s)
	{
		 roll_no=r;
		 firstname=f;
		lastname=l;
		age=a;
		dob=d;
		joinindate=j;
		section=s;
	}
	public void display()
	{
		System.out.println(roll_no+" "+firstname+" "+lastname+" "+age+" "+dob+" "+joinindate+" "+section);

	}
	
public static void main(String[] args) {
studentdemo k=new studentdemo();
k.insertrecord(1, "kiran", "rao", 10, "1-1-2014", "1-1-2024", 1);
k.display();



studentdemo k1=new studentdemo();
k1.insertrecord(2, "ran", "rao", 10, "1-1-2014", "1-1-2024", 1);
k1.display();

studentdemo k3=new studentdemo();
k3.insertrecord(2, "aran", "rao", 10, "1-1-2014", "1-1-2024", 1);
k3.display();



	}

}
