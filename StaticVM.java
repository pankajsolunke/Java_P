package onevideoinjava;

class Mobile
{
	static String brand; //----> static variable
	int price;   //---> instance variable
	String name; //---------^
	
	static
	{
		brand = "IPhone";
		System.out.println("in static block");
	}
	
	public Mobile()
	{
		price = 50000;
		name = "13pro";
		System.out.println("in constructor");
	}
	public void show()
	{
		System.out.println(brand +" : "+ price +" : "+ name);
	}
	
	public static void show1(Mobile m) 
	{
		System.out.println(brand +" : "+ m.price +" : "+ m.name);
	}
}
public class StaticVM {

	public static void main(String[] args) throws ClassNotFoundException
	{
//		Class.forName("onevideoinjava.Mobile");
		
		Mobile m = new Mobile();
		Mobile.brand = "Apple";
		m.name = "15promax";
		m.price = 120000;
		
		Mobile m1 = new Mobile();
		Mobile.brand = "Sapharacanda";
		m1.name = "13pro";
		m1.price = 55000;
		
		Mobile.brand = "iphone";
		m.show();
		m1.show();
		Mobile.show1(m);
	}

}
