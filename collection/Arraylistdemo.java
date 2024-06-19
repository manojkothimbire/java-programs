package collection;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<String>();
list.add("Rose");
list.add("marrygold");
list.add("Lotus");
list.add("sunflower");
list.add("juhu");
list.add("mogra");
System.out.println(list);
list.remove("Lotus");
System.out.println(list);

list.set(4, "Lotus");
System.out.println(list);
System.out.println(list.contains("mogra"));
System.out.println(list.clone());

for(String s:list)
{
	System.out.println(s);
}


	}

}
