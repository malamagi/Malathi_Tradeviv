package chandruJavaTraining;

import java.util.Arrays;

public class Abctry {

	public static void main(String[] args) {
		String s="abc123";
		char[] c=s.toCharArray();
		int sum=0,i=0;
		while(i<c.length)
		{
			if(i<=2){
				char eachchar=c[i];
				//char *array = eachchar.c[i];
				//System.out.print(eachchar);
				String res1 = String.valueOf(eachchar);
				char[] ch=res1.toCharArray();
				System.out.print(Arrays.toString(ch));
				i++;
			}else
			{			
			if( i >=3){
					int eachnum=c[i]-'0';
					sum=sum+eachnum;
					i++;
				}}} //System.out.print(eachchar);

		String res2=String.valueOf(sum); 
		char[] ch=res2.toCharArray();
		System.out.print(Arrays.toString(ch));	}}





