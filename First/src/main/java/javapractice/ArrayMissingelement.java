package javapractice;

public class ArrayMissingelement {

	public static void main(String[] args) {
	int a[]= {11,13,14,15};
	for(int i=0;i<4;i++)
	{
		System.out.print(a[i]+" ");
	}
	int sum1=0;
	for (int i=0;i<a.length;i++) {
		sum1+=a[i];
	}
	System.out.println("\nThe sum1 elements are:"+sum1);
	int sum2=0;
	for (int i=11;i<16
			;i++)
	{
		sum2+=i;
	}
	System.out.println("\nThe sum2 elements are:"+sum2);
	
	System.out.println("\nMissing elements are:"+(sum2-sum1));
	}

}
