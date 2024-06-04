package staticExample;

public class Staticvariableandfunction {

	static int a=0;
	int b=0;
	int c=100;
	
	void increment()
	{
		a++;
		b++;
		System.out.println("a value is"+a +" -->" + "b value is"+b);
	}
	
	//static function
	public static void print() {
		System.out.println("Hello This is static method");
	}
	public static void main(String[] args) {
		Staticvariableandfunction sv=new Staticvariableandfunction();
		int c=sv.c;
		System.out.println(c);
		
		sv.increment();
		sv.increment();
		System.out.println("create new object");
		Staticvariableandfunction sv1=new Staticvariableandfunction();
		sv1.increment();
		
		//call static function
		
		print();
		Staticvariableandfunction.print();
		System.out.println("------------------------" );
		
		Staticvariableandfunction.a=10;
		System.out.println(a);
		
	}
	

}
