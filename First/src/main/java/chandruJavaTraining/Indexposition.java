package chandruJavaTraining;

import java.util.Scanner;

public class Indexposition {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		System.out.print("Enter a character to find: ");
		char characterToFind = scanner.next().charAt(0);

		int indexpos = inputString.indexOf(characterToFind);

		if (indexpos == -1) {
			System.out.println("The character '" + characterToFind + "' is not found in the string");
		} else {
			System.out.println("The character '" + characterToFind + "'is found at index: "  + indexpos );
		}
	
	}

}

