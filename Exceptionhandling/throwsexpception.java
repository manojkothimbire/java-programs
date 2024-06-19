package Exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throwsexpception {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
findfile();
System.out.println("file found");
	}
	
	public static void findfile() throws FileNotFoundException
	{
		File f=new File("C:\\Users\\admin\\Desktop\\xyz.txt");
		FileInputStream fis=new FileInputStream(f);
	}

}
