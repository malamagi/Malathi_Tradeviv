package chandruJavaTraining;

import java.util.Arrays;

public class ArrayRevMidvalue {

	public static void main(String[] args) {

		//		char a=s.charAt(0);
		//		char b=s.charAt(1);
		//		char c=s.charAt(2);
		//		char d=s.charAt(3);
		//		String res=a+c+b+d;

		//get Char Array from the Input string

		//		String s="1234";
		//		char[] d = s.toCharArray();
		//		char  temp = d[1];
		//		d[1] = d[2];
		//		d[2] = temp;
		//		System.out.println(d);


		//Integer Array using temp variable
		//		int s[]= {1,2,3,4};
		//		int  temp = s[1];
		//		s[1] = s[2];
		//		s[2] = temp;
		//
		//		System.out.println(Arrays.toString(s));

		//Integer Array using for loop
		int s[]= {1,2,3,4};
		int n= s.length;
		for(int i=0;i<n;i++)
		{
			if((i==1 || i==2))
			{
				int  temp = s[i];
				s[i] = s[i+1];
				s[i+1] = temp;
				//System.out.println(s[i]);
				System.out.println(Arrays .toString(s));
				break;
			}
			
		}
	}
}
