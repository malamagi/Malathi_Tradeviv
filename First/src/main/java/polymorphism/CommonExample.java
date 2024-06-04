package polymorphism;

public class CommonExample {
	

	int add(int a,int b)
	{
	int x= a+b;
	return x;
	}
	double add(double d,double e,double f)
	{
	double y= d+e+f;
	return y;
	}
	
	public static void main(String[] args) {
		CommonExample ce=new CommonExample();
		int p=ce.add(2,3);
		System.out.println(p);
		double q=ce.add(2.4,3.3,6.0);
		System.out.println(q);
}
}
