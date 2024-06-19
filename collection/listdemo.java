package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listdemo {

	public static void main(String[] args) {

		List<Integer>list=new ArrayList();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			list.add(50);
			System.out.println(list);
			list.add(60);
			
			list.addAll(list);
			System.out.println(list);
			list.remove(1);
			System.out.println(list);
			System.out.println(list.contains(30));
			System.out.println(list.size());
			
			//Iterator
			for(int i:list)
			{
				System.out.println(i);
			}
			
			Iterator<Integer>itr=list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
	}

}
