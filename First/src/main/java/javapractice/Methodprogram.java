package javapractice;

public class Methodprogram {
	
	public void method1()
	{
		System.out.println("This is void method 1");
	}
	private boolean method2()
	{
		return true;
	}
	public String method3()
	{
		return "malathi";
	}
	
		public static void main(String[] args) {

		Methodprogram mp=new Methodprogram();
		mp.method1();
		boolean result=mp.method2();
		System.out.println(result);
		String name=mp.method3();
		System.out.println(name);
	}

}
