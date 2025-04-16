//create a array of size 10, assign values like 10,20,30... 90,100 using for loop
package CollectionTest;

public class AssignValToArrayUsingLoop {

	public static void main(String[] args) {
		int n[]=new int[11];
		n[0]=10;
		for(int i=1;i<n.length;i++)
		{
			n[i]=i*10;
			System.out.println(n[i]);
			
		}

	}

}
