package overriding;

import java.io.IOException;

public class Parent {

	public void property() throws IOException
	{
		System.out.println("Use my property");
	}
	public Object marriage() throws IOException
	{
		System.out.println("Marry only uncle daughter");
		return null;
	}

}
