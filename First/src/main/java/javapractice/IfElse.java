package javapractice;

//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class IfElse {
	
	 private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		 int N = scanner.nextInt();
	       scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        scanner.close();
	        if(N%2!=0|| N >= 6 && N <=20)
	        System.out.println("Weird");
	        else if(N >= 2 && N <= 5 || N>20)
	        System.out.println("Not weired");
	        else
	        System.out.println("not ");
	      
	}}

