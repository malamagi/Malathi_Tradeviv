package javapractice;

import java.util.Arrays;

public class ArrayStringprogram {


	public static void main(String[] args) {
		
		//integer array
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		//a[3]=40;// java.lang.ArrayIndexOutOfBoundsException(ERROR)
		System.out.println(Arrays.toString(a));

		String[] stdname= {"malathi" ,"kavitha","hema","ganga","sandhiya"};
		System.out.println(stdname[0]);
		System.out.println(stdname[2]);//particular index
		System.out.println(stdname.length);//array length
		System.out.println(stdname[stdname.length-1]);//last value
		System.out.println(Arrays.toString(stdname));//get all values from the array list
		
		String str1= "hello world";
		char[] chararray=str1.toCharArray();
		int pos=3;
		for(char c:chararray)
		{
			System.out.println(c+"");
			 char charToUppercase=Character.toUpperCase(str1.charAt(c));
			String resultString = str1.substring(0, c) + charToUppercase + str1.substring(pos + 1);

            // Print the result
            System.out.println("Resulting string: " + resultString);

			   
		}
		
		
		//array using loop
		String[] subjects= {"Java","SE","CN","VB","DS"};
		for (int i = 0; i < subjects.length; i++)
		{
			System.out.println(subjects[i]);
		}
			
		//for each array loop
		String[] subj= {"Java","SE","CN","VB","DS"};
		for(String s:subj)
		{
			System.out.println(s);
		}
		
		//2 dimensional array
		int[][] values= {{1,2},{3,4}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("arr["+i+"]["+j+"]="+values[i][j]);
			}
		}
			
		}

}
