//1. print all the elements of the arraylist one by one using for loop
package CollectionTest;

import java.util.ArrayList;

public class ArrayListForLoop {

	public static void main(String[] args) {
		ArrayList list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("length is "+list.size());
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
