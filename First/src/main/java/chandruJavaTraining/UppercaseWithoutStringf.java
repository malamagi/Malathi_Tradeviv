package chandruJavaTraining;

public class UppercaseWithoutStringf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "hello world";
        char charToConvert = 'o';
        
        String resultString = convertCharToUpperCase(inputString, charToConvert);
        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + resultString);
    }
    
    public static String convertCharToUpperCase(String str, char ch) {
        // Convert the character to its uppercase version
        char upperCaseChar = (char) ((ch >= 'a' && ch <= 'z') ? (ch - 'a' + 'A') : ch);
        
        // Create a new char array to build the new string
        char[] newStrArray = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is the one to be converted
            if (str.charAt(i) == ch) {
                newStrArray[i] = upperCaseChar;
            } else {
                newStrArray[i] = str.charAt(i);
            }
        }
        
        // Create a new string from the char array
        return new String(newStrArray);

	}

}
