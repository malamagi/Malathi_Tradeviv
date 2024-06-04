package overriding;

import java.io.IOException;

public class Son extends Parent {

	
	public String marriage() throws IOException
	{
		super.marriage();
		System.out.println("My rules My marriage");
		return null;
	}
	public static void main(String[] args) throws IOException {
		

		Parent parent=new Son();
		parent.property();
		parent.marriage();
	}

}
