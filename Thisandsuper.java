package onevideoinjava;

class A //extends object --> by default extends object class
{
	public A() {
		super(); // Calls Object class constructor
		System.out.println("in A");
	}
	public A(int a) {
		this();
//		super(); // Calls Object class constructor
		System.out.println("in A int");
	}
}
class B extends A{
	public B() {
		super(5);
//		super(5); //explicitly calling A(int a)
		System.out.println("in B");
	}
	public B(int b) {
		this();
//		super(); //calls A() by default
		System.out.println("in B int");
	}
}


public class Thisandsuper {
	public static void main(String[] args) {
		B b = new B(4);
	}
	
}
