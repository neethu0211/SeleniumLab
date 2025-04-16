//Find the highest number of the array
package CollectionTest;

public class HighestNoOfArray {

	public static void main(String[] args) {
		int a[]= {10,50,2,60,5};
		int highest=a[0];
		for(int i=0;i<a.length;i++)
		{
			/*for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[j])
				{
					//System.out.println("hight number is:"+a[j]);
					a[i]=a[j];
				}
				System.out.println("hight number is:"+a[i]);
			}*/
			if(a[i]>highest)
			{
				highest=a[i];
			}
			
		}
		System.out.println("hight number is:"+highest);
	}
}
