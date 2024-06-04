package javapractice;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N value:\n");
		int n;
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
				int result=n*i;
			System.out.println(n+ "*" +i+ "=" +result);

		}
}
}