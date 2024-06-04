package inheritance;

public class Electronics extends AirCooler{

	public boolean homeappliances()
	{
		return true;
	}

	public static void main(String[] args) {

		Electronics e=new Electronics();
		boolean homeappl=e.homeappliances();
		System.out.println(homeappl);
		e.ACDescription();
		int price=e.AcPrice;
		System.out.println(price);
		String tvcolor=e.Tvcolor();
		System.out.println(tvcolor);
		int tvprice=e.Tvprice;
		System.out.println(tvprice);
		e.TvDescription();
		System.out.println("----------------------------------------");

		//directly called the parent class
		//Television t=new Television();
		//t.TVparentclass();

		//Override method applied
		e.TVparentclass();


	}

}
