package classandobject;

public class student {
	int roll_no;
	String name;
	int age;

	public static void main(String[] args) {

		student m=new student();
		m.roll_no=101;
		m.name="manoj";
		m.age=10;
		
		System.out.println(m.roll_no+" "+m.name+" "+m.age);
		
		student d=new student();
		d.roll_no=102;
		d.name="dhanashree";
		d.age=11;
		System.out.println(d.roll_no+" "+d.name+" "+d.age);
		
		student k=new student();
		k.roll_no=103;
		k.name="karan";
		k.age=10;
		System.out.println(k.roll_no+" "+k.name+" "+k.age);
		
	}

}
