package variablesexample;

public class VariableExample {
		int c=12;//instance variable
		
		
		boolean result()
		{
			return true;
		}
		void add(int a,int b)
		{
			//System.out.println(c);
			int c=20;//local variable
			System.out.println(a+b+this.c);
			System.out.println(this.result());
		}

	
	
	
	public static void main(String[] args) {
				
		VariableExample ve=new VariableExample();
		ve.add(10,10);
		
		
	}

}
