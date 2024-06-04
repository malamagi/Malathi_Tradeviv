
package javapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ArrayListExample {
	public void arraylists()
	{
		List <String>arraylist = new ArrayList<String>();
		arraylist.add("Haribalan");
		arraylist.add("Kishore");
		arraylist.add("Yuvan");
		arraylist.add("Deepika");
		arraylist.add("Haribalan");
		arraylist.add("Krishanth");
		System.out.println("Array list are:"+arraylist);


		System.out.println(arraylist.get(0));
		System.out.println(arraylist.indexOf("Deepika"));
		System.out.println(arraylist.lastIndexOf("Haribalan"));

		arraylist.set(1, "Yasidha");
		System.out.println(arraylist);

		List<String> anotherlist=new ArrayList<String>();
		anotherlist.addAll(arraylist);
		System.out.println(anotherlist);

		anotherlist.clear();
		System.out.println(anotherlist);

		arraylist.remove(0);
		System.out.println(arraylist);

		arraylist.remove("Yuvan");
		System.out.println(arraylist);
		arraylist.add("null");
		System.out.println(arraylist);

		System.out.println(arraylist.isEmpty());

		for(String string : arraylist)
			System.out.println("For each Loop:" + string);

		for(int i=0;i<arraylist.size();i++)
			System.out.println("For loop:"+arraylist.get(i));

		ListIterator<String> listiterator1=arraylist.listIterator();
		while(listiterator1.hasNext())
		{
			System.out.println("List Iterator forward:"+listiterator1.next());
		}
		while(listiterator1.hasPrevious())
		{
			System.out.println("List Iterator Backward:"+listiterator1.previous());
		}

		Iterator<String> iterator=arraylist.iterator();
		while(iterator.hasNext())
			System.out.println("Iterator:"+iterator.next());

	}

	public static void main(String[] args) {


		ArrayListExample arraylistEg=new ArrayListExample();
		arraylistEg.arraylists();
	}

}
