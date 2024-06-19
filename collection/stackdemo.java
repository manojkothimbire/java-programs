package collection;

import java.util.Stack;

public class stackdemo {

	public static void main(String[] args) {

		Stack<Integer>s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
		for(int i:s)
		{
			System.out.println(i);
		}
		
	}

}

