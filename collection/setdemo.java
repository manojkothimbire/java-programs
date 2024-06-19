package collection;

import java.util.HashSet;
import java.util.Set;

public class setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String>s=new HashSet<String>();
		s.add("manoj");
		s.add("tushar");
		s.add("karan");
		s.add("sahil");
		s.add("rahul");
		System.out.println(s);
		s.add("manoj");
		System.out.println(s);
		s.remove("manoj");
		System.out.println(s);
		System.out.println(s.contains("rahul"));
		System.out.println(s.size());
		for(String str:s)
		{
			System.out.println(str);
		}
	}

}
