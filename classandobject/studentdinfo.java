package classandobject;

 class studentdinfo {
	int roll_no;
	String name;
	int age;

	public void insertrecord(int r,String n,int a)
	{
		roll_no=r;
		name=n;
		age=a;
	}
	public void display()
	{
		System.out.println(roll_no+" "+name+" "+age);
	}

	public static void main(String[] args) {

		studentdinfo m=new studentdinfo();
		m.insertrecord(1, "manoj", 10);
		m.display();
		
		studentdinfo m1=new studentdinfo();
		m1.insertrecord(2, "karan", 11);
		m1.display();
		
		studentdinfo m3=new studentdinfo();
		m3.insertrecord(3, "aryan", 10);
		m3.display();
	}

}
