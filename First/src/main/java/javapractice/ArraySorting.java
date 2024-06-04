package javapractice;

public class ArraySorting {

	public static void main(String[] args) {
		int a[]= {12,5,9,2,10};
		System.out.print("Unsorted Number is : " );
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+ " ");
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				//decending order if(a[j]>a[i]) 
				
				//Ascending order
				if(a[j]<a[i]) {
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
			}
		}
		System.out.print("\n Sorted Number"
				+ ""
				+ " is : " );
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+ " ");
	}
}
