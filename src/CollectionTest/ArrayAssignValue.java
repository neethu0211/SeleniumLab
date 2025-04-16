//2. Create a array of size 10, assign avalues like 0,1,2.. 9 using for loop
package CollectionTest;

import java.util.Scanner;

public class ArrayAssignValue {

	public static void main(String[] args) {
		int n[]=new int[10];
		for(int i=0;i<n.length;i++)
		{
			n[i]=i;
			System.out.println(n[i]);
			
		}
	}

}
