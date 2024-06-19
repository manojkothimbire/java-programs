package constructorpg;

 class student {
	 int roll_no;
	 String name;
	 int age;
	
	 student(int r,String n,int a)// parameter constructor
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
		student s=new student(101, "karan", 10);
		s.display();
	}

}
