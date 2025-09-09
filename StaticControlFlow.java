package Corejava;

class Base{
	static int i=10;
	static {
		methodOne();
		System.out.println("base class static block");
	}
	public static void main(String[] args) {
		methodOne();
		System.out.println("base class Main");
	}
	public static void methodOne() {
		System.out.println(j);
	}
	static int j = 20;
}
public class StaticControlFlow extends Base
{
	static int x = 100; //x =100
	static {
		methodTwo();
		System.out.println("derived class First static block");
	}
	public static void main(String[] args) {
		methodTwo();
		System.out.println("derived class Main method");
	}
	public static void methodTwo() {
		System.out.println(y);
	}
	static {
		System.out.println("derived second static block");
	}
	static int y = 200;
/*
	Static Block:
		Static blocks will be executed at the time of class loading hence if we want
		to perform any activity at the time of class loading we have to define that 
		activity inside static block.
		With in a class we can take any no of static blocks and all these static blocks 
		will be executed from top to bottom.
	
	IIQ : Without using main() method is it possible to print some statements to the console?
	Ans : Yes, by using static block.
  
Note : Without using main() method we can able to print some statement to the console , 
	   but this rule is applicable untill 1.6 version from 1.7 version onwards to run 
	   java program main() method is mandatory.
  
  
 */
//	static int i = 10;
//	static {
//		methodOne();
//		System.out.println("First static block");
//	}
//
//	public static void main(String[] args) 
//	{
//		methodOne();
//		System.out.println("Main Method");
//	}
//	public static void methodOne() {
//		System.out.println(j);
//	}
//
//	static {
//		methodOne();
//		System.out.println("second static block");
//	}
//	
//	static int j = 20;
}
