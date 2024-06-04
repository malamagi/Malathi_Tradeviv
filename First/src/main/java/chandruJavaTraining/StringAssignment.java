package chandruJavaTraining;

//import javax.print.attribute.standard.MediaSize.NA;

public class StringAssignment {

	public static void main(String[] args) {
		String name="Malathimathi";
		String trimname="good morning";
		int number=5;
		String uname="malathi";
		String lname="MALATHI";
		String msg="hai,hello,good,morning";
				
		System.out.println("Return character value for the particular index:");
		System.out.println(name.charAt(1));
		System.out.println("Return String length:");
		System.out.println(name.length());
		System.out.println("Cheks the equality of string");
		System.out.println(name.equals("Malathi"));
		System.out.println("Cheks the equality of string without case sensitivity");
		System.out.println(name.equalsIgnoreCase("malathimathi"));
		System.out.println("Checks if string is empty or not");
		System.out.println(name.isEmpty());
		System.out.println("Returns True/False on the given value is present or not");
		System.out.println(name.contains("M"));
		System.out.println("Return particular portion of the string");
		System.out.println(name.substring(5));
		System.out.println("Return Substring from the beginning to the End index ");
		System.out.println(name.substring(1, 3));
		System.out.println("Appends the string");
		System.out.println(name.concat("ravi"));
		System.out.println("Replace the existing String / Single character");
		System.out.println(name.replace('m', 'M'));
		System.out.println(name.replace("madi","Lakshmi"));
		System.out.println("Return Position of the character");
		System.out.println(name.indexOf("a"));
		System.out.println("Find Character specifiec from the index position");
		System.out.println(name.indexOf("i", 7));
		System.out.println(name.indexOf("mathi", 5));
		System.out.println("Trim Method");//not working
		System.out.println(trimname.trim());
		System.out.println("Convert given data type to string");//doubt
		System.out.println(String.valueOf(5));
		System.out.println("Convert in to Uppercase");
		System.out.println(uname.toUpperCase());
		System.out.println("Convert in to Lowercase");
		System.out.println(uname.toLowerCase());
		System.out.println("Join with Delimiter");
		System.out.println(String.join(".","www","tradeviv","com"));
		System.out.println("Split Method");
		String[] aftersplit=msg.split(",");
		for(String str:aftersplit)
		{
			System.out.println(str);
		}
		
		

	}

}
