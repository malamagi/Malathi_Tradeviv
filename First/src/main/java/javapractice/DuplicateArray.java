package javapractice;

import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		String s[]= {"java","c","c++","python","java"};
		//approach 1
		boolean flag= false;
//		for(int i=0;i<s.length;i++)
//		{
//			for(int j=i+1;j<s.length;j++)
//			{
//				if(s[i]==s[j])
//				{
//					System.out.println("Found Duplicate language: " +s[i]);
//					flag = true;
//				}
//					
//			}
//		}
//		if(flag==false)
//		{
//			System.out.println("No duplicates found");
//		}
		//approach 2 hashset
		HashSet<String> lang=new HashSet();
		
//		System.out.println(lang.add("VB"));
//		System.out.println(lang.add("VC"));
//		System.out.println(lang.add("VB"));
		
//		for(String l:s)
//		{
//			System.out.println(lang.add(l));
//
//		}
		for(String l:s)
		{
			if(lang.add(l)==false)
			System.out.println("duplicates found:"+l);
			flag=true;
		}
		if(flag==false)
		{
			System.out.println("no duplicates");
		}
			
		
		
	}

}
