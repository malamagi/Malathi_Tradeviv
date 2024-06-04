package abstractprogram;

//import interfaceprogram.Interface1;

public class Benz extends Car  {
	@Override
	public void enginemodel()
	{
		System.out.println("This is Benz Engine Model");
	}
	@Override
	public void enginevault()
	{
		System.out.println("This is Benz enginevault");

	}
	public static void main(String[] args) {
		
		Car car=new Benz();
		car.enginemodel();
		car.enginevault();
		
	}
//	@Override
//	public void result() {
//System.out.println("Interface 1 Implementation");		
//	}

}
