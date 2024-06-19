package collection;

import java.util.LinkedList;

public class linkedlistdemo {

	public static void main(String[] args) {
	
		LinkedList<String>list=new LinkedList<String>();
		list.add("mango");
		list.add("Apple");
		list.add("banana");
		list.add("pinaapple");
		list.add("Grapes");
		System.out.println(list);
		list.addFirst("kivi");
		System.out.println(list);
		list.addLast("watermelon");
		System.out.println(list);
		
		list.add(4, "orange");
		System.out.println(list);
		
		for(String str:list)

		{
			System.out.println(str);
		}

	}

}
