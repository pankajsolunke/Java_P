package Corejava;

public class Assertions {

	public static void main(String[] args) {
//		1.Simple version
		int age = 2;
		
		assert age > 0: "you are age is not negtive"; 
		
/*	Assert as keyword and identifier:
		assert keyword is introduced in 1.4 version hence from 1.4 version onwards 
		we can't use assert as identifier but until 1.3 we can use assert as an identifier.
		
		int assert = 12;
		
		System.out.println(assert);
*/
		
/*		Assertions in two type 
			1.Simple version
			2.Argumented version 
			
			syntax: assert(b):e;
			'b' should be boolean type
			'e' can be any type
			//'e' will be evaluated if and only if 'b' is false 
			  if 'b' is true then 'e' won't be evaluated

*/
//		2.Argumented version 
		
//		int a = 10;
//		assert(a > 10): "here x value should be > 10";
//		System.out.println(a);
		
//		int x = 10;
//		assert(x==100):++x;
//		System.out.println(x);

/*		For the 2nd argument we can take method call also
//		but void type method call not allowed.
		
		If methodOne() method return type is void then we will
	 get compile time error saying void type not allowed here.
*/
		int a = 10;
		assert(a>100):methodOne();
		System.out.println(a);
	
	}

	public static int methodOne() {
		return 999;
		
	}
	/*
	  
	Various runtime flags:
		-ea: To enable assertions in every non system class(user defined classes).
		-enableassertions: It is exactly same as -ea.
		-da: To disable assertions in every non system class.
		-disableassertions: It is exactly same as -da.
		-esa: To enable assertions in every system class(predefined classes or application classes).
		-enablesystemassertions: It is exactly same as -esa.
		-dsa: To disable assertions in every system class.
		-disablesystemassertions: It is exactly same as -dsa.

		We can use these flags in combination also but all 
		these flags will be executed from left to right.

		Example:java -ea -esa -dsa -ea -dsa -esa Test

Example:
	To enable assertions only in B class.
	java -ea: pack1.B
	To enable assertions only in B and C classes.
	java -ea: pack1.B -ea:pack1.pack2.C
	To enable assertions in every class of pack1.
	java -ea:pack1
	To enable assertions everywhere inside pack1 except B class.
	java -ea:pack1 -da:pack1.B
	To enable assertions in every class of pack1 except pack2 classes.
	java -ea:pack1... -da:pack1.pack2...
	
	It is possible to enable (or) disable assertions either 
	class wise (or) package wise also.

*/
}
