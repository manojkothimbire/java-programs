package Basicprograms;

import java.util.Scanner;

public class personaldetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String firstname;
String lastname;
String Email;
Long phonenumber;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the firstname");
firstname=sc.nextLine();

System.out.println("Enter the lastname");
lastname=sc.nextLine();

System.out.println("Enter the Email");
Email=sc.nextLine();

System.out.println("Enter the phone number");
phonenumber=sc.nextLong();


System.out.println("firstname="+firstname);
System.out.println("Lastname="+lastname);
System.out.println("Email="+Email);

System.out.println("PhoneNumber="+phonenumber);










	}

}
