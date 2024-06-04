package javapractice;

import java.util.Scanner;

import freemarker.core.StringArraySequence;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();

		
		//System.out.println(num);
		//logic 1
//		int rev;
//		while(num>0)
//		{
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		System.out.println("Reverse String is :" + rev);
		
		//logic 2
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
//		System.out.println("The reverse string is:"+ rev);
		
		//logic 3
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println("reverse String is:"+rev);
		
		
		
	}

}
