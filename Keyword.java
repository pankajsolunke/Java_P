package onevideoinjava;

public class Keyword {

	static int a;
	static int b;
	static void m1() {
		a = 10;
		b = 20;
//		m = m; 
//		System.out.println("is a m1: "+m);
//		return 10;
	}
	
	static void m2(int x,int y) {
		a = x;
		b = y;
//		System.out.println("is a m2 start");
//		return 20;
//		int m =10;
//		int n =32;
//		System.out.println("is a m2 end");
	}
	
	static void m3(int a,int b) {
		a = a;
		b = b;
		System.out.println(a+"  "+b+"\n");

	}
	
	static void m4(int a , int b) {
		Keyword.a = a;
		Keyword.b = b;
	}
	public static void main(String args[]) {
		System.out.println(a + "  " + b +"\n");
		
//		int a = 50;
//		System.out.println(a + "  "+ b);
//		System.out.println(Keyword.a);
//		System.out.println(a);
		m1();
		System.out.println(a+"  "+b+"\n");
//		System.out.println(a);
//		System.out.println(b);
//		int m = 40;
		m2(30,40);
		System.out.println(a+"  "+b+"\n");
		
		m3(50,60);
		System.out.println(a+"  "+b+"\n");
		
		m4(70,80);
		System.out.println(a+"  "+b+"\n");
//		System.out.println(m);
//		m1(50);
//		System.out.println(m);
//		System.out.println("main end");
	}
//	static int m;
//	static int b = m2();
	
}
