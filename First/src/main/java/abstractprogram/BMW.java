package abstractprogram;

import interfaceprogram.Interface1;
import interfaceprogram.Interface2;

public  class BMW extends Car implements Interface2 , Interface1 {
@Override
	public void enginemodel()
	{
		System.out.println("This is BMW Engine Model");
	}
@Override
	public void enginevault()
	{
		System.out.println("This is BMW enginevault");

	}
@Override
public void holidays() {
	System.out.println("interface 2 implementation");
	
}
@Override
public void result() {
	System.out.println("Interface 1 Implementation");		

}

	public static void main(String[] args) {

		Car car=new BMW();
		car.enginemodel();
		car.enginevault();
	}
	
}
