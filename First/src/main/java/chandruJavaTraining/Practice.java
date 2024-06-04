package chandruJavaTraining;

import java.util.Scanner;

public class Practice {

	public void test()
	{

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();
		// Print ASCII values and positions of each character in the string
		System.out.println("ASCII values and positions of characters in the given string:");
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			ch=Character.toUpperCase(ch);
			int asciiValue = (int) ch;
			int position=asciiValue-64;
			System.out.println("Character: '" + ch + "' at position " + position + " has ASCII value: " + asciiValue);

			//System.out.println("Character: '" + ch + " and the ASCII value is : " + asciiValue);
		}
	}

	public static void main(String[] args) {


		Practice ap=new Practice();
		ap.test();
	}

}
