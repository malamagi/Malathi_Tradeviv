package chandruJavaTraining;



public class CharacterUppercase {

	public static void main(String[] args) {
	
		String str= "hello world";
		int pos=0;
		char uppercase = Character.toUpperCase(str.charAt(pos));
        String result = str.substring(0, pos) + uppercase + str.substring(pos + 1);
        System.out.println("original string: " + str);
        System.out.println("uppercase string: " + result);
	}}

//		
//Scanner scanner = new Scanner(System.in);
//
//// Prompt the user to enter a string
//System.out.print("Enter a string: ");
//String inputString = scanner.nextLine();
//
//// Prompt the user to enter the position of the character to convert to uppercase
//System.out.print("Enter the position of the character to convert to uppercase: ");
//int position = scanner.nextInt();
//
//// Check if the position is valid
//if (position < 0 || position >= inputString.length()) {
//    System.out.println("Invalid position! Position should be between 0 and " + (inputString.length() - 1));
//} else {
//    // Convert the character at the specified position to uppercase
//    char charToUppercase = Character.toUpperCase(inputString.charAt(position));
//
//    // Build the new string with the uppercase character
//    String resultString = inputString.substring(0, position) + charToUppercase + inputString.substring(position + 1);
//
//    // Print the result
//    System.out.println("Resulting string: " + resultString);
//}
//
//scanner.close();
//}
//}